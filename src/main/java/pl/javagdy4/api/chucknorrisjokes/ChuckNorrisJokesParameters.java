package pl.javagdy4.api.chucknorrisjokes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChuckNorrisJokesParameters {

    private String jokesCategory;

    public void setJokesCategory(JokesCategory jokesCategory) {
    }
}
