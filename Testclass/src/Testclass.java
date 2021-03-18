public class Testclass {
    
	int i = 10;
	Testclass(int j){
		System.out.println("A  "+i);
		this.i = j*10;
		System.out.println("A  "+i);
	}
	public static void main(String[] args) {
		Testclass1 movingTotal = new Testclass1(10);
    	System.out.println(movingTotal.i*30);

    }
}

class Testclass1 extends Testclass {
    Testclass1(int j) {
		super(j);
		System.out.println("B  "+this.i);
		this.i = j*20;
		
	}
	
}