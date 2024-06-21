package chiarafais.u5w2venerdi.services;


import chiarafais.u5w2venerdi.entities.Utenti;
import chiarafais.u5w2venerdi.exceptions.NotFoundException;
import chiarafais.u5w2venerdi.repositories.UtentiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtentiService {
    @Autowired
    private UtentiRepository utentiRepository;

    public void saveUtente(Utenti newUser) {


        if (utentiRepository.existsByUsername(newUser.getUsername())) {
            throw new RuntimeException("L'username" + newUser.getUsername() + " è già in uso!");
        }
        if (newUser.getUsername().length() < 4) throw new RuntimeException("Il nome non può essere più corto di 4 caratteri");

        utentiRepository.save(newUser);
        log.info("Nuovo utente " + newUser.getUsername() + " salvato correttamente");
    }

    public Utenti findById(long id){
        return utentiRepository.findById(id).orElseThrow(()->new NotFoundException(id));
    }
}
