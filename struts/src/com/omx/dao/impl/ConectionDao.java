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
//	private static final String DATA_BASE_NAME = "WCDB";
//	private static final String DATA_BASE_DESC_ = "BD2 for websphere commerce";
//	private static final String DATA_BASE_NAME__ = "WCDB";
//	private static final String DATA_BASE_ = "WCDB";
	
	
	
	public void pruebaConexion(){
		Context initContext;
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
		    initContext = new InitialContext();
		    Context env  = (Context)initContext.lookup("java:comp/env");//"java:comp/env";  
		    DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/WASCommerceDB2");
		    cn = ds.getConnection();

		    String sqlBusqueda = "select u.USERS_ID, u.LOGONID, u.STATUS from userreg u";
		    st = cn.createStatement();
		    rs = st.executeQuery(sqlBusqueda);

		    while (rs.next()) {
		        System.out.println("USERS_ID: " + rs.getString("USERS_ID") + "<br />");
		        System.out.println("LOGONID: " + rs.getString("LOGONID") + "<br />");
		    }

		}catch (SQLException ex) {
			System.out.print("Error (" + ex.getErrorCode() + "): " + ex.getMessage());
			ex.printStackTrace();
		}catch (NamingException ex) {
			System.out.print("Error al intentar obtener el DataSource: " + ex.getMessage());
			ex.printStackTrace();
		}  finally {
		    if (rs != null) {
		        try {
		            rs.close();
		        } catch (SQLException ex) {
		        	System.out.print("Error (" + ex.getErrorCode() + "): " + ex.getMessage());
		        }
		    }

		    if (st != null) {
		        try {
		            st.close();
		        } catch (SQLException ex) {
		        	System.out.print("Error (" + ex.getErrorCode() + "): " + ex.getMessage());
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

}

