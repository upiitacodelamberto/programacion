/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package u2.clasesyobjetos;

/**
 *
 * @author lamberto
 */
public class GraficaTest {
    static final int N = 120;
    public static void main(String[] args) {
        Senpluscd SPCD = new Senpluscd();

        punto arr[] = new punto[N + 1];
        arr[0] = new punto(0, 3 * 100);
        for (int i = 0; i < N; i++) {
            arr[i + 1] = SPCD.step();
        }
        EjemploDibujo marco = new EjemploDibujo(arr);
        marco.setSize(700, 700);
        marco.crearGUI(arr);
        marco.setVisible(true);
    }
}
