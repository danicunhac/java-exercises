import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String nome = keyboard.nextLine();
		
		if(nome.equalsIgnoreCase("seiya")) {
			System.out.println("Pegasus");
		} else if(nome.equalsIgnoreCase("hyoga")) {
			System.out.println("Cisne");
		} else if(nome.equalsIgnoreCase("shiryu")) {
			System.out.println("Dragão");
		} else if(nome.equalsIgnoreCase("shun")) {
			System.out.println("Andromeda");
		} else if(nome.equalsIgnoreCase("Ikki")) {
			System.out.println("Fênix");
		}
		
		keyboard.close();
	}

}
