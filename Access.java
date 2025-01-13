
class MyParent{
	protected void protect(){
		System.out.println("I'm inside protected method");
	}
}
class Mychild extends MyParent{
	private void privateMethod(){ //invisible method
		System.out.println("I'm inside private method");

	}
}



class Access {
  public static void main(String[] args) {

	Mychild kid = new Mychild();
    kid.protect();
	//kid.privateMethod(); //private method is not visible, if we uncomment will create error
	  
    System.out.println("Hello world!");
  }
}