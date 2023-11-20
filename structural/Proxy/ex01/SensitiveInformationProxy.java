package ex01;

// Proxy - Controls access to the real object
public class SensitiveInformationProxy implements SensitiveInformation {
    private RealSensitiveInformation realSensitiveInformation;

    public SensitiveInformationProxy(String data) {
        // The real object is created only when needed
        this.realSensitiveInformation = new RealSensitiveInformation(data);
    }

    @Override
    public void display() {
        // Additional control or logging can be added here
        System.out.println("Accessing sensitive information through the proxy");
        realSensitiveInformation.display();
    }
}

