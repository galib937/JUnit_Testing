package net.therapconnect.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    public static Grader grader;

    @BeforeAll
    public static void happyTextBeforeExecutingOthers(){
        System.out.println("Remember folks that marks is not the end of the world. You can always do better");
        grader = new Grader();
    }

    @Test
    void shouldReturn_F() {
        assertEquals('F',grader.determineLetterGrade(59));
    }
    @Test
    void shouldReturn_A(){
        assertEquals('A',grader.determineLetterGrade(91));
    }
    @Test
    void shouldReturn_B(){
        assertEquals('B',grader.determineLetterGrade(89));
    }
    @Test
    void negativeShouldReturnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineLetterGrade(-1);
        });
    }

}