import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	

		var scanner = new Scanner(System.in);

		System.out.print("Informe um número: ");
		var n1 = scanner.nextInt();
		System.out.print("Informe um valor para o segundo número: ");
		var n2 = scanner.nextInt();
		while (true) {
			while (n2 < n1 || n2 % n1 == 0) {
				System.out.println("Informe um número maior que o primeiro que você digitou: ");
				n2 = scanner.nextInt();
			}
			
			if(!(n2 % n1 == 0)) {
				System.out.println("Resto diferente de 0");
				break;
			} 
			
		}
		
		scanner.close();
		
	}

}
