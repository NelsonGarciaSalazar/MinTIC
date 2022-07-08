package colegioMinTic.rol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    protected String nombre;
    protected int edad;
    protected int telefono;
    protected String correo;
    protected int documento;
}
