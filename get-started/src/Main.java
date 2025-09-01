import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	

		var scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		var value1 = scanner.nextInt(); //No caso de número racionais, usar nextfloat
		System.out.println("Informe o segundo número: ");
		var value2 = scanner.nextInt();
		
		System.out.printf("%s + %s = %s\n", value1, value2, value1+value2);
		System.out.printf("%s - %s = %s\n", value1, value2, value1-value2);
		//System.out.printf("%s / %s = %.2f\n", value1, value2, value1/value2);
		System.out.printf("%s %% %s = %s\n", value1, value2, value1%value2);
		System.out.printf("%s * %s = %s\n", value1, value2, value1*value2);
		
		scanner.close();
		
		var value = 50;
		System.out.println(++value);
		System.out.println(10 + value++);		
		System.out.println(10 + value);
	}

}
