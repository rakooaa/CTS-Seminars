package O;

public class Employee {
	private int Id;
	private String name;
	private float Salary;
	
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee(int id, String name, float Salary) {
		super();
		Id = id;
		this.name = name;
		this.Salary = Salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
	
	
}
