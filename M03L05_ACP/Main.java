package M03L05_ACP;

public class Main {
    // Instance variables store references to the two original SingleTable objects
    private SingleTable table1;
    private SingleTable table2;

    /**
     * Constructor initializing the CombinedTable with two SingleTable objects.
     */
    public Main(SingleTable t1, SingleTable t2) {
        this.table1 = t1;
        this.table2 = t2;
    }

    /**
     * Determines if a given number of people can sit at this combined table.
     * Total seats = (seats at table1 + seats at table2) - 2
     */
    public boolean canSeat(int numPeople) {
        int maxSeats = table1.getNumSeats() + table2.getNumSeats() - 2;
        return numPeople <= maxSeats;
    }

    /**
     * Calculates and returns the desirability of this combined table.
     * If both tables are the same height, returns average view quality.
     * If heights differ, subtracts 10 from the average view quality.
     */
    public double getDesirability() {
        double averageView = (table1.getViewQuality() + table2.getViewQuality()) / 2.0;

        if (table1.getHeight() == table2.getHeight()) {
            return averageView;
        } else {
            return averageView - 10.0;
        }
    }


    // --- Main Method to Test All Chart Requirements ---
    public static void main(String[] args) {
        // Create initial tables as described in Image 02
        SingleTable t1 = new SingleTable(4, 60.0, 74);
        SingleTable t2 = new SingleTable(8, 70.0, 74);
        SingleTable t3 = new SingleTable(12, 75.0, 76);

        // Test c1 (t1 + t2)
        Main c1 = new Main(t1, t2);
        System.out.println("c1.canSeat(9): " + c1.canSeat(9));             // Expected: true
        System.out.println("c1.canSeat(11): " + c1.canSeat(11));           // Expected: false
        System.out.println("c1.getDesirability(): " + c1.getDesirability()); // Expected: 65.0

        System.out.println("---");

        // Test c2 (t2 + t3)
        Main c2 = new Main(t2, t3);
        System.out.println("c2.canSeat(18): " + c2.canSeat(18));           // Expected: true
        System.out.println("c2.getDesirability(): " + c2.getDesirability()); // Expected: 62.5

        System.out.println("--- Updating t2 View Quality ---");
        // Update view quality on t2
        t2.setViewQuality(80.0);
        
        // Verify c2 desirability updates dynamically
        System.out.println("c2.getDesirability(): " + c2.getDesirability()); // Expected: 67.5
    }
}
