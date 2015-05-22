/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//package poligonoitem;
package u2.clasesyobjetos;
/**
 *
 * @author Administrador
 */
public class punto {
    int x;
    int y;

    public punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public punto(double t, double y){
        this.x = (int)t;this.y = (int)y;
    }

    public double norma(){
        return Math.sqrt(x * x + y * y);
    }

}
