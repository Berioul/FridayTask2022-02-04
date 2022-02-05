package de.neuefische.fridaytask;

import java.text.DecimalFormatSymbols;

public class PasswordValidation {

    public static void main(String[] args) {


    }

    private static boolean password(String pin) {
        if (pin.length() >= 8) {
            System.out.println("Password Valid");
            return true;
        }
        return false;
    }


    private static boolean passwordContainsDigit(String pin) {

        for (int i = 0; i < pin.length(); i++) {
            if (Character.isDigit(pin.charAt(i))) {
                System.out.println(true);
                return true;
            }

        }
        return false;
    }

    public static boolean checkPass(String pin) {

        return password(pin) && passwordContainsDigit(pin);


    }
}








