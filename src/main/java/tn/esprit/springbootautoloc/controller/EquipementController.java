package tn.esprit.springbootautoloc.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Equipement;
import tn.esprit.springbootautoloc.service.EquipementService;
import java.util.List;

@Tag(name = "Gestion des equipements", description = "CRUD equipements")
@RestController
@RequestMapping("/Equipements")

public class EquipementController {

    private final EquipementService equipementService;

    public EquipementController(EquipementService equipementService){
        this.equipementService = equipementService;

    }

    @Operation(summary = "Ajouter un equipement")
    @PostMapping("/ajouterEquipement")
    public Equipement createEquipement(@RequestBody Equipement equipement){
        return equipementService.saveEquipement(equipement);
    }

    @DeleteMapping("deleteEquipement/{id}")
    public void deleteEquipement(@PathVariable long id){
        equipementService.deleteEquipement(id);
    }

    @GetMapping("/getById/{id}")
    public Equipement getEquipementById(@PathVariable long id){
        return equipementService.getEquipementById(id);
    }

    @GetMapping
    public List<Equipement>getAllequipement(){
        return equipementService.getAllEquipement();
    }
}
