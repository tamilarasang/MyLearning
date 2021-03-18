
@FunctionalInterface
public interface ChildInf extends FunctionalInf{

	int x = 888;
	public void maths(int a, int b) ;
	
	default void mathsFunction(int a, int b) {
		System.out.println(a+b);
	}
	
	static void method2() {
		System.out.println("static method child");
	}
}
