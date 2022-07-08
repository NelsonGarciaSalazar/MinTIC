package colegioMinTic.colegio;

import colegioMinTic.rol.Docente;
import colegioMinTic.rol.Rector;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private Rector rector;
    private String direccion;
    private int numero;
    private String nombre;
    private int codigo;
    private List<Curso> cursos;

    public Colegio(Rector rector, String direccion, int numero, String nombre, int codigo) {
        this.rector = rector;
        this.direccion = direccion;
        this.numero = numero;
        this.nombre = nombre;
        this.codigo = codigo;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Docente docente, String nombre, int codigo, int cantidadEstudiantes){
        Curso curso = new Curso(docente,nombre,codigo,cantidadEstudiantes);
        cursos.add(curso);
    }

    public void agregarCursoAsociacion(Curso curso){
        cursos.add(curso);
    }
}
