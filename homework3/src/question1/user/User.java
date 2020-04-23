package question1.user;

import java.util.Date;
import java.util.List;

import question1.interfaces.IAddress;

public class User {
	private String name;
    private String surName;
    private String email;
    private String password;
    private String job;
    private Integer age;
    private List<IAddress> userAddress;
    private Date lastLoginToSystemDate;

    public User() {
    }

  
    
	public User(String name, String surName, String email, String password, String job, Integer age,
			List<IAddress> userAddress) {
		this.name = name;
		this.surName = surName;
		this.email = email;
		this.password = password; 
		this.job = job;
		this.age = age;
		this.userAddress = userAddress;
	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<IAddress> getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(List<IAddress> userAddress) {
		this.userAddress = userAddress;
	}

	public Date getLastLoginToSystemDate() {
		return lastLoginToSystemDate;
	}

	public void setLastLoginToSystemDate(Date lastLoginToSystemDate) {
		this.lastLoginToSystemDate = lastLoginToSystemDate;
	}
	
}
