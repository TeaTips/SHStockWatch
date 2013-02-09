/**
 * ChinaStockWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class ChinaStockWebServiceLocator extends org.apache.axis.client.Service implements cn.com.WebXml.ChinaStockWebService {

/**
 * <a
 * 			href="http://www.webxml.com.cn/"
 * 			target="_blank">WebXml.com.cn</a> <strong>中国股票行情数据 WEB
 * 			服务（支持深圳和上海股市的全部基金、债券和股票）</strong>，数据即时更新。输出GIF分时走势图、日/周/月 K
 * 			线图、及时行情数据（股票名称、行情时间、最新价、昨收盘、今开盘、涨跌额、最低、最高、涨跌幅、成交量、成交额、竞买价、竞卖价、委比、买一
 * -
 * 			买五、卖一 - 卖五）。此中国股票行情数据 WEB 服务仅作为用户获取信息之目的，并不构成投资建议。<a
 * 			href="http://www.webxml.com.cn/"
 * 			target="_blank">WebXml.com.cn</a>
 * 			和/或其各供应商不为本页面提供信息的错误、残缺、延迟或因依靠此信息所采取的任何行动负责。<strong>市场有风险，投资需谨慎</strong>。<br
 * 			/>此中国股票行情数据Web Services请不要用于任何商业目的，若有需要请<a
 * 			href="http://www.webxml.com.cn/zh_cn/contact_us.aspx"
 * 			target="_blank">联系我们</a>，欢迎技术交流。 QQ：8409035<br
 * 			/><strong>使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/
 * 			感谢大家的支持</strong>！<br /><br /><span
 * 			style="color:#D20000;"><strong>股票输入注意事项</strong>：因上海股票和深圳股票在代号上有重叠，所以在输入上海股票请在代号前加
 * 			SH，深圳加 SZ（不区分大小写），例：上证指数 sh000001，深发展A sz000001。如不输入股票代号默认上证指数
 * 			sh000001</span><br /><br />&nbsp;
 */

    public ChinaStockWebServiceLocator() {
    }


    public ChinaStockWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChinaStockWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ChinaStockWebServiceSoap
    private java.lang.String ChinaStockWebServiceSoap_address = "http://www.webxml.com.cn/WebServices/ChinaStockWebService.asmx";

    public java.lang.String getChinaStockWebServiceSoapAddress() {
        return ChinaStockWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ChinaStockWebServiceSoapWSDDServiceName = "ChinaStockWebServiceSoap";

    public java.lang.String getChinaStockWebServiceSoapWSDDServiceName() {
        return ChinaStockWebServiceSoapWSDDServiceName;
    }

    public void setChinaStockWebServiceSoapWSDDServiceName(java.lang.String name) {
        ChinaStockWebServiceSoapWSDDServiceName = name;
    }

    public cn.com.WebXml.ChinaStockWebServiceSoap getChinaStockWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ChinaStockWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getChinaStockWebServiceSoap(endpoint);
    }

    public cn.com.WebXml.ChinaStockWebServiceSoap getChinaStockWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.WebXml.ChinaStockWebServiceSoapStub _stub = new cn.com.WebXml.ChinaStockWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getChinaStockWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setChinaStockWebServiceSoapEndpointAddress(java.lang.String address) {
        ChinaStockWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.WebXml.ChinaStockWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.WebXml.ChinaStockWebServiceSoapStub _stub = new cn.com.WebXml.ChinaStockWebServiceSoapStub(new java.net.URL(ChinaStockWebServiceSoap_address), this);
                _stub.setPortName(getChinaStockWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ChinaStockWebServiceSoap".equals(inputPortName)) {
            return getChinaStockWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "ChinaStockWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "ChinaStockWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ChinaStockWebServiceSoap".equals(portName)) {
            setChinaStockWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
