public class Main {
	
	public static void main(String[] args) {	

		var person = new Person("João");
		System.out.println(person);
		System.out.println(person.getInfo()); 
		System.out.println(person.name());
		System.out.println(person.age());
		//var newPerson = new Person(person.name(), 13);
		
	}

}
