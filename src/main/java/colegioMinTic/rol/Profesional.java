package colegioMinTic.rol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profesional extends Persona{
    protected float salario;

    public Profesional(String nombre, int edad, int telefono, String correo, int documento, float salario) {
        super(nombre, edad, telefono, correo, documento);
        this.salario = salario;
    }

    public Profesional(float salario) {
        this.salario = salario;
    }
    public Profesional(){}

    @Override
    public String toString() {
        return "Profesional{" +
                "salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", documento=" + documento +
                "} " + super.toString();
    }

    public void renunciar(){
        // TODO mas adelante se implementa el metodo renunciar
        System.out.println("El profesional renuncio...");
    }
}
