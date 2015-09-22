package progdetallado;

import java.awt.event.WindowEvent;
import progdetallado.controlador.Utilitaria;
import progdetallado.modelo.ProgDetallado;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowListener;// PASO 1/5
public class TestGUIProgDetallado implements WindowListener {// PASO 2/5

    Frame F;
    TextArea TA;

    public TestGUIProgDetallado() {
        F = new Frame("Programa detallado de Programacion");
        TA = new TextArea();
        F.add(TA);
        F.setSize(800, 600);
        //F.setSize(400, 300);
        F.setLocationRelativeTo(null);
        F.addWindowListener(this);// PASO 3/5
        F.setVisible(true);
    }

    public static void main(String[] args) {
        ProgDetallado ProgD = new ProgDetallado();
        ProgD.setNombre(Utilitaria._crearNombreDProg());
        ProgD.setObjGeneral(Utilitaria._crearObjGeneral());
        ProgD.setNumDUnidades(5);
        ProgD.setUnidad(Utilitaria._crearUnidadDProg(ProgD.getNumDUnidades()));
        TestGUIProgDetallado GUIPD = new TestGUIProgDetallado();
        GUIPD.TA.setText(ProgD.toString());
    }

    @Override
    public void windowOpened(WindowEvent arg0) {// PASO 4/5
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosing(WindowEvent arg0) {// PASO 4/5
        //throw new UnsupportedOperationException("Not supported yet.");
        {// PASO 5/5
            F.dispose();
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent arg0) {// PASO 4/5
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowIconified(WindowEvent arg0) {// PASO 4/5
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {// PASO 4/5
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowActivated(WindowEvent arg0) {// PASO 4/5
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {// PASO 4/5
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
