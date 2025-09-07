
//Atributos só podem ser static no corpo. No argumento é normal. Não permite construtor sem argumentos.
//Todo atributo declarado no argumento no record é privado. Acessa-se por meio de método.
//Cria uma vez e os valores só podem ser usados para leitura. Objetos imutáveis
public record Person(String name, int age) {

	
	//'Compact constructor': Pode ser usado para fazer validação de valores
	public Person {	

		
	}
	
	public Person(String name){
		this(name, 1);
	}
	
	public String getInfo() {
		return "Name: " + name + ", age: " + age;
	}
	
}
