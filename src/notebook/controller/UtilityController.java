package notebook.controller;

import notebook.view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner sc;
    private View view;

    UtilityController(Scanner sc, View view) {
        this.sc = sc;
        this.view = view;
    }

    String checkInput(String msg, String regex) {
        String input; ///////&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&77
        view.printInputData(msg);
        while (!(sc.hasNext() &&
                (input = sc.nextLine()).matches(regex))) {
            view.printWrongInputData(msg);
        }
        return input;
    }
}
