package chiarafais.u5w2venerdi.services;

import chiarafais.u5w2venerdi.entities.Postazioni;
import chiarafais.u5w2venerdi.entities.Utenti;
import chiarafais.u5w2venerdi.exceptions.NotFoundException;
import chiarafais.u5w2venerdi.repositories.PostazioniRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostazioniService {
    @Autowired
    private PostazioniRepository postazioniRepository;

    public void savePostazione(Postazioni newPostazione) {
        postazioniRepository.save(newPostazione);
        log.info("Nuova postazione " + newPostazione.getTipoPostazione()+ " - " + newPostazione.getDescrizione() +" salvato correttamente");
    }
    public Postazioni findById(long id){
        return postazioniRepository.findById(id).orElseThrow(()->new NotFoundException(id));
    }
}
