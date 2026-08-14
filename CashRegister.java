public class CashRegister {
    private double purchase;
    private double payment;
    private int itemCount;

    public CashRegister() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0;
        return change;
    }

    // Part (a)
    public int getItemCount() {
        return itemCount;
    }

    // Part (b)
    public static int countTotal(CashRegister[] registers) {
        int totalItems = 0;
        for (CashRegister reg : registers) {
            if (reg != null) {
                totalItems += reg.getItemCount();
            }
        }
        return totalItems;
    }

    public static void main(String[] args) {
        // Create first cash register and add purchases
        CashRegister reg1 = new CashRegister();
        reg1.recordPurchase(12.50);
        reg1.recordPurchase(5.00);

        // Create second cash register and add purchases
        CashRegister reg2 = new CashRegister();
        reg2.recordPurchase(3.75);

        // Test Part (a)
        System.out.println("Register 1 items: " + reg1.getItemCount()); // Outputs: 2
        System.out.println("Register 2 items: " + reg2.getItemCount()); // Outputs: 1

        // Test Part (b)
        CashRegister[] registers = { reg1, reg2 };
        System.out.println("Total items across all registers: " + CashRegister.countTotal(registers)); // Outputs: 3
    }
}