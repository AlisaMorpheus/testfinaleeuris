package org.example.testfinale.service.sala;

import org.example.testfinale.model.Spettatore;

public interface SalaService {
    //attributi un insieme di spettatori
    // di dimensione fissata e contiene
    //funz svuota sala e ingresso di 1 spettatore alla volta
    void addSpettatore(Spettatore spettatore);
    //eccezione SalaAlCompleto
    //eccezione FilmVietatoAiMinori

    //incasso singola sala
    void incassoSala();
}
