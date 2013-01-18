/**
 * ConsultaImponentesDiprecaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ConsultaImponentesDiprecaServiceLocator extends org.apache.axis.client.Service implements cl.gob.aem.valida.ConsultaImponentesDiprecaService {

    public ConsultaImponentesDiprecaServiceLocator() {
    }


    public ConsultaImponentesDiprecaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConsultaImponentesDiprecaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConsultaImponentesDiprecaSoapPort
    private java.lang.String ConsultaImponentesDiprecaSoapPort_address = "http://localhost:8080/ImponentesService/services/ConsultaImponentesDiprecaSoapPort";

    public java.lang.String getConsultaImponentesDiprecaSoapPortAddress() {
        return ConsultaImponentesDiprecaSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConsultaImponentesDiprecaSoapPortWSDDServiceName = "ConsultaImponentesDiprecaSoapPort";

    public java.lang.String getConsultaImponentesDiprecaSoapPortWSDDServiceName() {
        return ConsultaImponentesDiprecaSoapPortWSDDServiceName;
    }

    public void setConsultaImponentesDiprecaSoapPortWSDDServiceName(java.lang.String name) {
        ConsultaImponentesDiprecaSoapPortWSDDServiceName = name;
    }

    public cl.gob.aem.valida.ConsultaImponentesDipreca getConsultaImponentesDiprecaSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConsultaImponentesDiprecaSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConsultaImponentesDiprecaSoapPort(endpoint);
    }

    public cl.gob.aem.valida.ConsultaImponentesDipreca getConsultaImponentesDiprecaSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.gob.aem.valida.ConsultaImponentesDiprecaBindingStub _stub = new cl.gob.aem.valida.ConsultaImponentesDiprecaBindingStub(portAddress, this);
            _stub.setPortName(getConsultaImponentesDiprecaSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConsultaImponentesDiprecaSoapPortEndpointAddress(java.lang.String address) {
        ConsultaImponentesDiprecaSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.gob.aem.valida.ConsultaImponentesDipreca.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.gob.aem.valida.ConsultaImponentesDiprecaBindingStub _stub = new cl.gob.aem.valida.ConsultaImponentesDiprecaBindingStub(new java.net.URL(ConsultaImponentesDiprecaSoapPort_address), this);
                _stub.setPortName(getConsultaImponentesDiprecaSoapPortWSDDServiceName());
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
        if ("ConsultaImponentesDiprecaSoapPort".equals(inputPortName)) {
            return getConsultaImponentesDiprecaSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ConsultaImponentesDiprecaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ConsultaImponentesDiprecaSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConsultaImponentesDiprecaSoapPort".equals(portName)) {
            setConsultaImponentesDiprecaSoapPortEndpointAddress(address);
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
