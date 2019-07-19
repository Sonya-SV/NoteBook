package notebook;

import notebook.controller.Controller;
import notebook.model.Model;
import notebook.view.View;

public class Main {

    public static void main(String[] args){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.executeUser();
    }
}
