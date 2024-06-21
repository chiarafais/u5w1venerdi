package chiarafais.u5w2venerdi.repositories;

import chiarafais.u5w2venerdi.entities.Postazioni;
import chiarafais.u5w2venerdi.entities.Prenotazioni;
import chiarafais.u5w2venerdi.entities.Utenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;


@Repository
public interface PrenotazioniRepository extends JpaRepository<Prenotazioni, Long> {

    boolean existsByPostazioneAndDataPrenotazione( Postazioni postazione, LocalDate data);
    boolean existsByUtenteAndDataPrenotazione(Utenti utente, LocalDate data);
}
