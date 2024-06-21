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
    @Column(name= "data_prenotazione")
    private LocalDate dataPrenotazione;

    public Prenotazioni() {
    }

    public Prenotazioni(Utenti utente, Postazioni postazione,LocalDate data_prenotazione) {
        this.utente = utente;
        this.postazione = postazione;
        this.dataPrenotazione = data_prenotazione;
    }

    @Override
    public String toString() {
        return "Prenotazioni{" +
                "id_prenotazione=" + id_prenotazione +
                ", utente=" + utente +
                ", postazione=" + postazione +
                ", data_prenotazione=" + dataPrenotazione +
                '}';
    }
}
