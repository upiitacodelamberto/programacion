package anotacion;

import java.lang.annotation.*;

@Target(ElementType.TYPE)       /* aplica solamente a clases */
@Retention(RetentionPolicy.RUNTIME)
public @interface anotacionEvidencia {
    public int id();
    public String nomdEvidencia();
    public int numDBoleta();
    public String nomDAlumno();
}
