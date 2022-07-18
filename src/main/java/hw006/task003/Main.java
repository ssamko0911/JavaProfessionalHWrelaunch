package hw006.task003;

import hw006.task003.models.Animal;
import hw006.task003.models.Predator;

import java.lang.annotation.Annotation;
/*
Задание 3.
Создайте несколько классов, один класс наследует другой и использует аннотацию Inherited.
Помимо этого, попробуйте ещё в проекте использовать 5 различных аннотаций.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Annotations of parent class(Animal):");
        Animal animal = new Animal();
        Annotation [] annotations = animal.getClass().getAnnotations();
        for (Annotation item : annotations) {
            System.out.println(item);
        }
        System.out.println("Annotations of child class(Predator):");
        Animal predator = new Predator();
        Annotation [] annotationsOfPredator = predator.getClass().getAnnotations();
        for (Annotation item : annotationsOfPredator) {
            System.out.println(item);
        }
    }
}
