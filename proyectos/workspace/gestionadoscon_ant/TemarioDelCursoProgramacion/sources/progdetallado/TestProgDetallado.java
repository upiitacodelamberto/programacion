package progdetallado;
import progdetallado.modelo.ProgDetallado;
import progdetallado.controlador.Utilitaria;
/**
 *
 * @author profesor
 */
public class TestProgDetallado {
    public static void main(String[] args) {
        ProgDetallado ProgD = new ProgDetallado();
        ProgD.setNombre(Utilitaria._crearNombreDProg());
        ProgD.setObjGeneral(Utilitaria._crearObjGeneral());
        ProgD.setNumDUnidades(5);
        ProgD.setUnidad(Utilitaria._crearUnidadDProg(ProgD.getNumDUnidades()));
        System.out.print(ProgD);        
    }
}
