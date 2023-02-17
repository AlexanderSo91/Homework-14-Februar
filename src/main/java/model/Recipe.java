package model;

import lombok.*;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    private String name;
    private int cookingTime;
    private List<Ingredient> ingredients;
    private List<String> steps;

    @Override
    public String toString() {
        return name + "\n Время приготовления " + cookingTime;
    }

}

