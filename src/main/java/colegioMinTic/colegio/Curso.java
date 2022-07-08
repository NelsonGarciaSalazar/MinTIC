package colegioMinTic.colegio;

import colegioMinTic.rol.Docente;
import colegioMinTic.rol.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private Docente docente;
    private List<Estudiante> estudiantes;
    private List<Asignatura> asignaturas;
    private String nombre;
    private int codigo;
    private int cantidadEstudiantes;

    public Curso(Docente docente, String nombre, int codigo, int cantidadEstudiantes) {
        this.docente = docente;
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.estudiantes = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }

    public Curso() {
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void agregarAsignatura(String nombre, int codigo, int cantidadNotas, float[] listaPorcentaje, float[] listaNotas){
        Asignatura asignatura =  new Asignatura(nombre,codigo,cantidadNotas,listaPorcentaje,listaNotas);
        asignaturas.add(asignatura);
    }

}
