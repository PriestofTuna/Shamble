import java.util.Scanner;
    public class Assignment2 {
        public static void main(String[] args) {
        System.out.println("Please imput five numbers");
        //Welcoming message
    Scanner keyboard = new Scanner(System.in);
    Double num1,num2,num3,num4,num5,numsum,average;
    //Initializes the variables above
        num1 = keyboard.nextDouble();
        num2 = keyboard.nextDouble();
        num3 = keyboard.nextDouble();
        num4 = keyboard.nextDouble();
        num5 = keyboard.nextDouble();
        numsum = (num1+num2+num3+num4+num5);
        //numsum stands for "all numbers sum"
        average = ((num1+num2+num3+num4+num5)/5);
        System.out.print("Your sum is "+numsum+" and your average is "+average);
        //Ending message and output of variables
	}
    }
