package home.websocket.app;

/**
 * Created by pi on 15. 2. 15.
 */
public class HelloMessage {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HelloMessage{" +
                "name='" + name + '\'' +
                '}';
    }
}
