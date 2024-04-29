package net.therapconnect.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTestNested {

    public ContactManager contactManager;

    @BeforeEach
    void shouldRunBeforeEach() {
        // Instantiate ContactManager before each test
        contactManager = new ContactManager();
    }

    @Nested
    class NestedParameterized {

        @DisplayName("Testing parameterized tests with value source")
        @ParameterizedTest
        @ValueSource(strings = {"ggman", "reacher", "keyboardwarrior"})
        public void testingParameterizedTests(String firstName) {
            // Call determineFirstNameIsAString from ContactManager
            assertTrue(contactManager.determineFirstNameIsAString(firstName));
        }

        @Disabled
        @DisplayName("Testing parameterized tests with method source")
        @ParameterizedTest
        @MethodSource("phoneNumbers")
        public void testingParameterizedTestsWithMethodSource(String firstName) {
            // Call determineFirstNameIsAString from ContactManager
            assertTrue(contactManager.determineFirstNameIsAString(firstName));
        }

        // Define method source for testingParameterizedTestsWithMethodSource
        public static List<String> phoneNumbers() {
            return Arrays.asList("ggman", "reacher", "keyboardwarrior");
        }

        //CsvSource
        @DisplayName("Testing CsvSource")
        @ParameterizedTest
        @CsvSource({"01698735445", "01698735321", "01698735987"})
        public void testingCsvSource(String phoneNumber) {
            assertTrue(contactManager.determinePhoneNumberIsAString(phoneNumber));
        }

        //CsvFileSource
        @DisplayName("Testing CsvFileSource")
        @ParameterizedTest
        @CsvFileSource(resources = "/data.csv")
        public void testingCsvFileSource(String phoneNumber) {
            assertTrue(contactManager.determinePhoneNumberIsAString(phoneNumber));
        }
    }
}
