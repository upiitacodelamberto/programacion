package anotacion;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // Solo se alica a clases
@Retention(RetentionPolicy.RUNTIME)
public @interface anotacionSubTema
{
    public String id();
    public String nomDSubTema() default "sin nombre de subtema";
    public String remmark() default "";
}
