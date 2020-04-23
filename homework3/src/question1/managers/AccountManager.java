package question1.managers;

import java.util.Set;
import java.util.TreeSet;

import question1.account.Account;
import question1.exceptions.InvalidAuthenticationException;

public class AccountManager {

	public Set<Account> accountSet;
	
	private TreeSet<Account> accounts;
	


	public AccountManager(Set<Account> accountSet) {
		this.accountSet = accountSet;
	}


	public Set<Account> getAccountSet() {
		return accountSet;
	}


	public void setAccountSet(Set<Account> accountSet) {
		this.accountSet = accountSet;
	}

	

	public TreeSet<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(TreeSet<Account> accounts) {
		this.accounts = accounts;
	}


	public AccountManager(TreeSet<Account> accounts) {
		this.accounts = accounts;
	}


	public Account login(String email, String password)  {
		
		for(Account account : accounts) {
		
		if(account!=null) {
			try {
		
			account.loginUser(email, password);
 
		
			}
			catch(InvalidAuthenticationException authenticationException){
			
				System.out.println(authenticationException.getMessage());
			
			}
		}
	}
		return null;
		
		
		
		
	}
	
	
	
}
