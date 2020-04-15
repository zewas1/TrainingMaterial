package simpleEmailGenerator;

public class PasswordGenerator {
    public static void main(String[]args){
        String password = generatePassword(10);

        System.out.println("Generated password: " + password);
    }

    private static String generatePassword(int ilgis) {
        String simboliuEilute = "abcdefghijklmnopqrstuvwxyz123456789!@#$%^&*()_+}{|:<?>,./;'][";
        char[] password = new char[ilgis];

        for (int i = 0; i < ilgis; i++){
            int randomNumber = (int) (Math.random() * simboliuEilute.length());
            password[i] = simboliuEilute.charAt(randomNumber);
        }
        return new String(password);
    }
}
