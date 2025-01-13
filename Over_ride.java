class Parent1{
	public void sayHello(){
		System.out.println("Hello from Parent");
	}
}

class Child1 extends Parent1{
	@Override
	public void sayHello(){
		System.out.println("Hello from Chid");
	}
}

public class Over_ride {
    public static void main(String[] args) 
	{
		Parent1 p = new Child1();   //for calling hello from child
		Parent1 p2 = new Parent1();  //for calling hello from parent
		p.sayHello();
		p2.sayHello();
	}
}
