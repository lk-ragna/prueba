package com.omx.form;

import org.apache.struts.action.ActionForm;

import com.omx.beans.TreeOrganizationBean;

public class OrgEntityForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TreeOrganizationBean orgEntity;

	public TreeOrganizationBean getOrgEntity() {
		return orgEntity;
	}

	public void setOrgEntity(TreeOrganizationBean orgEntity) {
		this.orgEntity = orgEntity;
	}
	
	
	
	
}
