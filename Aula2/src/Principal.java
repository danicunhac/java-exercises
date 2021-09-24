import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Qual o seu ano de nascimento?");
		Scanner teclado = new Scanner(System.in);
		int ano = teclado.nextInt();
		
		LocalDate d3 = LocalDate.now();
		int anoAtual = d3.getYear();
		
		int idade = anoAtual - ano;
		
		System.out.println("Você tem " + idade + " anos");
		teclado.close();


	}
}
