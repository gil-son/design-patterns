package ex01;

// RealSubject - The real object that the proxy represents
public class RealSensitiveInformation implements SensitiveInformation {
    private String data;

    public RealSensitiveInformation(String data) {
        this.data = data;
        loadDataFromDatabase(); // Simulating loading data from a database
    }

    private void loadDataFromDatabase() {
        System.out.println("Loading sensitive information from the database");
        // Simulating loading data from a database
    }

    @Override
    public void display() {
        System.out.println("Displaying sensitive information: " + data);
    }
}
