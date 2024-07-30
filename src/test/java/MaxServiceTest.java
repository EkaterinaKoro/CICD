import main.java.MaxService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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









