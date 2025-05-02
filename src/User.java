import java.util.ArrayList;

public class User {
    String name;
    String email;
    String studentId;
    String staffId;
    ArrayList<String> playlists = new ArrayList<String>();
    ArrayList<String> channels = new ArrayList<String>();

    public static void main(String args[]) {
        User u1 = new User();

        u1.name = "John Smith";
        u1.email = "johnsmith@gmail.com";
        u1.studentId = "01234567";
        u1.playlists.add("liked videos");
        u1.playlists.add("watch later");
        u1.channels.add("MqTube");

        System.out.println(u1.name);
        System.out.println(u1.email);
        System.out.println(u1.studentId);
        System.out.println(u1.playlists.get(0));
        System.out.println(u1.playlists.get(1));
        System.out.println(u1.channels.get(0));

    }
}