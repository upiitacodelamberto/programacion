package gestiondboletos;

import java.util.Vector;

import java.util.Scanner;
public class TestBoleto {

	public static void main(String[] args) {
		MENU=new Vector<String>();
		MENU.add("Generar Boleto");
		MENU.add("Salir");
		EVENTO=new Vector<String>();
		EVENTO.add("Concierto de Iron Maiden");
		EVENTO.add("Concierto de Ariana Grande");
		Bol ARR[]=new Bol[2];
		ARR[0]=new Bol();
		ARR[1]=new Bol();
		procesarComandos(ARR);
	}
	
	static void procesarComandos(Bol B[]){
		int opc, evt;//opcion, evento
		Boleto b;
		do{
		opc=mostrarMenu();
		switch(opc){
		  case 0:{
			  evt=mostrarEventos();
			  switch(evt){
			    case 0:{
			      b=new Boleto(EVENTO.get(0));
			      b.numdbol=B[0].VBoleto.size()+1;
			      B[0].VBoleto.add(b);
			      break;
			    }
			    case 1:{
			      b=new Boleto(EVENTO.get(1));
				  b.numdbol=B[1].VBoleto.size()+1;
				  B[1].VBoleto.add(b);
			      break;
			    }
			    default: break;
			  }
			  break;
		  }
		  case 1:{
			  
			  break;
		  }
		  default: break;
		}
		}while(opc!=MENU.size()-1);
	}
	static Vector<String> MENU;
	static Vector<String> EVENTO;
	static int mostrarMenu(){
		int sel; //seleccion
		Scanner S=new Scanner(System.in);
		System.out.println("Seleccione el numero que corresponda "
				+"a la opcion deseada");
		for(int i=0; i<MENU.size(); ++i)
			System.out.println(i+" "+MENU.get(i));
		System.out.print("Seleccion=");
		sel=S.nextInt();
		return sel;
	}
	static int mostrarEventos(){
		int ev;
		System.out.println("Seleccione evento");
		for(int i=0; i<EVENTO.size(); ++i)
			System.out.println(i+" "+EVENTO.get(i));
		System.out.print("Numero de evento: ");
		Scanner T=new Scanner(System.in);
		ev=T.nextInt();
		return ev;
	}
}
