package colegioMinTic.rol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estudiante extends Persona{
    protected String nombreAcudiente;
    protected int numeroAcudiente;

    public Estudiante(String nombre, int edad, int telefono, String correo, int documento, String nombreAcudiente, int numeroAcudiente) {
        super(nombre, edad, telefono, correo, documento);
        this.nombreAcudiente = nombreAcudiente;
        this.numeroAcudiente = numeroAcudiente;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombreAcudiente='" + nombreAcudiente + '\'' +
                ", numeroAcudiente=" + numeroAcudiente +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", documento=" + documento +
                "} " + super.toString();
    }
}
