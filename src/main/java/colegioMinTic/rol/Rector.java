package colegioMinTic.rol;

public class Rector extends Profesional{

    public Rector(String nombre, int edad, int telefono, String correo, int documento, float salario) {
        super(nombre, edad, telefono, correo, documento, salario);
    }

    public Rector() {
    }

    public void agregarCurso(){
        // TODO realizar implementacion agregarCurso
        System.out.println("Agregar curso...");
    }
}
