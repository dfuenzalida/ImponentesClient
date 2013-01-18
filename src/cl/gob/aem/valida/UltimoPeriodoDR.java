/**
 * UltimoPeriodoDR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class UltimoPeriodoDR  implements java.io.Serializable {
    private java.lang.String ultimoPeriodo;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public UltimoPeriodoDR() {
    }

    public UltimoPeriodoDR(
           java.lang.String ultimoPeriodo,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.ultimoPeriodo = ultimoPeriodo;
           this.signature = signature;
    }


    /**
     * Gets the ultimoPeriodo value for this UltimoPeriodoDR.
     * 
     * @return ultimoPeriodo
     */
    public java.lang.String getUltimoPeriodo() {
        return ultimoPeriodo;
    }


    /**
     * Sets the ultimoPeriodo value for this UltimoPeriodoDR.
     * 
     * @param ultimoPeriodo
     */
    public void setUltimoPeriodo(java.lang.String ultimoPeriodo) {
        this.ultimoPeriodo = ultimoPeriodo;
    }


    /**
     * Gets the signature value for this UltimoPeriodoDR.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this UltimoPeriodoDR.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UltimoPeriodoDR)) return false;
        UltimoPeriodoDR other = (UltimoPeriodoDR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ultimoPeriodo==null && other.getUltimoPeriodo()==null) || 
             (this.ultimoPeriodo!=null &&
              this.ultimoPeriodo.equals(other.getUltimoPeriodo()))) &&
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
        if (getUltimoPeriodo() != null) {
            _hashCode += getUltimoPeriodo().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UltimoPeriodoDR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">ultimoPeriodoDR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ultimoPeriodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ultimoPeriodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
