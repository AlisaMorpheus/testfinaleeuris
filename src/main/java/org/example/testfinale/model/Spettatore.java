package org.example.testfinale.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.testfinale.model.response.SpettatoreDto;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spettatori")
public class Spettatore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cognome;
    private Date dataNascita;
    @Transient
    private int idBiglietto;
    @OneToOne
    @JoinColumn(name = "idBiglietto")
    private Biglietto biglietto;
    @Transient
    private int idSala;
    @ManyToOne
    @JoinColumn(name = "idSala")
    private Sala sala;

    public SpettatoreDto toDto(){
        return SpettatoreDto.builder()
                .id(id)
                .nome(nome)
                .cognome(cognome)
                .dataNascita(dataNascita)
                .idBiglietto(idBiglietto)
                .idSala(idSala)
                .build();
    }
}
