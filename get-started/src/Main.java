import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	

		var scanner = new Scanner(System.in);

		System.out.print("Informe sua altura(cm):");
		var height = scanner.nextFloat();
		System.out.print("Informe seu peso(kg):");
		var weight = scanner.nextFloat();
		var BMI = (weight/(Math.pow(height, 2)));

		if(BMI <= 18.5) {
			System.out.println("Abaixo do peso");
		} else if (BMI >= 18.6 && BMI <= 24.9 ) {
			System.out.println("Peso ideal");
		} else if (BMI >= 25.0 && BMI <= 29.9 ) {
			System.out.println("Levemente acima do peso");
		} else if (BMI >= 30.0 && BMI <= 34.9 ) {
			System.out.println("Obesidade grau I");
		} else if (BMI >= 35.0 && BMI <= 39.9 ) {
			System.out.println("Obesidade grau II (Severa)");
		} else {
			System.out.println("Obesidade III (Mórbida)");
		}
		
		scanner.close();
		
	}

}
