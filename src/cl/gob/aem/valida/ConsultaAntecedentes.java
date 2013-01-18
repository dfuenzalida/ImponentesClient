/**
 * ConsultaAntecedentes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ConsultaAntecedentes  implements java.io.Serializable {
    private cl.gob.aem.valida.EstadoGlosaType estadoGlosa;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public ConsultaAntecedentes() {
    }

    public ConsultaAntecedentes(
           cl.gob.aem.valida.EstadoGlosaType estadoGlosa,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.estadoGlosa = estadoGlosa;
           this.signature = signature;
    }


    /**
     * Gets the estadoGlosa value for this ConsultaAntecedentes.
     * 
     * @return estadoGlosa
     */
    public cl.gob.aem.valida.EstadoGlosaType getEstadoGlosa() {
        return estadoGlosa;
    }


    /**
     * Sets the estadoGlosa value for this ConsultaAntecedentes.
     * 
     * @param estadoGlosa
     */
    public void setEstadoGlosa(cl.gob.aem.valida.EstadoGlosaType estadoGlosa) {
        this.estadoGlosa = estadoGlosa;
    }


    /**
     * Gets the signature value for this ConsultaAntecedentes.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ConsultaAntecedentes.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaAntecedentes)) return false;
        ConsultaAntecedentes other = (ConsultaAntecedentes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estadoGlosa==null && other.getEstadoGlosa()==null) || 
             (this.estadoGlosa!=null &&
              this.estadoGlosa.equals(other.getEstadoGlosa()))) &&
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
        if (getEstadoGlosa() != null) {
            _hashCode += getEstadoGlosa().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaAntecedentes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">consultaAntecedentes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoGlosa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "estadoGlosa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "estadoGlosaType"));
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
