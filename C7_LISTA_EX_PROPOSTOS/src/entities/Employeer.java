package entities;

public class Employeer {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employeer(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	
	public Double increaseSalary(Double percent) {
		return salary += salary * percent/ 100.0;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f%n", salary);
	}
	
}
