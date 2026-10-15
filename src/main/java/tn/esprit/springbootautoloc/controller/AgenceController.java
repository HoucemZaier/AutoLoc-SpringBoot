package tn.esprit.springbootautoloc.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Agence;
import tn.esprit.springbootautoloc.service.AgenceService;
import java.util.List;

@Tag(name = "Gestion des agences", description = "CRUD agences")
@RestController
@RequestMapping("/Agences")

public class AgenceController {

    private final AgenceService agenceService;

    public AgenceController(AgenceService agenceService){
        this.agenceService = agenceService;

    }

    @Operation(summary = "Ajouter une agence")
    @PostMapping("/ajouterAgence")
    public Agence createAgence(@RequestBody Agence agence){
        return agenceService.saveAgence(agence);
    }

    @DeleteMapping("deleteAgence/{id}")
    public void deleteAgence(@PathVariable long id){
        agenceService.deleteAgence(id);
    }

    @GetMapping("/getById/{id}")
    public Agence getAgenceById(@PathVariable long id){
        return agenceService.getAgenceById(id);
    }

}
