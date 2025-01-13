import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
	int sum=0;
    String result;

    Scanner sc=new Scanner(System.in);

	System.out.println("Enter the number of Subjects: ");
	int noOfSubjects = sc.nextInt();
	int marks[]=new int[noOfSubjects]; //intializing array
    
    System.out.println("");

	System.out.println("Enter the marks of " +noOfSubjects +" Subjects.Press Enter to give marks for another subject");

	//entering marks
	for(int i=0; i<noOfSubjects; i++){
		marks[i]=sc.nextInt();
	}
    
    //calculating sum
	for(int j=0; j<noOfSubjects; j++){
		sum=sum+marks[j];
	}
    
    System.out.println("");

    //generating result
	int percentage=sum/noOfSubjects;
	//can also be written as
	//int percentage=(sum/noOfSubjects*100)*100;

	System.out.println("your mark percentage: " + percentage);

	if(percentage >= 95){
		result="You scored A+. Great Work!";

	}

    else if(percentage >= 90 && percentage < 95){
		result="You scored A. Well Done!";
	}
	
    else if(percentage >= 85 && percentage < 90){
		result="You scored B+. Good job!";
	}

    else if(percentage >= 80 && percentage < 85){
		result="You scored B. Nice!";
	}

	else {
		result="you passed";
	}

	System.out.println(result);
    System.out.println("");
  }
}
