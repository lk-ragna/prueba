package com.omx.logic;

import java.util.ArrayList;
import java.util.List;

import com.omx.beans.ReportBean;

public class Prueba {
	
	private List<ReportBean> reporte;
	private String prueba;
	
	public Prueba(){
		reporte = new ArrayList<ReportBean>();
	    ReportBean repo1 = new ReportBean();
	    repo1.setSku("34567");
	    repo1.setDescription("Descripcion 1");
	    repo1.setQuantity(3);
	    repo1.setPrice(12.12);
	    repo1.setTotal(36.36);
	    reporte.add(repo1);
	}
	public List<ReportBean> getReporte() {
		return reporte;
	}
	public void setReporte(List<ReportBean> reporte) {
		this.reporte = reporte;
	}
	public String getPrueba() {
		prueba = "esto se supone que se debe de ver";
		return prueba;
	}
	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}
	
	
}
