package retoUnoAlmacenamiento;

public class Almacenamiento {
    public static void main(String[] args) {
        System.out.println(calcularCostoAlmacenamiento(false,100));
    }

    static float calcularCostoAlmacenamiento(boolean refrigerado, float valorBase){

        if (refrigerado) {
            valorBase += valorBase * 30 / 100;
        }else {
            valorBase += valorBase * 15 / 100;
        }
        return valorBase;
    }
}
