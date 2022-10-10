
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class calculatorTest {
    @Test
    public void isValidExpression() {
        String input = "2+2";
        assertEquals("Checking Validation function", true, main.isValidExpression(input));

        input = "9-2";
        assertEquals("Checking Validation function", true, main.isValidExpression(input));
        
        input = "3*5";
        assertEquals("Checking Validation function", true, main.isValidExpression(input));

        input = "1-1";
        assertEquals("Checking Validation function", true, main.isValidExpression(input));

        input = "(1+2)*2";
        assertEquals("Checking Validation function", true, main.isValidExpression(input));

        input = "-9-3122";
        assertEquals("Checking Validation function", true, main.isValidExpression(input));

        input = "9*1230+2-5+1";
        assertEquals("Checking Validation function", true, main.isValidExpression(input));

        input = "9*1230+2-5+One";
        assertEquals("Checking Validation function", false, main.isValidExpression(input));

        input = "9*shaker";
        assertEquals("Checking Validation function", false, main.isValidExpression(input));

        input = " ";
        assertEquals("Checking Validation function", false, main.isValidExpression(input));

        input = "2 + 5 + 3 * 2 - 1";
        assertEquals("Checking Validation function", false, main.isValidExpression(input));

        input = "(aasd)";
        assertEquals("Checking Validation function", false, main.isValidExpression(input));
    }

    @Test
    public void duplicateOperationCharacters(){
        String input = "1++1";
        assertEquals("Checking that two operators in succession is invalid", true, main.duplicateOperationCharacters(input));

        input = "1+1";
        assertEquals("Checking that a correct expression outputs the correct answer", false, main.duplicateOperationCharacters(input));

        input = "1+-";
        assertEquals("look at it", true, main.duplicateOperationCharacters(input));

        input = "--1";
        assertEquals("I hate java", true, main.duplicateOperationCharacters(input));
    }

    @Test
    public void infixToPostfixTest() {
        String input = "1*2+3";
        String output = "1 2 * 3 +";
        assertEquals("Checking infixToPostFix function with standard input",output, main.infixToPostfix(input));

        input = "(2+3)*(4+5)";
        output = "2 3 + 4 5 + *";
        main.infixToPostfix(input);
        assertEquals("Checking infixToPostFix function with brackets",output, main.infixToPostfix(input));
    }

    @Test
    public void evaluatePostfixTest(){
        String input = "1 2 * 3 +";
        int output = 5;
        assertEquals("Checking evaluate postfix expression",output, main.evaluatePostfix(input));

        input = "2 2 +";
        output = 4;
        assertEquals("Checking evaluate postfix expression",output, main.evaluatePostfix(input));
        
        input = "1 1 -";
        output = 0;
        assertEquals("Checking evaluate postfix expression",output, main.evaluatePostfix(input));

        input = "13 12 +";
        output = 25;
        assertEquals("Checking evaluate postfix expression",output, main.evaluatePostfix(input));

        input = "16 2 /";
        output = 8;
        assertEquals("Checking evaluate postfix expression",output, main.evaluatePostfix(input));
    }


}
