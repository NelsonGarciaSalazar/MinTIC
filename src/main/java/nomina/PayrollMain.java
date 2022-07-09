package nomina;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PayrollMain {
    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        Employee employee1 = new Employee("Nicolas", "Pinilla", 2000000,"DEVELOPER");
        Employee employee2 = new Employee("Lizeth", "Ariza", 3000000, "NURSE");
        Employee employee3 = new Employee("ALBERTO", "RAMIREZ", 4000000,"LAYER");

        payroll.addEmployee(1, employee1);
        payroll.addEmployee(2, employee2);
        payroll.addEmployee(3, employee3);
    }
}
