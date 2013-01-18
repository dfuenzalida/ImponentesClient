/**
 * EstadoGlosaSobreType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class EstadoGlosaSobreType  implements java.io.Serializable {
    private cl.gob.aem.valida.EstadoSobreType estadoSobre;

    private java.lang.String glosaSobre;

    public EstadoGlosaSobreType() {
    }

    public EstadoGlosaSobreType(
           cl.gob.aem.valida.EstadoSobreType estadoSobre,
           java.lang.String glosaSobre) {
           this.estadoSobre = estadoSobre;
           this.glosaSobre = glosaSobre;
    }


    /**
     * Gets the estadoSobre value for this EstadoGlosaSobreType.
     * 
     * @return estadoSobre
     */
    public cl.gob.aem.valida.EstadoSobreType getEstadoSobre() {
        return estadoSobre;
    }


    /**
     * Sets the estadoSobre value for this EstadoGlosaSobreType.
     * 
     * @param estadoSobre
     */
    public void setEstadoSobre(cl.gob.aem.valida.EstadoSobreType estadoSobre) {
        this.estadoSobre = estadoSobre;
    }


    /**
     * Gets the glosaSobre value for this EstadoGlosaSobreType.
     * 
     * @return glosaSobre
     */
    public java.lang.String getGlosaSobre() {
        return glosaSobre;
    }


    /**
     * Sets the glosaSobre value for this EstadoGlosaSobreType.
     * 
     * @param glosaSobre
     */
    public void setGlosaSobre(java.lang.String glosaSobre) {
        this.glosaSobre = glosaSobre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstadoGlosaSobreType)) return false;
        EstadoGlosaSobreType other = (EstadoGlosaSobreType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estadoSobre==null && other.getEstadoSobre()==null) || 
             (this.estadoSobre!=null &&
              this.estadoSobre.equals(other.getEstadoSobre()))) &&
            ((this.glosaSobre==null && other.getGlosaSobre()==null) || 
             (this.glosaSobre!=null &&
              this.glosaSobre.equals(other.getGlosaSobre())));
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
        if (getEstadoSobre() != null) {
            _hashCode += getEstadoSobre().hashCode();
        }
        if (getGlosaSobre() != null) {
            _hashCode += getGlosaSobre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EstadoGlosaSobreType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "estadoGlosaSobreType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoSobre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "estadoSobre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "estadoSobreType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glosaSobre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "glosaSobre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
