package notebook.model;

import java.util.ArrayList;
import java.util.List;

public enum DBUser {
    USER1(new User("Max","max@gmail.com")),
    USER2(new User("Nika", "nika777@gmail.com"));

    private User user;
    DBUser(User user) {
        this.user = user;
    }

    public static List<User> getDBUsers(){
        List<User> users = new ArrayList<User>();
        for(DBUser dbUser : DBUser.values())
            users.add(dbUser.user);
        return users;
    }
}
