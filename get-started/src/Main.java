import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	

		var scanner = new Scanner(System.in);
		/*
		
		System.out.printf("Quanto é 2 + 2 ?\n");
		var result = scanner.nextInt();
		var isRight = result == 4; Operador de igualdade
		System.out.printf("O resultado é 4, você acertou? (%s)", isRight);
		var isWrong = result != 4; //Operador de desigualdade
		System.out.printf("O resultado é 4, você errou? (%s)\n", isWrong);
		System.out.printf("O resultado é 4, você acertou? (%s)\n", !isWrong); //Operador de inversão
		
		*/
		
		System.out.println("Quantos anos você tem? ");
		var age = scanner.nextInt();
		System.out.println("Você é emancipado? ");
		var isEmancipated = scanner.nextBoolean();
		//var canDrive = age > 17; //Operador de comparação "Maior". Mesmo para "Menor"
		var canDrive = age >= 18 || isEmancipated; //Operador de comparação "Maior ou igual". Mesmo para "Menor ou igual"
		System.out.printf("Você pode dirigir? (%s)", canDrive);
		
		scanner.close();
		
	}

}
