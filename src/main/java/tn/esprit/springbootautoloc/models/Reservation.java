package tn.esprit.springbootautoloc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "reservations")
@Entity
@Getter
@Setter
@NoArgsConstructor // constructeur sans paramètre
@AllArgsConstructor // constructeur avec les paramètres


public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    @Column(name = "date_debut", nullable = false)
    private LocalDate dateDebut;
    @Column(name = "date_fin", nullable = false)
    private LocalDate dateFin;
    @Enumerated(EnumType.STRING)
    private StatusReservation status;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Vehicule vehicule;

    @OneToOne
    private Contrat contret;

}
