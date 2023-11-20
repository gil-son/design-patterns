package ex01;

public class Main {
    public static void main(String[] args) {

        Device tv = new Device("TV");

        Command turnOnTV = new TurnOnDeviceCommand(tv);
        Command turnOffTV = new TurnOffDeviceCommand(tv);

        RemoteControl remoteControl = new RemoteControl(turnOnTV, turnOffTV);

        remoteControl.pressTurnOnButton();
        remoteControl.pressTurnOffButton();
        
    }
}
