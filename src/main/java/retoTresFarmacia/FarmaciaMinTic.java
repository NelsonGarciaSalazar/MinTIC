package retoTresFarmacia;

public class FarmaciaMinTic {
    public static void main(String[] args) {
        Producto suero = new Producto("Suero", "14589", 25, 1500);
        Producto antibiotico = new Producto("Antibiotico en pastillas", "57896", 30, 1000);
        Producto vacunas = new Producto("Vacunas", "32658", 10, 2000);

        Producto p = new ProductoNoRefrigerado();
        p.setValorBase(1000);
        System.out.println(p.calcularCostoDeAlmacenamiento());

        System.out.println("Costo almacenamiento Suero: " + suero.calcularCostoDeAlmacenamiento());
        System.out.println("Costo almacenamiento Antibiotico en pastillas: " + antibiotico.calcularCostoDeAlmacenamiento());
        System.out.println("Costo almacenamiento Vacunas: " + vacunas.calcularCostoDeAlmacenamiento());
    }
}
