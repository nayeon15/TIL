package Test_210423_4;

public class Outter {
	
	public void method1(final int arg) {
		final int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	public void method2(int arg) {
		int localVariable = 1;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
