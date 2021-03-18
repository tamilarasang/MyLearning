import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Test implements Comparator<Test2>{
public static void main(String[] args) {
	int n = 100;
	int total = n*n+1/100;
	int arr[] = new int[n];
	int newtotal = 0;
	for(int i=0;i<n;i++) {
		newtotal = newtotal+arr[i];
	}
	int val1 = (total- newtotal)/2;
	System.out.println(val1 +" "+val1+1);
	List<Test2> ls = new ArrayList<>();
	ls.add(new Test2(1, 10000));
	ls.add(new Test2(2, 30000));
	ls.add(new Test2(3, 20000));
	ls.add(new Test2(4, 15000));
	Collections.sort(ls, new Test());
	for(Test2 obj : ls) {
		System.out.println(obj.getId() +" "+ obj.getSalary());
	}
	
}

@Override
public int compare(Test2 o1, Test2 o2) {
	// TODO Auto-generated method stub
	if(o1.getSalary() > o2.getSalary()) {
		return 1;
	}else if(o1.getSalary() < o2.getSalary()){
		return -1;
	}
	else{
		return 0;
	}
}
}


