package com.omx.dao.impl;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ConectionDao {
	private static final String CONECTION_POOL = "java:/comp/env/jdbc/WASCommerceDB2";
	Context initContext;
	Connection cn = null;
	Statement st = null;
	ResultSet rs = null;
	
	
	
	protected void openConnection() throws NamingException, SQLException{
		try {
			initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup(CONECTION_POOL);
		    cn = ds.getConnection();
		} catch (NamingException e) {
			closeConection();
			throw e;
		} catch (SQLException e) {
			closeConection();
			throw e;
		}
	    
		
	}
	
	protected ResultSet executeQuery(String sql) throws Exception{
		if(cn == null)
			throw new Exception("Conection is null");
		
		st = cn.createStatement();
	    rs = st.executeQuery(sql);
	    return rs;
		
	}
	
	protected void closeConection(){
		if (rs != null) {
	        try {
	            rs.close();
	        } catch (SQLException ex) {
	        	System.out.print("Error (" + ex.getErrorCode() + "): " + ex.getMessage());
	        	ex.printStackTrace();
	        }
	    }
	    if (st != null) {
	        try {
	            st.close();
	        } catch (SQLException ex) {
	        	System.out.print("Error (" + ex.getErrorCode() + "): " + ex.getMessage());
	        	ex.printStackTrace();
	        }
	    }
	    if (cn != null) {
	        try {
	            cn.close();
	        } catch (SQLException ex) {
	        	System.out.print("Error (" + ex.getErrorCode() + "): " + ex.getMessage());
	        	ex.printStackTrace();
	        }
	    }
	}
	
}

