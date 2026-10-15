package tn.esprit.springbootautoloc.service;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.springbootautoloc.models.Contrat;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.repository.ContratRepository;
import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {
    @Autowired
    private ContratRepository contratRepository;
    
    @Override
    public Contrat saveContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);
    }

    @Override
    public Contrat getContratById(Long idContrat) {
        return contratRepository.findById(idContrat).get();
    }

    @Override
    public List<Contrat> getAllContrat() {
        return contratRepository.findAll();
    }
}
