package notebook.controller;

import notebook.model.Model;
import static notebook.controller.Regex.*;
import notebook.view.View;
import  static notebook.view.TextConstant.*;


import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void executeUser(){
        Scanner sc = new Scanner(System.in);
        NoteController noteController = new NoteController(sc, view);
        noteController.inputNote();
    }
}
