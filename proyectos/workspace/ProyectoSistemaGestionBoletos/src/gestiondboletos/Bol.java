package gestiondboletos;



import java.util.Vector;

public class Bol {
	public String evento;
	public Vector<Boleto> VBoleto;
	public Bol(){ }
	public Bol(String evento){
		this.evento=evento;
	}
}
