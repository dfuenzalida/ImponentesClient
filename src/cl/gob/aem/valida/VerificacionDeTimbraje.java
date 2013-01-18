/**
 * VerificacionDeTimbraje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class VerificacionDeTimbraje  implements java.io.Serializable {
    private cl.gob.aem.valida.FechaType fechaLegalizacion;

    private java.lang.String reportado;

    private cl.gob.aem.valida.FechaType fechaAnulacion;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public VerificacionDeTimbraje() {
    }

    public VerificacionDeTimbraje(
           cl.gob.aem.valida.FechaType fechaLegalizacion,
           java.lang.String reportado,
           cl.gob.aem.valida.FechaType fechaAnulacion,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.fechaLegalizacion = fechaLegalizacion;
           this.reportado = reportado;
           this.fechaAnulacion = fechaAnulacion;
           this.signature = signature;
    }


    /**
     * Gets the fechaLegalizacion value for this VerificacionDeTimbraje.
     * 
     * @return fechaLegalizacion
     */
    public cl.gob.aem.valida.FechaType getFechaLegalizacion() {
        return fechaLegalizacion;
    }


    /**
     * Sets the fechaLegalizacion value for this VerificacionDeTimbraje.
     * 
     * @param fechaLegalizacion
     */
    public void setFechaLegalizacion(cl.gob.aem.valida.FechaType fechaLegalizacion) {
        this.fechaLegalizacion = fechaLegalizacion;
    }


    /**
     * Gets the reportado value for this VerificacionDeTimbraje.
     * 
     * @return reportado
     */
    public java.lang.String getReportado() {
        return reportado;
    }


    /**
     * Sets the reportado value for this VerificacionDeTimbraje.
     * 
     * @param reportado
     */
    public void setReportado(java.lang.String reportado) {
        this.reportado = reportado;
    }


    /**
     * Gets the fechaAnulacion value for this VerificacionDeTimbraje.
     * 
     * @return fechaAnulacion
     */
    public cl.gob.aem.valida.FechaType getFechaAnulacion() {
        return fechaAnulacion;
    }


    /**
     * Sets the fechaAnulacion value for this VerificacionDeTimbraje.
     * 
     * @param fechaAnulacion
     */
    public void setFechaAnulacion(cl.gob.aem.valida.FechaType fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }


    /**
     * Gets the signature value for this VerificacionDeTimbraje.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this VerificacionDeTimbraje.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerificacionDeTimbraje)) return false;
        VerificacionDeTimbraje other = (VerificacionDeTimbraje) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaLegalizacion==null && other.getFechaLegalizacion()==null) || 
             (this.fechaLegalizacion!=null &&
              this.fechaLegalizacion.equals(other.getFechaLegalizacion()))) &&
            ((this.reportado==null && other.getReportado()==null) || 
             (this.reportado!=null &&
              this.reportado.equals(other.getReportado()))) &&
            ((this.fechaAnulacion==null && other.getFechaAnulacion()==null) || 
             (this.fechaAnulacion!=null &&
              this.fechaAnulacion.equals(other.getFechaAnulacion()))) &&
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
        if (getFechaLegalizacion() != null) {
            _hashCode += getFechaLegalizacion().hashCode();
        }
        if (getReportado() != null) {
            _hashCode += getReportado().hashCode();
        }
        if (getFechaAnulacion() != null) {
            _hashCode += getFechaAnulacion().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerificacionDeTimbraje.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">verificacionDeTimbraje"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaLegalizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaLegalizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "reportado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAnulacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaAnulacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
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
