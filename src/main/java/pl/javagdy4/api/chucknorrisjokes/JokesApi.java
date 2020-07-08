package pl.javagdy4.api.chucknorrisjokes;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Log4j
public class JokesApi {
    private final static String API_CHUCK_NORRIS_JOKES = "https://api.chucknorris.io/jokes/random?category={category}";
    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();
    private final ObjectMapper objectMapper = new ObjectMapper();


    public List<String> requestJokes(ChuckNorrisJokesParameters parameters) {
        String requestUrl = prepareRequestURL(parameters);
        log.info("Request URL: " + requestUrl);
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(requestUrl))
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                String responseBody = response.body();
                JokesApp jokesApp = objectMapper.readValue(responseBody, JokesApp.class);
                return jokesApp.getCategories();
            } else {
                log.error("Error: " + response.statusCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();

    }

    private String prepareRequestURL(ChuckNorrisJokesParameters parameters) {
        return API_CHUCK_NORRIS_JOKES;
    }
}