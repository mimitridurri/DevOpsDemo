package ch.zhaw.iwi.devops.christmaslight;

import org.junit.jupiter.api.Test;

public class LightGridTest {
    @Test
    public void should_create_light_grid(){
        
        LightGrid lightGrid = new LightGrid();

    }
    @Test
    public void should_trun_on_all_lights() {
        LightGrid lightGrid = new LightGrid();
        lightGrid.turnOn(CoordinatePair.of(0, 0, 999, 999));
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                assertThat(lightGrid.getLight(i, j).isOn(), is(true));
        }
    }
}
