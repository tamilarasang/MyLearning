import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDetails{

	public static void main(String[] args) {
		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee(101, "Tamil", "IT"));
		ls.add(new Employee(102, "Raj", "MECH"));
		ls.add(new Employee(106, "Arun", "MECH"));
		ls.add(new Employee(105, "Brihat", "TU"));
		ls.add(new Employee(104, "Kumar", "CSE"));
		ls.add(new Employee(103, "Kalish", "CSE"));
		
		
		Collections.sort(ls, (t1,t2)->t1.getEmpid()<t2.getEmpid()?1:t1.getEmpid()>t2.getEmpid()?-1:(t1.getDeptname().compareTo(t2.getDeptname())>1 ? 1:t1.getDeptname().compareTo(t2.getDeptname())<1? -1:0));
		System.out.println(ls.toString());
		System.out.println("---------------------------------------------------");
		List<Employee> filterls = ls.stream().filter(e -> e.getEmpid() == 105).collect(Collectors.toList());
		List<Employee>  filterls1 = ls.stream().map(e -> 
			new Employee(e.getEmpid()*2,e.getEmpname(),e.getDeptname())
			).collect(Collectors.toList());
		
		//List<Employee> sortf = ls.stream().sorted((e1,e2)->e1.getEmpname().compareTo(e2.getEmpname())).allMatch(e->e.getEmpid()%2==
		System.out.println("Filtered-------"+filterls1.toString());
		System.out.println("----------------------------------------------------");
		//System.out.println("sorted----------"+sortf.toString());
		System.out.println("----------------------------------------------------");
		long count = ls.stream().filter(e -> e.getEmpid() == 105).count();
		System.out.println("count----------"+count);
		}

	
}
