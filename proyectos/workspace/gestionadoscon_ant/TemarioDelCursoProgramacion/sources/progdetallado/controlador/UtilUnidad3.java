package progdetallado.controlador;
import static progdetallado.controlador.UtilUnidad1._crearSubTema;
import progdetallado.modelo.SubTema;
import progdetallado.modelo.Tema;
import anotacion.anotacionEvidencia;

@anotacionEvidencia (id = 1, nomdEvidencia = "Clase Utilitaria p/controlador de progdetallado", 
        numDBoleta = 2014640063, nomDAlumno = "Roberto Eduardo Custodio Gonzalez")
public class UtilUnidad3 {
    
    public static String _crearCmpEspecifica(){
        
        return "Construir programas que utilicen interfaces para el manejo de la informacion\n" +
                "manifestando el uso adecuado del polimorfismo";
        
    }
    
    public static Tema[] _crearTema(int numdtemas){
       
        // Tema Tema[] = null;
        
        int t=0;
        Tema Tema[] = new Tema [numdtemas];
        
        while (t < numdtemas){        
            Tema[t]=new Tema();
            t++;            
        }
        
        Tema[0].setNombre("Introduccion a interfaces");
        Tema[1].setNombre("Clases abstractas");
        Tema[2].setNombre("Uso de super");
        Tema[3].setNombre("Metodos abstractos");
        Tema[4].setNombre("Polimorfismo");
        Tema[5].setNombre("Paquetes");      
        
        Tema[5].setSubTema(_crearSubTema(2),2);
        return Tema;
        
    }
    
    public static SubTema[] _crearSubTema(int numdsubtemas){
        
        int st = 0;
        SubTema SubTema[] = new SubTema[numdsubtemas];
        
        while(st < numdsubtemas){
            
            SubTema[st] = new SubTema();
            st++;
            
        }
        
        SubTema[0].setNombre("Importacion de paquetes");
        SubTema[1].setNombre("Creacion de paquetes");
        return SubTema;
    
    }
     
}
