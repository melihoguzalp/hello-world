package question1.addres_types;

import question1.interfaces.IAddress;

public class HomeAddress implements IAddress {

	private String city_name;
	private String region;
	private int number;



	public HomeAddress(String city_name, String region, int number) {
		this.city_name = city_name;
		this.region = region;
		this.number = number;
	}

	
	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	

	public void setRegion(String region) {
		this.region = region;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	
	@Override
	public String getCity() {
		return city_name;
	}

	@Override
	public String getRegion() {
		return region;
	}

	@Override
	public int getNumber() {
		return number;
	}

}
