package i0.sealights.unit;

import static org.junit.Assert.assertEquals;

import i0.sealights.cucumber.MathExpressionService;
import org.junit.Test;

public class SimpleUnitTest {
    
    @Test
    public void traditionalJUnit4TestMethod_001() {
        MathExpressionService mathExpressionService = new MathExpressionService();
        mathExpressionService.step001("123");
        
        assertEquals("7", "7");
    }

    @Test
    public void traditionalJUnit4TestMethod_002() {
        MathExpressionService mathExpressionService = new MathExpressionService();
        mathExpressionService.step001("124");

        assertEquals("8", "8");
    }
    
}
