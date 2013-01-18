/**
 * ValidacionRepertorioAlzamientos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ValidacionRepertorioAlzamientos  implements java.io.Serializable {
    private boolean vehiculoAlzado;

    private boolean datosExistentes;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public ValidacionRepertorioAlzamientos() {
    }

    public ValidacionRepertorioAlzamientos(
           boolean vehiculoAlzado,
           boolean datosExistentes,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.vehiculoAlzado = vehiculoAlzado;
           this.datosExistentes = datosExistentes;
           this.signature = signature;
    }


    /**
     * Gets the vehiculoAlzado value for this ValidacionRepertorioAlzamientos.
     * 
     * @return vehiculoAlzado
     */
    public boolean isVehiculoAlzado() {
        return vehiculoAlzado;
    }


    /**
     * Sets the vehiculoAlzado value for this ValidacionRepertorioAlzamientos.
     * 
     * @param vehiculoAlzado
     */
    public void setVehiculoAlzado(boolean vehiculoAlzado) {
        this.vehiculoAlzado = vehiculoAlzado;
    }


    /**
     * Gets the datosExistentes value for this ValidacionRepertorioAlzamientos.
     * 
     * @return datosExistentes
     */
    public boolean isDatosExistentes() {
        return datosExistentes;
    }


    /**
     * Sets the datosExistentes value for this ValidacionRepertorioAlzamientos.
     * 
     * @param datosExistentes
     */
    public void setDatosExistentes(boolean datosExistentes) {
        this.datosExistentes = datosExistentes;
    }


    /**
     * Gets the signature value for this ValidacionRepertorioAlzamientos.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ValidacionRepertorioAlzamientos.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidacionRepertorioAlzamientos)) return false;
        ValidacionRepertorioAlzamientos other = (ValidacionRepertorioAlzamientos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.vehiculoAlzado == other.isVehiculoAlzado() &&
            this.datosExistentes == other.isDatosExistentes() &&
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
        _hashCode += (isVehiculoAlzado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDatosExistentes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidacionRepertorioAlzamientos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">validacionRepertorioAlzamientos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehiculoAlzado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "vehiculoAlzado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosExistentes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosExistentes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
