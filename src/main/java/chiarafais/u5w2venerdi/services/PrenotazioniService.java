package chiarafais.u5w2venerdi.services;


import chiarafais.u5w2venerdi.entities.Prenotazioni;
import chiarafais.u5w2venerdi.repositories.PrenotazioniRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioniService {
    @Autowired
    private PrenotazioniRepository prenotazioniRepository;

    public void savePrenotazione(Prenotazioni newPrenotazione) {
        if(prenotazioniRepository.existsByPostazioneAndDataPrenotazione(newPrenotazione.getPostazione(), newPrenotazione.getDataPrenotazione())){
        throw new RuntimeException("non disponibile!");
        }
        prenotazioniRepository.save(newPrenotazione);
        log.info("Prenotazione n° : " + newPrenotazione.getId_prenotazione() + " è stata salvata correttamente");
    }

}
