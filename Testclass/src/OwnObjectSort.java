import java.util.Comparator;

public class OwnObjectSort<T> implements Comparator<T>{

	int empid;
	
	String empname;
	
	String dept;

	public OwnObjectSort(int empid, String empname, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "OwnObjectSort [empid=" + empid + ", empname=" + empname + ", dept=" + dept + "]";
	}

	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
