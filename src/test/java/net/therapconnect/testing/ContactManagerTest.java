package net.therapconnect.testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
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

    @Disabled
    @BeforeEach
    void shouldRunBeforeEach(){
        System.out.println("Running Before each test");
    }

    @Disabled
    @AfterEach
    void shouldRunAfterEach(){
        System.out.println("Running After each test");
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


    @Nested
    class nestedParameterized{
        @DisplayName("Testing parameterized tests with value source")
        @ParameterizedTest
        @ValueSource(strings = {"ggman","reacher","keyboardwarrior"})
        public void testingParameterizedTests(String firstname){
            var cm = new ContactManager();
            assertTrue(cm.determineFirstNameIsAString(firstname));
        }


        @Disabled
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

    @Nested
    class nestedCSV{
        //CsvSource

        @DisplayName("Testing CsvSource")
        @ParameterizedTest
        @CsvSource({"01698735445", "01698735321", "01698735987"})
        public void testingCsvSource(String phoneNumber){
            var cm = new ContactManager();
            assertTrue(cm.determinePhoneNumberIsAString(phoneNumber));
        }

        //CsvFileSource

        @DisplayName("Testing CsvFileSource")
        @ParameterizedTest
        @CsvFileSource(resources = "/data.csv")
        public void testingCsvFileSource(String phoneNumber){
            var cm = new ContactManager();
            assertTrue(cm.determinePhoneNumberIsAString(phoneNumber));
        }
    }


}