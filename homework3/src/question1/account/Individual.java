package question1.account;

import java.util.ArrayList;

import question1.account.Account;
import question1.insurance.Insurance;
import question1.user.User;

public class Individual extends Account {

	
	public Individual(User user, ArrayList<Insurance> insuranceList) {
		super(user, insuranceList);

	}
	
	@Override
	public int compareTo(Account account) {
		
		return this.getUser().getSurName().compareTo(account.getUser().getSurName());
	}

	
	@Override
	protected double policyOfInsurance(double insurancePrice) {
		return insurancePrice + insurancePrice * 0.4;
	}



}
