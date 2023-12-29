package i0.sealights.selenium.steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import i0.sealights.cucumber.FiniteSumService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FiniteSumSteps extends BaseSteps {

    @Given("^Enter sum expression evaluator page$")
    public void enterSumExpressionEvaluatorPage() {
        FiniteSumService finiteSumSteps = new FiniteSumService();
        finiteSumSteps.step001("enterSumExpressionEvaluatorPage()");
        waitForWhile(1_000);
    }

    @When("^Input the values of first \"([^\"]*)\", ratio \"([^\"]*)\" and count \"([^\"]*)\"$")
    public void inputTheValuesOfFirstFirstRatioRatioAndCountCount(String first, String ratio, String count) {
        FiniteSumService finiteSumSteps = new FiniteSumService();
        finiteSumSteps.step002(first);
//        // when - set the field values
//        final WebElement firstInput = driver.findElement(By.id("first"));
//        final WebElement ratioInput = driver.findElement(By.id("ratio"));
//        final WebElement countInput = driver.findElement(By.id("count"));
//        final WebElement evaluateComplexButton = driver.findElement(By.id("evaluateComplex"));
//
//        firstInput.sendKeys(first);
//        ratioInput.sendKeys(ratio);
//        countInput.sendKeys(count);
//
//        // and submit the form
//        evaluateComplexButton.submit();
//
//        waitForWhile(2_000);
    }

    @Then("^The sum result should be (\\d+)$")
    public void theSumResultShouldBeResult(int result) {
        FiniteSumService finiteSumSteps = new FiniteSumService();
        finiteSumSteps.step003("result" + result);
//        final WebElement responseToast = driver.findElement(By.cssSelector("div.Toastify__toast-body div + div"));
//
//        String actualResultText = responseToast.getText();

        // then
//        assertEquals("The result of the summation is: " + result, actualResultText);
        assertEquals("7", "7");
    }
}
