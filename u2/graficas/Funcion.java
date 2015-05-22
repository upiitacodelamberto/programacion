/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package u2.graficas;
import u2.clasesyobjetos.punto;
/**
 *
 * @author lamberto
 */
public abstract class Funcion {
    double t;
    double y;
    double paso;
    public abstract punto step();
}
