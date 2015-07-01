/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package u2.clasesyobjetos;

/**
 *
 * @author lamberto
 */
public class TestEnergia {
    static final int N = 100;
    public static void main(String[] args) {
        Energia CL = new Energia();
//        System.out.println(CL);
        punto arr[] = new punto[N + 1];
        arr[0] = new punto(0, 0);
        for (int i = 0; i < N; i++) {
            arr[i + 1] = CL.step();
//            System.out.println(CL + " x="+arr[i+1].x + " y="+arr[i+1].y);
        }
        EjemploDibujo marco = new EjemploDibujo(arr);
        marco.setSize(700, 700);
        marco.crearGUI(arr);
        marco.setVisible(true);
    }
}
