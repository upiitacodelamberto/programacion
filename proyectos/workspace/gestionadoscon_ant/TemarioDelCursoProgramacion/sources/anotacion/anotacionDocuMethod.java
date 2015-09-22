package anotacion;
import java.lang.annotation.*;
@Target(ElementType.METHOD)       /* aplica solamente a metodos, no a constructores. 
                                                                  Vease ElementType.CONSTRUCTOR */
@Retention(RetentionPolicy.RUNTIME)
public @interface anotacionDocuMethod {
    public int id();
    public String firma();
    public String rem() default "SIN COMENTARIO";
}
