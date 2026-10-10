package tn.esprit.springbootautoloc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Table(name = "agences")
@Entity
@Getter
@Setter
@NoArgsConstructor // constructeur sans paramètre
@AllArgsConstructor // constructeur avec les paramètres

public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;

    @OneToMany(mappedBy = "agence")
    private List<Employee> employes;

}
