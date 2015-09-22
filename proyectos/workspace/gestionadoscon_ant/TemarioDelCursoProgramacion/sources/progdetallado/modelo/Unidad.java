package progdetallado.modelo;

/**
 *
 * @author profesor
 */
public class Unidad {
    String nombre = null;
    String cmpespecifica = null;
    int numdtemas = 0;
    Tema Tema[] = null;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCmpEspecifica(String cmpespecifica){
        this.cmpespecifica = cmpespecifica;
    }
    public void setNumDTemas(int numdtemas){
        this.numdtemas = numdtemas;
    }
    public void setTema(Tema Tema[], int N){
        this.Tema = Tema;
        setNumDTemas(N);
    }
    public int getNumDTemas(){
        return numdtemas;
    }
}
