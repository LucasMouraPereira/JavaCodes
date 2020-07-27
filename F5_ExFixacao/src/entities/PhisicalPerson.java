package entities;

public class PhisicalPerson extends Person{
	private Double healthSpending;
	
	public PhisicalPerson() {
		super();
	}

	public PhisicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double incomeTax() {
		Double tax = 0.0;
		Double health = healthSpending * 0.5;
		if(getAnnualIncome() < 20000.00) {
			tax = getAnnualIncome() * 0.15 - health;
		} else {
			tax = getAnnualIncome() * 0.25 - health;
		}
		return tax;
	}
	
}
