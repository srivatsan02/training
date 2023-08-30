import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		System.out.print("enter your namer:");
		String name = console.next();
		System.out.print("your name is "+name);
		
		System.out.print("\nenter yout age:");
		int age = console.nextInt();
		System.out.println("your age is "+age);
	}

}
