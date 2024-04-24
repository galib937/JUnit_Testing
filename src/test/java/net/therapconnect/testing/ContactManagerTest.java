package net.therapconnect.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactManagerTest {
    @Test
    void FirstnameShouldBeString(){
        var cm = new ContactManager();
        assertTrue(cm.determineFirstNameIsAString("John"));
    }

    @Test
    void LastnameShouldBeString(){
        var cm = new ContactManager();
        assertTrue(cm.determineLastNameIsAString("Doe"));
    }
    @Test
    void phoneNumberShouldBeString(){
        var cm = new ContactManager();
        assertTrue(cm.determinePhoneNumberIsAString("987654321"));
    }


    @Test
    void passwordShouldBeValid(){
        var cm = new ContactManager();
        assertTrue(cm.passwordMustBeValid("acakjh34"));
    }
}