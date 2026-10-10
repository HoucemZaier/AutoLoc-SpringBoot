package tn.esprit.springbootautoloc.service;

import tn.esprit.springbootautoloc.models.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.repository.VehiculeRepository;


import java.util.List;

public class VehiculeServiceImpl implements VehiculeService{
    @Autowired
    private VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule saveVehicule(Vehicule vehicule) {

        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long idVehicule) {
        vehiculeRepository.deleteById(idVehicule);

    }

    @Override
    public Vehicule getVehiculeById(Long idVehicule) {

        return vehiculeRepository.findById(idVehicule).get();

    }

    @Override
    public List<Vehicule> getAllVehicule() {

        return vehiculeRepository.findAll();
    }
}
