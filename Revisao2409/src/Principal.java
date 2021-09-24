import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota \n");
		String nota1 = teclado.nextLine();
		
		System.out.println("Digite a segunda nota \n");
		String nota2 = teclado.nextLine();
		
		System.out.println("Digite a terceira nota \n");
		String nota3 = teclado.nextLine();
		
		Double media = (Double.parseDouble(nota1) + Double.parseDouble(nota2) + Double.parseDouble(nota3))/3;
		
		if (media < 5) {
			System.out.println("Reprovado. Média final = " + media);
		} else if(media > 5 && media < 6) {
			System.out.println("Prova final. Média final = " + media);
		} else {
			System.out.println("Aprovado. Média final = " + media);
		}
		
		teclado.close();
	}

}
