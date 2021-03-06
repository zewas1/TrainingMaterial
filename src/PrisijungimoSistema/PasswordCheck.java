package PrisijungimoSistema;

import java.util.regex.Pattern;

// password hashing

public class PasswordCheck {
    public static boolean isValid(String password){
        String passwordRegex = "((?=.*[a-zA-Z0-9_+&*-]).{8,40})";

        Pattern pat = Pattern.compile(passwordRegex);
        if (password == null)
            return false;
        return pat.matcher(password).matches();
    }
}