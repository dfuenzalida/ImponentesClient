/**
 * LicenciaEnsenanzaMedia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class LicenciaEnsenanzaMedia  implements java.io.Serializable {
    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    /* Elemento que indica si una persona tiene o no licencia de enseñanza
     * media */
    private boolean registraLicencia;

    /* Elemento que describe la escolaridad de un estudiante en caso
     * de no tener la licencia */
    private cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridad escolaridad;

    private org.apache.axis.types.NMToken schemaVersion;  // attribute

    public LicenciaEnsenanzaMedia() {
    }

    public LicenciaEnsenanzaMedia(
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           boolean registraLicencia,
           cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridad escolaridad,
           org.apache.axis.types.NMToken schemaVersion) {
           this.signature = signature;
           this.registraLicencia = registraLicencia;
           this.escolaridad = escolaridad;
           this.schemaVersion = schemaVersion;
    }


    /**
     * Gets the signature value for this LicenciaEnsenanzaMedia.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this LicenciaEnsenanzaMedia.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }


    /**
     * Gets the registraLicencia value for this LicenciaEnsenanzaMedia.
     * 
     * @return registraLicencia   * Elemento que indica si una persona tiene o no licencia de enseñanza
     * media
     */
    public boolean isRegistraLicencia() {
        return registraLicencia;
    }


    /**
     * Sets the registraLicencia value for this LicenciaEnsenanzaMedia.
     * 
     * @param registraLicencia   * Elemento que indica si una persona tiene o no licencia de enseñanza
     * media
     */
    public void setRegistraLicencia(boolean registraLicencia) {
        this.registraLicencia = registraLicencia;
    }


    /**
     * Gets the escolaridad value for this LicenciaEnsenanzaMedia.
     * 
     * @return escolaridad   * Elemento que describe la escolaridad de un estudiante en caso
     * de no tener la licencia
     */
    public cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridad getEscolaridad() {
        return escolaridad;
    }


    /**
     * Sets the escolaridad value for this LicenciaEnsenanzaMedia.
     * 
     * @param escolaridad   * Elemento que describe la escolaridad de un estudiante en caso
     * de no tener la licencia
     */
    public void setEscolaridad(cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridad escolaridad) {
        this.escolaridad = escolaridad;
    }


    /**
     * Gets the schemaVersion value for this LicenciaEnsenanzaMedia.
     * 
     * @return schemaVersion
     */
    public org.apache.axis.types.NMToken getSchemaVersion() {
        return schemaVersion;
    }


    /**
     * Sets the schemaVersion value for this LicenciaEnsenanzaMedia.
     * 
     * @param schemaVersion
     */
    public void setSchemaVersion(org.apache.axis.types.NMToken schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicenciaEnsenanzaMedia)) return false;
        LicenciaEnsenanzaMedia other = (LicenciaEnsenanzaMedia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            this.registraLicencia == other.isRegistraLicencia() &&
            ((this.escolaridad==null && other.getEscolaridad()==null) || 
             (this.escolaridad!=null &&
              this.escolaridad.equals(other.getEscolaridad()))) &&
            ((this.schemaVersion==null && other.getSchemaVersion()==null) || 
             (this.schemaVersion!=null &&
              this.schemaVersion.equals(other.getSchemaVersion())));
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
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        _hashCode += (isRegistraLicencia() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEscolaridad() != null) {
            _hashCode += getEscolaridad().hashCode();
        }
        if (getSchemaVersion() != null) {
            _hashCode += getSchemaVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LicenciaEnsenanzaMedia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">LicenciaEnsenanzaMedia"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SchemaVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NMTOKEN"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registraLicencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "RegistraLicencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escolaridad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Escolaridad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>LicenciaEnsenanzaMedia>Escolaridad"));
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
