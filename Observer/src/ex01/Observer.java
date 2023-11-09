package src.ex01;

class Observer {
    private String name;
    private Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println(name + " received an update. New state: " + subject.getState());
    }
}
