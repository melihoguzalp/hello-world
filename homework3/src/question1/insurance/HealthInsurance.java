package question1.insurance;

import java.util.Date;

import question1.insurance.Insurance;

public class HealthInsurance extends Insurance{

	


	public HealthInsurance(String insuranceName, double price, Date startDateofInsurace, Date endDateofInsurace) {
		super(insuranceName, price, startDateofInsurace, endDateofInsurace);
		
	}

	@Override
	protected double calculate() {
		
		return super.getPrice() + super.getPrice() * 0.35;
	
	}

}
