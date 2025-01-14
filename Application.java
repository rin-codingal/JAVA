import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("enter the first number: ");
			int x = sc.nextInt();

            System.out.print("enter the second number: ");
			int y = sc.nextInt();

			double z = x / y;
			System.out.println(x + " / " + y + " = " + z);
            System.out.println("");
		} 
        catch (ArithmeticException ex) {
			System.out.println("=== catch block ===");
			System.out.println(ex.toString());
		} 
        finally {
			System.out.println("==== finally block ====");
			System.out.println("Application Designed & Developed by");
			System.out.println("Nurinn");
            System.out.println("based on Codingal's project");
			sc.close();
		}
		System.out.println("=== DONE ===");
        System.out.println("");
	}
}
