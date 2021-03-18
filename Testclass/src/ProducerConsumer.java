
public class ProducerConsumer {
	int size = 50;
	int crSize = 15;
	Object arr[];
	Object cr[];
	void consume(Object val) {
		if(arr.length > size-1) {
			System.out.println("consumer is full");
			for(int i=0;i<size-1;i++) {
				arr[i] = arr[i+1];
			}
			arr[size-1] = val;
			System.out.println("consumer is removed 1st consumed value and inserted lastest one");
		}else {
			arr[arr.length] = val;
		}
		
	}
	void produce(Object val) {
		if(cr.length > crSize-1 ) {
			System.out.println("produce is full");
			boolean result = checkConsume(cr[0]);
			if(result) {
				for(int i=0;i<crSize-1;i++) {
					cr[i] = cr[i+1];
				}
				cr[crSize-1] = val;
				consume(val);
			}
		}else {
			cr[cr.length] = val;
			System.out.println("produce is completed");
			consume(val);
		}
	}
	private boolean checkConsume(Object object) {
		if(arr[arr.length-crSize] == object) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
