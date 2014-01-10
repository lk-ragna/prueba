package com.omx.dao.impl;

import com.omx.beans.ReportBean;
import com.omx.dao.ReportsDao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReportsDaoImpl extends ConectionDao implements ReportsDao {
	private static final String SELECT = "select o.ORDERS_ID, o.MEMBER_ID, ce.UP_PARTNUMBER, ced.UP_NAME, oi.QUANTITY, "
			+ "oi.price, oi.TOTALPRODUCT, a.FIRSTNAME, a.LASTNAME "
			+ "from orders o "
			+ "inner join orderitems oi ON o.ORDERS_ID = oi.ORDERS_ID "
			+ "inner join catentry ce ON oi.CATENTRY_ID = ce.CATENTRY_ID "
			+ "inner join catEntDesc ced ON ce.CATENTRY_ID = ced.CATENTRY_ID "
			+ "inner join address a ON o.MEMBER_ID = a.MEMBER_ID ";

	@Override
	public List<ReportBean> findAllReports(){
		List<ReportBean> products = new ArrayList<ReportBean>();
		try {
			this.openConnection();
			ResultSet rs = this.executeQuery(SELECT);
			
		    while (rs.next()) {
		    	ReportBean product = new ReportBean();
		    	product.setSku(rs.getString("UP_PARTNUMBER"));
		    	product.setMembrerId(rs.getInt("MEMBER_ID"));
		    	product.setDescription(rs.getString("UP_NAME"));
		    	product.setQuantity(rs.getInt("QUANTITY"));
		    	product.setPrice(rs.getDouble("PRICE"));
		    	product.setTotal(rs.getDouble("TOTALPRODUCT"));
		    	products.add(product);
		    	
		    }
			this.closeConection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

}
