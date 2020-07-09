package pl.javagdy4.api.chucknorrisjokes;

import java.util.Optional;


public enum JokesCategory {

    RANDOM("RANDOM"),
    ANIMAL("ANIMAL"),
    CAREER("CAREER"),
    CELEBRITY("CELEBRITY"),
    DEV("DEV"),
    EXPLICIT("EXPLICIT"),
    FASHION("FASHION"),
    FOOD("FOOD"),
    HISTORY("HISTORY"),
    MONEY("MONEY"),
    MOVIE("MOVIE"),
    MUSIC("MUSIC"),
    POLITICAL("POLITICAL"),
    RELIGION("RELIGION"),
    SCIENCE("SCIENCE"),
    SPORT("SPORT"),
    TRAVEL("TRAVEL");

    private String category;

    JokesCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static Optional<JokesCategory> parse(String input) {
        if (input.toUpperCase().contains("RANDOM")) {
            return Optional.of(JokesCategory.RANDOM);
        } else if (input.toUpperCase().contains("ANIMAL")) {
            return Optional.of(JokesCategory.ANIMAL);
        } else if (input.toUpperCase().contains("CAREER")) {
            return Optional.of(JokesCategory.CAREER);
        } else if (input.toUpperCase().contains("CELEBRITY")) {
            return Optional.of(JokesCategory.CELEBRITY);
        } else if (input.toUpperCase().contains("DEV")) {
            return Optional.of(JokesCategory.DEV);
        } else if (input.toUpperCase().contains("EXPLICIT")) {
            return Optional.of(JokesCategory.EXPLICIT);
        } else if (input.toUpperCase().contains("FASHION")) {
            return Optional.of(JokesCategory.FASHION);
        } else if (input.toUpperCase().contains("FOOD")) {
            return Optional.of(JokesCategory.FOOD);
        } else if (input.toUpperCase().contains("HISTORY")) {
            return Optional.of(JokesCategory.HISTORY);
        } else if (input.toUpperCase().contains("MONEY")) {
            return Optional.of(JokesCategory.MONEY);
        } else if (input.toUpperCase().contains("MOVIE")) {
            return Optional.of(JokesCategory.MOVIE);
        } else if (input.toUpperCase().contains("MUSIC")) {
            return Optional.of(JokesCategory.MUSIC);
        } else if (input.toUpperCase().contains("POLITICAL")) {
            return Optional.of(JokesCategory.POLITICAL);
        } else if (input.toUpperCase().contains("RELIGION")) {
            return Optional.of(JokesCategory.RELIGION);
        } else if (input.toUpperCase().contains("SCIENCE")) {
            return Optional.of(JokesCategory.SCIENCE);
        } else if (input.toUpperCase().contains("SPORT")) {
            return Optional.of(JokesCategory.SPORT);
        } else if (input.toUpperCase().contains("TRAVEL")) {
            return Optional.of(JokesCategory.TRAVEL);
        }
        return Optional.empty();
    }

    public void setCategory(JokesCategory jokesCategory) {
    }
}
