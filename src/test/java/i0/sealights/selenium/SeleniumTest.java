package i0.sealights.selenium;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTest {

    private static final String CHROME_DRIVER_LOCATION = "C:\\projekty\\sealigths\\sellenium-philips-mvn\\drivers\\114\\chromedriver.exe";

    private static ChromeDriver driver;

    static {
        if (System.getProperty("webdriver.chrome.driver") == null) {
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
        }
    }

    @BeforeClass
    public static void getLocalWebDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void cleanup() {
        driver.quit();
    }

     @Test
    public void shouldMultiply() throws InterruptedException {
        // given
        driver.navigate().to("http://localhost:8080/struts2demo/multiply.action");


         driver.navigate().to("http://localhost:8080/struts2demo/multiply.action");
        Thread.sleep(2000);

        // and
        setTestNameAndExecutionInBrowser("shouldEvaluateTheExpressionCCC", "57a4dc17-fd78-4934-87a8-a8e3e0f9e0db");

         // when - set the field values
         final WebElement firstInput = driver.findElement(By.id("mul_submit_val1"));
         final WebElement secondInput = driver.findElement(By.id("mul_submit_val2"));
         final WebElement submitButton = driver.findElement(By.id("mul_submit_btn"));

         firstInput.sendKeys("3");
         secondInput.sendKeys("7");

         Thread.sleep(1000) ;
         submitButton.click();
         

        // and
        final WebElement responseElement = driver.findElement(By.id("multiplyResult"));
        final String actualResultText = responseElement.getText();

         Thread.sleep(1000);
        // then
        assertEquals("21", actualResultText);
    }

    @Test
    public void shouldSumTwoValues() throws InterruptedException {
        // given
        driver.navigate().to("http://localhost:8080/struts2demo/add.action");

        Thread.sleep(2000);

        // and
        setTestNameAndExecutionInBrowser("shouldSumTwoValues", "57a4dc17-fd78-4934-87a8-a8e3e0f9e0db");

        // when - set the field values
        final WebElement firstInput = driver.findElement(By.id("add_submit_val1"));
        final WebElement secondInput = driver.findElement(By.id("add_submit_val2"));
        final WebElement submitButton = driver.findElement(By.id("add_submit_btn"));

        firstInput.sendKeys("12");
        secondInput.sendKeys("13");

        // and submit the form
        submitButton.submit();

        Thread.sleep(2000);  // Let the user actually see something!

        final WebElement firstOutput = driver.findElement(By.id("val01"));
        final WebElement secondOutput = driver.findElement(By.id("val02"));
        final WebElement resultOutput = driver.findElement(By.id("addResult"));

        String firstOutputText = firstOutput.getText();
        String secondOutputText = secondOutput.getText();
        String resultOutputText = resultOutput.getText();

        // then
        assertEquals("First value: 12", firstOutputText);
        assertEquals("Second value: 13", secondOutputText);
        assertEquals("Result: 25", resultOutputText);

    }

    private JavascriptExecutor fetchJavascriptExecutor() {
        return (JavascriptExecutor) driver;
    }

    private void setTestNameAndExecutionInBrowser(final String testName,
        final String executionId) throws InterruptedException {
//
//        final JavascriptExecutor javascriptExecutor = fetchJavascriptExecutor();
//        javascriptExecutor.executeScript(
//            "const testStartEvent = new CustomEvent(\"set:baggage\", {detail: { \"x-sl-test-name\": \"" + testName + "\", \"x-sl-test-session-id\":\"" + executionId + "\"},\n"
//                + "    });\n"
//                + "    window.dispatchEvent(testStartEvent);");
//        Thread.sleep(2000);
    }

}
