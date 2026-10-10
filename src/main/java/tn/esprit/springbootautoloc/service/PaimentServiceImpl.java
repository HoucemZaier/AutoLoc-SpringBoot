package tn.esprit.springbootautoloc.service;
import tn.esprit.springbootautoloc.models.Paiement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.repository.PaimentRepository;
import java.util.List;

public class PaimentServiceImpl implements PaimentService {
    @Autowired
    private PaimentRepository paimentRepository;

    @Override
    public Paiement savePaiment(Paiement paiement) {
        return paimentRepository.save(paiement);
    }

    @Override
    public void deleteReservation(Long idPaiement) {
        paimentRepository.deleteById(idPaiement);
    }

    @Override
    public Paiement getPaiementById(Long idPaiement) {
        return paimentRepository.findById(idPaiement).get();
    }

    @Override
    public List<Paiement> getAllPaiment() {
        return paimentRepository.findAll();
    }
}
