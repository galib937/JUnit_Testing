package net.therapconnect.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void shouldReturn_F() {
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(59));
    }
    @Test
    void shouldReturn_A(){
        Grader _grader = new Grader();
        assertEquals('A',_grader.determineLetterGrade(91));
    }
    @Test
    void negativeShouldReturnIllegalArgumentException(){
        Grader _grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            _grader.determineLetterGrade(-1);
        });
    }
}