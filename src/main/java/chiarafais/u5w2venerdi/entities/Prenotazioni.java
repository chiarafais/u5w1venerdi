package chiarafais.u5w2venerdi.entities;

import jakarta.persistence.*;
import lombok.*;

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

    public Prenotazioni() {
    }

    public Prenotazioni(Utenti utente, Postazioni postazione) {
        this.utente = utente;
        this.postazione = postazione;
    }

    @Override
    public String toString() {
        return "Prenotazioni{" +
                "id_prenotazione=" + id_prenotazione +
                ", utente=" + utente +
                ", postazione=" + postazione +
                '}';
    }
}
