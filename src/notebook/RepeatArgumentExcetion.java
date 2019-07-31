package notebook;

import notebook.model.User;

public class RepeatArgumentExcetion extends Exception {

    public RepeatArgumentExcetion(){
        super();
    }
    public RepeatArgumentExcetion(String message) {
        System.err.println(message);
    }

}
