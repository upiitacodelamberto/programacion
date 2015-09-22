package progdetallado.controlador;
import progdetallado.modelo.*;
/**
 *
 * @author profesor
 */
public class Utilitaria {
    public static String _crearNombreDProg(){
        return "Programacion";
    }
    public static String _crearObjGeneral(){
        String objG = "Implementar programas utilizando la metodologia"
                + "orientada a objetos que le permitan dar solucion a "
                + "problemas del area cienifica basica";
        return objG;
    }
    public static Unidad[] _crearUnidadDProg(int numdunidades){
        int u = 0;
        Unidad Unidad[] = new Unidad[numdunidades];
        while(u < numdunidades){
            Unidad[u] = new Unidad();
            u++;
        }
        Unidad[0].setNombre("Introduccion a Java");
        Unidad[1].setNombre("Clases basicas en Java y Herencia simple");
        Unidad[2].setNombre("Interfaces y polimorfismo");
        Unidad[3].setNombre("Archivo, E/S y Excepciones");
        Unidad[4].setNombre("Interfaces Graficas");
        
        Unidad[0].setTema(UtilUnidad1._crearTema(2), 2);
        Unidad[1].setTema(UtilUnidad2._crearTema(9), 9);
        Unidad[2].setTema(UtilUnidad3._crearTema(6), 6);
        Unidad[3].setTema(UtilUnidad4._crearTema(3), 3);
        Unidad[4].setTema(UtilUnidad5._crearTema(2), 2);
        return Unidad;        
    }    
}
