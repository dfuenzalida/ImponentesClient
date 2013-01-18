/**
 * ValidacionMontosPension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ValidacionMontosPension  implements java.io.Serializable {
    private java.lang.String institucionOrigen;

    private java.lang.String numeroResolucion;

    private java.util.Date fechaInicioPagoPension;

    private org.apache.axis.types.NonNegativeInteger montoPensionBruta;

    private java.lang.String tipoPension;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public ValidacionMontosPension() {
    }

    public ValidacionMontosPension(
           java.lang.String institucionOrigen,
           java.lang.String numeroResolucion,
           java.util.Date fechaInicioPagoPension,
           org.apache.axis.types.NonNegativeInteger montoPensionBruta,
           java.lang.String tipoPension,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.institucionOrigen = institucionOrigen;
           this.numeroResolucion = numeroResolucion;
           this.fechaInicioPagoPension = fechaInicioPagoPension;
           this.montoPensionBruta = montoPensionBruta;
           this.tipoPension = tipoPension;
           this.signature = signature;
    }


    /**
     * Gets the institucionOrigen value for this ValidacionMontosPension.
     * 
     * @return institucionOrigen
     */
    public java.lang.String getInstitucionOrigen() {
        return institucionOrigen;
    }


    /**
     * Sets the institucionOrigen value for this ValidacionMontosPension.
     * 
     * @param institucionOrigen
     */
    public void setInstitucionOrigen(java.lang.String institucionOrigen) {
        this.institucionOrigen = institucionOrigen;
    }


    /**
     * Gets the numeroResolucion value for this ValidacionMontosPension.
     * 
     * @return numeroResolucion
     */
    public java.lang.String getNumeroResolucion() {
        return numeroResolucion;
    }


    /**
     * Sets the numeroResolucion value for this ValidacionMontosPension.
     * 
     * @param numeroResolucion
     */
    public void setNumeroResolucion(java.lang.String numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }


    /**
     * Gets the fechaInicioPagoPension value for this ValidacionMontosPension.
     * 
     * @return fechaInicioPagoPension
     */
    public java.util.Date getFechaInicioPagoPension() {
        return fechaInicioPagoPension;
    }


    /**
     * Sets the fechaInicioPagoPension value for this ValidacionMontosPension.
     * 
     * @param fechaInicioPagoPension
     */
    public void setFechaInicioPagoPension(java.util.Date fechaInicioPagoPension) {
        this.fechaInicioPagoPension = fechaInicioPagoPension;
    }


    /**
     * Gets the montoPensionBruta value for this ValidacionMontosPension.
     * 
     * @return montoPensionBruta
     */
    public org.apache.axis.types.NonNegativeInteger getMontoPensionBruta() {
        return montoPensionBruta;
    }


    /**
     * Sets the montoPensionBruta value for this ValidacionMontosPension.
     * 
     * @param montoPensionBruta
     */
    public void setMontoPensionBruta(org.apache.axis.types.NonNegativeInteger montoPensionBruta) {
        this.montoPensionBruta = montoPensionBruta;
    }


    /**
     * Gets the tipoPension value for this ValidacionMontosPension.
     * 
     * @return tipoPension
     */
    public java.lang.String getTipoPension() {
        return tipoPension;
    }


    /**
     * Sets the tipoPension value for this ValidacionMontosPension.
     * 
     * @param tipoPension
     */
    public void setTipoPension(java.lang.String tipoPension) {
        this.tipoPension = tipoPension;
    }


    /**
     * Gets the signature value for this ValidacionMontosPension.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ValidacionMontosPension.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidacionMontosPension)) return false;
        ValidacionMontosPension other = (ValidacionMontosPension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.institucionOrigen==null && other.getInstitucionOrigen()==null) || 
             (this.institucionOrigen!=null &&
              this.institucionOrigen.equals(other.getInstitucionOrigen()))) &&
            ((this.numeroResolucion==null && other.getNumeroResolucion()==null) || 
             (this.numeroResolucion!=null &&
              this.numeroResolucion.equals(other.getNumeroResolucion()))) &&
            ((this.fechaInicioPagoPension==null && other.getFechaInicioPagoPension()==null) || 
             (this.fechaInicioPagoPension!=null &&
              this.fechaInicioPagoPension.equals(other.getFechaInicioPagoPension()))) &&
            ((this.montoPensionBruta==null && other.getMontoPensionBruta()==null) || 
             (this.montoPensionBruta!=null &&
              this.montoPensionBruta.equals(other.getMontoPensionBruta()))) &&
            ((this.tipoPension==null && other.getTipoPension()==null) || 
             (this.tipoPension!=null &&
              this.tipoPension.equals(other.getTipoPension()))) &&
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
        if (getInstitucionOrigen() != null) {
            _hashCode += getInstitucionOrigen().hashCode();
        }
        if (getNumeroResolucion() != null) {
            _hashCode += getNumeroResolucion().hashCode();
        }
        if (getFechaInicioPagoPension() != null) {
            _hashCode += getFechaInicioPagoPension().hashCode();
        }
        if (getMontoPensionBruta() != null) {
            _hashCode += getMontoPensionBruta().hashCode();
        }
        if (getTipoPension() != null) {
            _hashCode += getTipoPension().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidacionMontosPension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">validacionMontosPension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institucionOrigen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "institucionOrigen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroResolucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "numeroResolucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicioPagoPension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaInicioPagoPension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoPensionBruta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "montoPensionBruta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "tipoPension"));
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
