package retoTresFarmacia;

public class ProductoNoRefrigerado extends Producto{
    @Override
    public double calcularCostoDeAlmacenamiento() {
        return super.getValorBase() * 110 / 100;
    }
}
