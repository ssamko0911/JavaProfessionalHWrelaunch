package hw001.task003.models;

import java.util.Comparator;

public class Animal implements Comparable<Animal>, Comparator<Animal> {
    private String breed;
    private int weight;
    private int speed;
    private int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-10s %-10s %-10s",
                Animal.class.getSimpleName(), breed, weight, speed, price);
    }

    @Override
    public int compareTo(Animal o) {
        if (this.speed == o.getSpeed()) {
            if (this.price == o.getPrice()) {
                if (this.weight == o.getWeight()) {
                    return compare(this, o);
                }
                return this.weight - o.getWeight();
            }
            return this.price - o.getPrice();
        }
        return this.speed - o.getSpeed();
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getBreed().compareTo(o2.getBreed());
    }
}
