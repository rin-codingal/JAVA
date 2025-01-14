import java.util.ArrayList;

public class Magic2 {
    public static void main(String[] args) {
        System.out.println("==========Lambdas=======");
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(27);
        numbers.add(75);
        numbers.add(49);
        numbers.add(39);
        numbers.add(11);
        numbers.forEach( (x) -> { System.out.println(x); } );
        
        System.out.println("");

        numbers.forEach(n -> { //using Lambdas
            if (n == 49) 
                System.out.println("Found 49");
            });

        System.out.println("");
    }
}
