package chiarafais.u5w2venerdi.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "utenti")
@Getter
@Setter

public class Utenti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id_user;
    private String username;
    private String name;
    private String email;
    @OneToMany(mappedBy = "utente")
    private List<Prenotazioni> lista_prenotazioni;

    public Utenti() {
    }

    public Utenti( String username, String name, String email) {
        this.username = username;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utenti{" +
                "id_user=" + id_user +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
