package chiarafais.u5w2venerdi;

import chiarafais.u5w2venerdi.entities.Edifici;
import chiarafais.u5w2venerdi.entities.Postazioni;
import chiarafais.u5w2venerdi.entities.Prenotazioni;
import chiarafais.u5w2venerdi.entities.Utenti;
import chiarafais.u5w2venerdi.enums.TipoPostazione;
import chiarafais.u5w2venerdi.services.EdificiService;
import chiarafais.u5w2venerdi.services.PostazioniService;
import chiarafais.u5w2venerdi.services.PrenotazioniService;
import chiarafais.u5w2venerdi.services.UtentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private UtentiService utentiService;
    @Autowired
    private PrenotazioniService prenotazioniService;
    @Autowired
    private PostazioniService postazioniService;
    @Autowired
    private EdificiService edificiService;

    @Override
    public void run(String... args) throws Exception {

        Utenti utenteChiara = new Utenti("chiarafais","Chiara Fais","chiarafaisss@gmail.com");
        Utenti utenteNikita = new Utenti("niki","Nikita Ivanov","nikitaa@gmail.com");
        Utenti utenteLuca = new Utenti("lucaaaa","Luca Dipietro","lucadipie@gmail.com");
        Utenti utenteFrancesco = new Utenti("francesco.cri","Francesco Cristiano","frank97@gmail.com");

        Edifici biblioteca = new Edifici("Biblioteca", "Via Cagliari 33", "Roma");
        Edifici caffetteria = new Edifici("Caffetteria studiosa", "Via Milano 13", "Latina");
        Edifici coWorking = new Edifici("Working space ", "Via Isonzo 563", "Milano");

        Postazioni postazione1 = new Postazioni(TipoPostazione.OPENSPACE,"sala ampia in cui lavorare",12, edificiService.findById(1));
        Postazioni postazione2 = new Postazioni(TipoPostazione.PRIVATO,"piccola sala dedicata a voi", 4,edificiService.findById(2));
        Postazioni postazione3 = new Postazioni(TipoPostazione.SALARIUNIONI,"sala ampia e fornita di lavagna smart",20,edificiService.findById(3));

        Prenotazioni prenotazione1 = new Prenotazioni(utentiService.findById(2),postazioniService.findById(2), LocalDate.of(2024,7,25));

//        utentiService.saveUtente(utenteChiara);
//        utentiService.saveUtente(utenteNikita);
//        utentiService.saveUtente(utenteLuca);
//        utentiService.saveUtente(utenteFrancesco);
//        edificiService.saveEdificio(biblioteca);
//        edificiService.saveEdificio(caffetteria);
//        edificiService.saveEdificio(coWorking);
//        postazioniService.savePostazione(postazione1);
//        postazioniService.savePostazione(postazione2);
//        postazioniService.savePostazione(postazione3);

        prenotazioniService.savePrenotazione(prenotazione1);


    }
}
