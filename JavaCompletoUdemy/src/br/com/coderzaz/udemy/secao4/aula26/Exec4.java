package br.com.coderzaz.udemy.secao4.aula26;

import java.util.Scanner;

public class Exec4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", x);
		sc.close();
	}

}
