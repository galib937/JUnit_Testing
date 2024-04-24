package net.therapconnect.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void less_than_60() {
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(60));
    }
}