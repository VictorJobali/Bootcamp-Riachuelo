
//Atributos s� podem ser static no corpo. No argumento � normal. N�o permite construtor sem argumentos.
//Todo atributo declarado no argumento no record � privado. Acessa-se por meio de m�todo.
//Cria uma vez e os valores s� podem ser usados para leitura. Objetos imut�veis
public record Person(String name, int age) {

	
	//'Compact constructor': Pode ser usado para fazer valida��o de valores
	public Person {	

		
	}
	
	public Person(String name){
		this(name, 1);
	}
	
	public String getInfo() {
		return "Name: " + name + ", age: " + age;
	}
	
}
