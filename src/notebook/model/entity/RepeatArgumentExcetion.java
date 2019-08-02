package notebook.model.entity;

public class RepeatArgumentExcetion extends Exception {

    private String email;
    public RepeatArgumentExcetion(){
        super();
    }
    public RepeatArgumentExcetion(String message, String email) {
        System.err.println(message + email);
        this.email = email;
    }

}
