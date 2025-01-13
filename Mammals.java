//parent class
class Mammal{
	void mam(){
		System.out.println("Inside Mammals Class");
		}
}

//child class
class Lioness extends Mammal{
	void rawr(){
		System.out.println("Inside Lioness class ");
		}
}

//child 
class Human extends Mammal{
	void hum(){
		System.out.println("Inside Human class");
		}
}

class Mammals {
	public static void main(String args[]){
        Lioness obj = new Lioness();//object of child of child class
        Human obj1 = new Human();

        obj1.hum();
        obj.rawr();
        obj.mam();
	}
}
 