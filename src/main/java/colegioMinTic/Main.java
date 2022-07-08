package colegioMinTic;

import colegioMinTic.colegio.Colegio;
import colegioMinTic.colegio.Curso;
import colegioMinTic.rol.Docente;
import colegioMinTic.rol.Estudiante;
import colegioMinTic.rol.Rector;

public class Main {
    public static void main(String[] args) {

        Rector juanito = new Rector("Juanito",25,2232732,"juanito@gmail.com", 1234, 2500000);
        Colegio liceo = new Colegio(juanito, "Trans 6 # 6 -06", 3225566,"Liceo Nacional", 1526);
        Docente nicolas = new Docente("Nicolas",25,2232732,"juanito@gmail.com", 1234, 2500000);
        liceo.agregarCurso(nicolas,"Matematicas",1,45);

        Curso matematicas = new Curso(nicolas,"Matematicas",123,45);
        //matematicas.agregarAsignatura("Matematicas Basicas",987,4,1,4);

        Estudiante camilo = new Estudiante("Camilo",15,2232732,"camilo@gmail.com",1234,"Pedro Perez",1234);
        matematicas.agregarEstudiante(camilo);
    }
}
