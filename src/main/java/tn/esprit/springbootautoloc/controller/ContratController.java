package tn.esprit.springbootautoloc.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Contrat;
import tn.esprit.springbootautoloc.service.ContratService;
import java.util.List;

@Tag(name = "Gestion des contrats", description = "CRUD contrats")
@RestController
@RequestMapping("/Contrats")
public class ContratController {

    private final ContratService contratService;

    public ContratController(ContratService contratService){
        this.contratService = contratService;

    }

    @Operation(summary = "Ajouter un contrat")
    @PostMapping("/ajouterContrat")
    public Contrat createContrat(@RequestBody Contrat contrat){
        return contratService.saveContrat(contrat);
    }

    @DeleteMapping("deleteContrat/{id}")
    public void deleteContrat(@PathVariable long id){
        contratService.deleteContrat(id);
    }

    @GetMapping("/getById/{id}")
    public Contrat getContratById(@PathVariable long id){
        return contratService.getContratById(id);
    }

    @GetMapping
    public List<Contrat>getAllcontrat(){
        return contratService.getAllContrat();
    }
}
