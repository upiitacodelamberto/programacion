package gestiondboletos;

import java.util.Vector;

import java.util.Scanner;
public class TestBoleto {

	public static void main(String[] args) {
		MENU.add("Generar Boleto");
		MENU.add("Salir");
		EVENTO.add("Concierto de Iron Maiden");
		EVENTO.add("Concierto de Ariana Grande");
	}
	
	static void procesarComandos(Bol B[]){
		int opc, evt;//opcion, evento
		Bol b;
		opc=mostrarMenu();
		switch(opc){
		  case 0:{
			  evt=mostrarEventos();
			  b=new Boleto(EVENTO.get(evt));
			  break;
		  } 
		}
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
		Scanner T=new Scanner(System.in);
		ev=T.nextInt();
		return ev;
	}
}
