package tn.esprit.springbootautoloc.service;

import tn.esprit.springbootautoloc.models.Paiement;

import java.util.List;
public interface PaimentService {
    Paiement savePaiment(Paiement paiement);
    void deleteReservation(Long idPaiement);
    Paiement getPaiementById(Long idPaiement);
    List<Paiement> getAllPaiment();

}
