package br.com.coderzaz.udemy.secao4.aula26;

import java.util.Locale;
import java.util.Scanner;

public class Exec5 {

	public static void main(String[] args) {
		//Locale configura a localidade geográfica específica
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n",x);

	}

}
