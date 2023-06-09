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
@Table(name = "cinema")
public class Cinema {
    //attributi un insieme di oggetti di tipo sala
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeCinema;
    /*@Transient
    private int idSala;
    @OneToMany(mappedBy = "cinema")
    private List<Sala> sale;*/

}
