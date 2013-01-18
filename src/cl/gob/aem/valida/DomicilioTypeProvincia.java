/**
 * DomicilioTypeProvincia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class DomicilioTypeProvincia  implements java.io.Serializable {
    private cl.gob.aem.valida.CodigoProvinciaValores codigoProvincia;

    private cl.gob.aem.valida.ProvinciasValores descripcionProvincia;

    private cl.gob.aem.valida.ProvinciasValores descripcionProvincia2;

    public DomicilioTypeProvincia() {
    }

    public DomicilioTypeProvincia(
           cl.gob.aem.valida.CodigoProvinciaValores codigoProvincia,
           cl.gob.aem.valida.ProvinciasValores descripcionProvincia,
           cl.gob.aem.valida.ProvinciasValores descripcionProvincia2) {
           this.codigoProvincia = codigoProvincia;
           this.descripcionProvincia = descripcionProvincia;
           this.descripcionProvincia2 = descripcionProvincia2;
    }


    /**
     * Gets the codigoProvincia value for this DomicilioTypeProvincia.
     * 
     * @return codigoProvincia
     */
    public cl.gob.aem.valida.CodigoProvinciaValores getCodigoProvincia() {
        return codigoProvincia;
    }


    /**
     * Sets the codigoProvincia value for this DomicilioTypeProvincia.
     * 
     * @param codigoProvincia
     */
    public void setCodigoProvincia(cl.gob.aem.valida.CodigoProvinciaValores codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }


    /**
     * Gets the descripcionProvincia value for this DomicilioTypeProvincia.
     * 
     * @return descripcionProvincia
     */
    public cl.gob.aem.valida.ProvinciasValores getDescripcionProvincia() {
        return descripcionProvincia;
    }


    /**
     * Sets the descripcionProvincia value for this DomicilioTypeProvincia.
     * 
     * @param descripcionProvincia
     */
    public void setDescripcionProvincia(cl.gob.aem.valida.ProvinciasValores descripcionProvincia) {
        this.descripcionProvincia = descripcionProvincia;
    }


    /**
     * Gets the descripcionProvincia2 value for this DomicilioTypeProvincia.
     * 
     * @return descripcionProvincia2
     */
    public cl.gob.aem.valida.ProvinciasValores getDescripcionProvincia2() {
        return descripcionProvincia2;
    }


    /**
     * Sets the descripcionProvincia2 value for this DomicilioTypeProvincia.
     * 
     * @param descripcionProvincia2
     */
    public void setDescripcionProvincia2(cl.gob.aem.valida.ProvinciasValores descripcionProvincia2) {
        this.descripcionProvincia2 = descripcionProvincia2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomicilioTypeProvincia)) return false;
        DomicilioTypeProvincia other = (DomicilioTypeProvincia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoProvincia==null && other.getCodigoProvincia()==null) || 
             (this.codigoProvincia!=null &&
              this.codigoProvincia.equals(other.getCodigoProvincia()))) &&
            ((this.descripcionProvincia==null && other.getDescripcionProvincia()==null) || 
             (this.descripcionProvincia!=null &&
              this.descripcionProvincia.equals(other.getDescripcionProvincia()))) &&
            ((this.descripcionProvincia2==null && other.getDescripcionProvincia2()==null) || 
             (this.descripcionProvincia2!=null &&
              this.descripcionProvincia2.equals(other.getDescripcionProvincia2())));
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
        if (getCodigoProvincia() != null) {
            _hashCode += getCodigoProvincia().hashCode();
        }
        if (getDescripcionProvincia() != null) {
            _hashCode += getDescripcionProvincia().hashCode();
        }
        if (getDescripcionProvincia2() != null) {
            _hashCode += getDescripcionProvincia2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomicilioTypeProvincia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">DomicilioType>Provincia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "codigoProvinciaValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DescripcionProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "provinciasValores"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DescripcionProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "provinciasValores"));
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
