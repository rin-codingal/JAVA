public class Calci {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        int sum=a+b;
        int sub=a-b;
        int mult=a*b;
        int div=a/b;

        String magic="===========Magic=========";

        System.out.println("==========Method 1===========");
        System.out.println("a + b = "+sum);
        System.out.println("a - b = "+sub);
        System.out.println("a * b = "+mult);
        System.out.println("a / b = "+div);
        System.out.println("");

        System.out.println("=============Method 2============");
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));

        System.out.println("Remainder of a / b = " +(a%b));
        System.out.println("");

        System.out.println(magic);
        System.out.println("Addition: "+(a+b)+", Subtraction: "+(a-b)+", Multiplication: "+(a*b)+", Division: "+(a/b));
      }
}
