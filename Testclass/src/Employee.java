
public class Employee {

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", deptname=" + deptname + "]";
	}

	int empid;
	
	String empname;
	
	String deptname;

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

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Employee(int empid, String empname, String deptname) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.deptname = deptname;
	}
}
