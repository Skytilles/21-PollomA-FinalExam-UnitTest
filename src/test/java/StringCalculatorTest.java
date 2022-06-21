import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    @Test
    public void testNegativeNumbers(){

        assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("-1, 5");
            assertEquals(4, true);
        }, "Negatives Not Allowed");

    }
    @Test
    public void testOneThousand(){
            StringCalculator.add("1, 1000");
            assertEquals(1, true);

    }
}
