package progdetallado.modelo;
import progdetallado.modelo.Unidad;
/**
 *
 * @author profesor
 */
public class ProgDetallado {
    String nombre = null;
    String objgeneral = null;
    int numdunidades = 0;
    Unidad Unidad[] = null;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setObjGeneral(String objgeneral){
        this.objgeneral = objgeneral;
    }
    public void setNumDUnidades(int numdunidades){
        this.numdunidades = numdunidades;
    }
    public void setUnidad(Unidad Unidad[]){
        this.Unidad = Unidad;
    }
    public int getNumDUnidades(){
        return numdunidades;
    }

    @Override
    public String toString() {
        String S;
        int U, T, ST; // Unidad, Tema, SubTema 
        S =  nombre + "\n";
        for(int u = 0; u < numdunidades; u++){
            U = u + 1;
            S = S + U  + " " + Unidad[u].nombre + "\n";
            if(Unidad[u].Tema != null){
                for(int t = 0; t < Unidad[u].numdtemas; t++){
                    T = t + 1;
                    S = S + "\t" +U+"."+ T + " " + Unidad[u].Tema[t].nombre + "\n";
                    if(Unidad[u].Tema[t].SubTema != null){
                        for(int st = 0; st < Unidad[u].Tema[t].numdsubtemas ; ++st){
                            ST = st + 1;
                            S = S + "\t\t"+U+"."+ T + "." + ST + " " + Unidad[u].Tema[t].SubTema[st].nombre + "\n";
                        }
                    }
                }
            }
        }
        return S; 
    }
}
