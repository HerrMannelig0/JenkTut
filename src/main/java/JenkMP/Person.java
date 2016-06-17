package main.java.JenkMP;

/**
 * Class that represents a Person.
 */
public class Person {

    private int id;
    private String name;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
