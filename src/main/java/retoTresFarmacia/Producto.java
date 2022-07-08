package retoTresFarmacia;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto {
    private String nombre;
    private String id;
    private double temperatura;
    private double valorBase;

    public Producto(String nombre, String id, double temperatura, double valorBase) {
        this.nombre = nombre;
        this.id = id;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
    }

    public Producto() {}

    public double calcularCostoDeAlmacenamiento() {

        if ((this.getTemperatura() >= 0) && (this.getTemperatura() <= 20)) {
            return this.getValorBase() * 110 / 100;
        } else if (this.getTemperatura() > 21) {
            return this.getValorBase() * 120 / 100;
        }
        return this.getValorBase();
    }
}
