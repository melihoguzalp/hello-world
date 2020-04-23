package question1.account;

import java.util.ArrayList;
import java.util.List;

import question1.account.Account;
import question1.enums.AuthenticationStatus;
import question1.exceptions.InvalidAuthenticationException;
import question1.insurance.Insurance;
import question1.interfaces.IAddress;
import question1.user.User;



public abstract class Account implements Comparable<Account> {

	 
	protected User user;
	protected List<Insurance> insuranceList;
	protected AuthenticationStatus status = AuthenticationStatus.SUCCESS;
	
	
	public Account(){
		
	}
	public Account(User user, List<Insurance> insuranceList) {

		this.user = user;
		this.insuranceList = insuranceList;
	}

	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Insurance> getInsuranceList() {
		return insuranceList;
	}

	public void setInsuranceList(List<Insurance> insuranceList) {
		this.insuranceList = insuranceList;
	}

	public AuthenticationStatus getStatus() {
		return status;
	}

	public void setStatus(AuthenticationStatus status) {
		this.status = status;
	}


	public final static void showUserInfo(User user) {
		
		if(user != null) {
		StringBuilder builder = new StringBuilder();
		builder.append("Name : ");
		builder.append(user.getName());
		builder.append(" Surname : ");
		builder.append(user.getSurName());
		builder.append(" Email : ");
		builder.append(user.getEmail());
		builder.append(" Job : ");
		builder.append(user.getJob());
		builder.append("Last Login Date : ");
		builder.append(user.getLastLoginToSystemDate());
		
		System.out.println(builder.toString());
		}
		
		System.out.println("There is no any user information.");

		
	}
	
	
	public static void addInsurance(Account account,Insurance insurance) {
		
		if(account.getInsuranceList().isEmpty()) {
			
			List<Insurance> insuranceList = new ArrayList<Insurance>(); 
			insuranceList.add(insurance);
		}
		else {
			
			account.getInsuranceList().add(insurance);
			
		}
		
	}
	
	
	public final static  void showInsuranceInfo(List<Insurance> insuranceList) {

		if (insuranceList != null) {
			for (Insurance insurance : insuranceList) {
				StringBuilder builder = new StringBuilder();
				builder.append("Name: ");
				builder.append(insurance.getInsuranceName());
				builder.append("Price:");
				builder.append(insurance.getPrice());
				builder.append("Starting Date:");
				builder.append(insurance.getStartDateofInsurace());
				builder.append("Ending Date:");
				builder.append(insurance.getEndDateofInsurace());

				System.out.println(builder);
			}
		} else {
		
			System.out.println("The list is empty");
		}

	}
	
	
	
	
	public void loginUser(String email, String password) throws InvalidAuthenticationException {
		
		if(user.getEmail() != null && user.getPassword() != null) {
		if(email.equals(user.getEmail()) && password.equals(user.getPassword())){
			status = AuthenticationStatus.SUCCESS;		
			System.out.println(status + " : Succesfully Login !! ");
			
		}
		}
		else
		{	
			status = AuthenticationStatus.FAIL;
			throw new InvalidAuthenticationException("Login failed !!");
			
		}
		
	}
	
	
	
	public void showUserAddress(User user) {
		
		
		if(user.getUserAddress().isEmpty()) {//this is a list
			
			System.out.println("There is no addres information into the account..");
			
		}
		else {
			List<IAddress> addressList = new ArrayList<>();
			addressList = user.getUserAddress();
			
			int count = 1;
			for(IAddress address : addressList) {
				
				System.out.println(" ******Adress --->" + count + "******* :");
				System.out.println(address.getCity());
				System.out.println(address.getRegion());
				System.out.println(address.getNumber());
				System.out.println(" ");
				count++;
			}
			
		}
		
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((insuranceList == null) ? 0 : insuranceList.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (insuranceList == null) {
			if (other.insuranceList != null)
				return false;
		} else if (!insuranceList.equals(other.insuranceList))
			return false;
		if (status != other.status)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	
	
	
	protected abstract double policyOfInsurance(double insurancePrice);

	
	
	

}
