package com.omx.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.omx.beans.ReportBean;
import com.omx.form.ReportForm;


public class UserReportAction extends Action {
	
	private List<ReportBean> report;
	
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ReportForm reports = (ReportForm) form;
		
//		if(reports == null){
//			reports = new ReportForm();
//		}
		
		report = new ArrayList<ReportBean>();
		
		ReportBean user1 = new ReportBean();
		user1.setSku("2134");
		user1.setDescription("Lapiz");
		user1.setQuantity(2);
		user1.setPrice(12.12);
		user1.setTotal(24.24);
		report.add(user1);
		
		ReportBean user2 = new ReportBean();
		user2.setSku("74932");
		user2.setDescription("Pluma");
		user2.setQuantity(3);
		user2.setPrice(6d);
		user2.setTotal(18d);
		report.add(user2);
		
		ReportBean user3 = new ReportBean();
		user3.setSku("67354");
		user3.setDescription("Escritorio");
		user3.setQuantity(2);
		user3.setPrice(1234d);
		user3.setTotal(2468d);
		report.add(user3);
		
		reports.setUsersReport(report);
		reports.setCadena("pruebabbbbba");
		
		
		return mapping.findForward("success");
	}


	public List<ReportBean> getReport() {
		return report;
	}


	public void setReport(List<ReportBean> report) {
		this.report = report;
	}
	
	
	
}
