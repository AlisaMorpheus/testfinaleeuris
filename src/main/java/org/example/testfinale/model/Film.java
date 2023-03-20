package org.example.testfinale.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.testfinale.enums.FilmGenere;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String titolo;
    @Column
    private String autore;
    @Column
    private String produttore;
    @Column
    @Enumerated(EnumType.STRING)
    private FilmGenere genere;
    @Column
    private int etaMinima;
    @Column
    private int durata;

}
