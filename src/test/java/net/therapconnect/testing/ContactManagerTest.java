package net.therapconnect.testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

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

    @DisplayName("Testing parameterized tests with value source")
    @ParameterizedTest
    @ValueSource(strings = {"ggman","reacher","keyboardwarrior420"})
    public void testingParameterizedTests(String firstname){
        var cm = new ContactManager();
        assertTrue(cm.determineFirstNameIsAString(firstname));
    }


//    @Disabled
    @DisplayName("Testing parameterized tests with method source")
    @ParameterizedTest
    @MethodSource("phoneNumbers")
    public void testingParameterizedTestsWithMethodSource(String firstname){
        var cm = new ContactManager();
        assertTrue(cm.determineFirstNameIsAString(firstname));
    }
    public static List<String> phoneNumbers(){
        return Arrays.asList("ggman","reacher","keyboardwarrior");
    }

    @Nested
    class nestedParameterized{
        @DisplayName("Testing parameterized tests with value source")
        @ParameterizedTest
        @ValueSource(strings = {"ggman","reacher","keyboardwarrior"})
        public void testingParameterizedTests(String firstname){
            var cm = new ContactManager();
            assertTrue(cm.determineFirstNameIsAString(firstname));
        }


        //    @Disabled
        @DisplayName("Testing parameterized tests with method source")
        @ParameterizedTest
        @MethodSource("phoneNumbers")
        public void testingParameterizedTestsWithMethodSource(String firstname){
            var cm = new ContactManager();
            assertTrue(cm.determineFirstNameIsAString(firstname));
        }
        public static List<String> phoneNumbers(){
            return Arrays.asList("ggman","reacher","keyboardwarrior");
        }
    }
}