package ex01;


// Client code that uses the Target interface
public class Main {
    public static void main(String[] args) {
        // Using the existing Adaptee class with the help of Adapter
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        // Calling the request method through the Adapter
        adapter.request();
    }
}
