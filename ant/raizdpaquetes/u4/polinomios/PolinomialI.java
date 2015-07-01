package u4.polinomios;
/**
 *
 * @author lamberto
 * @version 2015.07.01
 */
public interface PolinomialI<T> { 
    Polinomio suma(Polinomio p);
    Polinomio multiplicar(Polinomio p);
    Raiz<T>[] resolver(Polinomio p);
    boolean esHurwitz(Polinomio p);
}
