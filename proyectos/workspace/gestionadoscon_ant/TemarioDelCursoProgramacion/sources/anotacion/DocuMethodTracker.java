package anotacion;

import java.util.*; /* List<Integer>, ArrayList<> */
import java.lang.reflect.*; /* Method */
/**
 * Este Tracker ratrea metodos anotados con anotacionDocuMethod.
 * 
 * @author Lamberto Maza Casas
 * @version 20150212
 */
public class DocuMethodTracker{
        public static void trackDocumentedMethods(List <Integer> numDMeth, Class<?> cl){
        for(Method m : cl.getDeclaredMethods()){
            anotacionDocuMethod uc = m.getAnnotation(anotacionDocuMethod.class);
            if(uc != null){
                System.out.println("Metodo encontrado: " + uc.id() + "\t Firma: " + uc.firma());
                System.out.println(uc.rem() + "\n");
                numDMeth.remove(new Integer(uc.id()));
            }
        }
        for(int i : numDMeth){
            System.out.println("Warning: Falta el metodo " + i);
        }
    }
    
    public static void main(String[] args) {
        List<Integer> documtdMethod = new ArrayList<Integer>();
        Collections.addAll(documtdMethod, 1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("METODOS ANOTADOS DE LA CLASE: " + App01.class.getCanonicalName());
        trackDocumentedMethods(documtdMethod, App01.class);
        
        List<Integer> docMethsDMainClass = new ArrayList<Integer>();
        Collections.addAll(docMethsDMainClass, 1);
        System.out.println("METODOS ANOTADOS DE LA CLASE: " + EvidenciaTracker.class.getCanonicalName());
        trackDocumentedMethods(documtdMethod, EvidenciaTracker.class);
    }
}
