package tn.esprit.springbootautoloc.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Paiement;
import tn.esprit.springbootautoloc.service.PaimentService;
import java.util.List;

@Tag(name = "Gestion des paiements", description = "CRUD paiement")
@RestController
@RequestMapping("/Paiements")

public class PaimentController {

    private final PaimentService paimentService;

    public PaimentController(PaimentService paimentService){
        this.paimentService = paimentService;

    }

    @Operation(summary = "Ajouter un paiement")
    @PostMapping("/ajouterPaiement")
    public Paiement createPaiment(@RequestBody Paiement paiement){
        return paimentService.savePaiment(paiement);
    }

    @DeleteMapping("deletePaiement/{id}")
    public void deletePaiment(@PathVariable long id){
        paimentService.deleteReservation(id);
    }

    @GetMapping("/getById/{id}")
    public Paiement getPaimentById(@PathVariable long id){
        return paimentService.getPaiementById(id);
    }

    @GetMapping
    public List<Paiement>getAllpaiment(){
        return paimentService.getAllPaiment();
    }
}
