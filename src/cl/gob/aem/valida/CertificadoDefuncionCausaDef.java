/**
 * CertificadoDefuncionCausaDef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoDefuncionCausaDef  implements java.io.Serializable {
    private java.lang.String tipoCausaDef;  // attribute

    public CertificadoDefuncionCausaDef() {
    }

    public CertificadoDefuncionCausaDef(
           java.lang.String tipoCausaDef) {
           this.tipoCausaDef = tipoCausaDef;
    }


    /**
     * Gets the tipoCausaDef value for this CertificadoDefuncionCausaDef.
     * 
     * @return tipoCausaDef
     */
    public java.lang.String getTipoCausaDef() {
        return tipoCausaDef;
    }


    /**
     * Sets the tipoCausaDef value for this CertificadoDefuncionCausaDef.
     * 
     * @param tipoCausaDef
     */
    public void setTipoCausaDef(java.lang.String tipoCausaDef) {
        this.tipoCausaDef = tipoCausaDef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoDefuncionCausaDef)) return false;
        CertificadoDefuncionCausaDef other = (CertificadoDefuncionCausaDef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoCausaDef==null && other.getTipoCausaDef()==null) || 
             (this.tipoCausaDef!=null &&
              this.tipoCausaDef.equals(other.getTipoCausaDef())));
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
        if (getTipoCausaDef() != null) {
            _hashCode += getTipoCausaDef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoDefuncionCausaDef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>certificadoDefuncion>causaDef"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tipoCausaDef");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tipoCausaDef"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
