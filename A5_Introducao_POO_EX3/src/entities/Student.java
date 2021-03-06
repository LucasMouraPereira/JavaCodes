package entities;

public class Student {
	
	public String name;
	public double fistQuarter;
	public double secondQuarter;
	public double thirdQuarter;
	
	public double finalNote() {
		return fistQuarter + secondQuarter + thirdQuarter;
	}
	
	public void result() {
		if(finalNote() >= 60) {
			System.out.println("PASS"); 
		} else {
			System.out.println("FAILED");
			double missing = 60.00 - finalNote();
			System.out.printf("MISSING %.2f POINTS", missing);
		}
		
	}
	
	public String toString() {
		return "FINAL GRADE = " 
				+ String.format("%.2f%n", finalNote());
	}
	
}
