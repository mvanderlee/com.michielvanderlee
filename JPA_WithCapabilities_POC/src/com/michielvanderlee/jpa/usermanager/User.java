package com.michielvanderlee.jpa.usermanager;

public class User
{
	//********************************************************************
	// Constructors
	//********************************************************************
	public User()
	{
		
	}
	
	//********************************************************************
	// Methods
	//********************************************************************

	//********************************************************************
	// getters and setters.
	//********************************************************************
	public UserRole getRole()
	{
		return role;
	}
	public void setRole(UserRole role)
	{
		this.role = role;
	}
	
	//********************************************************************
	// Properties
	//********************************************************************
	private UserRole role;

}
