package ch.zhaw.iwi.devops.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class ModuleItemController {

    private Map<Integer, ModuleItem> moduleItems = new HashMap<>();

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        this.moduleItems.put(1,new ModuleItem(1, "Neuer Job", "5 DevOps Engineers einstellen"));
        this.moduleItems.put(2,new ModuleItem(2, "Geschäftsleitung", "Mit Präsentation von DevOps überzeugen"));
        this.moduleItems.put(3,new ModuleItem(3, "Unit Tests", "Neues Projekt mit Unit Tests starten"));
        this.moduleItems.put(4,new ModuleItem(4, "Deployment", "Jede Woche!"));
        System.out.println("Init Data ModuleItemController");

    }

    @GetMapping("/testmoduleItem")
    public String testModuleItem() {
        return "ModuleItem app is up and running! HI!";
    }

    @GetMapping("/moduleItem/services/ping")
    public String ping() {
        String languageCode = "de";
        return "{ \"status\": \"ok\", \"userId\": \"admin"+ "\", \"languageCode\": \"" + languageCode + "\",\"version\": \"0.0.1" + "\"}";
    }

    @GetMapping("/moduleItem/count")
    public int count() {
        return this.moduleItems.size();
    }

    @GetMapping("/services/moduleItem")
    public List<PathListEntry<Integer>> moduleItem() {
        var result = new ArrayList<PathListEntry<Integer>>();
        for (var moduleItem : this.moduleItems.values()) {
            var entry = new PathListEntry<Integer>();
            entry.setKey(moduleItem.getId(), "moduleItemKey");
            entry.setName(moduleItem.getTitle());
            entry.getDetails().add(moduleItem.getDescription());
            entry.setTooltip(moduleItem.getDescription());
            result.add(entry);
        }
        return result;
    }
    

    @GetMapping("/services/moduleItem/{key}")
    public ModuleItem getModuleItem(@PathVariable Integer key) {
        return this.moduleItems.get(key);
    }

    @PostMapping("/services/moduleItem")
    public void createModuleItem(@RequestBody ModuleItem moduleItem) {
        var newId = this.moduleItems.keySet().stream().max(Comparator.naturalOrder()).orElse(0) + 1;
        moduleItem.setId(newId);
        this.moduleItems.put(newId, moduleItem);
    }

    @PutMapping("/services/moduleItem/{id}")
    public void updateModuleItem(@PathVariable Integer id, @RequestBody ModuleItem moduleItem) {
        moduleItem.setId(id);
        this.moduleItems.put(id, moduleItem);
    }

    @DeleteMapping("/services/moduleItem/{key}")
    public ModuleItem deleteModuleItem(@PathVariable Integer key) {
        return this.moduleItems.remove(key);
    }
}
