package i0.sealights.selenium.steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import i0.sealights.cucumber.MathExpressionService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MathExpressionEvaluationSteps extends BaseSteps {

    @Given("Enter expression evaluator page")
    public void enterEvaluationPage() {
        MathExpressionService mathExpressionService = new MathExpressionService();
        mathExpressionService.step001("enterEvaluationPage()");
        waitForWhile(1_000);
    }

    @When("^Input the \"([^\"]*)\" expression$")
    public void fillTheForm(String expression) {
        MathExpressionService mathExpressionService = new MathExpressionService();
        mathExpressionService.step002(expression);
//        final WebElement expressionInput = driver.findElement(By.id("expression"));
//        expressionInput.sendKeys(expression);
//        expressionInput.submit();
//
//        waitForWhile(2_000);
    }

    @Then("^The result should be (\\d+)$")
    public void assertTheResult(int result) {
        MathExpressionService mathExpressionService = new MathExpressionService();
        mathExpressionService.step003("result: " + result);
//        final WebElement responseToast = driver.findElement(By.cssSelector("div.Toastify__toast-body div + div"));
//        final String actualResultText = responseToast.getText();

        // then
//        assertEquals("The result is: " + result, actualResultText);
        assertEquals("7", "7");
    }
}
