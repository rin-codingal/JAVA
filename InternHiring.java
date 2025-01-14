import java.util.Scanner;

public class InternHiring {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner sc = new Scanner(System.in);
		/*
        we are creating a hiring tool where the HR can register candidates based on eligibilty to the databse
		database connection is not done in this program to avoid complexity at this point of time
		this could be completed using simple if else too but when systems become complex and big using the 
        standard approach becomes the best solution
        */

        System.out.println("Enter the candidate Details:");

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Gender: ");
        String gender = sc.next();

        System.out.print("Enter Percentage in 10th (without '%'): ");
        int percentage = sc.nextInt();
		

        if (percentage < 55) {
            throw new InvalidInternException("Registration Failed. Percentage cannot be less then 55%.");
        } else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);

            return candidate;
        }
    }

    public static void main(String[] args) {
		System.out.println("Welcome to InterHiring Tool");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("");
            
            System.out.println("Registration Successful");
            System.out.println("");
			//consider this was an working application over here if reg is successful we can save the data to the database.
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}
