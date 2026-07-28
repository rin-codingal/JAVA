import java.util.Scanner;

public class Pragyanam {
    private static int amount = 0;
    public static void main(String[] args) {


        Scanner one = new Scanner(System.in);


        System.out.print("Enter the code: ");

        int code = one.nextInt();


        if(code == 2341){

            boolean i = false;

            while(i == false) {

                System.out.println("1) View balance");

                System.out.println("2) Withdraw money");

                System.out.println("3) Deposit money");

                System.out.println("4) Exit");

                System.out.print("Enter the following options:");

                int options = one.nextInt();


                switch (options) {


                    case 1:

                        System.out.println("Your Balance is: " + amount);

                        break;


                    case 2:

                        System.out.print("Enter the amount: ");

                        int withdraw = one.nextInt();


                        if (withdraw > amount) {

                            System.out.println("Not Enough cash");

                        } else if (withdraw < 0) {

                            System.out.println("Invalid request");

                        } else if (withdraw < amount) {

                            amount = amount - withdraw;

                            System.out.println("Successfully withdrawn: " + withdraw);


                        } else if (withdraw == amount) {

                            amount = amount - withdraw;

                            System.out.println("Successfully withdrawn: " + withdraw);

                        }

                        break;


                    case 3:

                        System.out.print("Enter the money to be deposited: ");

                        int deposit = one.nextInt();


                        amount = amount + deposit;


                        System.out.println("Successfully deposited: " + deposit);

                        break;


                    case 4:

                        i = true;

                        break;

                }

            }

        }

    }

}
