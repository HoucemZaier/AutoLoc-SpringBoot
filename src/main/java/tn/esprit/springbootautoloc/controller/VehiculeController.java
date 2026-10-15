package tn.esprit.springbootautoloc.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Vehicule;
import tn.esprit.springbootautoloc.service.VehiculeService;
import java.util.List;

@Tag(name = "Gestion des vehicules", description = "CRUD vehicules")
@RestController
@RequestMapping("/Vehicules")

public class VehiculeController {

    private final VehiculeService vehiculeService;

    public VehiculeController(VehiculeService vehiculeService){
        this.vehiculeService = vehiculeService;

    }

    @Operation(summary = "Ajouter un vehicule")
    @PostMapping("/ajouterVehicule")
    public Vehicule createVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.saveVehicule(vehicule);
    }

    @DeleteMapping("deleteVehicule/{id}")
    public void deleteVehicule(@PathVariable long id){
        vehiculeService.deleteVehicule(id);
    }

    @GetMapping("/getById/{id}")
    public Vehicule getVehiculeById(@PathVariable long id){
        return vehiculeService.getVehiculeById(id);
    }

    @GetMapping
    public List<Vehicule>getAllvehicule(){
        return vehiculeService.getAllVehicule();
    }
}
