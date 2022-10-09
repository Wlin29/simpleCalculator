import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class calculatorTest {
    public void validation() {
        String input = "2+2";
        assertEquals("Checking Validation function", true, main.isValidExpression(input));
        input = "2+2";
    }
}
