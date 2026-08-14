package M04L05_ACP;

import java.util.ArrayList;

public class ArrayListQueries {

    /**
     * Executes Query Type 1:
     * Inserts value 'r' at index 'p' in the ArrayList and prints the updated list.
     * 
     * @param list the ArrayList to modify
     * @param p    the index at which to insert
     * @param r    the value to insert
     */
    public static void processQuery1(ArrayList<Integer> list, int p, int r) {
        if (p >= 0 && p <= list.size()) {
            list.add(p, r);
            printList(list);
        } else {
            System.out.println("Invalid index");
        }
    }

    /**
     * Executes Query Type 2:
     * Finds and prints the last index where value 'p' occurs in the ArrayList.
     * Prints -1 if 'p' is not found.
     * 
     * @param list the ArrayList to search
     * @param p    the value to search for
     */
    public static void processQuery2(ArrayList<Integer> list, int p) {
        int lastIndex = list.lastIndexOf(p);
        System.out.println(lastIndex);
    }

    /**
     * Helper method to print ArrayList elements space-separated.
     */
    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
        }
        System.out.println();
    }
}