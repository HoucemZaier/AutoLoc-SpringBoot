package tn.esprit.springbootautoloc.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Reservation;
import tn.esprit.springbootautoloc.service.ReservationService;
import java.util.List;

@Tag(name = "Gestion des reservations", description = "CRUD reservations") // tag pour tout le controlleur
@RestController
@RequestMapping("/Reservations")

public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;

    }

    @Operation(summary = "Ajouter une reservation")
    @PostMapping("/ajouterReservation")
    public Reservation createReservation(@RequestBody Reservation reservation){
        return reservationService.saveReservation(reservation);
    }

    @DeleteMapping("deleteReservation/{id}")
    public void deleteReservation(@PathVariable long id){
        reservationService.deleteReservation(id);
    }

    @GetMapping("/getById/{id}")
    public Reservation getReservationById(@PathVariable long id){
        return reservationService.getReservationById(id);
    }

    @GetMapping
    public List<Reservation>getAllreservation(){
        return reservationService.getAllReservation();
    }
}
