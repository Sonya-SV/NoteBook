package notebook.controller;

import notebook.RepeatArgumentExcetion;
import notebook.model.User;
import notebook.view.View;

import java.util.Scanner;

import static notebook.controller.Regex.*;
import static notebook.view.TextConstant.*;
public class NoteController {

    private String name;
    private String email;

    private Scanner sc;
    private View view;

    NoteController(Scanner sc, View view){
        this.sc=sc;
        this.view=view;
    }


    public User inputNote(){
        UtilityController utilityController = new UtilityController(sc, view);

        String strName = (String.valueOf(View.bundle.getLocale()).equals("uk"))
                ? REGEX_NAME_UK : REGEX_NAME_EN;

        this.name= utilityController.checkInputRegex(INPUT_NAME, strName);
        this.email = utilityController.checkInputRegex(INPUT_EMAIL, REGEX_EMAIL);
        return new User(this.name, this.email);

    }


}
