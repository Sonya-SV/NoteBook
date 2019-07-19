package notebook.view;

import java.util.Locale;
import java.util.ResourceBundle;
import static notebook.view.TextConstant.*;

public class View {

    static String BUNDLE_NAME = "message";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(
            BUNDLE_NAME,
//            new Locale("uk", "UA"));
            new Locale("en", "US"));

    public void printMessage(String msg){
        System.out.println(msg);
    }

    public String concatenation(String ... msg){
        StringBuilder concatStr = new StringBuilder();
        for(String i : msg)
            concatStr = concatStr.append(i);
        return concatStr.toString();
    }

    public void printInputData(String message){
        printMessage(concatenation(
                bundle.getString(INPUT_DATA),
                bundle.getString(message) ));
    }

    public void printWrongInputData(String message){
        printMessage(concatenation(
                bundle.getString(WRONG_DATA),
                bundle.getString(INPUT_DATA),
                bundle.getString(message) ));
    }
}


