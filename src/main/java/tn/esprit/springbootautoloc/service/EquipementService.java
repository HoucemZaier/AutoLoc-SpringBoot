package tn.esprit.springbootautoloc.service;
import tn.esprit.springbootautoloc.models.Equipement;
import tn.esprit.springbootautoloc.models.Paiement;

import java.util.List;
public interface EquipementService {
    Equipement saveEquipement(Equipement equipement);
    void deleteEquipement(Long idEquipement);
    Equipement getEquipementById(Long idEquipement);
    List<Equipement> getAllEquipement();
}
