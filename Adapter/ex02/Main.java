package ex02;


// Client code that uses the Target interface
public class Main {
    public static void main(String[] args) {
        // Using the existing Adaptee class with the help of Adapter
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        // Using another existing class with a different interface
        AnotherAdaptee anotherAdaptee = new AnotherAdaptee();
        Target anotherAdapter = new AnotherAdapter(anotherAdaptee);

        // Calling the request method through the Adapters
        adapter.request();
        anotherAdapter.request();

    }
}
