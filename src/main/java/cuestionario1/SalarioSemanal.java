package cuestionario1;

public class SalarioSemanal
{
    public static void main(String[] args) {
        System.out.println(salario(40));
    }

    static double salario(int horasLaboradas){

        int smlv = 1000000;

        return horasLaboradas <= 40 ? horasLaboradas * (smlv * 0.015): horasLaboradas * (smlv * 0.02);
    }
}
