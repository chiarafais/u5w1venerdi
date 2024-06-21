package chiarafais.u5w2venerdi.repositories;

import chiarafais.u5w2venerdi.entities.Edifici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificiRepository extends JpaRepository<Edifici, Long> {
}
