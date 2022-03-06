package helpers;


public class Generators {
    public static String generateRandomString(boolean isEmail, String domain) {
        String emailAddress = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while (emailAddress.length() < 5) {
            int character = (int) (Math.random() * 26);
            emailAddress += alphabet.substring(character, character + 1);
        }
        emailAddress += Integer.valueOf((int) (Math.random() * 99))
                .toString();
        if (isEmail) {
            emailAddress += "@" + domain;
        }

        return emailAddress;
    }
}
