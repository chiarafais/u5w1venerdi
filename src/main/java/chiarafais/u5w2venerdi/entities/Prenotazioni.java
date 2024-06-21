package chiarafais.u5w2venerdi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
public class Prenotazioni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id_prenotazione;
    @ManyToOne
    @JoinColumn(name = "utente")
    private Utenti utente;
    @ManyToOne
    @JoinColumn(name = "postazione")
    private Postazioni postazione;
    private LocalDate data_prenotazione;
    private LocalDate data_fine_prenotazione;

    public Prenotazioni() {
    }

    public Prenotazioni(Utenti utente, Postazioni postazione,LocalDate data_prenotazione) {
        this.utente = utente;
        this.postazione = postazione;
        this.data_prenotazione = data_prenotazione;
        this.data_fine_prenotazione = data_prenotazione.plusDays(1);
    }

    @Override
    public String toString() {
        return "Prenotazioni{" +
                "id_prenotazione=" + id_prenotazione +
                ", utente=" + utente +
                ", postazione=" + postazione +
                ", data_prenotazione=" + data_prenotazione +
                ", data_fine_prenotazione=" + data_fine_prenotazione +
                '}';
    }
}
