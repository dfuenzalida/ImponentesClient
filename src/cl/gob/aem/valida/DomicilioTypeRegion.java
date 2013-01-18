/**
 * DomicilioTypeRegion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class DomicilioTypeRegion  implements java.io.Serializable {
    private cl.gob.aem.valida.CodigoRegionValores codigoRegion;

    private cl.gob.aem.valida.RegionesValores descripcionRegion;

    private cl.gob.aem.valida.RegionesValores descripcionRegion2;

    public DomicilioTypeRegion() {
    }

    public DomicilioTypeRegion(
           cl.gob.aem.valida.CodigoRegionValores codigoRegion,
           cl.gob.aem.valida.RegionesValores descripcionRegion,
           cl.gob.aem.valida.RegionesValores descripcionRegion2) {
           this.codigoRegion = codigoRegion;
           this.descripcionRegion = descripcionRegion;
           this.descripcionRegion2 = descripcionRegion2;
    }


    /**
     * Gets the codigoRegion value for this DomicilioTypeRegion.
     * 
     * @return codigoRegion
     */
    public cl.gob.aem.valida.CodigoRegionValores getCodigoRegion() {
        return codigoRegion;
    }


    /**
     * Sets the codigoRegion value for this DomicilioTypeRegion.
     * 
     * @param codigoRegion
     */
    public void setCodigoRegion(cl.gob.aem.valida.CodigoRegionValores codigoRegion) {
        this.codigoRegion = codigoRegion;
    }


    /**
     * Gets the descripcionRegion value for this DomicilioTypeRegion.
     * 
     * @return descripcionRegion
     */
    public cl.gob.aem.valida.RegionesValores getDescripcionRegion() {
        return descripcionRegion;
    }


    /**
     * Sets the descripcionRegion value for this DomicilioTypeRegion.
     * 
     * @param descripcionRegion
     */
    public void setDescripcionRegion(cl.gob.aem.valida.RegionesValores descripcionRegion) {
        this.descripcionRegion = descripcionRegion;
    }


    /**
     * Gets the descripcionRegion2 value for this DomicilioTypeRegion.
     * 
     * @return descripcionRegion2
     */
    public cl.gob.aem.valida.RegionesValores getDescripcionRegion2() {
        return descripcionRegion2;
    }


    /**
     * Sets the descripcionRegion2 value for this DomicilioTypeRegion.
     * 
     * @param descripcionRegion2
     */
    public void setDescripcionRegion2(cl.gob.aem.valida.RegionesValores descripcionRegion2) {
        this.descripcionRegion2 = descripcionRegion2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomicilioTypeRegion)) return false;
        DomicilioTypeRegion other = (DomicilioTypeRegion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoRegion==null && other.getCodigoRegion()==null) || 
             (this.codigoRegion!=null &&
              this.codigoRegion.equals(other.getCodigoRegion()))) &&
            ((this.descripcionRegion==null && other.getDescripcionRegion()==null) || 
             (this.descripcionRegion!=null &&
              this.descripcionRegion.equals(other.getDescripcionRegion()))) &&
            ((this.descripcionRegion2==null && other.getDescripcionRegion2()==null) || 
             (this.descripcionRegion2!=null &&
              this.descripcionRegion2.equals(other.getDescripcionRegion2())));
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
        if (getCodigoRegion() != null) {
            _hashCode += getCodigoRegion().hashCode();
        }
        if (getDescripcionRegion() != null) {
            _hashCode += getDescripcionRegion().hashCode();
        }
        if (getDescripcionRegion2() != null) {
            _hashCode += getDescripcionRegion2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomicilioTypeRegion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">DomicilioType>Region"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "codigoRegionValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DescripcionRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "regionesValores"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
