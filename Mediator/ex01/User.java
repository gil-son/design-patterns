package ex01;

abstract class User {

    protected ChatMediatorImpl mediator;
    protected String name;

    public User(ChatMediatorImpl mediator, String name){
        this.mediator = mediator;
        this.name = name;
        mediator.addUser(this);
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);

}


