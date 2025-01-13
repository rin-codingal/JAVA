import java.util.*;

public class HelloUser {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

	System.out.println("Hello User please Enter your Name: ");
	String name=sc.nextLine();
    System.out.println("");

	System.out.println("Enter your lucky number");
	int lucky=sc.nextInt();
    System.out.println("");

	System.out.println("Hello "+name +", Your lucky number " +lucky +" shows you are really a hardworking person. Keep it up!");

  }
}
