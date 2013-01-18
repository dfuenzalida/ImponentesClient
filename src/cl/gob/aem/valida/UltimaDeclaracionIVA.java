/**
 * UltimaDeclaracionIVA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class UltimaDeclaracionIVA  implements java.io.Serializable {
    private java.lang.String ultimoPeriodoDeclaracionIVA;

    private cl.gob.aem.valida.FechaType fechaPresentacion;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public UltimaDeclaracionIVA() {
    }

    public UltimaDeclaracionIVA(
           java.lang.String ultimoPeriodoDeclaracionIVA,
           cl.gob.aem.valida.FechaType fechaPresentacion,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.ultimoPeriodoDeclaracionIVA = ultimoPeriodoDeclaracionIVA;
           this.fechaPresentacion = fechaPresentacion;
           this.signature = signature;
    }


    /**
     * Gets the ultimoPeriodoDeclaracionIVA value for this UltimaDeclaracionIVA.
     * 
     * @return ultimoPeriodoDeclaracionIVA
     */
    public java.lang.String getUltimoPeriodoDeclaracionIVA() {
        return ultimoPeriodoDeclaracionIVA;
    }


    /**
     * Sets the ultimoPeriodoDeclaracionIVA value for this UltimaDeclaracionIVA.
     * 
     * @param ultimoPeriodoDeclaracionIVA
     */
    public void setUltimoPeriodoDeclaracionIVA(java.lang.String ultimoPeriodoDeclaracionIVA) {
        this.ultimoPeriodoDeclaracionIVA = ultimoPeriodoDeclaracionIVA;
    }


    /**
     * Gets the fechaPresentacion value for this UltimaDeclaracionIVA.
     * 
     * @return fechaPresentacion
     */
    public cl.gob.aem.valida.FechaType getFechaPresentacion() {
        return fechaPresentacion;
    }


    /**
     * Sets the fechaPresentacion value for this UltimaDeclaracionIVA.
     * 
     * @param fechaPresentacion
     */
    public void setFechaPresentacion(cl.gob.aem.valida.FechaType fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }


    /**
     * Gets the signature value for this UltimaDeclaracionIVA.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this UltimaDeclaracionIVA.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UltimaDeclaracionIVA)) return false;
        UltimaDeclaracionIVA other = (UltimaDeclaracionIVA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ultimoPeriodoDeclaracionIVA==null && other.getUltimoPeriodoDeclaracionIVA()==null) || 
             (this.ultimoPeriodoDeclaracionIVA!=null &&
              this.ultimoPeriodoDeclaracionIVA.equals(other.getUltimoPeriodoDeclaracionIVA()))) &&
            ((this.fechaPresentacion==null && other.getFechaPresentacion()==null) || 
             (this.fechaPresentacion!=null &&
              this.fechaPresentacion.equals(other.getFechaPresentacion()))) &&
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
        if (getUltimoPeriodoDeclaracionIVA() != null) {
            _hashCode += getUltimoPeriodoDeclaracionIVA().hashCode();
        }
        if (getFechaPresentacion() != null) {
            _hashCode += getFechaPresentacion().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UltimaDeclaracionIVA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">ultimaDeclaracionIVA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ultimoPeriodoDeclaracionIVA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ultimoPeriodoDeclaracionIVA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPresentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaPresentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setMinOccurs(0);
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
