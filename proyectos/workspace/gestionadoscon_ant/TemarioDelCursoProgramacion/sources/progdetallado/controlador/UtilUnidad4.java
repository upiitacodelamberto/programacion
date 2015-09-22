package progdetallado.controlador;

import progdetallado.modelo.Tema;
import progdetallado.modelo.SubTema;
import anotacion.anotacionEvidencia;

@anotacionEvidencia(id = 1, nomdEvidencia = "Clase Utilitaria p/controlador de progdetallado", 
        numDBoleta= 2014640216, nomDAlumno= "Salvador Ramirez Martinez")
public class UtilUnidad4 {

    public static String _crearCmpEspecifica() {
        return "Implementar interfaces graficas en el lenguaje Java para presentacion\n"
                + "de la informacion.";
    }

    public static Tema[] _crearTema(int numdtemas) {
        int t = 0;
        Tema Tema[] = new Tema[numdtemas];
        while (t < numdtemas) {
            Tema[t] = new Tema();
            t++;
        }
        Tema[0].setNombre("Objetos FIle");
        Tema[0].setSubTema(_crearSubTema(2), 2);
        Tema[1].setNombre("Clases de JAVA para E/S de datos");
        Tema[2].setNombre("Excepciones");
        Tema[2].setSubTema(_crearSubTema(5), 5);
        return Tema;
    }

    public static SubTema[] _crearSubTema(int numdsubtemas) {
        int st = 0;
        SubTema SubTema[] = new SubTema[numdsubtemas];
//        SubTema SubTemas[] = new SubTema[numdsubtemas];
        while (st < numdsubtemas) {
            SubTema[st] = new SubTema();
            st++;
        }
        switch (numdsubtemas) {
            case 2: {

                SubTema[0].setNombre("Entrada y Salida de archivos");
                SubTema[1].setNombre("Entrada y Salida con objetos");
                break;
            }
            case 5: {
                SubTema[0].setNombre("Atrapado de excepciones (catch)");
                SubTema[1].setNombre("Lanzamiento de excepciones (try)");
                SubTema[2].setNombre("Propagacion de excepciones (throw)");
                SubTema[3].setNombre("Tipos de excepciones");
                SubTema[4].setNombre("Excepciones definidas por el programador");
            }
        }
        return SubTema;
    }// End  _crearSubTema()
}// End class UtilUnidad4
