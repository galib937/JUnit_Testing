package net.therapconnect.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ContactManagerTest {
    @BeforeAll
    static void shouldRunBeforeAll(){
        System.out.println("Running Before anything has been run");
    }
    @AfterAll
    static void shouldRunAfterAll(){
        System.out.println("Running After everything has done executing");
    }
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

    @DisplayName("Testing the repeated tests")
    @RepeatedTest(value = 10)
    void passwordShouldBeValid(){
        var cm = new ContactManager();
        assertTrue(cm.passwordMustBeValid("acakjh34"));
    }

}