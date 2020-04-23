package question1.managers;

import java.util.ArrayList;
import java.util.List;

import question1.interfaces.IAddress;
import question1.user.User;

public class AddressManager {
	
	
	public static void addUserAddress(User user , IAddress iaddress) {
		
		if(user!= null) {
			
			if(user.getUserAddress() == null) {
				
				List<IAddress> addressList = new ArrayList<>();
				addressList.add(iaddress);
				
				user.setUserAddress(addressList); 
				
			}
				System.out.println(user.getUserAddress().add(iaddress));
			
				
				
		}
	
		
	}	
	

	
	
	public static void deleteUserAddress(User user,IAddress iaddress) {
		
		
	      if (user != null) {
	    	  if(user.getUserAddress() != null) {
	      
	            if (user.getUserAddress().size() > 0) {
	                user.getUserAddress().remove(iaddress);
	            }
	    	  }
	        }
		
		
		
		
	}
	
	
	

}
