package org.example.testfinale.service.sala;

import org.example.testfinale.model.response.GenericResponse;
import org.example.testfinale.model.Spettatore;
import org.example.testfinale.model.response.SpettatoreDto;

import java.util.Date;

public interface SalaService {
    //funz svuota sala
    Boolean svuotaSala();

    // ingresso di uno spettatore alla volta
    GenericResponse<SpettatoreDto> insertSpettatore(String nome, String cognome, Date dataNascita, int idBiglietto, int idSala);
    //eccezione SalaAlCompleto
    //eccezione FilmVietatoAiMinori

    //incasso singola sala
    void incassoSala();
}
