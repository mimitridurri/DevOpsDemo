package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ModuleItemTest {

        @Test
        public void testModuleItem() {
            var moduleItem1 = new ModuleItem(1, "title", "description");
            assertEquals("title", moduleItem1.getTitle());
            assertEquals("description", moduleItem1.getDescription());
            assertEquals(1, moduleItem1.getId());
        }
        
    }
