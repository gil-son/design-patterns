package ex01;

// Concrete Command - TurnOnDeviceCommand
public class TurnOnDeviceCommand implements Command {
    private Device device;

    public TurnOnDeviceCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
