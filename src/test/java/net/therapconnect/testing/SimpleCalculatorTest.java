package net.therapconnect.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class SimpleCalculatorTest {
    @Test
    void A_added_to_B_equals_C(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void A_added_to_B_equals_C_1(){
        var calculator = new SimpleCalculator();
        assertEquals(10,calculator.add(3,7));
    }

//    @Test
//    void A_multiplied_by_B_equals_C(){
//        var calculator = new SimpleCalculator();
//        assertEquals(16,calculator.multiply(4,4));
//    }
}