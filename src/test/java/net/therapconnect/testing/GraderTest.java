package net.therapconnect.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @BeforeAll
    public static void happyTextBeforeExecutingOthers(){
        System.out.println("Remember folks that marks is not the end of the world. You can always do better");
    }

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