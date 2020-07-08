package pl.javagdy4.api.chucknorrisjokes;

import java.util.Optional;


public enum JokesCategory {

    RANDOM("random"),
    ANIMAL("animal"),
    CAREER("carrer"),
    CELEBRITY("celebrity"),
    DEV("dev"),
    EXPLICIT("explicit"),
    FASHION("fashion"),
    FOOD("food"),
    HISTORY("history"),
    MONEY("money"),
    MOVIE("movie"),
    MUSIC("music"),
    POLITICAL("political"),
    RELIGION("religion"),
    SCIENCE("science"),
    SPORT("sport"),
    TRAVEL("travel");

    private String category;

    JokesCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public static Optional<JokesCategory> parse(String input) {
        if (input.toUpperCase().contains("random")) {
            return Optional.of(JokesCategory.RANDOM);
        } else if (input.toUpperCase().contains("animal")) {
            return Optional.of(JokesCategory.ANIMAL);
        } else if (input.toUpperCase().contains("carrer")) {
            return Optional.of(JokesCategory.CAREER);
        } else if (input.toUpperCase().contains("celebrity")) {
            return Optional.of(JokesCategory.CELEBRITY);
        } else if (input.toUpperCase().contains("dev")) {
            return Optional.of(JokesCategory.DEV);
        } else if (input.toUpperCase().contains("explicit")) {
            return Optional.of(JokesCategory.EXPLICIT);
        } else if (input.toUpperCase().contains("fashion")) {
            return Optional.of(JokesCategory.FASHION);
        } else if (input.toUpperCase().contains("food")) {
            return Optional.of(JokesCategory.FOOD);
        } else if (input.toUpperCase().contains("history")) {
            return Optional.of(JokesCategory.HISTORY);
        } else if (input.toUpperCase().contains("money")) {
            return Optional.of(JokesCategory.MONEY);
        } else if (input.toUpperCase().contains("movie")) {
            return Optional.of(JokesCategory.MOVIE);
        } else if (input.toUpperCase().contains("music")) {
            return Optional.of(JokesCategory.MUSIC);
        } else if (input.toUpperCase().contains("political")) {
            return Optional.of(JokesCategory.POLITICAL);
        } else if (input.toUpperCase().contains("religion")) {
            return Optional.of(JokesCategory.RELIGION);
        } else if (input.toUpperCase().contains("science")) {
            return Optional.of(JokesCategory.SCIENCE);
        } else if (input.toUpperCase().contains("sport")) {
            return Optional.of(JokesCategory.SPORT);
        } else if (input.toUpperCase().contains("travel")) {
            return Optional.of(JokesCategory.TRAVEL);
        }
        return Optional.empty();
    }


}
