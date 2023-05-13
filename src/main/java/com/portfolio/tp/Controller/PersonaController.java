package com.portfolio.tp.Controller;

import com.portfolio.tp.Entity.Persona;
import com.portfolio.tp.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService iPersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> GetPersona(){
        return iPersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        iPersonaService.savePersona(persona);
        return "El usuario fue creado correctamente";
    }
    
    @DeleteMapping("/personas/borrar/(id)")
    public String deletePersona(@PathVariable Long id){
        iPersonaService.deletePersona(id);
        return "El usuario fue borrado correctamente";
    }
    
    @PutMapping("/personas/editar/(id)")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("img") String nuevoImg){
        Persona persona = iPersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        
        iPersonaService.savePersona(persona);
        return persona;
    }
}
