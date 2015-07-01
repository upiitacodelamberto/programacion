package u4.polinomios;
/**
 *
 * @author lamberto
 * @version 2015.07.01
 */
public class Polinomio {
    int n; //grado del polinomio
    double a[];  //coeficientes del polinomio
    public Polinomio(double a[]){
        this.a=a;
        n=a.length-1;
    }
    //Forma 2 de corregir el error de "no encuentro del constructor por defecto"
    //de la clase Polinomio
    public Polinomio(){ }/* deliberadamente vacio (por ahora) */
    @Override
    public String toString(){
        String s = "";
        int i=n;
        while(i>=0){
            s+=a[i]+" ";
            --i;
        }/* Faltaba el --i; para decrementar el indice i (2015.07.01) */
        return s;
    }
}

class Raiz<T>{
    T r; //una raiz de un polinomio
}