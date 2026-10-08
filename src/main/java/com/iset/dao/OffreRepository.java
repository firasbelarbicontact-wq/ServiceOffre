package com.iset.dao;

import com.iset.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OffreRepository extends JpaRepository<Offre, Long> {

}
