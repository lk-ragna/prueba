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
import com.omx.dao.impl.ConectionDao;
import com.omx.dao.impl.ReportsDaoImpl;
import com.omx.form.HelloWorldForm;

public class HelloWorldAction extends Action {

	
	private List<ReportBean> reporte;
	private String atributo1;
	private String atributo2;
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		atributo1 = request.getParameter("caso1");
		atributo2 = request.getParameter("caso2");
		
		HelloWorldForm hwForm = (HelloWorldForm) form;
	    hwForm.setMessage("Hello World");
	    reporte = new ArrayList<ReportBean>();
	    ReportBean repo1 = new ReportBean();
	    repo1.setSku("34567");
	    repo1.setDescription("Descripcion 1");
	    repo1.setQuantity(3);
	    repo1.setPrice(12.12);
	    repo1.setTotal(36.36);
	    reporte.add(repo1);
	    
	    ReportsDaoImpl rep = new ReportsDaoImpl();
	    rep.findAllReports();
	    
	    return mapping.findForward("success");
    }

	public List<ReportBean> getReporte() {
		return reporte;
	}

	public void setReporte(List<ReportBean> reporte) {
		this.reporte = reporte;
	}

	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	public String getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
}
