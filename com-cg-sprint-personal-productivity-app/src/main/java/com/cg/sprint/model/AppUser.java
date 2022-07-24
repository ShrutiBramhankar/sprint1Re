   package com.cg.sprint.model;

   import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
   import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
   import javax.validation.constraints.Max;
   import javax.validation.constraints.Min;
   import javax.validation.constraints.NotBlank;
   import javax.validation.constraints.Pattern;

   @Entity
   @Table(name = "app_users") 
   public class AppUser {

	   
	   
	 
   	@Id
   	@GeneratedValue(strategy = GenerationType.AUTO)
   	@Column(name = "user_id")
   	
   	private int userId;

   
   	@Column(name = "first_name")
   	
   	private String firstName; 
   	
   	@Column(name = "last_name")   
   	
   	private String lastName;
   	
   	@Column(name = "email_id")
   	
   	private String emailId;
   		
   	  	  	
   	@Column(name = "user_name")
   	@NotBlank
   	private String userName;

   	@Column(name = "password")
   	@NotBlank
   	@Min(4)
   	@Max(32)
   	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
   	private String password;

   	@OneToMany(mappedBy = "appUser" ,cascade = CascadeType.ALL)
   	private List<Todo> todos;
   	
  
   	public AppUser() {
   		super();
   	}

   	public AppUser(String userName, String password) {
   		super();
   		this.userName = userName;
   		this.password = password;

   	}

   	public String getUserName() {
   		return userName;
   	}

   	public void setUserName(String userName) {
   		this.userName = userName;
   	}

   	public String getPassword() {
   		return password;
   	}

   	public void setPassword(String password) {
   		this.password = password;
   	}
  	
   	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public List<Todo> getTodos() {
		return todos;
	}

	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}

//	@Override
//   	public int hashCode() {
//   		final int prime = 31;
//   		int result = 1;
//   		result = prime * result + ((password == null) ? 0 : password.hashCode());
//   		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
//   		return result;
//   	}
//
//   	@Override
//   	public boolean equals(Object obj) {
//   		if (this == obj)
//   			return true;
//   		if (obj == null)
//   			return false;
//   		if (getClass() != obj.getClass())
//   			return false;
//   		AppUser other = (AppUser) obj;
//   		if (password == null) {
//   			if (other.password != null)
//   				return false;
//   		} else if (!password.equals(other.password))
//   			return false;
//   		if (userName == null) {
//   			if (other.userName != null)
//   				return false;
//   		} else if (!userName.equals(other.userName))
//   			return false;
//   		return true;
//   	}

   	@Override
   	public String toString() {
   		return "AppUser [userName=" + userName + ", password=" + password + "]";
   	}

   }
