package com.portfolio.tp.Repository;

import com.portfolio.tp.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositoty extends JpaRepository<Persona,Long> {
    
}
