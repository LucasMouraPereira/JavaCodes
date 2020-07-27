package entities;

public class LegalPerson extends Person{
	private Integer employeesQuantity;
	
	public LegalPerson() {
		
	}

	public LegalPerson(String name, Double annualIncome, Integer employeesQuantity) {
		super(name, annualIncome);
		this.employeesQuantity = employeesQuantity;
	}

	public Integer getEmployeesQuantity() {
		return employeesQuantity;
	}

	public void setEmployeesQuantity(Integer employeesQuantity) {
		this.employeesQuantity = employeesQuantity;
	}

	@Override
	public Double incomeTax() {
		Double tax = 0.0;
		if(employeesQuantity < 10) {
			tax = getAnnualIncome() * 0.16;
		} else {
			tax = getAnnualIncome() * 0.14;
		}
		return tax;
	}
}
