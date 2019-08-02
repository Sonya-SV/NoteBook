package notebook.controller;

import notebook.model.entity.User;
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


    public void inputNote(){
        UtilityController utilityController
                = new UtilityController(sc, view);

        String strName = (String.valueOf(
                View.bundle.getLocale()).equals("uk"))
                ? REGEX_NAME_UK : REGEX_NAME_EN;

        this.name=
                utilityController.checkInputRegex(
                        INPUT_NAME, strName);
        this.email =
                utilityController.checkInputRegex(
                        INPUT_EMAIL, REGEX_EMAIL);
    }

    public void inputEmail(){
        UtilityController utilityController =
                new UtilityController(sc, view);

        this.email =
                utilityController.checkInputRegex(
                        INPUT_EMAIL, REGEX_EMAIL);
    }


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
