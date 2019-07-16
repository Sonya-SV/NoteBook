package NoteBook;

public class Controller {

    private Model model;
    private View view;


    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public static final String REGEX_NAME = "[A-Z][a-z]{1,20}|[А-ЩЬЮЯЇІЄҐ][а-щьюяїієґ]{1,20}";
    public static final String REGEX_NIKNAME = "^[a-zA-ZА-ЩЬЮЯЇІЄҐа-щьюяїієґ0-9_.-]{1,30}$ ";
    public static final String REGEX_COMMENT = ".{0,1000}";
    public static final String REGEX_GROUPS = "[A-Za-z|А-ЩЬЮЯЇІЄҐа-щьюяїієґ ]{1,40}+";
    public static final String REGEX_HOME_PHONE = "^((\\+\\d{1,2})|\\d{0,2})\\(\\d{3,4}\\)\\d{3}-\\d{2}-\\d{2}$";
    public static final String REGEX_MOBILE_PHONE = "^((\\+\\d{1,2})|\\d{0,2})\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    public static final String REGEX_EMAIL = "^[A-Za-z0-9.]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,6}$";
    public static final String REGEX_SKYPE = "^[A-Za-z][A-Za-z0-9_.-]{5,31}$";
    public static final String REGEX_INDEX = "[0-9]{5}";
    public static final String REGEX_CITY = "[A-Z][A-Za-z- ]{1,30}|[А-ЩЬЮЯЇІЄҐ][ А-ЩЬЮЯЇІЄҐа-щьюяїієґ-]{1,30}";
    public static final String REGEX_STREET = "[A-Z][A-Za-z- ]{1,30}|[А-ЩЬЮЯЇІЄҐ][ А-ЩЬЮЯЇІЄҐа-щьюяїієґ-]{1,30}";
    public static final String REGEX_HOME_NUMBER = "[0-9]{1,3}[(A-Za-z|А-ЩЬЮЯЇІЄҐа-щьюяїієґ)]?(\\/[0-9]{1,3})?";
    public static final String REGEX_FLAT_NUMBER = "[0-9]{1,4}[(a-z|а-щьюяїієґ)]?";
    public static final String REGEX_DATE = "([1-9]|0[1-9]|[1-2][0-9]|3[0-1])\\.([1-9]|0[1-9]|1[0-2])\\.(0[1-9]|[1-9][0-9]|[1-9][0-9]{3})$";

}
