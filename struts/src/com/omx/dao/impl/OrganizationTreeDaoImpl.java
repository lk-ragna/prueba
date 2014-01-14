package com.omx.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.omx.beans.BudgetAvailableBean;
import com.omx.beans.BudgetBean;
import com.omx.beans.TreeOrganizationBean;
import com.omx.dao.OrganizationTreeDao;

public class OrganizationTreeDaoImpl extends ConectionDao implements OrganizationTreeDao{
	
	private static final String SELECT = "select m.MEMBER_ID, m.TYPE, o.ORGENTITYNAME, u.LOGONID "
			+ "from MBRREL mr "
			+ "INNER JOIN MEMBER m ON m.MEMBER_ID = mr.DESCENDANT_ID "
			+ "LEFT JOIN ORGENTITY o ON o.ORGENTITY_ID = mr.DESCENDANT_ID "
			+ "LEFT JOIN USERREG u ON u.USERS_ID = mr.DESCENDANT_ID ";
	
	private static final String SELECT_ORGENTITY = "select o.ORGENTITY_ID, o.ORGENTITYNAME, 'O' as TYPE from ORGENTITY o ";
	
	private String SELECT_BUDGET = "SELECT IDBUDGET, MEMBER_ID, CREDITAMOUNT, CREATIONDATE, LENGTHPERIOD, STATUS FROM BUDGET "; 
	
	private String SELECT_BUDGET_DISP_USE = "SELECT (SELECT CREDITAMOUNT FROM BUDGET WHERE BUDGET.MEMBER_ID = ?) - SUM(TRANSACTION_BUDGET.AMOUNT) as \"avalible_budget\", SUM(TRANSACTION_BUDGET.AMOUNT) as \"used_budget\" FROM TRANSACTION_BUDGET"
	         + " JOIN BUDGET ON TRANSACTION_BUDGET.MEMBER_ID = BUDGET.MEMBER_ID"
	         + " WHERE (SELECT CURRENT DATE - TRANSACTION_BUDGET.CREATIONDATE FROM sysibm.sysdummy1) BETWEEN 0 AND BUDGET.LENGTHPERIOD"
	         + " AND BUDGET.MEMBER_ID = ?";
	
	private static final String TYPE_USER = "U";
	
	
	@Override
	public List<BudgetAvailableBean> getAvailableBudget(Long idMember) throws Exception, NamingException, SQLException {
		List<BudgetAvailableBean> list = new ArrayList<BudgetAvailableBean>();
		String sql = SELECT_BUDGET_DISP_USE;
		
		try{
			this.openConnection();
			List<Object> params = new ArrayList<Object>();
			params.add(idMember);
			params.add(idMember);
			
			this.executeQuery(sql, params);
			
			if(rs == null)
				return null;
			
			while (rs.next()) {
				BudgetAvailableBean budget = new BudgetAvailableBean();
				budget.setMember_id(idMember);
				String aux = rs.getString("avalible_budget");
				if(aux != null && !aux.isEmpty())
					budget.setBudgetAvailable(rs.getDouble("avalible_budget"));
				aux = rs.getString("used_budget");
				if(aux != null && !aux.isEmpty())
					budget.setBudgetUsed(rs.getDouble("used_budget"));
				
				list.add(budget);
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
		return list;
	}
	
	
	@Override
	public List<BudgetBean> getBudgetByMember(Long idMember, Integer Status)  throws Exception, NamingException, SQLException{
		String sql = SELECT_BUDGET + "WHERE MEMBER_ID = " + idMember + " AND STATUS = " + Status;
		List<BudgetBean> budgetList = new ArrayList<BudgetBean>();
		
		
		try{
			this.openConnection();
			rs = this.executeQuery(sql);
			
			if(rs == null)
				return null;
			
			
			while (rs.next()) {
				BudgetBean budget = new BudgetBean();
				budget.setIdBudget(rs.getInt("IDBUDGET"));
				budget.setMember_id(rs.getLong("MEMBER_ID"));
				budget.setCreditAmount(rs.getDouble("CREDITAMOUNT"));
				budget.setCreationDate(rs.getDate("CREATIONDATE"));
				budget.setLengthPeriod(rs.getInt("LENGTHPERIOD"));
				budget.setStatus(rs.getInt("STATUS"));
				budgetList.add(budget);
				
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
		return budgetList;
	}
	
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
