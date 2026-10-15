package tn.esprit.springbootautoloc.service;
import tn.esprit.springbootautoloc.models.Equipement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.repository.EquipementRepository;

import java.util.List;

@Service
public class EquipementServiceImpl implements EquipementService{
    @Autowired
    private EquipementRepository equipementRepository;
    @Override
    public Equipement saveEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void deleteEquipement(Long idEquipement) {
        equipementRepository.deleteById(idEquipement);
    }

    @Override
    public Equipement getEquipementById(Long idEquipement) {
        return equipementRepository.findById(idEquipement).get();
    }

    @Override
    public List<Equipement> getAllEquipement() {
        return equipementRepository.findAll();
    }
}
