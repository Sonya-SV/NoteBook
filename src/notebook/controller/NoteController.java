package notebook.controller;

import notebook.view.View;

import java.util.Scanner;

import static notebook.controller.Regex.*;
import static notebook.view.TextConstant.*;
public class NoteController {

    private enum Groups {}
    private String Name;
    private String Surname;
    private String MiddleName;
    private String SurnameName;
    private String Nikname;
    private String Comment;
    private String HomePhone;
    private String MobilePhone;
    private String MobilePhone2;
    private String Email;
    private String Skype;
    private String Index;
    private String City;
    private String Street;
    private String HomeNumber;
    private String FlatNumber;
    private String Address;
    private String Dates;

    private Scanner sc;
    private View view;

    NoteController(Scanner sc, View view){
        this.sc=sc;
        this.view=view;
    }


    public void inputNote(){
        UtilityController utilityController = new UtilityController(sc, view);

        /*
         * rewrite hardcode
         */
        String strName = (String.valueOf(View.bundle.getLocale()).equals("uk"))
                ? REGEX_NAME_UK : REGEX_NAME_EN;
        String strNikname = (String.valueOf(View.bundle.getLocale()).equals("uk"))
                ? REGEX_NIKNAME_UK : REGEX_NIKNAME_EN;


        this.Name = utilityController.checkInput(INPUT_NAME, strName);
        this.Surname = utilityController.checkInput(INPUT_NAME, strName);
        this.MiddleName = utilityController.checkInput(INPUT_NAME, strName);
        this.Nikname = utilityController.checkInput(INPUT_NAME, strNikname);

    }

}
