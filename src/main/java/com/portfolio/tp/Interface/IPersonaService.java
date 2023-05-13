package com.portfolio.tp.Interface;

import com.portfolio.tp.Entity.Persona;
import java.util.List;

public interface IPersonaService {   
    //Lista de usuarios
    public List<Persona>getPersona();
    
    //Guardar usuario
    public void savePersona(Persona persona);
    
    //Eliminar Usuario por ID
    public void deletePersona(Long id);
    
    //Buscar Usuario por ID
    public Persona findPersona(Long id);
}
