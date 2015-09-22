package anotacion;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // Solo se aplica a clases
@Retention(RetentionPolicy.RUNTIME)
public @interface anotacionTema  {
    public String id();
    public String nomDTema() default "sin nombre de tema";
    public String remmark() default "";
}
