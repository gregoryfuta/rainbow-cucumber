package i0.sealights.selenium.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSteps {

    public static ChromeDriver driver;

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
