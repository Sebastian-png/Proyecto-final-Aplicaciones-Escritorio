
package com.mycompany.academiafutbol.logica;

import com.mycompany.academiafutbol.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreEstu, String ciudad, String edad, 
            String valMes, String mesAtra, String categoria, String genero, 
            String nombreRepre, String celular, String corElec) {
        
        //Creamos el responsable y se le asignaron sus valores
        
        Responsable respon = new Responsable();
        respon.setNombre(nombreRepre);
        respon.setCelular(celular);
        respon.setCorElec(corElec);
        
        //Creamos el estudiante y se le asignaron sus valores
        
        Estudiante estu = new Estudiante();
        estu.setNombre(nombreEstu);
        estu.setCiudad(ciudad);
        estu.setEdad(edad);
        estu.setValor_mes(valMes);
        estu.setMeses_atrasados(mesAtra);
        estu.setCategoria(categoria);
        estu.setGenero(genero);
        estu.setUnResponsable(respon);
        
        controlPersis.guardar(respon, estu);
        
    }

    public List<Estudiante> traerEstudiantes() {
        
        return controlPersis.traerEstudiantes();
        
    }

    public void borrarEstudiantes(int id_estudiante) {
        controlPersis.borrarEstudiantes( id_estudiante);
        
    }

    public Estudiante traerEstudiantes(int id_estudiante) {
        return controlPersis.traerEstudiantes(id_estudiante);
    }

    public void editarEstudiante(Estudiante estu, String nombreEstu, String ciudad, String edad, 
            String valMes, String mesAtra, String categoria, String genero, String nombreRepre, 
            String celular, String corElec) {
        
        estu.setNombre(nombreEstu);
        estu.setCiudad(ciudad);
        estu.setEdad(edad);
        estu.setValor_mes(valMes);
        estu.setMeses_atrasados(mesAtra);
        estu.setCategoria(categoria);
        estu.setGenero(genero);
        
        //Modifico el estudiante
        controlPersis.editarEstudiante(estu);
        
        //Seter nuevos valores del responsable
        Responsable respon = this.buscarResponsable(estu.getUnResponsable().getId_padre());
        respon.setNombre(nombreRepre);
        respon.setCelular(celular);
        respon.setCorElec(corElec);
        
        //Llamar al editar responsable
        this.modificarResponsable(respon);
        
    }

    private Responsable buscarResponsable(int id_padre) {
        return controlPersis.traerResponsable(id_padre); 
    }

    private void modificarResponsable(Responsable respon) {
              controlPersis.modificarResponsable(respon);
    }

   
    
}
