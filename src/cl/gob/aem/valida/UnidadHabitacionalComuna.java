/**
 * UnidadHabitacionalComuna.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class UnidadHabitacionalComuna  implements java.io.Serializable {
    private java.lang.String habitacional;

    private java.lang.String comuna;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public UnidadHabitacionalComuna() {
    }

    public UnidadHabitacionalComuna(
           java.lang.String habitacional,
           java.lang.String comuna,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.habitacional = habitacional;
           this.comuna = comuna;
           this.signature = signature;
    }


    /**
     * Gets the habitacional value for this UnidadHabitacionalComuna.
     * 
     * @return habitacional
     */
    public java.lang.String getHabitacional() {
        return habitacional;
    }


    /**
     * Sets the habitacional value for this UnidadHabitacionalComuna.
     * 
     * @param habitacional
     */
    public void setHabitacional(java.lang.String habitacional) {
        this.habitacional = habitacional;
    }


    /**
     * Gets the comuna value for this UnidadHabitacionalComuna.
     * 
     * @return comuna
     */
    public java.lang.String getComuna() {
        return comuna;
    }


    /**
     * Sets the comuna value for this UnidadHabitacionalComuna.
     * 
     * @param comuna
     */
    public void setComuna(java.lang.String comuna) {
        this.comuna = comuna;
    }


    /**
     * Gets the signature value for this UnidadHabitacionalComuna.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this UnidadHabitacionalComuna.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnidadHabitacionalComuna)) return false;
        UnidadHabitacionalComuna other = (UnidadHabitacionalComuna) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.habitacional==null && other.getHabitacional()==null) || 
             (this.habitacional!=null &&
              this.habitacional.equals(other.getHabitacional()))) &&
            ((this.comuna==null && other.getComuna()==null) || 
             (this.comuna!=null &&
              this.comuna.equals(other.getComuna()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature())));
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
        if (getHabitacional() != null) {
            _hashCode += getHabitacional().hashCode();
        }
        if (getComuna() != null) {
            _hashCode += getComuna().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnidadHabitacionalComuna.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">unidadHabitacionalComuna"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("habitacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "habitacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comuna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "comuna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
