package cuestionario2;

public class Tiquete{
    private String id;
    private double valorUnitario;
    private int catidadDePasajeros;

    public Tiquete(String id, double valorUnitario, int catidadDePasajeros) {
        this.id = id;
        this.valorUnitario = valorUnitario;
        this.catidadDePasajeros = catidadDePasajeros;
    }

    public double costoTiquete(){
        return valorUnitario * catidadDePasajeros;
    }
}
