package aplicacao;

import java.util.Scanner;

import entidades.forma;
import entidades.retangulo;
import entidades.triangulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner rostov = new Scanner(System.in);
		forma forma = new forma(0, 0.0);
		System.out.println("Digite o tipo de formula que quer fazer: ");
		String tipo = rostov.nextLine();
		if(tipo.equalsIgnoreCase("Retangulo")) {
			System.out.println("Digite o valor da Largura");
			forma.largura = rostov.nextDouble();
			System.out.println("Digite o valor da Altura");
			forma.altura = rostov.nextDouble();
			retangulo retangulo = new retangulo(forma.largura, forma.altura);
			forma.tipo = tipo;
			System.out.println(forma.mostrarInfo(tipo));
			System.out.println(retangulo.calcularArea());
			
			
		}else if(tipo.equalsIgnoreCase("Triangulo")) {
			System.out.println("Digite o valor da Base");
			forma.base = rostov.nextDouble();
			System.out.println("Digite o valor da Altura");
			forma.altura = rostov.nextDouble();
			triangulo triangulo = new triangulo(forma.base, forma.altura);
			forma.tipo = tipo;
			System.out.println(forma.mostrarInfo(tipo));
			System.out.println("Resultado: "+triangulo.calcularArea()+"");
		}

}
}
