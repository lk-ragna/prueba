package com.omx.bo;

import java.sql.SQLException;

import javax.naming.NamingException;

import com.omx.beans.TreeOrganizationBean;

public interface OrganizationTreeBO {
	
	public TreeOrganizationBean getOrganizationTreePerMemberId(Long memberId) throws NamingException, SQLException, Exception;

}
