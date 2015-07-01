package u4.polinomios;

/**
 *
 * @author lamberto
 * @version 2015.07.01
 * PolDoubleImpl modela un polinomio para el cual nos interesan 
 * las raices reales.
 */
public class PolDoubleImpl extends Polinomio implements PolinomialI<Double>{
    @Override
    public Polinomio suma(Polinomio p) {
//        int N=n>p.n?n:p.n;
        int N;
        Polinomio O, P;//deg{O} debera ser menor o igual que deg{P}
        if(n>p.n){//Cual polinonio tiene grado mas alto? el nuestro o el que 
                  //recibimos como argumento
            P=this; O=p; N=n;
        }else{
            P=p; O=this; N=p.n;
        }
        double arr[] = new double[N+1];
        for(int i=N; i>=0; --i){
            if(i>O.n){
                arr[i]=P.a[i];
            }else{
                arr[i]=P.a[i]+O.a[i];
            }
        }
        return new Polinomio(arr);
    }
    //Forma 1 de corregir el error de "no encuentro del constructor por defecto"
    //de la clase Polinomio
    public PolDoubleImpl(double arr[]){
        super(arr);
    }

    @Override
    public Polinomio multiplicar(Polinomio p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Raiz<Double>[] resolver(Polinomio p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean esHurwitz(Polinomio p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
