/**
 * BitacoraEncabezadoRegion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class BitacoraEncabezadoRegion  implements java.io.Serializable {
    /* Nombre de la Region */
    private cl.gob.aem.valida.RegionesValores descripcionRegion;

    public BitacoraEncabezadoRegion() {
    }

    public BitacoraEncabezadoRegion(
           cl.gob.aem.valida.RegionesValores descripcionRegion) {
           this.descripcionRegion = descripcionRegion;
    }


    /**
     * Gets the descripcionRegion value for this BitacoraEncabezadoRegion.
     * 
     * @return descripcionRegion   * Nombre de la Region
     */
    public cl.gob.aem.valida.RegionesValores getDescripcionRegion() {
        return descripcionRegion;
    }


    /**
     * Sets the descripcionRegion value for this BitacoraEncabezadoRegion.
     * 
     * @param descripcionRegion   * Nombre de la Region
     */
    public void setDescripcionRegion(cl.gob.aem.valida.RegionesValores descripcionRegion) {
        this.descripcionRegion = descripcionRegion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BitacoraEncabezadoRegion)) return false;
        BitacoraEncabezadoRegion other = (BitacoraEncabezadoRegion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descripcionRegion==null && other.getDescripcionRegion()==null) || 
             (this.descripcionRegion!=null &&
              this.descripcionRegion.equals(other.getDescripcionRegion())));
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
        if (getDescripcionRegion() != null) {
            _hashCode += getDescripcionRegion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BitacoraEncabezadoRegion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>Bitacora>Encabezado>Region"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DescripcionRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "regionesValores"));
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
