package M04L05_ACP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read size N
        int n = scanner.nextInt();

        // 2. Read N elements into ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // 3. Read Query Type Q
        int q = scanner.nextInt();

        if (q == 1) {
            // Read index p and value r
            int p = scanner.nextInt();
            int r = scanner.nextInt();
            ArrayListQueries.processQuery1(list, p, r);

        } else if (q == 2) {
            // Read search value p
            int p = scanner.nextInt();
            ArrayListQueries.processQuery2(list, p);

        } else {
            System.out.println("Invalid Query Type");
        }

        scanner.close();
    }
}