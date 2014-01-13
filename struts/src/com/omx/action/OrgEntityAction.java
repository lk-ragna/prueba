package com.omx.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.omx.beans.TreeOrganizationBean;
import com.omx.bo.OrganizationTreeBO;
import com.omx.bo.impl.OrganizationTreeBOImpl;
import com.omx.form.OrgEntityForm;

public class OrgEntityAction extends Action{

	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		OrgEntityForm orgEntity = (OrgEntityForm) form;
		OrganizationTreeBO organizationTreeBO = new OrganizationTreeBOImpl();
		TreeOrganizationBean tree = organizationTreeBO.getOrganizationTreePerMemberId(7000000000000001651L);
		System.out.println("todas las organizaciones son " + tree.toString());
		//orgEntity.setOrgEntity(organizationTreeBO.getOrganizationTreePerMemberId(7000000000000001651L));
		
		return mapping.findForward("success");
	}
}
