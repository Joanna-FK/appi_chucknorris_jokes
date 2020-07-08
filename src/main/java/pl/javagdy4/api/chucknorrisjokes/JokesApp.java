package pl.javagdy4.api.chucknorrisjokes;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;


@Data

public class JokesApp {
    private List<String> categories;
    private LocalDateTime created_at;
    private String icon_url;
    private String id;
    private LocalDateTime updated_at;
    private String url;
    private String value;


}
