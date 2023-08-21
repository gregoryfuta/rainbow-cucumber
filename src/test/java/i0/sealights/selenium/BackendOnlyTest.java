package i0.sealights.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Ignore
public class BackendOnlyTest {

    final RestTemplate restTemplate = new RestTemplate();

    @Test
    public void shouldEvaluateTheExpression() {
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:9080/api/evaluate/3+4",
            String.class);

        assertTrue(actualResponse.getBody().contains("7"));
    }

    @Test
    public void shouldSumTheFiniteGeometricSeries() {
        final ResponseEntity<String> actualResponse = restTemplate.getForEntity(
            "http://localhost:9080/api/evaluate/3+3",
            String.class);

        assertTrue(actualResponse.getBody().contains("6"));
    }
}
