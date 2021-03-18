/**
 * 
 */

/**
 * @author tamil
 *
 */
@FunctionalInterface
public interface FunctionalInf {
	int x = 999;
	public void maths(int a, int b);
	
	default void mathsFunction(int a, int b) {
		System.out.println(a-b);
	}
	static void method2() {
		System.out.println("static method main");
	}
}
