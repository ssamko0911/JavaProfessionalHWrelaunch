package hw004.task004;

public class Animal {
    private String name = "Thomas";
    protected int age = 3;
    public boolean isTale = true;

    @Override
    public String toString() {
        return String.format("Animal: name - %s, age - %d, tale - %s.", name, age, isTale);
    }
}
