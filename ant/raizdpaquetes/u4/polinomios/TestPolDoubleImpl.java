package u4.polinomios;

/**
 *
 * @author lamberto
 */
public class TestPolDoubleImpl {
    public static void main(String[] args) {
        double a[]={3, 0, 5, 3};
        Polinomio A=new Polinomio(a);
        double b[]={5, 3, 6};
        PolDoubleImpl B=new PolDoubleImpl(b);
        Polinomio C=B.suma(A);
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
    }
}
