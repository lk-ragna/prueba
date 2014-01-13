package com.omx.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.omx.beans.ReportBean;
import com.omx.dao.ReportsDao;
import com.omx.dao.impl.ReportsDaoImpl;

public class ExportExcelAction extends Action {
	private final static Integer PRODUCT = 1;
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		Integer tipoReporte = Integer.parseInt(request.getParameter("reportTipe"));
		StringBuffer sb = null; 
		if(tipoReporte == PRODUCT){
			sb = productReport();
		}else{
			sb = productReport();
		}
		
		// tell browser program going to return an application file
		// instead of html page
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename=temp.csv");

		try {
			ServletOutputStream out = response.getOutputStream();
			

			InputStream in = new ByteArrayInputStream(sb.toString().getBytes(
					"UTF-8"));

			byte[] outputByte = new byte[4096];
			// copy binary contect to output stream
			while (in.read(outputByte, 0, 4096) != -1) {
				out.write(outputByte, 0, 4096);
			}
			in.close();
			out.flush();
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static StringBuffer generateCsvFileBuffer() {
		StringBuffer writer = new StringBuffer();

		writer.append("DisplayName");
		writer.append(',');
		writer.append("Age");
		writer.append(',');
		writer.append("HandPhone");
		writer.append("\n");
		writer.append("mkyong");
		writer.append(',');
		writer.append("26");
		writer.append(',');
		writer.append("0123456789");
		writer.append("\n");
		

		return writer;
	}
	
	private static StringBuffer productReport(){
		
		ReportsDao dao = new ReportsDaoImpl();
		List<ReportBean> reporte = dao.findAllReports();
		StringBuffer reporteString = new StringBuffer();
		
		reporteString.append("SKU,Descripción,Cantidad,Precio,Total\n");
		
		if(reporte == null || reporte.isEmpty())
			return reporteString;
		
		for(ReportBean producto : reporte){
			reporteString.append(producto.getSku() + "," + producto.getDescription() + "," + producto.getQuantity() 
					+ "," + producto.getPrice() + "," + producto.getTotal() + "\n");
		}
		
		return reporteString;
		
		
		
	}
}
