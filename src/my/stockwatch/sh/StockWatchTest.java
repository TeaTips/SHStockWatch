package my.stockwatch.sh;

import java.rmi.RemoteException;

import cn.com.WebXml.ChinaStockWebServiceSoapProxy;

public class StockWatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ChinaStockWebServiceSoapProxy sampleChinaStockWebServiceSoapProxyid = new ChinaStockWebServiceSoapProxy();
		
		try {
			String[] result = sampleChinaStockWebServiceSoapProxyid.getStockInfoByCode("sh000001");
			for(String entry : result)
			{
				System.out.println(entry);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
