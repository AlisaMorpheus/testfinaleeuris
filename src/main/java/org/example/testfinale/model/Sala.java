package org.example.testfinale.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sale")
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //private List<Spettatore> spettatori;
    //private final int spettatoriMax = 180;
    @Transient
    private int idFilm;
    @OneToOne
    @JoinColumn(name = "idFilm")
    private Film film;
    @Transient
    private int idCinema;
    @ManyToOne
    @JoinColumn(name = "idCinema")
    private Cinema cinema;

}
