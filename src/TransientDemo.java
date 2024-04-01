import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TransientDemo {

    static String fileName = "user.ser";

    public static void main(String[] args) throws Exception {
        User user = new User("Abhishek", "ADMIN");

        System.out.println("Serializing = " + user);
        serialize(user);

        User deserUser = deserialize();
        System.out.println("Deserialized = " + deserUser);
    }

    public static void serialize(User user) throws Exception {
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(user);
        out.close();
        file.close();
    }

    public static User deserialize() throws Exception {
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);
        User user = (User) in.readObject();
        in.close();
        file.close();
        return user;
    }
}
