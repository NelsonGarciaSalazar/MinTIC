package nomina;

import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class Payroll {

    public Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Integer id, Employee employee){
        employees.put(id, employee);
    }

    public void printPayroll(){
        for (Employee employee:employees.values()) {
            System.out.println("Employee: " + employee.getName() + " " +
                                                employee.getLastName()+ " " +
                                                employee.calculateSalary()
                                );
        }
    }

    public void changeAreaEmployee(){
        employees.get(id).setArea();
    }

    public void changeWageBase(){

    }
}
