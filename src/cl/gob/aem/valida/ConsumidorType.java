/**
 * ConsumidorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ConsumidorType  implements java.io.Serializable {
    private cl.gob.aem.valida.InstitucionesValores nombre;

    private cl.gob.aem.valida.TramitesValores tramite;

    private cl.gob.aem.valida.ConsumidorTypeCertificado certificado;

    public ConsumidorType() {
    }

    public ConsumidorType(
           cl.gob.aem.valida.InstitucionesValores nombre,
           cl.gob.aem.valida.TramitesValores tramite,
           cl.gob.aem.valida.ConsumidorTypeCertificado certificado) {
           this.nombre = nombre;
           this.tramite = tramite;
           this.certificado = certificado;
    }


    /**
     * Gets the nombre value for this ConsumidorType.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.InstitucionesValores getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ConsumidorType.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.InstitucionesValores nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the tramite value for this ConsumidorType.
     * 
     * @return tramite
     */
    public cl.gob.aem.valida.TramitesValores getTramite() {
        return tramite;
    }


    /**
     * Sets the tramite value for this ConsumidorType.
     * 
     * @param tramite
     */
    public void setTramite(cl.gob.aem.valida.TramitesValores tramite) {
        this.tramite = tramite;
    }


    /**
     * Gets the certificado value for this ConsumidorType.
     * 
     * @return certificado
     */
    public cl.gob.aem.valida.ConsumidorTypeCertificado getCertificado() {
        return certificado;
    }


    /**
     * Sets the certificado value for this ConsumidorType.
     * 
     * @param certificado
     */
    public void setCertificado(cl.gob.aem.valida.ConsumidorTypeCertificado certificado) {
        this.certificado = certificado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsumidorType)) return false;
        ConsumidorType other = (ConsumidorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.tramite==null && other.getTramite()==null) || 
             (this.tramite!=null &&
              this.tramite.equals(other.getTramite()))) &&
            ((this.certificado==null && other.getCertificado()==null) || 
             (this.certificado!=null &&
              this.certificado.equals(other.getCertificado())));
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
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getTramite() != null) {
            _hashCode += getTramite().hashCode();
        }
        if (getCertificado() != null) {
            _hashCode += getCertificado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsumidorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "consumidorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "institucionesValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tramite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "tramite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "tramitesValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "certificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">consumidorType>certificado"));
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
