import java.util.*;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your number below:");        
        int num=sc.nextInt();
        int num2 = num; // copy input for the second method

        System.out.println("");

        System.out.println("METHOD 1");        
        //int num = 42157;
        int reversed = 0;
        int digit;
    
        while(num != 0) {        
          // get last digit from num
          digit = num % 10;
          reversed = reversed * 10 + digit;
    
          // remove the last digit from num
          num /= 10;
        }
    
        System.out.println("Reversed Number: " + reversed);

        System.out.println("");

        System.out.println("METHOD 2");
        int reverse = 0;        
    
        for(;num2 != 0; num2 /= 10) {
          digit = num2 % 10;
          reverse = reverse * 10 + digit;
        }
    
        System.out.println("Reversed Number: " + reverse);
        
    } 
}
