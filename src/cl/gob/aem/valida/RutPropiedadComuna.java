/**
 * RutPropiedadComuna.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class RutPropiedadComuna  implements java.io.Serializable {
    private cl.gob.aem.valida.RutPropiedadComunaPropiedad[] propiedad;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    private org.apache.axis.types.NonNegativeInteger registrosTotales;  // attribute

    public RutPropiedadComuna() {
    }

    public RutPropiedadComuna(
           cl.gob.aem.valida.RutPropiedadComunaPropiedad[] propiedad,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           org.apache.axis.types.NonNegativeInteger registrosTotales) {
           this.propiedad = propiedad;
           this.signature = signature;
           this.registrosTotales = registrosTotales;
    }


    /**
     * Gets the propiedad value for this RutPropiedadComuna.
     * 
     * @return propiedad
     */
    public cl.gob.aem.valida.RutPropiedadComunaPropiedad[] getPropiedad() {
        return propiedad;
    }


    /**
     * Sets the propiedad value for this RutPropiedadComuna.
     * 
     * @param propiedad
     */
    public void setPropiedad(cl.gob.aem.valida.RutPropiedadComunaPropiedad[] propiedad) {
        this.propiedad = propiedad;
    }

    public cl.gob.aem.valida.RutPropiedadComunaPropiedad getPropiedad(int i) {
        return this.propiedad[i];
    }

    public void setPropiedad(int i, cl.gob.aem.valida.RutPropiedadComunaPropiedad _value) {
        this.propiedad[i] = _value;
    }


    /**
     * Gets the signature value for this RutPropiedadComuna.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this RutPropiedadComuna.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }


    /**
     * Gets the registrosTotales value for this RutPropiedadComuna.
     * 
     * @return registrosTotales
     */
    public org.apache.axis.types.NonNegativeInteger getRegistrosTotales() {
        return registrosTotales;
    }


    /**
     * Sets the registrosTotales value for this RutPropiedadComuna.
     * 
     * @param registrosTotales
     */
    public void setRegistrosTotales(org.apache.axis.types.NonNegativeInteger registrosTotales) {
        this.registrosTotales = registrosTotales;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RutPropiedadComuna)) return false;
        RutPropiedadComuna other = (RutPropiedadComuna) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propiedad==null && other.getPropiedad()==null) || 
             (this.propiedad!=null &&
              java.util.Arrays.equals(this.propiedad, other.getPropiedad()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.registrosTotales==null && other.getRegistrosTotales()==null) || 
             (this.registrosTotales!=null &&
              this.registrosTotales.equals(other.getRegistrosTotales())));
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
        if (getPropiedad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropiedad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropiedad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getRegistrosTotales() != null) {
            _hashCode += getRegistrosTotales().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RutPropiedadComuna.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">rutPropiedadComuna"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("registrosTotales");
        attrField.setXmlName(new javax.xml.namespace.QName("", "registrosTotales"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propiedad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "propiedad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>rutPropiedadComuna>propiedad"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
