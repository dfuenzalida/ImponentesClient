/**
 * CertificadoAnotacionesVigentePatente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAnotacionesVigentePatente  implements java.io.Serializable {
    private cl.gob.aem.valida.VehiculoType datosVehiculo;

    private cl.gob.aem.valida.VehiculoLimitacionesDominioType datosVehiculoConLimitacionesDominio;

    private cl.gob.aem.valida.CertificadoAnotacionesVigentePatentePropietarioActual propietarioActual;

    private cl.gob.aem.valida.CertificadoAnotacionesVigentePatentePropietariosAnteriores propietariosAnteriores;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public CertificadoAnotacionesVigentePatente() {
    }

    public CertificadoAnotacionesVigentePatente(
           cl.gob.aem.valida.VehiculoType datosVehiculo,
           cl.gob.aem.valida.VehiculoLimitacionesDominioType datosVehiculoConLimitacionesDominio,
           cl.gob.aem.valida.CertificadoAnotacionesVigentePatentePropietarioActual propietarioActual,
           cl.gob.aem.valida.CertificadoAnotacionesVigentePatentePropietariosAnteriores propietariosAnteriores,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.datosVehiculo = datosVehiculo;
           this.datosVehiculoConLimitacionesDominio = datosVehiculoConLimitacionesDominio;
           this.propietarioActual = propietarioActual;
           this.propietariosAnteriores = propietariosAnteriores;
           this.signature = signature;
    }


    /**
     * Gets the datosVehiculo value for this CertificadoAnotacionesVigentePatente.
     * 
     * @return datosVehiculo
     */
    public cl.gob.aem.valida.VehiculoType getDatosVehiculo() {
        return datosVehiculo;
    }


    /**
     * Sets the datosVehiculo value for this CertificadoAnotacionesVigentePatente.
     * 
     * @param datosVehiculo
     */
    public void setDatosVehiculo(cl.gob.aem.valida.VehiculoType datosVehiculo) {
        this.datosVehiculo = datosVehiculo;
    }


    /**
     * Gets the datosVehiculoConLimitacionesDominio value for this CertificadoAnotacionesVigentePatente.
     * 
     * @return datosVehiculoConLimitacionesDominio
     */
    public cl.gob.aem.valida.VehiculoLimitacionesDominioType getDatosVehiculoConLimitacionesDominio() {
        return datosVehiculoConLimitacionesDominio;
    }


    /**
     * Sets the datosVehiculoConLimitacionesDominio value for this CertificadoAnotacionesVigentePatente.
     * 
     * @param datosVehiculoConLimitacionesDominio
     */
    public void setDatosVehiculoConLimitacionesDominio(cl.gob.aem.valida.VehiculoLimitacionesDominioType datosVehiculoConLimitacionesDominio) {
        this.datosVehiculoConLimitacionesDominio = datosVehiculoConLimitacionesDominio;
    }


    /**
     * Gets the propietarioActual value for this CertificadoAnotacionesVigentePatente.
     * 
     * @return propietarioActual
     */
    public cl.gob.aem.valida.CertificadoAnotacionesVigentePatentePropietarioActual getPropietarioActual() {
        return propietarioActual;
    }


    /**
     * Sets the propietarioActual value for this CertificadoAnotacionesVigentePatente.
     * 
     * @param propietarioActual
     */
    public void setPropietarioActual(cl.gob.aem.valida.CertificadoAnotacionesVigentePatentePropietarioActual propietarioActual) {
        this.propietarioActual = propietarioActual;
    }


    /**
     * Gets the propietariosAnteriores value for this CertificadoAnotacionesVigentePatente.
     * 
     * @return propietariosAnteriores
     */
    public cl.gob.aem.valida.CertificadoAnotacionesVigentePatentePropietariosAnteriores getPropietariosAnteriores() {
        return propietariosAnteriores;
    }


    /**
     * Sets the propietariosAnteriores value for this CertificadoAnotacionesVigentePatente.
     * 
     * @param propietariosAnteriores
     */
    public void setPropietariosAnteriores(cl.gob.aem.valida.CertificadoAnotacionesVigentePatentePropietariosAnteriores propietariosAnteriores) {
        this.propietariosAnteriores = propietariosAnteriores;
    }


    /**
     * Gets the signature value for this CertificadoAnotacionesVigentePatente.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this CertificadoAnotacionesVigentePatente.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAnotacionesVigentePatente)) return false;
        CertificadoAnotacionesVigentePatente other = (CertificadoAnotacionesVigentePatente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosVehiculo==null && other.getDatosVehiculo()==null) || 
             (this.datosVehiculo!=null &&
              this.datosVehiculo.equals(other.getDatosVehiculo()))) &&
            ((this.datosVehiculoConLimitacionesDominio==null && other.getDatosVehiculoConLimitacionesDominio()==null) || 
             (this.datosVehiculoConLimitacionesDominio!=null &&
              this.datosVehiculoConLimitacionesDominio.equals(other.getDatosVehiculoConLimitacionesDominio()))) &&
            ((this.propietarioActual==null && other.getPropietarioActual()==null) || 
             (this.propietarioActual!=null &&
              this.propietarioActual.equals(other.getPropietarioActual()))) &&
            ((this.propietariosAnteriores==null && other.getPropietariosAnteriores()==null) || 
             (this.propietariosAnteriores!=null &&
              this.propietariosAnteriores.equals(other.getPropietariosAnteriores()))) &&
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
        if (getDatosVehiculo() != null) {
            _hashCode += getDatosVehiculo().hashCode();
        }
        if (getDatosVehiculoConLimitacionesDominio() != null) {
            _hashCode += getDatosVehiculoConLimitacionesDominio().hashCode();
        }
        if (getPropietarioActual() != null) {
            _hashCode += getPropietarioActual().hashCode();
        }
        if (getPropietariosAnteriores() != null) {
            _hashCode += getPropietariosAnteriores().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAnotacionesVigentePatente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">certificadoAnotacionesVigentePatente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosVehiculo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosVehiculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "vehiculoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosVehiculoConLimitacionesDominio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosVehiculoConLimitacionesDominio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "vehiculoLimitacionesDominioType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propietarioActual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "PropietarioActual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>certificadoAnotacionesVigentePatente>PropietarioActual"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propietariosAnteriores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "PropietariosAnteriores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>certificadoAnotacionesVigentePatente>PropietariosAnteriores"));
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
