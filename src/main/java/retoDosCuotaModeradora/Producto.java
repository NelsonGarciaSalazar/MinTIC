package retoDosCuotaModeradora;

public class Producto {
    private String nombre;
    private String codigo;
    private String categoria;
    private String laboratorio;
    private boolean cotizante;

    public Producto(String nombre, String codigo, String categoria, String laboratorio, boolean cotizante) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.laboratorio = laboratorio;
        this.cotizante = cotizante;
    }

    public float costo(){
       return this.cotizante ? 3500: 14000;
    }

    public void info() {
        System.out.println("[Producto]:");
        System.out.println("Nombre:" +this.nombre);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Laboratorio: " + this.laboratorio);
        System.out.println("Precio: " + this.costo());
    }
}
