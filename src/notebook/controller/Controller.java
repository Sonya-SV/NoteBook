package notebook.controller;

import notebook.model.entity.RepeatArgumentExcetion;
import notebook.model.Model;

import notebook.model.entity.User;
import static notebook.view.TextConstant.*;
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
        noteController.inputNote();
        User user = getUser(noteController);
        view.printMessage(user.toString());

    }

    private User getUser(NoteController noteController){
        User user = null;
        while(true){
            try{
                user = new User(noteController.getName(), noteController.getEmail());
                model.addUser(user);
                break;
            }catch (RepeatArgumentExcetion e){
                noteController.inputEmail();
            }
        }
        return user;
    }
}


