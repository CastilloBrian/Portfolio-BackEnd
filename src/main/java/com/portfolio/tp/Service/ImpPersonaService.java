package com.portfolio.tp.Service;

import com.portfolio.tp.Entity.Persona;
import com.portfolio.tp.Interface.IPersonaService;
import com.portfolio.tp.Repository.IPersonaRepositoty;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepositoty IPersonaRepositoty;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = IPersonaRepositoty.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        IPersonaRepositoty.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        IPersonaRepositoty.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = IPersonaRepositoty.findById(id).orElse(null);
        return persona;
    }
    
}
