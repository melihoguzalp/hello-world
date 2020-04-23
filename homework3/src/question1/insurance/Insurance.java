package question1.insurance;

import java.util.Date;

public abstract class Insurance {
	
	
	private String insuranceName;
	private double price;
	private Date startDateofInsurace;
	private Date endDateofInsurace;

	

	public Insurance(String insuranceName, double price, Date startDateofInsurace, Date endDateofInsurace) {
		this.insuranceName = insuranceName;
		this.price = price;
		this.startDateofInsurace = startDateofInsurace;
		this.endDateofInsurace = endDateofInsurace;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getStartDateofInsurace() {
		return startDateofInsurace;
	}


	public void setStartDateofInsurace(Date startDateofInsurace) {
		this.startDateofInsurace = startDateofInsurace;
	}


	public Date getEndDateofInsurace() {
		return endDateofInsurace;
	}


	public void setEndDateofInsurace(Date endDateofInsurace) {
		this.endDateofInsurace = endDateofInsurace;
	}


	protected abstract double calculate();
		
	
	

}
