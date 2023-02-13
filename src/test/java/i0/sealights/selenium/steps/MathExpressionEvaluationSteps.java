package i0.sealights.selenium.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MathExpressionEvaluationSteps extends BaseSteps {

    @Given("Enter expression evaluator page")
    public void enterEvaluationPage() {
        driver.navigate().to("http://localhost:9080/");
        waitForWhile(2_000);
        setTestNameAndExecutionInBrowser("shouldEvaluateTheExpressionCCC", "execution-03");
    }

    @When("Input the expression")
    public void fillTheForm() {
        final WebElement expressionInput = driver.findElement(By.id("expression"));
        expressionInput.sendKeys("3 * (4 + 3)");
        expressionInput.submit();

        waitForWhile(2_000);
    }

    @Then("The result should be 21")
    public void assertTheResult() {
        final WebElement responseToast = driver.findElement(By.cssSelector("div.Toastify__toast-body div + div"));
        final String actualResultText = responseToast.getText();

        // then
        assertEquals("The result is: 21", actualResultText);
    }
}
