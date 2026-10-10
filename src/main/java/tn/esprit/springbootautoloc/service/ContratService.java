package tn.esprit.springbootautoloc.service;
import tn.esprit.springbootautoloc.models.Contrat;
import java.util.List;

public interface ContratService {
    Contrat saveContrat(Contrat contrat);
    void deleteContrat(Long idContrat);
    Contrat getContratById(Long idContrat);
    List<Contrat> getAllContrat();
}
