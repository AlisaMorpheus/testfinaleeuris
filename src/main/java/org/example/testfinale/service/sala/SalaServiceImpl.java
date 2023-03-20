package org.example.testfinale.service.sala;

import org.example.testfinale.model.Biglietto;
import org.example.testfinale.model.Sala;
import org.example.testfinale.model.response.GenericResponse;
import org.example.testfinale.model.Spettatore;
import org.example.testfinale.model.response.SpettatoreDto;
import org.example.testfinale.repository.BigliettoRepository;
import org.example.testfinale.repository.FilmRepository;
import org.example.testfinale.repository.SalaRepository;
import org.example.testfinale.repository.SpettatoreRepository;

import java.util.Date;
import java.util.Optional;

public class SalaServiceImpl implements SalaService{
    private SalaRepository salaRepository;
    private BigliettoRepository bigliettoRepository;
    private SpettatoreRepository spettatoreRepository;
    private FilmRepository filmRepository;
    public  SalaServiceImpl(SalaRepository salaRepository, BigliettoRepository bigliettoRepository, SpettatoreRepository spettatoreRepository, FilmRepository filmRepository){
        this.salaRepository = salaRepository;
        this.bigliettoRepository = bigliettoRepository;
        this.spettatoreRepository = spettatoreRepository;
        this.filmRepository = filmRepository;
    }

    @Override
    public Boolean svuotaSala() {
        return null;
    }

    @Override
    public GenericResponse<SpettatoreDto> insertSpettatore(String nome, String cognome, Date dataNascita, int idBiglietto, int idSala) {
        GenericResponse<SpettatoreDto> response = new GenericResponse<>();
        try{
            Optional<Biglietto> biglietto = bigliettoRepository.findById(idBiglietto);
            Optional<Sala> sala = salaRepository.findById(idSala);
            if(biglietto.isPresent() && sala.isPresent()){
                Spettatore spettatore = Spettatore.builder()
                        .nome(nome)
                        .cognome(cognome)
                        .dataNascita(dataNascita)
                        .idBiglietto(idBiglietto)
                        .idSala(idSala)
                        .build();

                    spettatoreRepository.save(spettatore);
                    response.setBody(spettatore.toDto());
            }else {
                response.setErrorMessage("Biglietto o sala non trovati");
            }
        }catch (Exception e){
            response.setErrorMessage(e.getMessage());
        }
        return response;
    }

    @Override
    public void incassoSala() {

    }
}
