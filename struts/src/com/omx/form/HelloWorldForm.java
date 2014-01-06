package com.omx.form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1997700876715766752L;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
