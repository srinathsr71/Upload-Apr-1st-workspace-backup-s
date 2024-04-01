package demo;

class A {

public void add() {
	System.out.println("addition");
}
public void sub() {
	System.out.println("substraction");
}
}
class B extends sample{
	public void multiply() {
		System.out.println("multiplication");
	}
	public void division() {
		System.out.println("divisions");
	}
}

class sample{
	public static void main(String[] args) {
		A aa=new A();
		
		aa.sub();
		aa.add();
		
		
		
	}
}




