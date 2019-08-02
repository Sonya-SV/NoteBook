package notebook.model.entity;

public class User {
    private String name;
    private String email;

    public User(String name, String email)
            throws RepeatArgumentExcetion {
        if (DBUser.checkEmail(email)) {
            throw new RepeatArgumentExcetion(
                    "Not unique email: ", email);
        }
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
