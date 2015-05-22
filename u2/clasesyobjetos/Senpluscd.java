/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package u2.clasesyobjetos;

/**
 *
 * @author lamberto
 */
public class Senpluscd extends Energia {

    punto step() {
        t += paso;
        y = 3 + 2 * Math.sin(20*t);
        return new punto(500 * t, 100 * y);
    }
}
