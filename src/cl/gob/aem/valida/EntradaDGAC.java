/**
 * EntradaDGAC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class EntradaDGAC  implements java.io.Serializable {
    /* Codigo OACI del aeropuerto / aerodromo a consultar */
    private java.lang.String codigoOACI;

    /* Fecha de inicio para la consulta de las operaciones aeronauticas */
    private java.util.Date fechaInicio;

    /* Fecha final para la consulta de las operaciones aeronauticas */
    private java.util.Date fechaFin;

    /* Firma electronica del mensaje */
    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public EntradaDGAC() {
    }

    public EntradaDGAC(
           java.lang.String codigoOACI,
           java.util.Date fechaInicio,
           java.util.Date fechaFin,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.codigoOACI = codigoOACI;
           this.fechaInicio = fechaInicio;
           this.fechaFin = fechaFin;
           this.signature = signature;
    }


    /**
     * Gets the codigoOACI value for this EntradaDGAC.
     * 
     * @return codigoOACI   * Codigo OACI del aeropuerto / aerodromo a consultar
     */
    public java.lang.String getCodigoOACI() {
        return codigoOACI;
    }


    /**
     * Sets the codigoOACI value for this EntradaDGAC.
     * 
     * @param codigoOACI   * Codigo OACI del aeropuerto / aerodromo a consultar
     */
    public void setCodigoOACI(java.lang.String codigoOACI) {
        this.codigoOACI = codigoOACI;
    }


    /**
     * Gets the fechaInicio value for this EntradaDGAC.
     * 
     * @return fechaInicio   * Fecha de inicio para la consulta de las operaciones aeronauticas
     */
    public java.util.Date getFechaInicio() {
        return fechaInicio;
    }


    /**
     * Sets the fechaInicio value for this EntradaDGAC.
     * 
     * @param fechaInicio   * Fecha de inicio para la consulta de las operaciones aeronauticas
     */
    public void setFechaInicio(java.util.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    /**
     * Gets the fechaFin value for this EntradaDGAC.
     * 
     * @return fechaFin   * Fecha final para la consulta de las operaciones aeronauticas
     */
    public java.util.Date getFechaFin() {
        return fechaFin;
    }


    /**
     * Sets the fechaFin value for this EntradaDGAC.
     * 
     * @param fechaFin   * Fecha final para la consulta de las operaciones aeronauticas
     */
    public void setFechaFin(java.util.Date fechaFin) {
        this.fechaFin = fechaFin;
    }


    /**
     * Gets the signature value for this EntradaDGAC.
     * 
     * @return signature   * Firma electronica del mensaje
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this EntradaDGAC.
     * 
     * @param signature   * Firma electronica del mensaje
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntradaDGAC)) return false;
        EntradaDGAC other = (EntradaDGAC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoOACI==null && other.getCodigoOACI()==null) || 
             (this.codigoOACI!=null &&
              this.codigoOACI.equals(other.getCodigoOACI()))) &&
            ((this.fechaInicio==null && other.getFechaInicio()==null) || 
             (this.fechaInicio!=null &&
              this.fechaInicio.equals(other.getFechaInicio()))) &&
            ((this.fechaFin==null && other.getFechaFin()==null) || 
             (this.fechaFin!=null &&
              this.fechaFin.equals(other.getFechaFin()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature())));
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
        if (getCodigoOACI() != null) {
            _hashCode += getCodigoOACI().hashCode();
        }
        if (getFechaInicio() != null) {
            _hashCode += getFechaInicio().hashCode();
        }
        if (getFechaFin() != null) {
            _hashCode += getFechaFin().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntradaDGAC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">EntradaDGAC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOACI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoOACI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureType"));
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
