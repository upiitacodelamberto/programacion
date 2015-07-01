package u2.graficas;
/*
 * Tiro vertical 
 * Y(t) = Vinic*t - (1/2)*g*t^{2}
 */
import u2.clasesyobjetos.punto;
import java.util.Scanner;
public class TiroVertical extends Funcion{
    double Vinic;       //Velocidad inicial
    final static double g = 9.81;//Constante gravitacional
    static final int N = 120;
    public TiroVertical(){
        paso = 0.01;
        Scanner S = new Scanner(System.in);
        System.out.print("Velocidad inicial: ");
//        Vinic = S.nextDouble();
        Vinic = 5.0;
        t = 0;
        y = 0;
    }
    public punto step(){
        t += paso;
        y = Vinic * t - (1/2.0)*g*Math.pow(t, 2);
        return new punto(500*t, 400*y);
    }
    public static void main(String[] args) {
        TiroVertical TV = new TiroVertical();

        punto arr[] = new punto[N + 1];
//        arr[0] = new punto(0, 3 * 100);
        arr[0] = new punto(0, 0);
        for (int i = 0; i < N; i++) {
            arr[i + 1] = TV.step();
        }
        Ventanaparagrafica marco = new Ventanaparagrafica(arr);
        marco.setSize(700, 700);
        marco.crearGUI();
        marco.setVisible(true);
    }
}
