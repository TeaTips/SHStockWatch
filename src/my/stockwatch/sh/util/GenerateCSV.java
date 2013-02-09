package my.stockwatch.sh.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import my.stockwatch.sh.dto.StockInfo;
import cn.com.WebXml.ChinaStockWebServiceSoapProxy;

public class GenerateCSV {
	ChinaStockWebServiceSoapProxy sampleChinaStockWebServiceSoapProxyid;
	static String OUTPUTFILENAME = "output.csv"; 
	List<StockInfo> stockInfoList;
	public GenerateCSV(
			ChinaStockWebServiceSoapProxy sampleChinaStockWebServiceSoapProxyid) {
		super();
		this.sampleChinaStockWebServiceSoapProxyid = sampleChinaStockWebServiceSoapProxyid;
		
	}
	
	public static String generateCSV(List<StockInfo> stockInfoList)
	{
		String fileLocation = "";
		File file = new File(OUTPUTFILENAME);
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			// generate header
			bw.append(Constants.getLine());
			bw.newLine();
			// add content
			for(StockInfo si : stockInfoList)
			{
				String contentLine = Constants.formatStringArrayToLine(si.getInfo());
				bw.append(contentLine);
				bw.newLine();
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return fileLocation;
	}

}
