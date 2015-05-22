/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package poligonoitem;
package u2.clasesyobjetos;
//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;//PASO 1/5
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class EjemploDibujo extends JFrame implements ActionListener {//PASO 2/5

    private JPanel panel;
    private JButton boton, instrucc, salir;
    private Graphics papel_01;
    private punto arr[];
    private final static int LADO = 600;

    public EjemploDibujo(punto arr[]) {
        this.arr = arr;
    }

    public void crearGUI(punto arr[]) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        //ventana.setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(LADO, LADO));
        panel.setBackground(Color.white);
        ventana.setBackground(Color.white);
        ventana.add(panel);
        //ventana.add(panel, BorderLayout.CENTER);

        boton = new JButton("DIBUJAR");
        ventana.add(boton);
        boton.setBackground(Color.red);
        //ventana.add(boton,BorderLayout.SOUTH);
        boton.addActionListener(this);//PASO 3/5
        /*
        Esto produce error! POR QUE??
        Graphics papel = panel.getGraphics();
        for (int i = 0; i < arr.length - 1; i++)
        {
        papel.drawLine(50 * arr[i].x, 600 - 50 *arr[i].y,
        50 * arr[i + 1].x, 600 - 50 * arr[i + 1].y);
        }
         */
        
        salir = new JButton("SALIR");
        ventana.add(salir);
        salir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {//PASO 4/5
        if (e.getActionCommand().equals("DIBUJAR")) {//PASO 5/5
            Graphics papel = panel.getGraphics();
            //papel.drawLine(0, 0, 100, 100);
            papel.setColor(Color.red);
            papel.drawLine(0, 0, 0, LADO);
            papel.drawLine(0, LADO, LADO, LADO);
            papel.setColor(Color.blue);
            for (int i = 0; i < arr.length - 1; i++) {
//                papel.drawString("P[" + i + "]",
//                        50 * arr[i].x + 3, 600 - 50 * arr[i].y);
//                papel.drawLine(50 * arr[i].x, 600 - 50 * arr[i].y,
//                        50 * arr[i + 1].x, 600 - 50 * arr[i + 1].y);
                papel.drawLine(arr[i].x, 600 - arr[i].y,
                        arr[i + 1].x, 600 - arr[i + 1].y);
            }
//            papel.drawString("P[" + 4 + "]", 50 * arr[arr.length - 1].x + 3,
//                    600 - 50 * arr[arr.length - 1].y);
//            papel.drawLine(50 * arr[arr.length - 1].x,
//                    600 - 50 * arr[arr.length - 1].y,
//                    50 * arr[0].x, 600 - 50 * arr[0].y);
        }
        if (e.getActionCommand().equals("INSTRUCCIONES")) {
            String puntos = "";
            for (int i = 0; i < arr.length - 1; i++) {
                puntos += "P[" + i + "] = (" + arr[i].x + ","
                        + arr[i].y + ")\n";
            }

            puntos += "P[" + 4 + "] = (" + arr[arr.length - 1].x
                    + "," + arr[arr.length - 1].y + ")";
            JOptionPane.showMessageDialog(null, "Utilice la funcion \n"
                    + "double integral(E e, double i, double s, unsigned d)\n"
                    + "para calcular el area del poligono que se muestra. \n"
                    + "Las cordenadas de los puntos son:\n"
                    + puntos);
        }
        if(e.getActionCommand().equals("SALIR")){
            dispose();
            System.exit(0);
        }
    }

    // Este metodo "no funciona", POR QUE??
    public void dibLine() {
        papel_01 = panel.getGraphics();
        papel_01.drawLine(0, 0, 100, 100);
    }
}
