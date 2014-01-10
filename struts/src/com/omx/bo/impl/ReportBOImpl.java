package com.omx.bo.impl;

import java.util.List;

import com.omx.beans.ReportBean;
import com.omx.bo.ReportBO;
import com.omx.dao.ReportsDao;
import com.omx.dao.impl.ReportsDaoImpl;

public class ReportBOImpl implements ReportBO {
	ReportsDao reportsDao;
	
	@Override
	public List<ReportBean> findAllProducts() {
		reportsDao = new ReportsDaoImpl();
		return reportsDao.findAllReports();
	}

}
