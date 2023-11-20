package ex01;

public class Main {
    public static void main(String[] args) {
        // Using the proxy to access sensitive information
        SensitiveInformation proxy = new SensitiveInformationProxy("Some sensitive data");

        // The real object is only created and loaded when needed
        proxy.display();
    }
}
