package i0.sealights.selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class AsyncBackendOnlyTest {

    final RestTemplate restTemplate = new RestTemplate();
    private String baseEndpointUrl = "http://localhost:8080/app/evaluateAsync";

    @Test
    public void shouldEvaluateTheExpression() {
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+4",
            String.class);

        assertTrue(actualResponse.getBody().contains("7"));
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries01() {
        final String testName = "shouldSumTheFiniteGeometricSeries01";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries02() {
        final String testName = "shouldSumTheFiniteGeometricSeries02";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries03() {
        final String testName = "shouldSumTheFiniteGeometricSeries03";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries04() {
        final String testName = "shouldSumTheFiniteGeometricSeries04";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries05() {
        final String testName = "shouldSumTheFiniteGeometricSeries05";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries06() {
        final String testName = "shouldSumTheFiniteGeometricSeries06";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries07() {
        final String testName = "shouldSumTheFiniteGeometricSeries07";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries08() {
        final String testName = "shouldSumTheFiniteGeometricSeries08";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries09() {
        final String testName = "shouldSumTheFiniteGeometricSeries09";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries11() {
        final String testName = "shouldSumTheFiniteGeometricSeries11";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries12() {
        final String testName = "shouldSumTheFiniteGeometricSeries12";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries13() {
        final String testName = "shouldSumTheFiniteGeometricSeries13";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries14() {
        final String testName = "shouldSumTheFiniteGeometricSeries14";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries15() {
        final String testName = "shouldSumTheFiniteGeometricSeries15";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries16() {
        final String testName = "shouldSumTheFiniteGeometricSeries16";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries17() {
        final String testName = "shouldSumTheFiniteGeometricSeries17";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries18() {
        final String testName = "shouldSumTheFiniteGeometricSeries18";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries19() {
        final String testName = "shouldSumTheFiniteGeometricSeries19";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl + "/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries21() {
        final String testName = "shouldSumTheFiniteGeometricSeries21";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries22() {
        final String testName = "shouldSumTheFiniteGeometricSeries22";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries23() {
        final String testName = "shouldSumTheFiniteGeometricSeries23";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries24() {
        final String testName = "shouldSumTheFiniteGeometricSeries24";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries25() {
        final String testName = "shouldSumTheFiniteGeometricSeries25";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries26() {
        final String testName = "shouldSumTheFiniteGeometricSeries26";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries27() {
        final String testName = "shouldSumTheFiniteGeometricSeries27";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries28() {
        final String testName = "shouldSumTheFiniteGeometricSeries28";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void asyncShouldSumTheFiniteGeometricSeries29() {
        final String testName = "shouldSumTheFiniteGeometricSeries29";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            baseEndpointUrl +"/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
