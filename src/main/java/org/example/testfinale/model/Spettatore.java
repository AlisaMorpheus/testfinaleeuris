package org.example.testfinale.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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


    //funzionalità che restituisca un valore booleano
    // per determinare la minore o maggiore età
    //dello spettatore;
    // ad una funzionalità che restituisca l'età dello spettatore come valore intero
    //funz get sconto --> > 70 e 50 < 5
    //valore sconto


}