package src.ex01;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Subject subject2 = new Subject();

        Observer observer1 = new Observer("Observer 1", subject);
        Observer observer2 = new Observer("Observer 2", subject);
        Observer observer3 = new Observer("Observer 3", subject2);

        subject.setState(10); // Notifies and updates observers 1 and 2
        subject.setState(20);

        subject2.setState(30); // Notifies and updates observer 3

    }
}
