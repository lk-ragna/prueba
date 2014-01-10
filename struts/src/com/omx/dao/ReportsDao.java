package com.omx.dao;

import java.util.List;

import com.omx.beans.ReportBean;

public interface ReportsDao {
	public List<ReportBean> findAllReports();
}
