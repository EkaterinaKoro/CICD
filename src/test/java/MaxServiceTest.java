package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test
    public void ShouldFinMax() {
        MaxService maxService = new MaxService();
        int a = 5;
        int b = 3;

        int expected = a;
        int actual = maxService.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
