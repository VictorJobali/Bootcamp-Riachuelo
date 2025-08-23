import java.util.Scanner;

public class Main {

	private final static String WELCOME_MESSAGE = "Olá, informe o seu nome: ";
	
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println(WELCOME_MESSAGE);
		String name = scan.next();
		System.out.println("informe sua idade: ");
		int age = scan.nextInt();
		
		System.out.printf("Olá %s sua idade é %d anos \n", name, age);

		scan.close();
		
	}

}
