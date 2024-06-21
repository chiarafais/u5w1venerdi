package chiarafais.u5w2venerdi.services;

import chiarafais.u5w2venerdi.entities.Edifici;
import chiarafais.u5w2venerdi.exceptions.NotFoundException;
import chiarafais.u5w2venerdi.repositories.EdificiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificiService {
    @Autowired
    private EdificiRepository edificiRepository;

    public void saveEdificio(Edifici newEdificio) {
        edificiRepository.save(newEdificio);
        log.info("l'edificio : " + newEdificio.getNome_edificio() + " è stato salvato correttamente");
    }

    public Edifici findById(long id){
        return edificiRepository.findById(id).orElseThrow(()->new NotFoundException(id));
    }
}
