package ex01;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // Send the message to all users except the sender
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }

    public void addUser(User user) {
        users.add(user);
    }
}
