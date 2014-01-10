package com.omx.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.omx.beans.ReportBean;
import com.omx.bo.ReportBO;
import com.omx.bo.impl.ReportBOImpl;
import com.omx.form.ReportForm;


public class UserReportAction extends Action {
	
	private List<ReportBean> products;
	
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		ReportForm reports = (ReportForm) form;
		ReportBO reportBo = new ReportBOImpl();
		reports.setUsersReport(reportBo.findAllProducts());
		
//		reports.setUsersReport(report);
//		reports.setCadena("pruebabbbbba");
		
		
		return mapping.findForward("success");
	}



	public List<ReportBean> getProducts() {
		return products;
	}



	public void setProducts(List<ReportBean> products) {
		this.products = products;
	}


	
	
	
}
