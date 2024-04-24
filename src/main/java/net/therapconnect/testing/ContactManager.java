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

}
