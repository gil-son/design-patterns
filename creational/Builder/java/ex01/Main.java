package ex01;

public class Main {
    public static void main(String[] args) {
        // Using the builder to construct a Person object
        Person person = new Person.PersonBuilder()
                .setName("John Doe")
                .setAge("2000/12/01")
                .setAddress("123 Main St")
                .build();

        // Printing the details of the created person
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());

    }
}
