package retoTresFarmacia;

import java.util.List;

public class Lote {
    private List<Producto> productos;

    public Lote() {}

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
}
