package notebook.model;

import notebook.RepeatArgumentExcetion;

import java.util.ArrayList;
import java.util.List;

public class Model {

    List<User> users = new ArrayList<>();

    public boolean addUser(User newUser) throws RepeatArgumentExcetion {
        for (User user : DBUser.getDBUsers()) {
            if (user.getEmail().equals(newUser.getEmail()))
                throw new RepeatArgumentExcetion("This email is already exist! Input another one");
            else
                users.add(newUser);
        }
        return true;
    }



}
