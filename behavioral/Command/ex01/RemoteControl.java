package ex01;

public class RemoteControl {
    private Command turnOnButton;
    private Command turnOffButton;

    public RemoteControl(Command turnOnButton, Command turnOffButton) {
        this.turnOnButton = turnOnButton;
        this.turnOffButton = turnOffButton;
    }

    public void pressTurnOnButton() {
        turnOnButton.execute();
    }

    public void pressTurnOffButton() {
        turnOffButton.execute();
    }
}
