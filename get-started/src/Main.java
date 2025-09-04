import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	

		var scanner = new Scanner(System.in);

		System.out.print("Informe o primeiro número:");
		var n1 = scanner.nextInt();
		var n2 = 0;
		while(true) {
			System.out.print("Informe o segundo número:");
			n2 = scanner.nextInt();
			if(n2 > n1) break;
			System.out.printf("Informe um número maior que %s\n",n1);
		}
		System.out.print("Você quer par ou ímpar?");
		var choice = scanner.next();
		if (choice.equalsIgnoreCase("par")) {
			for (var i = n1; i <= n2 ; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		} else {
			for (var i = n1; i <= n2; i++) {
				if(i % 2 == 1) {
					System.out.println(i);
				}
			}
		}
		
		scanner.close();
		
	}

}
