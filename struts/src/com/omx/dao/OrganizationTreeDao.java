package com.omx.dao;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.omx.beans.TreeOrganizationBean;

public interface OrganizationTreeDao {
	
	public List<TreeOrganizationBean> getOrganizationTree(Long idMember)  throws Exception, NamingException, SQLException;
	public TreeOrganizationBean findOrganizationPerMemberId(Long idMember) throws Exception, NamingException, SQLException;

}
