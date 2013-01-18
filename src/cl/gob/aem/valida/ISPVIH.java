/**
 * ISPVIH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ISPVIH  implements java.io.Serializable {
    /* Este esquema define los campos que componen al elemento ResultadoExamenesVIH */
    private cl.gob.aem.valida.ExamenVIHType[] resultadoExamenesVIH;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    private int identificadorDeEnvio;  // attribute

    public ISPVIH() {
    }

    public ISPVIH(
           cl.gob.aem.valida.ExamenVIHType[] resultadoExamenesVIH,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           int identificadorDeEnvio) {
           this.resultadoExamenesVIH = resultadoExamenesVIH;
           this.signature = signature;
           this.identificadorDeEnvio = identificadorDeEnvio;
    }


    /**
     * Gets the resultadoExamenesVIH value for this ISPVIH.
     * 
     * @return resultadoExamenesVIH   * Este esquema define los campos que componen al elemento ResultadoExamenesVIH
     */
    public cl.gob.aem.valida.ExamenVIHType[] getResultadoExamenesVIH() {
        return resultadoExamenesVIH;
    }


    /**
     * Sets the resultadoExamenesVIH value for this ISPVIH.
     * 
     * @param resultadoExamenesVIH   * Este esquema define los campos que componen al elemento ResultadoExamenesVIH
     */
    public void setResultadoExamenesVIH(cl.gob.aem.valida.ExamenVIHType[] resultadoExamenesVIH) {
        this.resultadoExamenesVIH = resultadoExamenesVIH;
    }


    /**
     * Gets the signature value for this ISPVIH.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ISPVIH.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }


    /**
     * Gets the identificadorDeEnvio value for this ISPVIH.
     * 
     * @return identificadorDeEnvio
     */
    public int getIdentificadorDeEnvio() {
        return identificadorDeEnvio;
    }


    /**
     * Sets the identificadorDeEnvio value for this ISPVIH.
     * 
     * @param identificadorDeEnvio
     */
    public void setIdentificadorDeEnvio(int identificadorDeEnvio) {
        this.identificadorDeEnvio = identificadorDeEnvio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ISPVIH)) return false;
        ISPVIH other = (ISPVIH) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultadoExamenesVIH==null && other.getResultadoExamenesVIH()==null) || 
             (this.resultadoExamenesVIH!=null &&
              java.util.Arrays.equals(this.resultadoExamenesVIH, other.getResultadoExamenesVIH()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            this.identificadorDeEnvio == other.getIdentificadorDeEnvio();
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
        if (getResultadoExamenesVIH() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultadoExamenesVIH());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultadoExamenesVIH(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        _hashCode += getIdentificadorDeEnvio();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ISPVIH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">ISPVIH"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("identificadorDeEnvio");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IdentificadorDeEnvio"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoExamenesVIH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ResultadoExamenesVIH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ExamenVIH"));
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
