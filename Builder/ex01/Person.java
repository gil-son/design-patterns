package ex01;

public class Person {
    private String name;
    private String age;
    private String address;

    // Private constructor to enforce the use of the builder
    private Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    // Builder class
    static class PersonBuilder {
        private String name;
        private String dateOfBirth;
        private String address;

        // Builder methods for setting optional parameters
        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        // Build method to create the final Person object
        public Person build() {
            // You can perform additional validation here before constructing the object
            return new Person(name, dateOfBirth, address);
        }
    }
}
