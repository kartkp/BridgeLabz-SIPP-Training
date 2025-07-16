import java.util.*;
import java.time.*;

abstract class Notification {
    String message;
    LocalDateTime timestamp;
    Notification(String msg) {
        this.message = msg;
        this.timestamp = LocalDateTime.now();
    }
    abstract void display();
}
class LikeNotification extends Notification {
    LikeNotification(String user) {
        super(user + " liked the post.");
    }
    void display() {
        System.out.println(timestamp + " - " + message);
    }
}

class CommentNotification extends Notification {
    CommentNotification(String user, String comment) {
        super(user + " commented: " + comment);
    }
    void display() {
        System.out.println(timestamp + " - " + message);
    }
}

class User {
    private LinkedList<Notification> feed = new LinkedList<>();
    private static final int MAX_FEED_SIZE = 20;

    public void addNotification(Notification n) {
        feed.addFirst(n);
        if (feed.size() > MAX_FEED_SIZE) {
            feed.removeLast();
        }
    }

    public void displayFeed() {
        for (Notification n : feed) {
            n.display();
        }
    }
}
public class Socialmedianoti {
    public static void main(String[] args) {
        User u = new User();
        u.addNotification(new LikeNotification("Puneet"));
        u.addNotification(new LikeNotification("Anuj"));
        u.addNotification(new CommentNotification("Raghav", "First post!"));
        
        u.displayFeed();
    }
}

