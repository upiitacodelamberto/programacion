package anotacion;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a description of class App01 here.
 * 
 * @author Lamberto Maza Casas
 * @version 20150212
 */
public class App01 {

    //static List<String> RUTAS;
    List<String> RUTAS;
    

    @anotacionDocuMethod(id = 1, firma = "String[] getArchivosClass(String ruta)",
    rem = "Con este metodo se puede obtener un array con nombres de los \n"
    + "archivos class presentes en una ruta. (No opera recursivamente.)\n"
    + "Se necesita crear un metodo que devuelva un arreglo de \"todas las rutas\" \n"
    + "dentro de un directorio.")
    String[] getArchivosClass(String ruta) {
        String arr[] = null, result[] = null;
        int N = 0, index;
        File nombre = new File(ruta);
        if (nombre.exists()) {
            if (nombre.isDirectory()) {
                arr = nombre.list();
            }
        } else {
            System.out.println(ruta + " no existe1");
        }
        if (arr != null) {
            if ((N = contarLosClass(arr)) > 0) {
                result = new String[N];
                index = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].endsWith(".class")) {
                        result[index] = arr[i];
                        index++;
                    }
                }
            }
        }
        return result;
    }

    @anotacionDocuMethod(id = 2, firma = "private int contarLosClass(String a[])",
    rem = "Se usa en el metodo 1.")
    private int contarLosClass(String a[]) {
        int count = 0;
        for (String fn : a) {
            if (fn.endsWith(".class")) {
                count++;
            }
        }
        return count;
    }

    @anotacionDocuMethod(id = 3, firma = "String[] getSubDirs(String ruta)",
    rem = "Si no hay subdirectorios se devuelve null.")
    String[] getSubDirs(String ruta) {
        String result[] = null;
        String arr[] = null;
        int N, index;
        if (ruta != null) {
            File nombre = new File(ruta);
            if (nombre.exists()) {
                if (nombre.isDirectory()) {
                    arr = nombre.list();
                }
            } else {
                System.out.println(ruta + " no existe!");
            }
        }
        if (arr != null) {
            if ((N = contarLosDirs(arr, ruta + "/")) > 0) {
                //System.out.println("Subdirectorios encontrados: " + N);
                result = new String[N];
                index = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (new File(ruta + "/" + arr[i]).isDirectory()) {
                        result[index] = ruta + "/" + arr[i];
                        index++;
                    }
                }
            }
        }
        return result; /* si no hay subdirectorios se devuelve null*/
    }

    @anotacionDocuMethod(id = 4, firma = "private int contarLosDirs(String a[])",
    rem = "Se usa en el metodo 3.\n"
    + "Ahora que ya se tiene un metodo que devuelve los subdirectorios de \n"
    + "una ruta (el metodo 3) podemos crear una funcion recursiva que agregue\n"
    + "rutas de directorio a una lista static de String. Tal funcion recursiva sera \n"
    + "de tipo void, recibira un arreglo de String, si este es null, simplemente \n"
    + "hara return, si no es null, agregara las rutas de directorio una a la vez\n"
    + "y se llamara a si misma pasando como argumento el arreglo que devuelve\n"
    + "el metodo 3: String[] getSubDirs(String ruta).")
    private int contarLosDirs(String a[], String prefijo) {
        int count = 0;
        for (String fn : a) {
            File FN = new File(prefijo + fn);
            if (FN.isDirectory()) {
                count++;
            }
        }
        return count;
    }

    public App01() {
        RUTAS = new ArrayList<String>();
    }

    @anotacionDocuMethod(id = 5, firma = "public void agregarRutas(String rutas[])",
    rem = "La funcion recursiva indicada en el comentario del metodo 4.\n"
    + "FALTA PROBAR SI FUNCIONA BIEN!! YEAH FINALLY  IT WORKS!!!!!!!!!!!!!    (20150212)")
    public void agregarRutas(String rutas[]) {
        if (rutas == null) {
            return;
        } else {
            for (String s : rutas) {
                Collections.addAll(RUTAS, s);
                agregarRutas(getSubDirs(s));
            }
        }
    }
    
    @anotacionDocuMethod(id = 6, firma = "private String getPrefijo(String ruta)",
    rem = "Se usa en el metodo 4, NOPE! parece que ya no se usa. (20150212)")
    private String getPrefijo(String ruta) {
        String res = null;
        if (ruta.lastIndexOf("/") > 0) {
            res = ruta.substring(0, ruta.lastIndexOf("/") + 1);
        }
        return res;
    }

    @Override
    public String toString() {
        String S = "";
        for (String s : RUTAS) {
            S += s + "\n";
        }
        return S;
    }
    @anotacionDocuMethod(id = 7, firma = "public List<String> chroot(String pkgroot)", 
            rem = "Hace chroot de las rutas con respecto a la ruta pkgroot.")
    public List<String> chroot(String pkgroot){
        List<String> res = new ArrayList<String>();
        if(pkgroot.endsWith("/")){
            pkgroot = pkgroot.substring(0, pkgroot.lastIndexOf("/"));
        }
        for(int i = 0; i < RUTAS.size(); i++){
            if(RUTAS.get(i).startsWith(pkgroot, 0)){
                if(pkgroot.length() == RUTAS.get(i).length()){
                    res.add(i, "/");
                } else {
                    res.add(i, RUTAS.get(i).substring(pkgroot.length()));
                }
            } else {
                return null; /* one path does not begin with pkgroot */
            }
        }
        return res;
    }
    @anotacionDocuMethod(id = 8, firma = "String prefijoCanonico(String path)", 
            rem = "Obtiene el prefijo canonico correspondiente a una ruta de paquete.\n"
            + "Con este prefijo + \".\" + className (sin .class) se obtendra el String que \n"
            + "hay que gregar a la List arr en el main de EvidenciaTracker.")
    String prefijoCanonico(String path){
        String pc = "";
        while(path.lastIndexOf("/") >  0){
            pc = "." + path.substring(path.lastIndexOf("/") + 1) + pc;
            path = path.substring(0, path.lastIndexOf("/"));
        }
        pc= path.substring(1) + pc;
        return pc;
    }
    
    @anotacionDocuMethod(id = 9, firma = "public String chroot(String s, String pkgroot)", 
            rem = "Hace chroot de la ruta s con respecto a la ruta pkgroot.")
    public String chroot(String s, String pkgroot){
        String res = "";
        if(pkgroot.endsWith("/")){
            pkgroot = pkgroot.substring(0, pkgroot.lastIndexOf("/"));
        }
        if(s.startsWith(pkgroot, 0)){
                if(pkgroot.length() == s.length()){
                    res += "/";
                } else {
                    res += s.substring(pkgroot.length());
                }
            } else {
                return null; /* one path does not begin with pkgroot */
            }
        return res;
        }
}// End class App01
