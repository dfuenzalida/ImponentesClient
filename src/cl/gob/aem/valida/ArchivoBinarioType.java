/**
 * ArchivoBinarioType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ArchivoBinarioType  implements java.io.Serializable {
    /* Nombre completo del archivo al nivel del sistema operativo
     * (imagen123.jpg, texto456.txt,... ) */
    private java.lang.String nombre;

    /* Especificacion del "MediaType" del archivo según registrado
     * en IANA :  image/jpeg, image/gif, application/pdf, ...
     * (http://www.iana.org/assignments/media-types/) */
    private java.lang.String tipoContenido;

    /* Cantidad de bytes del archivo */
    private org.apache.axis.types.UnsignedInt cantidadBytes;

    /* data binaria del archivo codificada en Base64 (rfc2045). */
    private byte[] dataCodificada;

    /* Descripcion del archivo binario si necesario */
    private java.lang.String descripcion;

    private org.apache.axis.types.NMToken schemaVersion;  // attribute

    public ArchivoBinarioType() {
    }

    public ArchivoBinarioType(
           java.lang.String nombre,
           java.lang.String tipoContenido,
           org.apache.axis.types.UnsignedInt cantidadBytes,
           byte[] dataCodificada,
           java.lang.String descripcion,
           org.apache.axis.types.NMToken schemaVersion) {
           this.nombre = nombre;
           this.tipoContenido = tipoContenido;
           this.cantidadBytes = cantidadBytes;
           this.dataCodificada = dataCodificada;
           this.descripcion = descripcion;
           this.schemaVersion = schemaVersion;
    }


    /**
     * Gets the nombre value for this ArchivoBinarioType.
     * 
     * @return nombre   * Nombre completo del archivo al nivel del sistema operativo
     * (imagen123.jpg, texto456.txt,... )
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ArchivoBinarioType.
     * 
     * @param nombre   * Nombre completo del archivo al nivel del sistema operativo
     * (imagen123.jpg, texto456.txt,... )
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the tipoContenido value for this ArchivoBinarioType.
     * 
     * @return tipoContenido   * Especificacion del "MediaType" del archivo según registrado
     * en IANA :  image/jpeg, image/gif, application/pdf, ...
     * (http://www.iana.org/assignments/media-types/)
     */
    public java.lang.String getTipoContenido() {
        return tipoContenido;
    }


    /**
     * Sets the tipoContenido value for this ArchivoBinarioType.
     * 
     * @param tipoContenido   * Especificacion del "MediaType" del archivo según registrado
     * en IANA :  image/jpeg, image/gif, application/pdf, ...
     * (http://www.iana.org/assignments/media-types/)
     */
    public void setTipoContenido(java.lang.String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }


    /**
     * Gets the cantidadBytes value for this ArchivoBinarioType.
     * 
     * @return cantidadBytes   * Cantidad de bytes del archivo
     */
    public org.apache.axis.types.UnsignedInt getCantidadBytes() {
        return cantidadBytes;
    }


    /**
     * Sets the cantidadBytes value for this ArchivoBinarioType.
     * 
     * @param cantidadBytes   * Cantidad de bytes del archivo
     */
    public void setCantidadBytes(org.apache.axis.types.UnsignedInt cantidadBytes) {
        this.cantidadBytes = cantidadBytes;
    }


    /**
     * Gets the dataCodificada value for this ArchivoBinarioType.
     * 
     * @return dataCodificada   * data binaria del archivo codificada en Base64 (rfc2045).
     */
    public byte[] getDataCodificada() {
        return dataCodificada;
    }


    /**
     * Sets the dataCodificada value for this ArchivoBinarioType.
     * 
     * @param dataCodificada   * data binaria del archivo codificada en Base64 (rfc2045).
     */
    public void setDataCodificada(byte[] dataCodificada) {
        this.dataCodificada = dataCodificada;
    }


    /**
     * Gets the descripcion value for this ArchivoBinarioType.
     * 
     * @return descripcion   * Descripcion del archivo binario si necesario
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this ArchivoBinarioType.
     * 
     * @param descripcion   * Descripcion del archivo binario si necesario
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the schemaVersion value for this ArchivoBinarioType.
     * 
     * @return schemaVersion
     */
    public org.apache.axis.types.NMToken getSchemaVersion() {
        return schemaVersion;
    }


    /**
     * Sets the schemaVersion value for this ArchivoBinarioType.
     * 
     * @param schemaVersion
     */
    public void setSchemaVersion(org.apache.axis.types.NMToken schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchivoBinarioType)) return false;
        ArchivoBinarioType other = (ArchivoBinarioType) obj;
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
            ((this.tipoContenido==null && other.getTipoContenido()==null) || 
             (this.tipoContenido!=null &&
              this.tipoContenido.equals(other.getTipoContenido()))) &&
            ((this.cantidadBytes==null && other.getCantidadBytes()==null) || 
             (this.cantidadBytes!=null &&
              this.cantidadBytes.equals(other.getCantidadBytes()))) &&
            ((this.dataCodificada==null && other.getDataCodificada()==null) || 
             (this.dataCodificada!=null &&
              java.util.Arrays.equals(this.dataCodificada, other.getDataCodificada()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
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
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getTipoContenido() != null) {
            _hashCode += getTipoContenido().hashCode();
        }
        if (getCantidadBytes() != null) {
            _hashCode += getCantidadBytes().hashCode();
        }
        if (getDataCodificada() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataCodificada());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataCodificada(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getSchemaVersion() != null) {
            _hashCode += getSchemaVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchivoBinarioType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ArchivoBinarioType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SchemaVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NMTOKEN"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoContenido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TipoContenido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CantidadBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCodificada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DataCodificada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
