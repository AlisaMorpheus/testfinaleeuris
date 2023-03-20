package org.example.testfinale.repository;

import org.example.testfinale.model.Biglietto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BigliettoRepository extends JpaRepository<Biglietto, Integer> {

}
