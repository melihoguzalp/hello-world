package question1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import question1.account.Account;
import question1.addres_types.BusinessAddress;
import question1.addres_types.HomeAddress;
import question1.interfaces.IAddress;
import question1.managers.AccountManager;
import question1.managers.AddressManager;
import question1.user.User;


public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<IAddress> userAdress = new ArrayList<IAddress>();
	static User user;
	static AddressManager addressManager = new AddressManager();
	
	
	public static void main(String[] args) {

		AccountManager accountManager = new AccountManager(null);
		createCustomer();
		
	}
	
	

	public static void insertCustomer() {

		
		customerPersonalInfo();
		customerAddressInfo();

		

	}

	public static AccountManager createCustomer() {
		
		Set<Account> accountSet = new TreeSet<Account>();
		AccountManager accountManager = new AccountManager(accountSet); 
		insertCustomer();
		return accountManager;

	}

	public static void customerPersonalInfo() {
		
		System.out.println("Add Customer Info:");
		
		System.out.println("Enter your email:");
		String email = scanner.nextLine();
		
		System.out.println("Enter your password:");
		String password = scanner.nextLine();
		
		System.out.println("Succesfully Login !!");

		
		User user = new User("Melih", "Oðuzalp", email, password, "Engineer", 23, userAdress);
		System.out.println(user.getName() + " " + user.getSurName() + " " + user.getEmail() + " " + 
		user.getPassword() + " "+user.getJob() + " " + user.getAge() + " " +user.getUserAddress());

		System.out.println("Personal informations added . !!\n");
		
		
		
	}
	
	
	public static void customerAddressInfo() {
		
		System.out.println("Home Adress Information of Customer :");

		HomeAddress address = new HomeAddress("Ýstanbul", "Güngören", 67);
		AddressManager.addUserAddress(user, address);
		
		System.out.println("------------------------------------");
		System.out.println(address.getCity_name() + " " + address.getRegion() + " " + address.getNumber());
		System.out.println("Address added. !!\n");
		
		
		System.out.println("Business Adress Information of Customer :");
		
		BusinessAddress address2 = new BusinessAddress("Ýstanbul", "Bakýrköy", 34);
		AddressManager.addUserAddress(user, address2);

		System.out.println("-----------------------------------------");
		System.out.println(address2.getCity_name() + " " + address2.getRegion() + " " + address2.getNumber());
		System.out.println("Address added. !!");

		
		

		
	}
	
	
	
	
}
