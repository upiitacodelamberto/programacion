package progdetallado.controlador;

import progdetallado.modelo.Tema;
import anotacion.anotacionEvidencia;

@anotacionEvidencia (id = 1, nomdEvidencia = "Clase Utilitaria p/controlador de progdetallado", 
        numDBoleta = 2014640078, nomDAlumno = "Luis Enrique Farias Quiroz")
public class UtilUnidad2 {
    public static String _crearCmpEspecifica(){
        return "";
    }
    public static Tema[] _crearTema(int numdtemas){
        int h = 0;
        Tema Tema[] = new Tema[numdtemas];
        while(h < numdtemas){
            Tema[h] = new Tema();
            h++;
        }
        Tema[0].setNombre("Clases y objetos");
        Tema[1].setNombre("Alcance de clases");
        Tema[2].setNombre("Modificadores");
        Tema[3].setNombre("Metodos. Uso de setters y getters");
        Tema[4].setNombre("Constructores");
        Tema[5].setNombre("Sobrecarga de metodos");
        Tema[6].setNombre("Sobrecarga de constructores");
        Tema[7].setNombre("Uso de this");
        Tema[8].setNombre("Herencia simple");
        
        
        return Tema;        
               
    }    
}
