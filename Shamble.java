
public class Persons {

	public Persons(String name, int age) {
		this.setName(name);
		this.setAge(age);
		// TODO Auto-generated constructor stub
	}
	
	

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "This Person's name is " + this.name + ": their Age is" + this.age;
	}

}
// Everything above this comment is for the class "Persons"
// Everything below this comment is for the class Peoples
import java.util.Scanner;
public class Peoples {

	public Peoples() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);
    String personsName = keyboard.next();
    Persons person = new Persons(personsName, 24);
    Persons MarkPerson = new Persons("Mark", 15);
    System.out.println(MarkPerson);
    System.out.println(personsName);
    System.out.println(person);
    if (!MarkPerson.equals(personsName)){
    System.out.print("This is not a spy with multiple identies, failure.");	
    }
	}

}
