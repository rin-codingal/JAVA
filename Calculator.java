import java.util.Scanner;

//parent class
class Calc {
    void sum(int fnum, int snum) {
        int z = fnum + snum;
        System.out.println(fnum + " + " + snum + " = " + z);
    }

    void sub(int fnum, int snum) {
        int z = fnum - snum;
        System.out.println(fnum + " - " + snum + " = " + z);
    }

    void mult(int fnum, int snum) {
        int z = fnum * snum;
        System.out.println(fnum + " * " + snum + " = " + z);
    }

    void div(int fnum, int snum) {
        float z = fnum / snum;
        System.out.println(fnum + " / " + snum + " = " + z);
    }
}

//child class
class Num extends Calc {
    void numbers(int x, int y) {
        System.out.println("First number:"+x);
        System.out.println("Second number:"+y);

        System.out.println("");
        System.out.println("Here's the calculation result:");
    }
}

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the first number: ");
		int first_num = sc.nextInt();

        System.out.print("enter the second number: ");
        int second_num = sc.nextInt();

        System.out.println("");

        Num res = new Num();

        res.numbers(first_num, second_num);
        res.sum(first_num, second_num);
        res.sub(first_num, second_num);
        res.mult(first_num, second_num);
        res.div(first_num, second_num);

        System.out.println("");
    }
}
