package tn.esprit.springbootautoloc.service;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.springbootautoloc.models.Agence;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.repository.AgenceRepository;
import java.util.List;

@Service
public class AgenceServiceImpl implements AgenceService{
    @Autowired
    private AgenceRepository agenceRepository;

    @Override
    public Agence saveAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long idAgence) {
        agenceRepository.deleteById(idAgence);
    }

    @Override
    public Agence getAgenceById(Long idAgence) {

        return agenceRepository.findById(idAgence).get();
    }

    @Override
    public List<Agence> getAgence() {
        return agenceRepository.findAll();
    }
}
