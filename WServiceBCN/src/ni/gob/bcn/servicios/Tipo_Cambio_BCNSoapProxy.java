package ni.gob.bcn.servicios;

public class Tipo_Cambio_BCNSoapProxy implements ni.gob.bcn.servicios.Tipo_Cambio_BCNSoap {
  private String _endpoint = null;
  private ni.gob.bcn.servicios.Tipo_Cambio_BCNSoap tipo_Cambio_BCNSoap = null;
  
  public Tipo_Cambio_BCNSoapProxy() {
    _initTipo_Cambio_BCNSoapProxy();
  }
  
  public Tipo_Cambio_BCNSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initTipo_Cambio_BCNSoapProxy();
  }
  
  private void _initTipo_Cambio_BCNSoapProxy() {
    try {
      tipo_Cambio_BCNSoap = (new ni.gob.bcn.servicios.Tipo_Cambio_BCNLocator()).getTipo_Cambio_BCNSoap();
      if (tipo_Cambio_BCNSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tipo_Cambio_BCNSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tipo_Cambio_BCNSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tipo_Cambio_BCNSoap != null)
      ((javax.xml.rpc.Stub)tipo_Cambio_BCNSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ni.gob.bcn.servicios.Tipo_Cambio_BCNSoap getTipo_Cambio_BCNSoap() {
    if (tipo_Cambio_BCNSoap == null)
      _initTipo_Cambio_BCNSoapProxy();
    return tipo_Cambio_BCNSoap;
  }
  
  public double recuperaTC_Dia(int ano, int mes, int dia) throws java.rmi.RemoteException{
    if (tipo_Cambio_BCNSoap == null)
      _initTipo_Cambio_BCNSoapProxy();
    return tipo_Cambio_BCNSoap.recuperaTC_Dia(ano, mes, dia);
  }
  
  public ni.gob.bcn.servicios.RecuperaTC_MesResponseRecuperaTC_MesResult recuperaTC_Mes(int ano, int mes) throws java.rmi.RemoteException{
    if (tipo_Cambio_BCNSoap == null)
      _initTipo_Cambio_BCNSoapProxy();
    return tipo_Cambio_BCNSoap.recuperaTC_Mes(ano, mes);
  }
  
  
}