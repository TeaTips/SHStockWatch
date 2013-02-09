package my.stockwatch.sh;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import my.stockwatch.sh.dto.StockInfo;
import my.stockwatch.sh.util.Constants;
import my.stockwatch.sh.util.GenerateCSV;
import cn.com.WebXml.ChinaStockWebServiceSoapProxy;

public class StockWatchTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		ChinaStockWebServiceSoapProxy sampleChinaStockWebServiceSoapProxyid = new ChinaStockWebServiceSoapProxy();
		List<StockInfo> stockInfoList = new ArrayList<StockInfo>();
		
		String[] metaInfo = Constants.getMetaInfo();
//		System.out.println(metaInfo);
		
		try {
			for(String stockCode : Constants.getStockCodeList())
			{
				String[] result = sampleChinaStockWebServiceSoapProxyid.getStockInfoByCode(stockCode.trim());
				for(int i = 0; i < metaInfo.length && i < result.length; ++i)
				{
					System.out.println(metaInfo[i] + ": " + result[i]);
				}
				StockInfo stockInfo = new StockInfo();
//				stockInfo.setCode("sh000001");
				stockInfo.setInfo(result);
				stockInfoList.add(stockInfo);
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GenerateCSV.generateCSV(stockInfoList);
		
	}
}
