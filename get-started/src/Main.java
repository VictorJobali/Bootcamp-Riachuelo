import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	

		var scanner = new Scanner(System.in);
		
		/*
		  
		 SWITCH CASE COM "INT" 
		  
		  
		System.out.println("Informe um número de 1 até 7:");
		var option = scanner.nextInt();
		switch(option) {
			case 1:
			case 7:
				System.out.println("Fim de semana!!");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
			default:
				System.out.println("Opção inválida");
		}
		   
		   */
		
		
		  
/*		 
  		SWITCH CASE sem "break" 
		  
		  
		System.out.println("Informe um número de 1 até 7:");
		var option = scanner.nextInt();
		switch(option) {
			case 1, 7 -> System.out.println("Fim de semana");
			case 2 -> System.out.println("Segunda");
			case 3 -> System.out.println("Terça");
			case 4 -> System.out.println("Quarta");
			case 5 -> System.out.println("Quinta");
			case 6 -> System.out.println("Sexta");
			default -> System.out.println("Opção inválida");
		
		}*/
		   
		   
		System.out.println("Informe um número de 1 até 7:");
		var option = scanner.nextInt();
		var message = switch(option) {
			case 1, 7 -> {
				var day = option == 1 ? "Domingo" : "Sábado";
				yield String.format("Hoje é %s, fim de semana !!!", day);
			}
			case 2 -> "Segunda";
			case 3 -> "Terça";
			case 4 -> "Quarta";
			case 5 -> "Quinta";
			case 6 -> "Sexta";
			default -> "Opção inválida";
		
		};
		
		System.out.println(message);
		
		scanner.close();
		
	}

}
