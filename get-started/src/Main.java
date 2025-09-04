import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	

		var scanner = new Scanner(System.in);
		
		/*
		   =======================================
			Exemplo utilizando operador de negação
		   =======================================
		
		var name = "";  
		while (!name.equalsIgnoreCase("exit")) {
			System.out.println("Informe um nome:");
			name = scanner.next();
			System.out.println(name);
		}
		
		System.out.println("Você informou o nome correto!");
		
		*/
		
		/*
		  =====================================
		  Exemplo utilizando a keyword 'break'
		  =====================================
		  
		var name = "";  
		while (true) {
			System.out.println("Informe um nome:");
			name = scanner.next();
			System.out.println(name);
			
			if(name.equalsIgnoreCase("exit")) break;
		
		}
		
		System.out.println("Você informou o nome correto!");
		
		*/
		
		/*
		 =========================== 
		 Exemplo usando 'do...while' 
		 =========================== 
		  
		  
		  
		  
		  
		  
		  
		*/
		var name = "exit";
		do {
			System.out.println("Informe um nome:");
			name = scanner.next();
			System.out.println(name);
		
		} while (!name.equalsIgnoreCase("exit"));
		
		scanner.close();
		
	}

}
