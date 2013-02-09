package my.stockwatch.sh;

import java.rmi.RemoteException;

import my.stockwatch.sh.util.Constants;
import cn.com.WebXml.ChinaStockWebServiceSoapProxy;

public class StockWatchTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		ChinaStockWebServiceSoapProxy sampleChinaStockWebServiceSoapProxyid = new ChinaStockWebServiceSoapProxy();
		String[] metaInfo = Constants.getMetaInfo();
//		System.out.println(metaInfo);
		
		try {
			String[] result = sampleChinaStockWebServiceSoapProxyid.getStockInfoByCode("sh000001");
			for(int i = 0; i < metaInfo.length && i < result.length; ++i)
			{
				System.out.println(metaInfo[i] + ": " + result[i]);
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
