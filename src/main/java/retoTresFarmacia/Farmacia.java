package retoTresFarmacia;

import java.util.List;

public class Farmacia {
    private String nit;
    private String nombre;
    private String direccion;
    public List<Almacen> almacenes;

    public Farmacia(){}

    public void agregarAlmacen(){
        Almacen almacen = new Almacen();
        almacenes.add(almacen);
    }

    public void agregarProducto(String codigoAlmacen, Producto producto){

    }
}
