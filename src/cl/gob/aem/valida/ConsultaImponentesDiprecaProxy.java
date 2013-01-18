package cl.gob.aem.valida;

public class ConsultaImponentesDiprecaProxy implements cl.gob.aem.valida.ConsultaImponentesDipreca {
  private String _endpoint = null;
  private cl.gob.aem.valida.ConsultaImponentesDipreca consultaImponentesDipreca = null;
  
  public ConsultaImponentesDiprecaProxy() {
    _initConsultaImponentesDiprecaProxy();
  }
  
  public ConsultaImponentesDiprecaProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsultaImponentesDiprecaProxy();
  }
  
  private void _initConsultaImponentesDiprecaProxy() {
    try {
      consultaImponentesDipreca = (new cl.gob.aem.valida.ConsultaImponentesDiprecaServiceLocator()).getConsultaImponentesDiprecaSoapPort();
      if (consultaImponentesDipreca != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consultaImponentesDipreca)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consultaImponentesDipreca)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consultaImponentesDipreca != null)
      ((javax.xml.rpc.Stub)consultaImponentesDipreca)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.gob.aem.valida.ConsultaImponentesDipreca getConsultaImponentesDipreca() {
    if (consultaImponentesDipreca == null)
      _initConsultaImponentesDiprecaProxy();
    return consultaImponentesDipreca;
  }
  
  public cl.gob.aem.valida.Sobre consultaImponentesDipreca(cl.gob.aem.valida.Sobre request) throws java.rmi.RemoteException{
    if (consultaImponentesDipreca == null)
      _initConsultaImponentesDiprecaProxy();
    return consultaImponentesDipreca.consultaImponentesDipreca(request);
  }
  
  
}