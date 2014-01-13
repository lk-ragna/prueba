package com.omx.form;

import org.apache.struts.action.ActionForm;

public class LogInForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7125848602751243219L;
	
	private String user;
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
