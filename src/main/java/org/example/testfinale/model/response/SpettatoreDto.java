package org.example.testfinale.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpettatoreDto {
    private int id;
    private String nome;
    private String cognome;
    private Date dataNascita;
    private int idBiglietto;
    private int idSala;

}
