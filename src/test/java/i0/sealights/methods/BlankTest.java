package i0.sealights.methods;

import static org.junit.Assert.assertEquals;

import i0.sealights.veeve.VeeveCustomMethods;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class BlankTest {

    final RestTemplate restTemplate = new RestTemplate();

    @Test
    public void shouldSumTheFiniteGeometricSeries() {
        VeeveCustomMethods veeveCustomMethods = new VeeveCustomMethods();

        assertEquals(12, veeveCustomMethods.methodIncludeInt(12));

    }
}
