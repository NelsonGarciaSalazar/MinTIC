package cuestionario3;

public class Moto extends Vehiculo{
    private int cilindraje;

    public Moto(int cilindraje, String placa) {
        super(placa);
        this.cilindraje = cilindraje;
    }

    public int calcularImpuesto(){
        return cilindraje >= 150 ? 90000: 45000;
    }
}
