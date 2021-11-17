package br.com.coderzaz.udemy.secao4.aula26;

import java.util.Scanner;
/**
 * Exemplo de uso class scanner para entrada de dados via terminal
 * @author zaz
 *
 */
public class Exec1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String x;
		 x = sc.next();
		 System.out.println("Você digitou: "+x);
		 
		 sc.close();
	}

}
