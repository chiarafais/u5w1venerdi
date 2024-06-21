package chiarafais.u5w2venerdi.entities;

import chiarafais.u5w2venerdi.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "postazioni")
@Getter
@Setter
public class Postazioni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id_postazione;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;
    private int numero_max_partecipanti;
    @ManyToOne
    @JoinColumn(name = "id_edificio")
    private Edifici edificio;
    @OneToMany(mappedBy = "postazione")
    private List<Prenotazioni> prenotazione;

    public Postazioni() {
    }

    public Postazioni(TipoPostazione tipoPostazione, String descrizione, int numero_max_partecipanti, Edifici edificio) {
        this.tipoPostazione = tipoPostazione;
        this.descrizione = descrizione;
        this.numero_max_partecipanti = numero_max_partecipanti;
        this.edificio = edificio;
    }

    @Override
    public String toString() {
        return "Postazioni{" +
                "id_postazione=" + id_postazione +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", numero_max_partecipanti=" + numero_max_partecipanti +
                ", edificio=" + edificio +
                ", prenotazione=" + prenotazione +
                '}';
    }
}
