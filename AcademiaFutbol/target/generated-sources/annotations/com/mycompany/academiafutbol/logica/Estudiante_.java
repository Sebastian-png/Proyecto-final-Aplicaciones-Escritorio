package com.mycompany.academiafutbol.logica;

import com.mycompany.academiafutbol.logica.Responsable;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-18T07:24:04", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile SingularAttribute<Estudiante, String> meses_atrasados;
    public static volatile SingularAttribute<Estudiante, Integer> id_estudiante;
    public static volatile SingularAttribute<Estudiante, String> ciudad;
    public static volatile SingularAttribute<Estudiante, String> genero;
    public static volatile SingularAttribute<Estudiante, String> categoria;
    public static volatile SingularAttribute<Estudiante, String> valor_mes;
    public static volatile SingularAttribute<Estudiante, Responsable> unResponsable;
    public static volatile SingularAttribute<Estudiante, String> nombre;
    public static volatile SingularAttribute<Estudiante, String> edad;

}