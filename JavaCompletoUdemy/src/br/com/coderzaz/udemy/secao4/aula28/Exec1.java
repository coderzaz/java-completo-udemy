package br.com.coderzaz.udemy.secao4.aula28;

public class Exec1 {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C; 
		
					
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz Quadrada de "+x+" = "+A);
		System.out.println("Raiz Quadrada de "+x+" = "+B);
		System.out.println("Raiz Quadrada de 25 "+x+" = "+C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0,  2.0);
		
		System.out.println(x+" elevado a "+y+" = "+A);
		System.out.println(x+" elevado ao Quadrado "+y+" = "+B);
		System.out.println(x+" 5 elevado ao Quadrado "+y+" = "+C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de "+y+" = "+A);
		System.out.println("Valor absoluto de "+z+" = "+B);
		
		
		
	}

}
