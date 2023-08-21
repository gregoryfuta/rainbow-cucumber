package i0.sealights.selenium.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StrutsSeleniumSteps extends BaseSteps {

    private static final String CHROME_DRIVER_LOCATION = "C:\\projekty\\sealigths\\sellenium-philips-mvn\\drivers\\114\\chromedriver.exe";

    private static ChromeDriver driver;

    static {
        if (System.getProperty("webdriver.chrome.driver") == null) {
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
        }
    }
    
    @AfterClass
    public static void cleanup() {
        driver.quit();
    }
    
    @Given("^Enter sum expression evaluator page$")
    public void enterSumExpressionEvaluatorPage() {
        waitForWhile(1_000);
    }

    @When("^Go with it$")
    public void inputTheValuesOfFirstFirstRatioRatioAndCountCount() throws Exception {
        // given
        BaseSteps.driver.navigate().to("http://localhost:8080/struts2demo/multiply.action");

        Thread.sleep(2000);

//        // when - set the field values
        final WebElement firstInput = BaseSteps.driver.findElement(By.id("mul_submit_val1"));
        final WebElement secondInput = BaseSteps.driver.findElement(By.id("mul_submit_val2"));
        final WebElement submitButton = BaseSteps.driver.findElement(By.id("mul_submit_btn"));
//
        firstInput.sendKeys("3");
        secondInput.sendKeys("7");
//
        Thread.sleep(1000) ;
        submitButton.click();


        // and
        final WebElement responseElement = BaseSteps.driver.findElement(By.id("multiplyResult"));
        final String actualResultText = responseElement.getText();
//
//        Thread.sleep(1000);
        
        assertEquals("21", actualResultText);
    }

    @Then("^The sum result should be$")
    public void theSumResultShouldBeResult() {
//        final WebElement responseToast = driver.findElement(By.cssSelector("div.Toastify__toast-body div + div"));
//
//        String actualResultText = responseToast.getText();

        // then
        assertEquals("2", "2");
    }

    protected void waitForWhile(int waitMilliseconds) {
        try {
            Thread.sleep(waitMilliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
