package anotacion;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Este Tracker ratrea clases anotadas con anotacionEvidencia.
 * @author Lamberto Maza Casas
 * @version 20150212
 */
public class EvidenciaTracker {

    //public static void trackEvidencias(List<Integer> evidencias, String arr[]) throws ClassNotFoundException {
    public static void trackEvidencias(List<Integer> evidencias, List<String> arr) throws ClassNotFoundException {
        for (String className : arr) {
            Class<?> cn = Class.forName(className);
            anotacionEvidencia aE = cn.getAnnotation(anotacionEvidencia.class);
            if (aE != null) {
                System.out.println("Evidencia " + aE.id() + " " + aE.nomdEvidencia() + "\n"
                        + className + "\n" + aE.numDBoleta() + " " + aE.nomDAlumno() + "\n");

                evidencias.remove(new Integer(aE.id()));
            }
        }
        for (int i : evidencias) {
            System.out.println("Warning: Falta la evidencia " + i);
        }
    }// End trackEvidencias()

    @anotacionDocuMethod(id = 1, firma = "public static void main(String[] args) throws IOException",
    rem = "Hasta ahora se tiene una lista static de Strings en la clase App01. Por cada elemento \n"
    + "de esta lista con el metodo 1 de las instancias de la clase App01 se puede obtener un array \n"
    + "de Strings con los nombres de los archivos .class contenidos en ese paquete (Cada elemento\n"
    + "de la citada lista corresponde a un paquete del proyecto). Con los elementos de este arreglo\n"
    + "de Strings (que son los nombres de los archivos class del paquete) y el elemento de la lista \n"
    + "que le dio origen (al array) se puede ir creando los nombres de clase calificados para todas \n"
    + "las clases presentes en el proyecto. Cada uno de estos nombres calificados de clase se deberan\n"
    + "ir agregando a la lista de Strings arr. Para asi poder encontrar las evidencias entregadas por\n"
    + "los alumnos que ya fueron integradas al proyecto. NOTA: El array RUTAS ya no es variable de\n"
     + "clase en App01, ahora es variable de instancia. (20150213)")
    public static void main(String[] args) throws IOException, Exception {
        List<Integer> evidencias = new ArrayList<Integer>();
        Collections.addAll(evidencias, 1, 2);
        String arr1[] = null;
        String className;

        String pkgroot = "/home/lamberto/Programacion_Agosto_Diciembre_2014/"
                + "ProgramacionAgostoDiciembre2014/build/classes";

        List<String> arr = new ArrayList<String>();
        // Collections.addAll(arr, "u1.progdetallado.controlador.UtilUnidad5");
        App01 APP = new App01();
//        //
//        String arr1[] = APP.getArchivosClass("/home/lamberto/Programacion_Agosto_Diciembre_2014/"
//                + "ProgramacionAgostoDiciembre2014/build/classes/u1/progdetallado/controlador");
//        System.out.println("{arr1} = ");
//        for (String s : arr1) {
//            System.out.println(s);
//        }
//        //
        String arr2[] = {pkgroot};
        APP.agregarRutas(arr2); /* Con esto agrego a la List App01.RUTAS las rutas de todos los paquetes 
        del proyecto. */
//        System.out.println(APP);


//        for (String s : pkgs) {
//            System.out.println(s);
//        }

        App01 APPaux = new App01();
        String pkgrootsrc = "/home/lamberto/Programacion_Agosto_Diciembre_2014/"
                + "ProgramacionAgostoDiciembre2014/src";
        String arr3[] = {pkgrootsrc};
        APPaux.agregarRutas(arr3);
        List<String> pkgssrc = APPaux.chroot(pkgrootsrc);

        for (String s : APP.RUTAS) {
            if ((arr1 = APP.getArchivosClass(s)) != null) {
                for (String t : arr1) {
                    className = APP.prefijoCanonico(APP.chroot(s, pkgroot)) + "." + t.substring(0, t.indexOf("."));
                    /* para que solo busque en los pkgs del directorio src del proyecto. */
                    if (pkgssrc.indexOf(APP.chroot(s, pkgroot)) >= 0) { 
                        Collections.addAll(arr, className);
                    }
                }
            }
        }

        try {
            trackEvidencias(evidencias, arr);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EvidenciaTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// End main()
}// End EvidenciaTracker
