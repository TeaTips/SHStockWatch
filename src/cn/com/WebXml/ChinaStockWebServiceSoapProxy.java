package cn.com.WebXml;

public class ChinaStockWebServiceSoapProxy implements cn.com.WebXml.ChinaStockWebServiceSoap {
  private String _endpoint = null;
  private cn.com.WebXml.ChinaStockWebServiceSoap chinaStockWebServiceSoap = null;
  
  public ChinaStockWebServiceSoapProxy() {
    _initChinaStockWebServiceSoapProxy();
  }
  
  public ChinaStockWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initChinaStockWebServiceSoapProxy();
  }
  
  private void _initChinaStockWebServiceSoapProxy() {
    try {
      chinaStockWebServiceSoap = (new cn.com.WebXml.ChinaStockWebServiceLocator()).getChinaStockWebServiceSoap();
      if (chinaStockWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)chinaStockWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)chinaStockWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (chinaStockWebServiceSoap != null)
      ((javax.xml.rpc.Stub)chinaStockWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.WebXml.ChinaStockWebServiceSoap getChinaStockWebServiceSoap() {
    if (chinaStockWebServiceSoap == null)
      _initChinaStockWebServiceSoapProxy();
    return chinaStockWebServiceSoap;
  }
  
  public void getStockImageByCode(java.lang.String theStockCode) throws java.rmi.RemoteException{
    if (chinaStockWebServiceSoap == null)
      _initChinaStockWebServiceSoapProxy();
    chinaStockWebServiceSoap.getStockImageByCode(theStockCode);
  }
  
  public byte[] getStockImageByteByCode(java.lang.String theStockCode) throws java.rmi.RemoteException{
    if (chinaStockWebServiceSoap == null)
      _initChinaStockWebServiceSoapProxy();
    return chinaStockWebServiceSoap.getStockImageByteByCode(theStockCode);
  }
  
  public void getStockImage_kByCode(java.lang.String theStockCode, java.lang.String theType) throws java.rmi.RemoteException{
    if (chinaStockWebServiceSoap == null)
      _initChinaStockWebServiceSoapProxy();
    chinaStockWebServiceSoap.getStockImage_kByCode(theStockCode, theType);
  }
  
  public byte[] getStockImage_kByteByCode(java.lang.String theStockCode, java.lang.String theType) throws java.rmi.RemoteException{
    if (chinaStockWebServiceSoap == null)
      _initChinaStockWebServiceSoapProxy();
    return chinaStockWebServiceSoap.getStockImage_kByteByCode(theStockCode, theType);
  }
  
  public java.lang.String[] getStockInfoByCode(java.lang.String theStockCode) throws java.rmi.RemoteException{
    if (chinaStockWebServiceSoap == null)
      _initChinaStockWebServiceSoapProxy();
    return chinaStockWebServiceSoap.getStockInfoByCode(theStockCode);
  }
  
  
}