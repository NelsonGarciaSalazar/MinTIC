package nomina;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements InterfaceEmployee{

    private String name;
    private String lastName;
    private float wageBase;
    private String area;

    private static final float SMLV = 1000000;
    @Override
    public float calculateSalary() {

        if (Objects.equals(this.area, "DEVELOPER")) {
            return wageBase + (3 * SMLV);
        }else if ("NURSE".equals(this.area)) {
            return (float) (wageBase + (0.5 * SMLV));
        }else
            return wageBase + (2 * SMLV);
    }
}
