package ex01;

public class Main {

    public static void main(String[] args) {

        ChatMediatorImpl mediator = new ChatMediatorImpl();

        User user1 = new ChatUser(mediator, "Alice");
        User user2 = new ChatUser(mediator, "Bob");
        User user3 = new ChatUser(mediator, "Charlie");

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi, Alice!");
        user3.sendMessage("Hey there!");
    }

}
