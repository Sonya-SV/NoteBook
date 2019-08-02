package notebook.model.entity;

import java.util.ArrayList;
import java.util.List;

public enum DBUser {
    USER1("Max","max@gmail.com"),
    USER2("Nika", "nika777@gmail.com");

    private final String name;
    private final String email;
    DBUser(String name, String email) {

        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public static boolean checkEmail(String emailData){
        for(DBUser user : DBUser.values())
            if(user.getEmail().equals(emailData)) {
                return true;
            }
        return false;
    }
}
