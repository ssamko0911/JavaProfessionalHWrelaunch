package hw006.task003.models;

import hw006.task003.AdditionalCustomAnno;

@AdditionalCustomAnno
public class Predator extends Animal {
    int size;

    @Override
    void animalActions() {
        System.out.println("Predator actions");
    }
}
