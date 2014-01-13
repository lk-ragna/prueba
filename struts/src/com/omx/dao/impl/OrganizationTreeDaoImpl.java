package com.omx.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.omx.beans.TreeOrganizationBean;
import com.omx.dao.OrganizationTreeDao;

public class OrganizationTreeDaoImpl extends ConectionDao implements OrganizationTreeDao{
	
	public static final String SELECT = "select m.MEMBER_ID, m.TYPE, o.ORGENTITYNAME, u.LOGONID "
			+ "from MBRREL mr "
			+ "INNER JOIN MEMBER m ON m.MEMBER_ID = mr.DESCENDANT_ID "
			+ "LEFT JOIN ORGENTITY o ON o.ORGENTITY_ID = mr.DESCENDANT_ID "
			+ "LEFT JOIN USERREG u ON u.USERS_ID = mr.DESCENDANT_ID ";
	
	public static final String SELECT_ORGENTITY = "select o.ORGENTITY_ID, o.ORGENTITYNAME, 'O' as TYPE from ORGENTITY o ";
	private static final String TYPE_USER = "U";
	
	
	@Override
	public List<TreeOrganizationBean> getOrganizationTree(Long idMember) throws Exception, NamingException, SQLException{
		String sql = SELECT + " where mr.ANCESTOR_ID = " + idMember + " and SEQUENCE = 1";
		List<TreeOrganizationBean> tree = new ArrayList<TreeOrganizationBean>();
		ResultSet rs = null;
		try {
			this.openConnection();
			
			rs = this.executeQuery(sql);
			
			if(rs == null)
				return null;
			
			while (rs.next()) {
				TreeOrganizationBean leaf = new TreeOrganizationBean();
				leaf.setOrganizationId(rs.getLong("MEMBER_ID"));
				leaf.setType(rs.getString("TYPE"));
				String type = null;
				if(rs.getString("TYPE") != null){
					type = rs.getString("TYPE").trim();
				}
				
				if(type.equalsIgnoreCase(TYPE_USER)){
					leaf.setOrganizationName(rs.getString("LOGONID"));
				}else{
					leaf.setOrganizationName(rs.getString("ORGENTITYNAME"));
				}
				tree.add(leaf);
				
				
			}
			
			
		} catch (NamingException e) {
			throw e;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}finally{
			this.closeConection();
		}
		
		
		return tree;
	}
	
	@Override
	public TreeOrganizationBean findOrganizationPerMemberId(Long idMember) throws Exception, NamingException, SQLException{
		try{
			this.openConnection();
			ResultSet rs = this.executeQuery(SELECT_ORGENTITY + "where ORGENTITY_ID = " + idMember);
			if(rs == null)
				return null;
			
			while (rs.next()) {
				TreeOrganizationBean leaf = new TreeOrganizationBean();
				leaf.setOrganizationId(rs.getLong("ORGENTITY_ID"));
				leaf.setType(rs.getString("TYPE"));
				leaf.setOrganizationName(rs.getString("ORGENTITYNAME"));
				return leaf;
				
				
			}
			return null;
			
		} catch (NamingException e) {
			throw e;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}finally{
			this.closeConection();
		}
		
		
		
		
	}

}
