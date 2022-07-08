package cuestionario3;

public class Impuesto {
    public static void main(String[] args) {

        Moto moto1 = new Moto(200, "FZQ102");
        System.out.println(moto1.calcularImpuesto());

        Moto moto2 = new Moto( 100, "FZQ103");
        System.out.println(moto2.calcularImpuesto());
    }
}
