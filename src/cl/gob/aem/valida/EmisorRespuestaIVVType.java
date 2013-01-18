/**
 * EmisorRespuestaIVVType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class EmisorRespuestaIVVType  implements java.io.Serializable {
    private cl.gob.aem.valida.EmisorRespuestaIVVTypeEmisor emisor;

    public EmisorRespuestaIVVType() {
    }

    public EmisorRespuestaIVVType(
           cl.gob.aem.valida.EmisorRespuestaIVVTypeEmisor emisor) {
           this.emisor = emisor;
    }


    /**
     * Gets the emisor value for this EmisorRespuestaIVVType.
     * 
     * @return emisor
     */
    public cl.gob.aem.valida.EmisorRespuestaIVVTypeEmisor getEmisor() {
        return emisor;
    }


    /**
     * Sets the emisor value for this EmisorRespuestaIVVType.
     * 
     * @param emisor
     */
    public void setEmisor(cl.gob.aem.valida.EmisorRespuestaIVVTypeEmisor emisor) {
        this.emisor = emisor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmisorRespuestaIVVType)) return false;
        EmisorRespuestaIVVType other = (EmisorRespuestaIVVType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emisor==null && other.getEmisor()==null) || 
             (this.emisor!=null &&
              this.emisor.equals(other.getEmisor())));
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
        if (getEmisor() != null) {
            _hashCode += getEmisor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmisorRespuestaIVVType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "EmisorRespuestaIVVType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Emisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">EmisorRespuestaIVVType>Emisor"));
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
