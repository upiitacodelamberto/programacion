package anotacion;

//import java.lang.reflect.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import u4.anotacion.anotacionTema;
import java.io.*;
/**
 * Write a description of class ThemeTracker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThemeTracker
{
    public static void trackThemes(List <String> temas, List<String> arr) throws ClassNotFoundException{
        for(String className : arr){
            //UseCase uc = m.getAnnotation(UseCase.class);
            Class<?> cn = Class.forName(className);
            anotacionTema tm = cn.getAnnotation(anotacionTema.class);
            if(tm != null){
                System.out.println(tm.id() + " " + tm.nomDTema() + "\n"
                        + className + "\n" + tm.remmark() + "\n") ;
                
                anotacionSubTema aST = cn.getAnnotation(anotacionSubTema.class);
                if(aST != null){
                    System.out.println(aST.id() + " " + aST.nomDSubTema() + "\n" 
                         + aST.remmark() + "\n");
                }
                temas.remove(new String(tm.id()));
            }
        }
        for(String i : temas){
            System.out.println("Warning: Falta la clase de ejemplo del tema " + i);
        }
    }// End trackThemes()
    
    static void writeTrackedThemes(List <String> temas, List<String> arr)throws ClassNotFoundException, IOException{
        PrintStream PS = new PrintStream(new FileOutputStream("TemasU4_encontrados.txt"));
        for(String className : arr){
            Class<?> cn = Class.forName(className);
            anotacionTema aT = cn.getAnnotation(anotacionTema.class);
            if(aT != null){
                PS.println(aT.id() + " " + aT.nomDTema() + "\n" + className + "\n" + aT.remmark() + "\n");
                
                anotacionSubTema aST = cn.getAnnotation(anotacionSubTema.class);
                if(aST != null){
                    PS.println(aST.id() + " " + aST.nomDSubTema() + "\n" 
                         + aST.remmark() + "\n");
                }
                temas.remove(aT.id());
            }
        }
        for(String i : temas){
            PS.println("Warning: Falta la clase de ejemplo del tema " + i);
        }
        PS.close();
    }// End writeTrackedThemes()
    
    
    public static void main(String[] args) throws IOException{
        String arr1[] = null;
        String className;
        List<String> temas = new ArrayList<String>();
        Collections.addAll(temas, "4.1", "4.2", "4.3");
        List <String> temasparawrite = new ArrayList<String>(temas);
        //Collections.addAll(temasparawrite, "4.1", "4.2", "4.3");
        Collections.copy(temasparawrite, temas);
        
//        String arr[] = { "u4.jafPabloSznajdleder.Cap13Demo02", "u4.jafPabloSznajdleder.Cap13Demo02_1", 
//                                   "u4.jafPabloSznajdleder.Cap13Demo01", "u4.virtualupiita.EntradaFileYKbd", 
//                                   "u4.jafPabloSznajdleder.Persona", "u4.jafPabloSznajdleder.Demo8", 
//                                   "u4.jafPabloSznajdleder.Demo9", 
//                                   "u4.virtualupiita.SalidaFile", "u4.virtualupiita.EscrituraDTiposBasicos", 
//                                   "u4.virtualupiita.LecturaDTiposBasicos", "u4.virtualupiita.WriteDoubles", 
//                                   "u4.Ceballos2ndEd.Leer", "u4.Ceballos2ndEd.LeerDatos"
//                                 };
        String pkgroot = "/home/lamberto/Programacion_Agosto_Diciembre_2014/"
                + "ProgramacionAgostoDiciembre2014/build/classes";
        List<String> arr = new ArrayList<String>();
        App01 APP = new App01();
        String arr2[] = {pkgroot};
        APP.agregarRutas(arr2); /* Con esto agrego a la List App01.RUTAS las rutas de todos los paquetes 
        del proyecto. */
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
            trackThemes(temas, arr);
            writeTrackedThemes(temasparawrite, arr);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThemeTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// End main()
}// End class ThemeTracker
