package inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Student extends Persona {

    private float average;

    public Student(String name, String lastName, float average) {
        super(name, lastName);
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "average=" + average +
                "} " + super.toString();
    }
}
