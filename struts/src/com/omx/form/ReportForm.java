package com.omx.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.omx.beans.ReportBean;

public class ReportForm  extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6415346477183967842L;
	
	private List<ReportBean> usersReport;
	private String cadena;

	public List<ReportBean> getUsersReport() {
		return this.usersReport;
	}

	public void setUsersReport(List<ReportBean> usersReport) {
		this.usersReport = usersReport;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	

}
