package anotacion;
import java.io.File;

public class App00{
    String[] getArchivosClass(String ruta){
        String arr[] = null, result[] = null;
        int N = 0, index;
        File nombre = new File(ruta);
        if(nombre.exists()){
            if(nombre.isDirectory()){
                arr = nombre.list();
            }
        } else {
            System.out.println(ruta + " no existe!");
        }
        if(arr != null){
            if((N = contarLosClass(arr)) > 0){
                result = new String[N];
                index = 0;
                for(int i = 0; i < arr.length; i++){
                    if(arr[i].endsWith(".class")){
                        result[index] = arr[i];
                        index++;
                    }
                }
            }
        }
        
        return result;
    } 
    int contarLosClass(String a[]){
        int count = 0;
        for(String fn : a){
            if(fn.endsWith(".class")) count++;
        }
        return count;
    }
}// End class App00
