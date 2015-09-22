package progdetallado.controlador;

import progdetallado.modelo.Tema;
import progdetallado.modelo.SubTema;
import anotacion.anotacionEvidencia;

@anotacionEvidencia (id = 1, nomdEvidencia = "Clase Utilitaria p/controlador de progdetallado", 
        numDBoleta = 2014640032, nomDAlumno = "Bruno Sandoval Francisco")
public class UtilUnidad5 {

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
        Tema[0].setNombre("Interfaces graficas GUI");
        Tema[1].setNombre("Interfaces JFC (swing)");
        Tema[1].setSubTema(_crearSubTema(2), 2);
        return Tema;
    }

    public static SubTema[] _crearSubTema(int numdsubtemas) {
        int st = 0;
        SubTema SubTema[] = new SubTema[numdsubtemas];
        while (st < numdsubtemas) {
            SubTema[st] = new SubTema();
            st++;
        }

        SubTema[0].setNombre("Crear un componente swing ");
        SubTema[1].setNombre("Componentes swing comunes");
        return SubTema;
    }
}
