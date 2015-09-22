package progdetallado.controlador;
import progdetallado.modelo.Tema;
import progdetallado.modelo.Unidad;
import progdetallado.modelo.SubTema;
import anotacion.anotacionEvidencia;

@anotacionEvidencia (id = 1, nomdEvidencia = "Clase Utilitaria p/controlador de progdetallado", 
        numDBoleta = 2014640336, nomDAlumno = "Alexie Pineda De La Rosa")
public class UtilUnidad1 {
    public static String _crearCmpEspecifica(){
        return "Desarrollar aplicaciones empleando los elementos basicos del lenguaje\n" +
               "Java para la construccion de programas.";
    }
    public static Tema[] _crearTema(int numdtemas){
        int t = 0;
        Tema Tema[] = new Tema[numdtemas];
        while(t < numdtemas){
            Tema[t] = new Tema();
            t++;
        }
        Tema[0].setNombre("Fases en el desarrollo de un programa en Java");
        Tema[1].setNombre("Elementos que conforman el lenguaje Java");
        
        Tema[1].setSubTema(_crearSubTema(9),9);
        return Tema;           
    }
    public static SubTema[] _crearSubTema(int numdsubtemas){
        int st = 0;
        SubTema SubTema[] = new SubTema[numdsubtemas];
        while(st < numdsubtemas){
            SubTema[st] = new SubTema();
            st++;
        }
        
        SubTema[0].setNombre("Tipo de datos");
        SubTema[1].setNombre("Literales");
        SubTema[2].setNombre("Identificadores");
        SubTema[3].setNombre("Palabras Clave");
        SubTema[4].setNombre("Declaracion de constantes simolicas");
        SubTema[5].setNombre("Expresiones numericas");
        SubTema[6].setNombre("Conversion entre tipo de datos");
        SubTema[7].setNombre("Operadores");
        SubTema[8].setNombre("E/S de datos desde el teclado en Java");
       return SubTema;
    }
}

