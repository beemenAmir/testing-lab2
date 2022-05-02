import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {
    Question1 question = new Question1();
@Test
    void evenOddTest() {

        assertEquals("even",question.evenOdd(2));
        assertEquals("odd",question.evenOdd(1));
        assertEquals("even",question.evenOdd(0));
    }
@Test
    void maxMin() {
    int[] arr={-12,3,5,124,6,425,0,-19};
    int[] minMax = {-19,425};
    assertArrayEquals(minMax,question.maxMin(arr));
    }
}