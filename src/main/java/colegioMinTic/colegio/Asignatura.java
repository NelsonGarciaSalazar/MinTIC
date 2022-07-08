package colegioMinTic.colegio;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Asignatura {
    private String nombre;
    private int codigo;
    private int cantidadNotas;
    private float[] listaPorcentaje;
    private float[] listaNotas;

    public Asignatura(String nombre, int codigo, int cantidadNotas, float[] listaPorcentaje, float[] listaNotas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadNotas = cantidadNotas;
        this.listaPorcentaje = listaPorcentaje;
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", cantidadNotas=" + cantidadNotas +
                ", listaPorcentaje=" + Arrays.toString(listaPorcentaje) +
                ", listaNotas=" + Arrays.toString(listaNotas) +
                '}';
    }

    public void obtenerPromedioAsignatura(){
        // TODO realizar implementacion de promedioAsignatura
        System.out.println("El promedio de la asignatura es...");
    }
}
