package chiarafais.u5w2venerdi.repositories;

import chiarafais.u5w2venerdi.entities.Postazioni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioniRepository extends JpaRepository<Postazioni, Long> {
}
