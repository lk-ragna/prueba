package com.omx.bo.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.omx.beans.TreeOrganizationBean;
import com.omx.bo.OrganizationTreeBO;
import com.omx.dao.OrganizationTreeDao;
import com.omx.dao.impl.OrganizationTreeDaoImpl;

public class OrganizationTreeBOImpl implements OrganizationTreeBO{
	
	OrganizationTreeDao organizationTreeDao;
	
	@Override
	public TreeOrganizationBean getOrganizationTreePerMemberId(Long memberId) throws NamingException, SQLException, Exception {
		organizationTreeDao = new OrganizationTreeDaoImpl();
		
		TreeOrganizationBean orgEntity = organizationTreeDao.findOrganizationPerMemberId(memberId);
		if(orgEntity == null)
			return null;
		
		orgEntity.setTreeOrganizationBean(this.findOrganizationsAndUsers(orgEntity.getOrganizationId()));
		
		
		return orgEntity;
		
		
	}
	
	
	private List<TreeOrganizationBean> findOrganizationsAndUsers(Long memberId) throws NamingException, SQLException, Exception{
		organizationTreeDao = new OrganizationTreeDaoImpl();
		List<TreeOrganizationBean> list = organizationTreeDao.getOrganizationTree(memberId);
		if(list == null || list.isEmpty())
			return null;
		
		for(TreeOrganizationBean member : list){
			member.setTreeOrganizationBean(this.findOrganizationsAndUsers(member.getOrganizationId()));
		}
		return list;
		
		
	}
	

}
