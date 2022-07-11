package hw004.task002.models;

public class Fish {
    private String name;
    public int age;
    private boolean isTail;
    protected String color;

    public Fish(String name, int age, boolean isTail, String color) {
        this.name = name;
        this.age = age;
        this.isTail = isTail;
        this.color = color;
    }

    public void fishSwim() {
        System.out.println("Fish is swimming!");
    }
}
