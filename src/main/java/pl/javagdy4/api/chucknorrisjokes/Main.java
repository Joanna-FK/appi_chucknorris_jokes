package pl.javagdy4.api.chucknorrisjokes;

import lombok.extern.log4j.Log4j;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
@Log4j
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ChuckNorrisJokesParameters parameters = new ChuckNorrisJokesParameters();
        JokesApi jokesApi= new JokesApi();
        loadJokes(scanner, parameters);

        if(("category").equalsIgnoreCase(parameters.getJokesCategory())){
            loadJokes(scanner, parameters);
        }

        List <String> jokesApps = jokesApi.requestJokes(parameters);
        jokesApps.forEach(log::info);
    }
    private static void loadJokes(Scanner scanner, ChuckNorrisJokesParameters jokesParameters){

        do{
        log.info("Do you want to receive jokes random or some category? Please write me your selection according to the list below: ");
        log.info("random");
        log.info("animal");
        log.info("career");
        log.info("celebrity");
        log.info("dev");
        log.info("explicit");
        log.info("fashion");
        log.info("food");
        log.info("history");
        log.info("money");
        log.info("movie");
        log.info("music");
        log.info("political");
        log.info("religion");
        log.info("science");
        log.info("sport");
        log.info("travel");

            Optional <JokesCategory>optionalJokesCategory = JokesCategory.parse(scanner.nextLine());
            if(optionalJokesCategory.isPresent()){
                jokesParameters.setJokesCategory(optionalJokesCategory.get());
            }else {
                log.error("Error: it's wrong");
            }
        }while (jokesParameters.getJokesCategory()==null);

    }
}
