package Test_210423_2;

public class A {
	class B{ } 
	
	static class C{}
	
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	static C field4 = new C();
	
	static void method2() {
		C var2 = new C();
	}

}
