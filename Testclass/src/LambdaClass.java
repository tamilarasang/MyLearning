
public class LambdaClass {
static int i =0;
	public static void main(String[] args) {
		ChildInf inf = (a,b)->{
			int c = a+b;
			b = c+c;
			System.out.println(a+c);
			};
		ChildInf inf1 = new ChildInf() {
			
			@Override
			public void maths(int a, int b) {
			
				
			}
		};
		inf.maths(4, 4);
		inf1.maths(i, i);
		inf.mathsFunction(9, 8);
		System.out.println(ChildInf.x);
		System.out.println(FunctionalInf.x);
		ChildInf.method2();
		FunctionalInf.method2();
		
		Runnable r = ()->{
			int j = i;
			for(i = i; i<j+10; i++) {
				
			System.out.println(i);
		}
			System.out.println("-----");
			};
		Thread t = new Thread(r);
		Thread t1 = new Thread(r);
		t.start();
		try {
			t.sleep(1000);
			t1.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
class Testtry {
	int x =2;
	LambdaClass ls = new LambdaClass() {
		int x =101;
		public void m1() {
			System.out.println(x);
		}
	};
	
	
	}