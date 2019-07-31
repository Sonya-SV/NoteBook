package notebook.controller;

import notebook.RepeatArgumentExcetion;
import notebook.model.Model;

import static notebook.view.TextConstant.*;

import notebook.model.User;
import notebook.view.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;


    public Controller(Model user, View view) {
        this.model = user;
        this.view = view;
    }

    public void executeUser() {
        Scanner sc = new Scanner(System.in);
        NoteController noteController = new NoteController(sc, view);
        while(true) {
            try {
                model.addUser(noteController.inputNote());
                break;
            } catch (RepeatArgumentExcetion e) {
            }
        }




    }
}


