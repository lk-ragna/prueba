package com.omx.dao.impl;

import com.omx.beans.ReportBean;
import com.omx.dao.ReportsDao;

import java.sql.ResultSet;

public class ReportsDaoImpl extends ConectionDao implements ReportsDao {
	private static final String SELECT = "select u.USERS_ID, u.LOGONID, u.STATUS from userreg u";

	@Override
	public ReportBean findAllReports(){
		
		try {
			this.openConnection();
			ResultSet rs = this.executeQuery(SELECT);
			
		    while (rs.next()) {
		        System.out.println("USERS_ID: " + rs.getString("USERS_ID") + "<br />");
		        System.out.println("LOGONID: " + rs.getString("LOGONID") + "<br />");
		    }
			this.closeConection();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
