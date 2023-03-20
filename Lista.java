package Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		ArrayList <Integer> listaDeEnteros;
		String numero;
		System.out.println("Introduce los valores numericos de la lista: ");
		numero = teclado.next();

		
		//llamada a metodo de leer numero por teclado
		listaDeEnteros = listaDesdeTeclado(numero);

		System.out.println("El Tamaño de la lista es [" + listaDeEnteros.size()+ "]");
		System.out.println("Los Valores de la lista:");

		for (int i = 0; i < listaDeEnteros.size(); i++) {
			System.out.println("Posicion de la lista : ["+ (i + 1) + "] " + listaDeEnteros.get(i));
		}
	}

	//Metodo para rellenar la lista desde el teclado
	public static ArrayList <Integer> listaDesdeTeclado(String valor) {
		ArrayList <Integer> resultado = new ArrayList<>();
		while (!valor.equals("0")) {	
			resultado.add(Integer.valueOf(valor));
			valor = teclado.next();
		}
		return resultado;
	}
}



