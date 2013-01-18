/**
 * Bitacora.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class Bitacora  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    /* Encabezado con los datos que describen el aeropuerto o aerodromo
     * donde se realizaron las operaciones aeronauticas */
    private cl.gob.aem.valida.BitacoraEncabezado encabezado;

    private cl.gob.aem.valida.BitacoraDetalleOperacion[] detalle;

    private cl.gob.aem.valida.BitacoraDatosGestion datosGestion;

    private org.apache.axis.message.MessageElement [] _any;

    private java.math.BigDecimal schemaVersion;  // attribute

    public Bitacora() {
    }

    public Bitacora(
           cl.gob.aem.valida.BitacoraEncabezado encabezado,
           cl.gob.aem.valida.BitacoraDetalleOperacion[] detalle,
           cl.gob.aem.valida.BitacoraDatosGestion datosGestion,
           org.apache.axis.message.MessageElement [] _any,
           java.math.BigDecimal schemaVersion) {
           this.encabezado = encabezado;
           this.detalle = detalle;
           this.datosGestion = datosGestion;
           this._any = _any;
           this.schemaVersion = schemaVersion;
    }


    /**
     * Gets the encabezado value for this Bitacora.
     * 
     * @return encabezado   * Encabezado con los datos que describen el aeropuerto o aerodromo
     * donde se realizaron las operaciones aeronauticas
     */
    public cl.gob.aem.valida.BitacoraEncabezado getEncabezado() {
        return encabezado;
    }


    /**
     * Sets the encabezado value for this Bitacora.
     * 
     * @param encabezado   * Encabezado con los datos que describen el aeropuerto o aerodromo
     * donde se realizaron las operaciones aeronauticas
     */
    public void setEncabezado(cl.gob.aem.valida.BitacoraEncabezado encabezado) {
        this.encabezado = encabezado;
    }


    /**
     * Gets the detalle value for this Bitacora.
     * 
     * @return detalle
     */
    public cl.gob.aem.valida.BitacoraDetalleOperacion[] getDetalle() {
        return detalle;
    }


    /**
     * Sets the detalle value for this Bitacora.
     * 
     * @param detalle
     */
    public void setDetalle(cl.gob.aem.valida.BitacoraDetalleOperacion[] detalle) {
        this.detalle = detalle;
    }


    /**
     * Gets the datosGestion value for this Bitacora.
     * 
     * @return datosGestion
     */
    public cl.gob.aem.valida.BitacoraDatosGestion getDatosGestion() {
        return datosGestion;
    }


    /**
     * Sets the datosGestion value for this Bitacora.
     * 
     * @param datosGestion
     */
    public void setDatosGestion(cl.gob.aem.valida.BitacoraDatosGestion datosGestion) {
        this.datosGestion = datosGestion;
    }


    /**
     * Gets the _any value for this Bitacora.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this Bitacora.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the schemaVersion value for this Bitacora.
     * 
     * @return schemaVersion
     */
    public java.math.BigDecimal getSchemaVersion() {
        return schemaVersion;
    }


    /**
     * Sets the schemaVersion value for this Bitacora.
     * 
     * @param schemaVersion
     */
    public void setSchemaVersion(java.math.BigDecimal schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bitacora)) return false;
        Bitacora other = (Bitacora) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.encabezado==null && other.getEncabezado()==null) || 
             (this.encabezado!=null &&
              this.encabezado.equals(other.getEncabezado()))) &&
            ((this.detalle==null && other.getDetalle()==null) || 
             (this.detalle!=null &&
              java.util.Arrays.equals(this.detalle, other.getDetalle()))) &&
            ((this.datosGestion==null && other.getDatosGestion()==null) || 
             (this.datosGestion!=null &&
              this.datosGestion.equals(other.getDatosGestion()))) &&
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
        if (getEncabezado() != null) {
            _hashCode += getEncabezado().hashCode();
        }
        if (getDetalle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetalle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetalle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatosGestion() != null) {
            _hashCode += getDatosGestion().hashCode();
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
        new org.apache.axis.description.TypeDesc(Bitacora.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">Bitacora"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SchemaVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encabezado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Encabezado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>Bitacora>Encabezado"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detalle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Detalle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>Bitacora>Detalle>Operacion"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Operacion"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosGestion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DatosGestion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>Bitacora>DatosGestion"));
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
