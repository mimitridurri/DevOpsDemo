package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ModuleItemControllerTest {

    @Test
    public void testCreate() {
        
        ModuleItemController controller = new ModuleItemController();
        var moduleItem = new ModuleItem(1, "t", "d");
        controller.createModuleItem(moduleItem);
        assertEquals(1, controller.count());
        assertEquals(1, controller.moduleItem().size());


    }

}