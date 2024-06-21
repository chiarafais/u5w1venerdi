package chiarafais.u5w2venerdi.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "edifici")
@Getter
@Setter

public class Edifici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id_edificio;
    private String nome_edificio;
    private String indirizzo_edificio;
    private String citta_edificio;
    @OneToMany(mappedBy = "edificio")
    private List<Postazioni> lista_postazioni;

    public Edifici() {
    }

    public Edifici( String nome_edificio, String indirizzo_edificio, String citta_edificio) {
        this.nome_edificio = nome_edificio;
        this.indirizzo_edificio = indirizzo_edificio;
        this.citta_edificio = citta_edificio;
    }

    @Override
    public String toString() {
        return "Edifici{" +
                "id_edificio=" + id_edificio +
                ", nome_edificio='" + nome_edificio + '\'' +
                ", indirizzo_edificio='" + indirizzo_edificio + '\'' +
                ", citta_edificio='" + citta_edificio + '\'' +
                '}';
    }
}
