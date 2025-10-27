package ex01;

public class Device {

    private String name;

    public Device(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " turned on.");
    }

    public void turnOff() {
        System.out.println(name + " turned off.");
    }

}
