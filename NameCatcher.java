import java.util.ArrayList;

public class NameCatcher {
    public static void main(String[] args) {
        System.out.println("==========Lambdas=======");
        ArrayList<String> name = new ArrayList<String>();

        name.add("Ana");
        name.add("Jay");
        name.add("Frank");
        name.add("Lily");
        name.add("Jennie");
        name.forEach( (x) -> { System.out.println(x); } );
        System.out.println("");

        name.forEach(n -> { //using Lambdas
            if (n == "Frank") 
                System.out.println("Found Frank");
            });

        System.out.println("");
    }
}
