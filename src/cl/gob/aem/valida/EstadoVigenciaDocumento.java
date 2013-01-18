/**
 * EstadoVigenciaDocumento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class EstadoVigenciaDocumento  implements java.io.Serializable {
    private cl.gob.aem.valida.IdentificacionType identificacion;

    private org.apache.axis.types.Time hora;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public EstadoVigenciaDocumento() {
    }

    public EstadoVigenciaDocumento(
           cl.gob.aem.valida.IdentificacionType identificacion,
           org.apache.axis.types.Time hora,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.identificacion = identificacion;
           this.hora = hora;
           this.signature = signature;
    }


    /**
     * Gets the identificacion value for this EstadoVigenciaDocumento.
     * 
     * @return identificacion
     */
    public cl.gob.aem.valida.IdentificacionType getIdentificacion() {
        return identificacion;
    }


    /**
     * Sets the identificacion value for this EstadoVigenciaDocumento.
     * 
     * @param identificacion
     */
    public void setIdentificacion(cl.gob.aem.valida.IdentificacionType identificacion) {
        this.identificacion = identificacion;
    }


    /**
     * Gets the hora value for this EstadoVigenciaDocumento.
     * 
     * @return hora
     */
    public org.apache.axis.types.Time getHora() {
        return hora;
    }


    /**
     * Sets the hora value for this EstadoVigenciaDocumento.
     * 
     * @param hora
     */
    public void setHora(org.apache.axis.types.Time hora) {
        this.hora = hora;
    }


    /**
     * Gets the signature value for this EstadoVigenciaDocumento.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this EstadoVigenciaDocumento.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstadoVigenciaDocumento)) return false;
        EstadoVigenciaDocumento other = (EstadoVigenciaDocumento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificacion==null && other.getIdentificacion()==null) || 
             (this.identificacion!=null &&
              this.identificacion.equals(other.getIdentificacion()))) &&
            ((this.hora==null && other.getHora()==null) || 
             (this.hora!=null &&
              this.hora.equals(other.getHora()))) &&
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
        if (getIdentificacion() != null) {
            _hashCode += getIdentificacion().hashCode();
        }
        if (getHora() != null) {
            _hashCode += getHora().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EstadoVigenciaDocumento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">estadoVigenciaDocumento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "identificacionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "hora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
