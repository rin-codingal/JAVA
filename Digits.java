import java.util.ArrayList;

public class Digits {
    // Instance variable to store individual digits
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object representing num.
     * Precondition: num >= 0
     */
    public Digits(int num) {
        digitList = new ArrayList<Integer>();

        // Special case for zero
        if (num == 0) {
            digitList.add(0); // Java automatically converts int to Integer (Autoboxing)
        }

        // Extract digits from right to left and insert at the beginning (index 0)
        while (num > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }
    }

    // Getter method to view the digit list
    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    // Main method for testing
    public static void main(String[] args) {
        Digits d1 = new Digits(15409);
        System.out.println(d1.getDigitList()); // Output: [1, 5, 4, 0, 9]

        Digits d2 = new Digits(0);
        System.out.println(d2.getDigitList()); // Output: [0]
    }
}