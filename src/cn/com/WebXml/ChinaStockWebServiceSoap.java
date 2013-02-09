/**
 * ChinaStockWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public interface ChinaStockWebServiceSoap extends java.rmi.Remote {

    /**
     * <br
     * 				/><h3>直接获得中国股票GIF分时走势图（545*300pixel/72dpi）</h3><p>输入参数：theStockCode
     * 				= 股票代号，如：sh000001； 返回数据：股票GIF分时走势图。</p><br />
     */
    public void getStockImageByCode(java.lang.String theStockCode) throws java.rmi.RemoteException;

    /**
     * <br
     * 				/><h3>获得中国股票GIF分时走势图字节数组</h3><p>输入参数：theStockCode
     * 				= 股票代号，如：sh000001； 返回数据：股票GIF分时走势图字节数组。<br
     * 				/><strong>字节流到图片可以参考以下方法</strong>（.NET vb）：<br
     * 				/>HttpContext.Current.Response.Cache.SetCacheability(System.Web.HttpCacheability.NoCache)
     * 				'不缓存<br />HttpContext.Current.Response.ClearContent()<br
     * 				/>HttpContext.Current.Response.ContentType = "image/Gif"<br
     * 				/>HttpContext.Current.Response.BinaryWrite(Ary) 'Ary 图片字节数组<br
     * 				/>HttpContext.Current.Response.End()</p><br />
     */
    public byte[] getStockImageByteByCode(java.lang.String theStockCode) throws java.rmi.RemoteException;

    /**
     * <br
     * 				/><h3>直接获得中国股票GIF日/周/月 K
     * 				线图（545*300pixel/72dpi）</h3><p>输入参数：theStockCode =
     * 				股票代号，如：sh000001；theType = K 线图类型（D：日[默认]、W：周、M：月），返回数据：股票GIF日
     * K
     * 				线图。</p><br />
     */
    public void getStockImage_kByCode(java.lang.String theStockCode, java.lang.String theType) throws java.rmi.RemoteException;

    /**
     * <br
     * 				/><h3>获得中国股票GIF日/周/月 K
     * 				线图字节数组</h3><p>输入参数：theStockCode =
     * 				股票代号，如：sh000001；theType = K 线图类型（D：日[默认]、W：周、M：月），返回数据：股票GIF日
     * K
     * 				线图字节数组。</p><br />
     */
    public byte[] getStockImage_kByteByCode(java.lang.String theStockCode, java.lang.String theType) throws java.rmi.RemoteException;

    /**
     * <br
     * 				/><h3>获得中国股票及时行情
     * 				String()</h3><p>输入参数：theStockCode = 股票代号，如：sh000001；
     * 				返回数据：一个一维字符串数组
     * 				String(24)，结构为：String(0)股票代号、String(1)股票名称、String(2)行情时间、String(3)最新价（元）、String(4)昨收盘（元）、String(5)今开盘（元）、String(6)涨跌额（元）、String(7)最低（元）、String(8)最高（元）、String(9)涨跌幅（%）、String(10)成交量（手）、String(11)成交额（万元）、String(12)竞买价（元）、String(13)竞卖价（元）、String(14)委比（%）、String(15)-String(19)买一
     * 				- 买五（元）/手、String(20)-String(24)卖一 - 卖五（元）/手。</p><br />
     */
    public java.lang.String[] getStockInfoByCode(java.lang.String theStockCode) throws java.rmi.RemoteException;
}
