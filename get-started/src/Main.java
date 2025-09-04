import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	

		var scanner = new Scanner(System.in);
		System.out.println("Digite um número:");
		var n1 = scanner.nextInt();
		
		for(var i = 1; i <= 10; i++) {
			var result = n1 * i;
			System.out.printf("%s * %s = %s\n", n1, i, result);
			
		}

		scanner.close();
		
	}

}
