
public class Test2 {
	int id;
	int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	Test2(int a,int b){
		this.salary = b;
		this.id = a;
	}
}
