package com.cip.prog4;

import java.util.Scanner;

public class TareaTema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("El jugador 1 hace su lanzamiento");
				
		int valor= (int)(Math.random()*6)+ 1;
		
		System.out.println("Dado 1:" + valor);
		
		int valor1= (int)(Math.random()*6)+ 1;
		
		System.out.println("Dado 2:" + valor1);
		
		System.out.println("El jugador 2 hace su lanzamiento");

		int valor2= (int)(Math.random()*6)+ 1;
		
        System.out.println("Dado 1:" + valor2);
		
		int valor3= (int)(Math.random()*6)+ 1;
		
		System.out.println("Dado 2:" + valor3);
		
		if ((valor + valor1) > (valor2 + valor3)) {
			
			System.out.println("La tirada más alta es " + (valor + valor1));
			
			System.out.println("El ganador es el jugador 1"); 
		}
		
		else if (((valor + valor1) < (valor2 + valor3)) ) {
			
			System.out.println("La tirada más alta es " + (valor2 + valor3));
			
			System.out.println("El ganador es el jugador 2"); 

		}
		
		else {
			
			System.out.println("Empate técnico entre el jugador 1 y jugador 2"); 
	
		}
		
		int media= (valor + valor1 + valor2 + valor3)/4;
		
		System.out.println("La media de los 4 dados es " + Math.round(media));
		
		sc.close();
		
		
		
		

		

	}

}
