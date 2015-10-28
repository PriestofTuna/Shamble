
public class Person {

	
	private String name;
	
	
	
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
		// TODO Auto-generated constructor stub
		
	}
	
	

	
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
public class People {
	private static Scanner keyboard = new Scanner(System.in);
	public People() {
		// TODO Auto-generated constructor stub
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    String personsName = keyboard.next();
    Person asdf = new Person(personsName, 24);
    Person markPerson = new Person("Mark", 15);
    System.out.println(asdf.getName());
    String example = "hi";
    String another = example;
    System.out.print(example != another);
    
  
    System.out.println(asdf);
    if (markPerson.getName().charAt(0) == (asdf.getName()).charAt(0)   ){
    System.out.print("This is not a spy with multiple identies, failure.");	
    }
	}

}
