package ch.zhaw.iwi.devops.christmaslight;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TestChristmasLight {
    @Test
    void testCreateLightGrid() {
        ChristmasLights lights = new ChristmasLights();
        assertNotNull(lights);
        assertEquals(1000, lights.getWidth());
        assertEquals(1000, lights.getHeight());
    }
}
