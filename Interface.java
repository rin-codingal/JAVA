interface MyInterface{   
	public void method1();
	public void method2();
}

class Interface implements MyInterface {
	public void method1(){
		System.out.println("this is method 1");
	}
   
	public void method2(){
		System.out.println("this is method2");
	}
	public static void main(String arg[]){
		MyInterface obj = new Interface();
		obj.method1();
		obj.method2();	
	}
}