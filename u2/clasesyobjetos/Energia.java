/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package u2.clasesyobjetos;
import anotacionesytrackers.anotacionTema;
@anotacionTema(id="2.1", nomDTema="Clases y Objetos", remmark="Clase que sera "
        + "usada como clase base.")
public class Energia {
    static double g;// = 9.81;// m/s^{2} (por ser static g es una variable de clase)
    double m;
    double t;
    double y;
    double paso;
    //void step(){
    punto step(){
        t += paso;
        y = (g/2)*Math.pow(t, 2);// y(t) = \frac{g}{2}t^{2}
        return new punto(500*t, 100*y);
    }
    public Energia(){
        t = 0;
        paso = 0.01;
        y = 0;
        g = 9.81;
    }
//    public static void main(String[] args) {
//        Energia E = new Energia();//Objeto de clase Energia
// //       g = 10;
//        System.out.println(Energia.g);//Esperamos el valor 10
//   //     E.g = 9.9;
//        System.out.println(Energia.g);//Esperamos el valor 9.9
//        Energia E1 = new Energia();
//        System.out.println(E1.g);//Esperamos el valor 9.81
//    }
    
    @Override
    public String toString(){
        return "t = " + t + " y = " + y;
    }
}
