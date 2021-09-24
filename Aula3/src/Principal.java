import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1 = teclado.nextInt();
		System.out.println("O primeiro número é " + num1);
		int num2 = teclado.nextInt();
		System.out.println("O segundo número é " + num2);
		teclado.close();
		
		int soma = num1 + num2;
		int diferenca = num1 - num2;
		System.out.println();
		System.out.println("Soma entre os dois números é " + soma);
		System.out.println("A diferença entre eles é " + diferenca);
	}

}
