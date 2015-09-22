package progdetallado.modelo;
/**
 *
 * @author profesor
 */
public class SubTema {
    String nombre = null;
    String cmpespecifica = null;
    int numdsubtemas = 0;
    SubTema SubTema[] = null;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /*public void setNumDSubTemas(int numdsubtemas){
        this.numdsubtemas = numdsubtemas;
    }
    public void setSubTema(SubTema SubTema[], int M){
        this.SubTema = SubTema;
        setNumDSubTemas(M);
    }
    public int getNumDSubTemas(){
        return numdsubtemas;
    }*/
}
