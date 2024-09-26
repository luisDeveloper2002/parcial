package co.edu.uptc.animals_rest.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Animal {
    private String name;
    private String category;
}
