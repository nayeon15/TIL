package Test_210423_5;

public class Outter {
	String field = "out-field";
	
	void method() {
		System.out.println("out-method");
	}
	
	class  Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
	}
	
	void print() {
		System.out.println(this.field);
		this.method();
		System.out.println();
		
		System.out.println(Outter.this.field);
		Outter.this.method();
	}

}
