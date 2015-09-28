/**
 HolaMundo.java - Un programa ``Hola Mundo'' como 
 buena pr\'actica de inicio de curso. N\'otese que la 
 clase Hola no es public, y por lo tanto este archivo 
 no tiene por qu\'e llamarse Hola.java, de hecho, como 
 Ud. sabe, este archivo se llama HolaMundo.java
 Para compilar este archivo use: javac Holamundo.java
 El ejecutable es el archivo Hola.class
 y para ``correr'' este programa use: java Hola
 Deber\'a observar como salida en la terminal:
 Hola mundo Java!!
 
 @author Lamberto
 @version 2015.09.22
 */
class Hola{
  public static void main(String arr[]){
    System.out.println("Hola mundo Java!!");
	System.out.println("arr.length="+arr.length);
	for(int i=0; i<arr.length; i++){
	  System.out.print(arr[i]+" ");
	}
	System.out.println();
  }
}
