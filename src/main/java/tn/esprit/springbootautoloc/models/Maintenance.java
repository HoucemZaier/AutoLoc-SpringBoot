package tn.esprit.springbootautoloc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "maintenances")
@Entity
@Getter
@Setter
@NoArgsConstructor // constructeur sans paramètre
@AllArgsConstructor // constructeur avec les paramètres

public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    @Column(name = "date_debut", nullable = false)
    private LocalDate dateDebut;
    @Column(name = "date_fin", nullable = false)
    private LocalDate dateFin;
    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    private Vehicule vehicule;

}
