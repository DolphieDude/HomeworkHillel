package H12.task1;
import java.util.ArrayList;

public class UserList {
    public ArrayList<String> users;

    public UserList() {
    }

    public UserList(ArrayList<String> users) {
        this.users = users;
    }

    void printList() {
        for (String name: users) System.out.println(name);
    }
}
