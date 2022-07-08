package retoTresFarmacia;

public class ProductoRefrigerado extends Producto{
    @Override
    public double calcularCostoDeAlmacenamiento() {
        return super.getValorBase() * 120 / 100;
    }
}
