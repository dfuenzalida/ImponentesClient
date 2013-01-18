/**
 * DomicilioTypeComuna.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class DomicilioTypeComuna  implements java.io.Serializable {
    private cl.gob.aem.valida.CodigoComunaValores codigoComuna;

    private cl.gob.aem.valida.ComunasValores descripcionComuna;

    private cl.gob.aem.valida.ComunasValores descripcionComuna2;

    public DomicilioTypeComuna() {
    }

    public DomicilioTypeComuna(
           cl.gob.aem.valida.CodigoComunaValores codigoComuna,
           cl.gob.aem.valida.ComunasValores descripcionComuna,
           cl.gob.aem.valida.ComunasValores descripcionComuna2) {
           this.codigoComuna = codigoComuna;
           this.descripcionComuna = descripcionComuna;
           this.descripcionComuna2 = descripcionComuna2;
    }


    /**
     * Gets the codigoComuna value for this DomicilioTypeComuna.
     * 
     * @return codigoComuna
     */
    public cl.gob.aem.valida.CodigoComunaValores getCodigoComuna() {
        return codigoComuna;
    }


    /**
     * Sets the codigoComuna value for this DomicilioTypeComuna.
     * 
     * @param codigoComuna
     */
    public void setCodigoComuna(cl.gob.aem.valida.CodigoComunaValores codigoComuna) {
        this.codigoComuna = codigoComuna;
    }


    /**
     * Gets the descripcionComuna value for this DomicilioTypeComuna.
     * 
     * @return descripcionComuna
     */
    public cl.gob.aem.valida.ComunasValores getDescripcionComuna() {
        return descripcionComuna;
    }


    /**
     * Sets the descripcionComuna value for this DomicilioTypeComuna.
     * 
     * @param descripcionComuna
     */
    public void setDescripcionComuna(cl.gob.aem.valida.ComunasValores descripcionComuna) {
        this.descripcionComuna = descripcionComuna;
    }


    /**
     * Gets the descripcionComuna2 value for this DomicilioTypeComuna.
     * 
     * @return descripcionComuna2
     */
    public cl.gob.aem.valida.ComunasValores getDescripcionComuna2() {
        return descripcionComuna2;
    }


    /**
     * Sets the descripcionComuna2 value for this DomicilioTypeComuna.
     * 
     * @param descripcionComuna2
     */
    public void setDescripcionComuna2(cl.gob.aem.valida.ComunasValores descripcionComuna2) {
        this.descripcionComuna2 = descripcionComuna2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomicilioTypeComuna)) return false;
        DomicilioTypeComuna other = (DomicilioTypeComuna) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoComuna==null && other.getCodigoComuna()==null) || 
             (this.codigoComuna!=null &&
              this.codigoComuna.equals(other.getCodigoComuna()))) &&
            ((this.descripcionComuna==null && other.getDescripcionComuna()==null) || 
             (this.descripcionComuna!=null &&
              this.descripcionComuna.equals(other.getDescripcionComuna()))) &&
            ((this.descripcionComuna2==null && other.getDescripcionComuna2()==null) || 
             (this.descripcionComuna2!=null &&
              this.descripcionComuna2.equals(other.getDescripcionComuna2())));
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
        if (getCodigoComuna() != null) {
            _hashCode += getCodigoComuna().hashCode();
        }
        if (getDescripcionComuna() != null) {
            _hashCode += getDescripcionComuna().hashCode();
        }
        if (getDescripcionComuna2() != null) {
            _hashCode += getDescripcionComuna2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomicilioTypeComuna.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">DomicilioType>Comuna"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoComuna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoComuna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "codigoComunaValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionComuna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DescripcionComuna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "comunasValores"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionComuna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DescripcionComuna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "comunasValores"));
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
