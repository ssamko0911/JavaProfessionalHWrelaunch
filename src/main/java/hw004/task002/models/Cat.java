package hw004.task002.models;

public class Cat {
    private String name;
    public int age;
    private boolean isTail;

    public Cat(String name, int age, boolean isTail) {
        this.name = name;
        this.age = age;
        this.isTail = isTail;
    }

    public void catRun() {
        System.out.println("Cat is running!");
    }
}
