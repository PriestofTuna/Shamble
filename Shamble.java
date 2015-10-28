
import java.util.Scanner;


public class Peoples {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	String personsName = keyboard.next();
	Persons person = new Persons();
	Persons anotherPerson = new Persons("Bob", 24);
	Persons Bob = new Person();
	Persons.this.name = "Bob";
	Persons.this.age = 24;
	Persons.writeOutput();
	
	Persons Mat = new Person();
	Persons.this.name = "Matthew";
	Persons.this.age = "15";
	
}
}
// Everything above this comment is for the class "Peoples"
// Everything below this comment is for the class Persons
public class Persons {

	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;
	
	public String name() {
		return this.name;
	}
	public int age() {
		return this.age;
	}
	public String toString() {
		return "Person's name is : + " + this.name + "Age is" + this.age;
	}
}
