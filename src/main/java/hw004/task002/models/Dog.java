package hw004.task002.models;

public class Dog {
    private String name;
    public int age;
    private boolean isTail;
    protected int weight;

    public Dog(String name, int age, boolean isTail, int weight) {
        this.name = name;
        this.age = age;
        this.isTail = isTail;
        this.weight = weight;
    }

    public void dogRun() {
        System.out.println("Dog is running!");
    }
}
