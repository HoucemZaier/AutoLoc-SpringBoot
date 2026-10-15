package tn.esprit.springbootautoloc.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Maintenance;
import tn.esprit.springbootautoloc.service.MaintenanceService;
import java.util.List;

@Tag(name = "Gestion des maintenances", description = "CRUD maintenances")
@RestController
@RequestMapping("/Maintenances")
public class MaintenanceController {

    private final MaintenanceService maintenanceService;

    public MaintenanceController(MaintenanceService maintenanceService){
        this.maintenanceService = maintenanceService;

    }

    @Operation(summary = "Ajouter une maintenance")
    @PostMapping("/ajouterMaintenance")
    public Maintenance createMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.saveMaintenance(maintenance);
    }

    @DeleteMapping("deleteMaintenance/{id}")
    public void deleteMaintenance(@PathVariable long id){
        maintenanceService.deleteMaintenance(id);
    }

    @GetMapping("/getById/{id}")
    public Maintenance getMaintenanceById(@PathVariable long id){
        return maintenanceService.getMaintenanceById(id);
    }

    @GetMapping
    public List<Maintenance>getAllmaintenance(){
        return maintenanceService.getAllMaintenance();
    }


}
