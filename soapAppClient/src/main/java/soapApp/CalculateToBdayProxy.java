package soapApp;

public class CalculateToBdayProxy implements soapApp.CalculateToBday {
  private String _endpoint = null;
  private soapApp.CalculateToBday calculateToBday = null;
  
  public CalculateToBdayProxy() {
    _initCalculateToBdayProxy();
  }
  
  public CalculateToBdayProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculateToBdayProxy();
  }
  
  private void _initCalculateToBdayProxy() {
    try {
      calculateToBday = (new soapApp.CalculateToBdayServiceLocator()).getCalculateToBday();
      if (calculateToBday != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculateToBday)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculateToBday)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculateToBday != null)
      ((javax.xml.rpc.Stub)calculateToBday)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soapApp.CalculateToBday getCalculateToBday() {
    if (calculateToBday == null)
      _initCalculateToBdayProxy();
    return calculateToBday;
  }
  
  public int getDay(int year, int month, int day) throws java.rmi.RemoteException{
    if (calculateToBday == null)
      _initCalculateToBdayProxy();
    return calculateToBday.getDay(year, month, day);
  }
  
  
}