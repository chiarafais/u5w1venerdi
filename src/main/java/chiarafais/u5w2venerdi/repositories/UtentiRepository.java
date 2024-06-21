package chiarafais.u5w2venerdi.repositories;

import chiarafais.u5w2venerdi.entities.Utenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtentiRepository extends JpaRepository<Utenti, Long> {

    boolean existsByUsername (String username) ;
}
