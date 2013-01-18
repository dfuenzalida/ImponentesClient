/**
 * TipoEntrada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.dipreca.servicios.ipsV01;

public class TipoEntrada  implements java.io.Serializable {
    /* Rut enviado por IPS */
    private cl.gob.aem.valida.RunType rutIPS;

    /* Password para IPS */
    private java.lang.String passIPS;

    /* Run del Imponente a Consultar */
    private cl.gob.aem.valida.RunType rutImponente;

    public TipoEntrada() {
    }

    public TipoEntrada(
           cl.gob.aem.valida.RunType rutIPS,
           java.lang.String passIPS,
           cl.gob.aem.valida.RunType rutImponente) {
           this.rutIPS = rutIPS;
           this.passIPS = passIPS;
           this.rutImponente = rutImponente;
    }


    /**
     * Gets the rutIPS value for this TipoEntrada.
     * 
     * @return rutIPS   * Rut enviado por IPS
     */
    public cl.gob.aem.valida.RunType getRutIPS() {
        return rutIPS;
    }


    /**
     * Sets the rutIPS value for this TipoEntrada.
     * 
     * @param rutIPS   * Rut enviado por IPS
     */
    public void setRutIPS(cl.gob.aem.valida.RunType rutIPS) {
        this.rutIPS = rutIPS;
    }


    /**
     * Gets the passIPS value for this TipoEntrada.
     * 
     * @return passIPS   * Password para IPS
     */
    public java.lang.String getPassIPS() {
        return passIPS;
    }


    /**
     * Sets the passIPS value for this TipoEntrada.
     * 
     * @param passIPS   * Password para IPS
     */
    public void setPassIPS(java.lang.String passIPS) {
        this.passIPS = passIPS;
    }


    /**
     * Gets the rutImponente value for this TipoEntrada.
     * 
     * @return rutImponente   * Run del Imponente a Consultar
     */
    public cl.gob.aem.valida.RunType getRutImponente() {
        return rutImponente;
    }


    /**
     * Sets the rutImponente value for this TipoEntrada.
     * 
     * @param rutImponente   * Run del Imponente a Consultar
     */
    public void setRutImponente(cl.gob.aem.valida.RunType rutImponente) {
        this.rutImponente = rutImponente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoEntrada)) return false;
        TipoEntrada other = (TipoEntrada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rutIPS==null && other.getRutIPS()==null) || 
             (this.rutIPS!=null &&
              this.rutIPS.equals(other.getRutIPS()))) &&
            ((this.passIPS==null && other.getPassIPS()==null) || 
             (this.passIPS!=null &&
              this.passIPS.equals(other.getPassIPS()))) &&
            ((this.rutImponente==null && other.getRutImponente()==null) || 
             (this.rutImponente!=null &&
              this.rutImponente.equals(other.getRutImponente())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRutIPS() != null) {
            _hashCode += getRutIPS().hashCode();
        }
        if (getPassIPS() != null) {
            _hashCode += getPassIPS().hashCode();
        }
        if (getRutImponente() != null) {
            _hashCode += getRutImponente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoEntrada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "TipoEntrada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutIPS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "RutIPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passIPS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "PassIPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutImponente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "RutImponente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
