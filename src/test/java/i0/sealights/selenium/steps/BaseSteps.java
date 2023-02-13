package i0.sealights.selenium.steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseSteps {

    private static final String CHROME_DRIVER_LOCATION = "c:\\Users\\grzeg\\sellenium-philips-mvn\\drivers\\chromedriver.exe";

    static ChromeDriver driver;

    static {
        if (System.getProperty("webdriver.chrome.driver") == null) {
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
        }

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    protected void waitForWhile(int waitMilliseconds) {
        try {
            Thread.sleep(waitMilliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    protected JavascriptExecutor fetchJavascriptExecutor() {
        return (JavascriptExecutor) driver;
    }

    protected void setTestNameAndExecutionInBrowser(final String testName, final String executionId) {
        final JavascriptExecutor javascriptExecutor = fetchJavascriptExecutor();
        javascriptExecutor.executeScript(
            "const testStartEvent = new CustomEvent(\"set:baggage\", {detail: { \"x-sl-test-name\": \"" + testName + "\", \"x-sl-test-session-id\":\"" + executionId + "\"},\n"
                + "    });\n"
                + "    window.dispatchEvent(testStartEvent);");
        waitForWhile(2_000);
    }

}
