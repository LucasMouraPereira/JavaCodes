package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRendel) {
		long t1 = carRendel.getStart().getTime();
		long t2 = carRendel.getFinish().getTime();
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRendel.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
