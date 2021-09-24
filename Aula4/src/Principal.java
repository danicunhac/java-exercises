import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		String nota1 = teclado.nextLine();
		
		System.out.println("Digite a segunda nota");
		String nota2 = teclado.nextLine();
		
		System.out.println("Digite a terceira nota");
		String nota3 = teclado.nextLine();
		
		Double soma = (Double.parseDouble(nota1) + Double.parseDouble(nota2) + Double.parseDouble(nota3))/3;
		
		System.out.println("A média é: " + soma);
		teclado.close();
		}

}
