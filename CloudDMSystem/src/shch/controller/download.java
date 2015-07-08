package shch.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;

public class download extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 HttpSession session=request.getSession();
		 request.setCharacterEncoding("UTF-8");
		  response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
			 HSSFWorkbook workbook = new HSSFWorkbook();// 创建一个Excel文件    
			    HSSFSheet sheet = workbook.createSheet();// 创建一个Excel的Sheet    
			  //  sheet.createFreezePane(1, 3);// 冻结    
			    // 设置列宽    
			    sheet.setColumnWidth(0, 4000);    
			    sheet.setColumnWidth(1, 4000);   
			    // Sheet样式    
			    HSSFCellStyle sheetStyle = workbook.createCellStyle();    
			    // 背景色的设定    
			    sheetStyle.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);    
			    // 前景色的设定    
			    sheetStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);    
			    // 填充模式    
			    sheetStyle.setFillPattern(HSSFCellStyle.FINE_DOTS);    
			    // 设置列的样式    
			    for (int i = 0; i <= 14; i++) {    
			      sheet.setDefaultColumnStyle((short) i, sheetStyle);    
			    }    
			    // 设置字体    
			    HSSFFont headfont = workbook.createFont();    
			    headfont.setFontName("黑体");    
			    headfont.setFontHeightInPoints((short) 22);// 字体大小    
			    headfont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 加粗    
			    // 另一个样式    
			    HSSFCellStyle headstyle = workbook.createCellStyle();    
			    headstyle.setFont(headfont);    
			    headstyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
			    headstyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
			    headstyle.setLocked(true);    
			    headstyle.setWrapText(true);// 自动换行    
			    // 另一个字体样式    
			    HSSFFont columnHeadFont = workbook.createFont();    
			    columnHeadFont.setFontName("宋体");    
			    columnHeadFont.setFontHeightInPoints((short) 10);    
			    columnHeadFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);    
			    // 列头的样式    
			    HSSFCellStyle columnHeadStyle = workbook.createCellStyle();    
			    columnHeadStyle.setFont(columnHeadFont);    
			    columnHeadStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
			    columnHeadStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
			    columnHeadStyle.setLocked(true);    
			    columnHeadStyle.setWrapText(true);    
			    columnHeadStyle.setLeftBorderColor(HSSFColor.BLACK.index);// 左边框的颜色    
			    columnHeadStyle.setBorderLeft((short) 1);// 边框的大小    
			    columnHeadStyle.setRightBorderColor(HSSFColor.BLACK.index);// 右边框的颜色    
			    columnHeadStyle.setBorderRight((short) 1);// 边框的大小    
			    columnHeadStyle.setTopBorderColor(HSSFColor.BLACK.index);
			    columnHeadStyle.setBorderTop((short) 1);// 边框的大小
			    columnHeadStyle.setBottomBorderColor(HSSFColor.BLACK.index);
			    columnHeadStyle.setBorderBottom((short) 1);
			    columnHeadStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 设置单元格的边框为粗体    
			    columnHeadStyle.setBottomBorderColor(HSSFColor.BLACK.index); // 设置单元格的边框颜色    
			    // 设置单元格的背景颜色（单元格的样式会覆盖列或行的样式）    
			  //  columnHeadStyle.setFillForegroundColor(HSSFColor.WHITE.index);    
			    
			    
			    try {  
			    
			    	 FileOutputStream out=new FileOutputStream("F://apache-tomcat-7.0.55/webapps/CloudDMSystem/download/result.xls");
			      // 创建第一行    
			      HSSFRow row0 = sheet.createRow(0);    
			      // 设置行高    
			      row0.setHeight((short) 900);  
			      // 创建第一列    
			      HSSFCell cell0 = row0.createCell(0);    
			      cell0.setCellValue(new HSSFRichTextString("数据质量评分结果表"));    
			      cell0.setCellStyle(headstyle);    
			      /**  
			       * 合并单元格  
			       *    第一个参数：第一个单元格的行数（从0开始）  
			       *    第二个参数：第二个单元格的行数（从0开始）  
			       *    第三个参数：第一个单元格的列数（从0开始）  
			       *    第四个参数：第二个单元格的列数（从0开始）  
			       */    
			      CellRangeAddress range = new CellRangeAddress(0, 0, 0, 13);    
			      sheet.addMergedRegion(range);    
			      // 第三行    
			      HSSFRow row2 = sheet.createRow(1);    
			      row2.setHeight((short) 900);    
			      HSSFCell cell = row2.createCell(0);    
			      cell.setCellValue(new HSSFRichTextString("系统名称"));    
			      cell.setCellStyle(columnHeadStyle);   
			      range = new CellRangeAddress(1, 3, 0, 0);    
			      sheet.addMergedRegion(range);    
			      cell = row2.createCell(1);    
			      cell.setCellValue(new HSSFRichTextString("总评分"));    
			      cell.setCellStyle(columnHeadStyle); 
			      for(int i=2;i<14;i++){
			    	  cell = row2.createCell(i);    
				      cell.setCellValue(new HSSFRichTextString(""));    
				      cell.setCellStyle(columnHeadStyle);  
			      }
			      range = new CellRangeAddress(1, 1, 2, 13);    
			      sheet.addMergedRegion(range);
			      cell = row2.createCell(2); 
			      cell.setCellValue(new HSSFRichTextString("数据质量评分体系"));
			      cell.setCellStyle(columnHeadStyle);  
			      HSSFRow row3 = sheet.createRow(2);    
			      row3.setHeight((short) 600);    
			      cell = row3.createCell(2);    
			      cell.setCellValue(new HSSFRichTextString("准确性"));    
			      range = new CellRangeAddress(2, 2, 2, 4);   
			      sheet.addMergedRegion(range); 
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row3.createCell(5);    
			      cell.setCellValue(new HSSFRichTextString("完整性"));    
			      range = new CellRangeAddress(2, 2, 5, 7);    
			      sheet.addMergedRegion(range);
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row3.createCell(8);    
			      cell.setCellValue(new HSSFRichTextString("一致性"));    
			      range = new CellRangeAddress(2, 2, 8, 10);    
			      sheet.addMergedRegion(range); 
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row3.createCell(11);    
			      cell.setCellValue(new HSSFRichTextString("及时性")); 
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row3.createCell(12);  
			      cell.setCellStyle(columnHeadStyle);
			      cell.setCellValue(new HSSFRichTextString("")); 
			      cell = row3.createCell(13);   
			      cell.setCellStyle(columnHeadStyle);
			      cell.setCellValue(new HSSFRichTextString("")); 
			      range = new CellRangeAddress(2, 2, 11, 13);    
			      sheet.addMergedRegion(range); 
			      cell.setCellStyle(columnHeadStyle); 
			      HSSFRow row4 = sheet.createRow(3);    
			      row4.setHeight((short) 600); 
			      
			      range = new CellRangeAddress(1, 3, 1, 1);    
			      sheet.addMergedRegion(range); 
			      cell = row4.createCell(2);    
			      cell.setCellValue(new HSSFRichTextString("合格率"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(3);    
			      cell.setCellValue(new HSSFRichTextString("权重"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(4);    
			      cell.setCellValue(new HSSFRichTextString("得分"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(5);    
			      cell.setCellValue(new HSSFRichTextString("合格率"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(6);    
			      cell.setCellValue(new HSSFRichTextString("权重"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(7);    
			      cell.setCellValue(new HSSFRichTextString("得分"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(8);    
			      cell.setCellValue(new HSSFRichTextString("合格率"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(9);    
			      cell.setCellValue(new HSSFRichTextString("权重"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(10);    
			      cell.setCellValue(new HSSFRichTextString("得分"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(11);    
			      cell.setCellValue(new HSSFRichTextString("合格率"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(12);    
			      cell.setCellValue(new HSSFRichTextString("权重"));    
			      cell.setCellStyle(columnHeadStyle); 
			      cell = row4.createCell(13);    
			      cell.setCellValue(new HSSFRichTextString("得分"));    
			      cell.setCellStyle(columnHeadStyle); 
			      
			
		     for(int i = 1; i < 5; i++) {  
		         //创建第i行  
		    	 int k=i+3;
		         HSSFRow rowk = sheet.createRow(k );  
		         //在第i行的相应列中加入相应的数据  
		         String systemnamei=(String) session.getAttribute("systemname"+i);
		         if(!((systemnamei==null)||("".equals(systemnamei)))){
		 			float zfi=(Float) session.getAttribute("zf"+i);
		 			float cepi=(Float) session.getAttribute("cep"+i);
		 			float cqi=(Float) session.getAttribute("cq"+i);
		 			float cdfi=(Float) session.getAttribute("cdf"+i);
		 			float zepi=(Float) session.getAttribute("zep"+i);
		 			float zqi=(Float) session.getAttribute("zq"+i);
		 			float zdfi=(Float) session.getAttribute("zdf"+i);
		 			float yepi=(Float) session.getAttribute("yep"+i);
		 			float yqi=(Float) session.getAttribute("yq"+i);
		 			float ydfi=(Float) session.getAttribute("ydf"+i);
		 			float jepi=(Float) session.getAttribute("jep"+i);
		 			float jqi=(Float) session.getAttribute("jq"+i);
		 			float jdfi=(Float) session.getAttribute("jdf"+i);
		         
		        	 cell=rowk.createCell(0);
		             cell.setCellValue(new HSSFRichTextString(systemnamei));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(1);
		             cell.setCellValue(new HSSFRichTextString(""+zfi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(2);
		             cell.setCellValue(new HSSFRichTextString(""+cepi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(3);
		             cell.setCellValue(new HSSFRichTextString(""+cqi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(4);
		             cell.setCellValue(new HSSFRichTextString(""+cdfi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(5);
		             cell.setCellValue(new HSSFRichTextString(""+zepi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(6);
		             cell.setCellValue(new HSSFRichTextString(""+zqi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(7);
		             cell.setCellValue(new HSSFRichTextString(""+zdfi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(8);
		             cell.setCellValue(new HSSFRichTextString(""+yepi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(9);
		             cell.setCellValue(new HSSFRichTextString(""+yqi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(10);
		             cell.setCellValue(new HSSFRichTextString(""+ydfi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(11);
		             cell.setCellValue(new HSSFRichTextString(""+jepi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(12);
		             cell.setCellValue(new HSSFRichTextString(""+jqi));  
		             cell.setCellStyle(columnHeadStyle); 
		             cell=rowk.createCell(13);
		             cell.setCellValue(new HSSFRichTextString(""+jdfi));  
		             cell.setCellStyle(columnHeadStyle); 
		         }
		     }  
		     //写入数据  把相应的Excel 工作簿存盘  
		    workbook.write(out); 
		    String filename = "result.xls";  
	      //  System.out.println(filename);  
	          
	        //设置文件MIME类型  
	        response.setContentType(getServletContext().getMimeType(filename));  
	        //设置Content-Disposition  
	        response.setHeader("Content-Disposition", "attachment;filename="+filename);  
	        //读取目标文件，通过response将目标文件写到客户端  
	        //获取目标文件的绝对路径  
	        String fullFileName = getServletContext().getRealPath("/download/"+filename);  
	        //System.out.println(fullFileName);  
	        //读取文件  
	        InputStream in = new FileInputStream(fullFileName);  
	        OutputStream os = response.getOutputStream();  
	          
	        //写文件  
	        int b;  
	        while((b=in.read())!= -1)  
	        {  
	            os.write(b);  
	        }  
	          
	        in.close();  
	        os.close();
	      //  request.getRequestDispatcher("/result.jsp").forward(request, response);
	      /*  PrintWriter outp = response.getWriter();
	        outp.print("<script language='javascript'>alert('下载成功!');window.location.href='/CloudDMSystem/result.jsp';</script>"); */
		 } catch (IOException e) {  
		     e.printStackTrace();  
		 } 
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
