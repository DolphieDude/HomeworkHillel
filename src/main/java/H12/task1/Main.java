package H12.task1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter path to .json file to get list of users");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        File path = new File(input.readLine());
        ObjectMapper om = new ObjectMapper();
        UserList ul = om.readValue(path, UserList.class);
        ul.printList();
//        ArrayList<String> arr = new ArrayList(Arrays.asList(new String[] {"name", "nickname"}));
//        UserList userList = new UserList(arr);
//        File file = new File("enter1.json");
//        om.writeValue(file, userList);
    }
}
