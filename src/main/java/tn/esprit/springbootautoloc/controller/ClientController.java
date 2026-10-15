package tn.esprit.springbootautoloc.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Client;
import tn.esprit.springbootautoloc.service.ClientService;
import java.util.List;

@Tag(name = "Gestion des clients", description = "CRUD clients")
@RestController
@RequestMapping("/Clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;

    }

    @Operation(summary = "Ajouter un client")
    @PostMapping("/ajouterClient")
    public Client createClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @DeleteMapping("deleteClient/{id}")
    public void deleteClient(@PathVariable long id){
        clientService.deleteClient(id);
    }

    @GetMapping("/getById/{id}")
    public Client getClientById(@PathVariable long id){
        return clientService.getCLientById(id);
    }


}
