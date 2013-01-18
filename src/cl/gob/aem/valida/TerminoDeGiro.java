/**
 * TerminoDeGiro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class TerminoDeGiro  implements java.io.Serializable {
    private cl.gob.aem.valida.FechaType fechaTerminoDeGiro;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public TerminoDeGiro() {
    }

    public TerminoDeGiro(
           cl.gob.aem.valida.FechaType fechaTerminoDeGiro,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.fechaTerminoDeGiro = fechaTerminoDeGiro;
           this.signature = signature;
    }


    /**
     * Gets the fechaTerminoDeGiro value for this TerminoDeGiro.
     * 
     * @return fechaTerminoDeGiro
     */
    public cl.gob.aem.valida.FechaType getFechaTerminoDeGiro() {
        return fechaTerminoDeGiro;
    }


    /**
     * Sets the fechaTerminoDeGiro value for this TerminoDeGiro.
     * 
     * @param fechaTerminoDeGiro
     */
    public void setFechaTerminoDeGiro(cl.gob.aem.valida.FechaType fechaTerminoDeGiro) {
        this.fechaTerminoDeGiro = fechaTerminoDeGiro;
    }


    /**
     * Gets the signature value for this TerminoDeGiro.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this TerminoDeGiro.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TerminoDeGiro)) return false;
        TerminoDeGiro other = (TerminoDeGiro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaTerminoDeGiro==null && other.getFechaTerminoDeGiro()==null) || 
             (this.fechaTerminoDeGiro!=null &&
              this.fechaTerminoDeGiro.equals(other.getFechaTerminoDeGiro()))) &&
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
        if (getFechaTerminoDeGiro() != null) {
            _hashCode += getFechaTerminoDeGiro().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TerminoDeGiro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">terminoDeGiro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaTerminoDeGiro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaTerminoDeGiro"));
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
