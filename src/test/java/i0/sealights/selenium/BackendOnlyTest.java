package i0.sealights.selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class BackendOnlyTest {

    final RestTemplate restTemplate = new RestTemplate();

    @Test
    public void shouldEvaluateTheExpression() {
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+4",
            String.class);

        assertTrue(actualResponse.getBody().contains("7"));
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries01() {
        final String testName = "shouldSumTheFiniteGeometricSeries01";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries02() {
        final String testName = "shouldSumTheFiniteGeometricSeries02";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries03() {
        final String testName = "shouldSumTheFiniteGeometricSeries03";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries04() {
        final String testName = "shouldSumTheFiniteGeometricSeries04";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries05() {
        final String testName = "shouldSumTheFiniteGeometricSeries05";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries06() {
        final String testName = "shouldSumTheFiniteGeometricSeries06";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries07() {
        final String testName = "shouldSumTheFiniteGeometricSeries07";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries08() {
        final String testName = "shouldSumTheFiniteGeometricSeries08";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries09() {
        final String testName = "shouldSumTheFiniteGeometricSeries09";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries11() {
        final String testName = "shouldSumTheFiniteGeometricSeries11";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries12() {
        final String testName = "shouldSumTheFiniteGeometricSeries12";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries13() {
        final String testName = "shouldSumTheFiniteGeometricSeries13";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries14() {
        final String testName = "shouldSumTheFiniteGeometricSeries14";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries15() {
        final String testName = "shouldSumTheFiniteGeometricSeries15";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries16() {
        final String testName = "shouldSumTheFiniteGeometricSeries16";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries17() {
        final String testName = "shouldSumTheFiniteGeometricSeries17";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries18() {
        final String testName = "shouldSumTheFiniteGeometricSeries18";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries19() {
        final String testName = "shouldSumTheFiniteGeometricSeries19";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries21() {
        final String testName = "shouldSumTheFiniteGeometricSeries21";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries22() {
        final String testName = "shouldSumTheFiniteGeometricSeries22";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries23() {
        final String testName = "shouldSumTheFiniteGeometricSeries23";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries24() {
        final String testName = "shouldSumTheFiniteGeometricSeries24";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries25() {
        final String testName = "shouldSumTheFiniteGeometricSeries25";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries26() {
        final String testName = "shouldSumTheFiniteGeometricSeries26";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries27() {
        final String testName = "shouldSumTheFiniteGeometricSeries27";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries28() {
        final String testName = "shouldSumTheFiniteGeometricSeries28";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
            String.class);

        sleep();
        assertTrue(actualResponse.getBody().contains("6"));
        System.out.println("stop test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries29() {
        final String testName = "shouldSumTheFiniteGeometricSeries29";
        System.out.println("start test " + testName + " in thread: " + Thread.currentThread().getName() + ", ID: " + Thread.currentThread().getId());
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:8080/app/evaluate/3+3",
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