/**
 * EspeciesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.sernapesca.www.schema;

public class EspeciesType  implements java.io.Serializable {
    private cl.sernapesca.www.schema.CodigoDescripcionType especie;

    private cl.sernapesca.www.schema.CodigoDescripcionType zona;

    private double toneladas;

    public EspeciesType() {
    }

    public EspeciesType(
           cl.sernapesca.www.schema.CodigoDescripcionType especie,
           cl.sernapesca.www.schema.CodigoDescripcionType zona,
           double toneladas) {
           this.especie = especie;
           this.zona = zona;
           this.toneladas = toneladas;
    }


    /**
     * Gets the especie value for this EspeciesType.
     * 
     * @return especie
     */
    public cl.sernapesca.www.schema.CodigoDescripcionType getEspecie() {
        return especie;
    }


    /**
     * Sets the especie value for this EspeciesType.
     * 
     * @param especie
     */
    public void setEspecie(cl.sernapesca.www.schema.CodigoDescripcionType especie) {
        this.especie = especie;
    }


    /**
     * Gets the zona value for this EspeciesType.
     * 
     * @return zona
     */
    public cl.sernapesca.www.schema.CodigoDescripcionType getZona() {
        return zona;
    }


    /**
     * Sets the zona value for this EspeciesType.
     * 
     * @param zona
     */
    public void setZona(cl.sernapesca.www.schema.CodigoDescripcionType zona) {
        this.zona = zona;
    }


    /**
     * Gets the toneladas value for this EspeciesType.
     * 
     * @return toneladas
     */
    public double getToneladas() {
        return toneladas;
    }


    /**
     * Sets the toneladas value for this EspeciesType.
     * 
     * @param toneladas
     */
    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EspeciesType)) return false;
        EspeciesType other = (EspeciesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.especie==null && other.getEspecie()==null) || 
             (this.especie!=null &&
              this.especie.equals(other.getEspecie()))) &&
            ((this.zona==null && other.getZona()==null) || 
             (this.zona!=null &&
              this.zona.equals(other.getZona()))) &&
            this.toneladas == other.getToneladas();
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
        if (getEspecie() != null) {
            _hashCode += getEspecie().hashCode();
        }
        if (getZona() != null) {
            _hashCode += getZona().hashCode();
        }
        _hashCode += new Double(getToneladas()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EspeciesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "EspeciesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("especie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Especie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "CodigoDescripcionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Zona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "CodigoDescripcionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneladas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Toneladas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
