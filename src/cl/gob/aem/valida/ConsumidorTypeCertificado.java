/**
 * ConsumidorTypeCertificado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ConsumidorTypeCertificado  implements java.io.Serializable {
    private org.w3.www._2000._09.xmldsig.X509DataType x509Data;

    public ConsumidorTypeCertificado() {
    }

    public ConsumidorTypeCertificado(
           org.w3.www._2000._09.xmldsig.X509DataType x509Data) {
           this.x509Data = x509Data;
    }


    /**
     * Gets the x509Data value for this ConsumidorTypeCertificado.
     * 
     * @return x509Data
     */
    public org.w3.www._2000._09.xmldsig.X509DataType getX509Data() {
        return x509Data;
    }


    /**
     * Sets the x509Data value for this ConsumidorTypeCertificado.
     * 
     * @param x509Data
     */
    public void setX509Data(org.w3.www._2000._09.xmldsig.X509DataType x509Data) {
        this.x509Data = x509Data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsumidorTypeCertificado)) return false;
        ConsumidorTypeCertificado other = (ConsumidorTypeCertificado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.x509Data==null && other.getX509Data()==null) || 
             (this.x509Data!=null &&
              this.x509Data.equals(other.getX509Data())));
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
        if (getX509Data() != null) {
            _hashCode += getX509Data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsumidorTypeCertificado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">consumidorType>certificado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x509Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "X509Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "X509DataType"));
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
