package com.mycompany.academiafutbol.persistencia;

import com.mycompany.academiafutbol.logica.Estudiante;
import com.mycompany.academiafutbol.logica.Responsable;
import com.mycompany.academiafutbol.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    ResponsableJpaController responsableJpa = new ResponsableJpaController();
    EstudianteJpaController estudianteJpa = new EstudianteJpaController();        

    public void guardar(Responsable respon, Estudiante estu) {
        
        //Crear en DB el responsable
        responsableJpa.create(respon);
        
        //Crear en DB el estudiante
        estudianteJpa.create(estu);
    }

    public List<Estudiante> traerEstudiantes() {
        
        return estudianteJpa.findEstudianteEntities();
    }

    public void borrarEstudiantes(int id_estudiante) {
        try {
            estudianteJpa.destroy(id_estudiante);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Estudiante traerEstudiantes(int id_estudiante) {
        return estudianteJpa.findEstudiante(id_estudiante);
    }

    public void editarEstudiante(Estudiante estu) {
        try {
            estudianteJpa.edit(estu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Responsable traerResponsable(int id_padre) {
        return responsableJpa.findResponsable(id_padre);
    }

    public void modificarResponsable(Responsable respon) {
        try {
            responsableJpa.edit(respon);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
