import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private transient String role;
    private transient final String password = "blahblah";

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return ("User(name = " + name +
                ", role = " + role +
                ", password = " + password
        );
    }
}
