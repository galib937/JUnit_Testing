package net.therapconnect.testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @DisplayName("Testing parameterized tests")
    @ParameterizedTest
    @ValueSource(strings = {"ggman","reacher","keyboardwarrior420"})
    public void testingParameterizedTests(String firstname){
        var cm = new ContactManager();
        assertTrue(cm.determineFirstNameIsAString(firstname));
    }

}