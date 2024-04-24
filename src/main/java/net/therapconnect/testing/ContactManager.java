package net.therapconnect.testing;

public class ContactManager {
    public boolean determineFirstNameIsAString(String str) {
        String regex = "^[a-zA-Z]+$";
        return str.matches(regex);
    }

    public boolean determineLastNameIsAString(String str) {
        String regex = "^[a-zA-Z]+$";
        return str.matches(regex);
    }

    public boolean determinePhoneNumberIsAString(String str) {
        String regex = "^[0-9]+$";
        return str.matches(regex);
    }

    public boolean passwordMustBeValid(String str) {
        return str.length()>=8 && str.length()<=100;
    }
}
