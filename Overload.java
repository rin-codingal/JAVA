class Student 
{
	int id;
	String name;
	float stipend;
	
	Student(){}

	Student(int id, String name){
		this.id = id;
		this.name = name;
	}

	Student(int id, String name, float stipend){
		this.id = id;
		this.name = name;
		this.stipend=stipend;
		
	}

	void displayDetails(){
		System.out.println(this.id + " | " + this.name + " | " + this.stipend);
	}
} 

class Overload {
	public static void main(String[] args) 
	{
       Student st1=new Student(); //default constructor
	   Student st2=new Student(77,"Rain"); //overloaded constructor with 2 parameters
	   Student st3=new Student(101,"Play",7500);//overloaded constructor with 3 parameters

       st1.displayDetails();
       st2.displayDetails();
       st3.displayDetails();
	}
}