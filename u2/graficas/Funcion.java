package u2.graficas;
import u2.clasesyobjetos.punto;

public abstract class Funcion {
    double t;
    double y;
    double paso;
    public abstract punto step();
}
