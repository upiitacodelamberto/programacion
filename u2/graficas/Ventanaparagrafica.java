/*
 * Esta clase esta basada en la clase EjemploDibujo
 * del paquete u2.clasesyobjetos
 */
package u2.graficas;
//import java.awt.BorderLayout;
import u2.clasesyobjetos.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;//PASO 1/5
import java.awt.event.ActionListener;//PASO 1/5
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Ventanaparagrafica extends JFrame implements ActionListener {//PASO 2/5

    private JPanel panel;
    private JButton boton, salir;
    private Graphics papel_01;
    private punto arr[];
    private final static int LADO = 600;

    public Ventanaparagrafica(punto arr[]) {
        this.arr = arr;
    }

    public void crearGUI() {
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
                papel.drawLine(arr[i].x, 600 - arr[i].y,
                        arr[i + 1].x, 600 - arr[i + 1].y);
            }
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
