package chiarafais.u5w2venerdi.repositories;

import chiarafais.u5w2venerdi.entities.Prenotazioni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioniRepository extends JpaRepository<Prenotazioni, Long> {
}
