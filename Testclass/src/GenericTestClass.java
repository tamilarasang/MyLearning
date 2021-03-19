import java.util.ArrayList;
import java.util.List;

public class GenericTestClass {

	public static void displayList(List<? super Integer> list) {

		display(list);
	
	    
	}
	 public static void display(List<?> list)  
	    {  
		 System.out.println("displaying generic");
	        for(Object o:list)  
	        {  
	            System.out.println(o);  
	        }  
	    };
	    
	    private static void add(ArrayList<? extends Number> num) {  
	        
	        int sum=0;  
	          
	        for(Number n:num)  
	        {  
	            sum = sum+n.intValue();  
	        }  
	          System.out.println(sum);
	    }
public static void main(String[] args) {
	
	   ArrayList<Integer> l1=new ArrayList<>();  
       l1.add(10);  
       l1.add(20);  
       l1.add(30);  
         
       ArrayList<Number> l2=new ArrayList<>();  
       l2.add(30.0);  
       l2.add(40.0);  
       l2.add(50.0);  
	 
       displayList(l1);
       add(l1);
		displayList(l2);
		add(l2);
	
}

}
