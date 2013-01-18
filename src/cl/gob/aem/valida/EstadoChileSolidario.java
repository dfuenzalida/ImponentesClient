/**
 * EstadoChileSolidario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class EstadoChileSolidario  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    /* Indica si un persona pertenece a Chile Solidario */
    private cl.gob.aem.valida.CodigoDescripcion estado;

    /* Datos que identifican a la persona */
    private cl.gob.aem.valida.Persona datosPersona;

    /* Identificación de la Ficha de Protección Social */
    private cl.gob.aem.valida.Situacion idFichaProteccion;

    /* Lista de Beneficios o Programas a los que pertecene la persona
     * consultada */
    private cl.gob.aem.valida.Programa[] programas;

    private org.apache.axis.message.MessageElement [] _any;

    private java.math.BigDecimal schemaVersion;  // attribute

    public EstadoChileSolidario() {
    }

    public EstadoChileSolidario(
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           cl.gob.aem.valida.CodigoDescripcion estado,
           cl.gob.aem.valida.Persona datosPersona,
           cl.gob.aem.valida.Situacion idFichaProteccion,
           cl.gob.aem.valida.Programa[] programas,
           org.apache.axis.message.MessageElement [] _any,
           java.math.BigDecimal schemaVersion) {
           this.signature = signature;
           this.estado = estado;
           this.datosPersona = datosPersona;
           this.idFichaProteccion = idFichaProteccion;
           this.programas = programas;
           this._any = _any;
           this.schemaVersion = schemaVersion;
    }


    /**
     * Gets the signature value for this EstadoChileSolidario.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this EstadoChileSolidario.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }


    /**
     * Gets the estado value for this EstadoChileSolidario.
     * 
     * @return estado   * Indica si un persona pertenece a Chile Solidario
     */
    public cl.gob.aem.valida.CodigoDescripcion getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this EstadoChileSolidario.
     * 
     * @param estado   * Indica si un persona pertenece a Chile Solidario
     */
    public void setEstado(cl.gob.aem.valida.CodigoDescripcion estado) {
        this.estado = estado;
    }


    /**
     * Gets the datosPersona value for this EstadoChileSolidario.
     * 
     * @return datosPersona   * Datos que identifican a la persona
     */
    public cl.gob.aem.valida.Persona getDatosPersona() {
        return datosPersona;
    }


    /**
     * Sets the datosPersona value for this EstadoChileSolidario.
     * 
     * @param datosPersona   * Datos que identifican a la persona
     */
    public void setDatosPersona(cl.gob.aem.valida.Persona datosPersona) {
        this.datosPersona = datosPersona;
    }


    /**
     * Gets the idFichaProteccion value for this EstadoChileSolidario.
     * 
     * @return idFichaProteccion   * Identificación de la Ficha de Protección Social
     */
    public cl.gob.aem.valida.Situacion getIdFichaProteccion() {
        return idFichaProteccion;
    }


    /**
     * Sets the idFichaProteccion value for this EstadoChileSolidario.
     * 
     * @param idFichaProteccion   * Identificación de la Ficha de Protección Social
     */
    public void setIdFichaProteccion(cl.gob.aem.valida.Situacion idFichaProteccion) {
        this.idFichaProteccion = idFichaProteccion;
    }


    /**
     * Gets the programas value for this EstadoChileSolidario.
     * 
     * @return programas   * Lista de Beneficios o Programas a los que pertecene la persona
     * consultada
     */
    public cl.gob.aem.valida.Programa[] getProgramas() {
        return programas;
    }


    /**
     * Sets the programas value for this EstadoChileSolidario.
     * 
     * @param programas   * Lista de Beneficios o Programas a los que pertecene la persona
     * consultada
     */
    public void setProgramas(cl.gob.aem.valida.Programa[] programas) {
        this.programas = programas;
    }


    /**
     * Gets the _any value for this EstadoChileSolidario.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this EstadoChileSolidario.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the schemaVersion value for this EstadoChileSolidario.
     * 
     * @return schemaVersion
     */
    public java.math.BigDecimal getSchemaVersion() {
        return schemaVersion;
    }


    /**
     * Sets the schemaVersion value for this EstadoChileSolidario.
     * 
     * @param schemaVersion
     */
    public void setSchemaVersion(java.math.BigDecimal schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstadoChileSolidario)) return false;
        EstadoChileSolidario other = (EstadoChileSolidario) obj;
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
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.datosPersona==null && other.getDatosPersona()==null) || 
             (this.datosPersona!=null &&
              this.datosPersona.equals(other.getDatosPersona()))) &&
            ((this.idFichaProteccion==null && other.getIdFichaProteccion()==null) || 
             (this.idFichaProteccion!=null &&
              this.idFichaProteccion.equals(other.getIdFichaProteccion()))) &&
            ((this.programas==null && other.getProgramas()==null) || 
             (this.programas!=null &&
              java.util.Arrays.equals(this.programas, other.getProgramas()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
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
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getDatosPersona() != null) {
            _hashCode += getDatosPersona().hashCode();
        }
        if (getIdFichaProteccion() != null) {
            _hashCode += getIdFichaProteccion().hashCode();
        }
        if (getProgramas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProgramas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProgramas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSchemaVersion() != null) {
            _hashCode += getSchemaVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EstadoChileSolidario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">EstadoChileSolidario"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SchemaVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoDescripcion"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DatosPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Persona"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idFichaProteccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "IdFichaProteccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Situacion"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Programas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Programa"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Programa"));
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
