package idclase;

import static java.lang.System.nanoTime;

public class ObtenerIdClase {
    public static void main(String[] args) {

        String id = String.valueOf(nanoTime());

        Persona camilo = new Persona(id, "Camilo");

        String persona = camilo.toString();
        System.out.println("Impresión del objeto camilo: " + persona);
    }
}
