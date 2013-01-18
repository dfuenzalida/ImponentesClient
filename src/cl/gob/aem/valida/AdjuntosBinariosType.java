/**
 * AdjuntosBinariosType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class AdjuntosBinariosType  implements java.io.Serializable {
    private int cantidad;

    private cl.gob.aem.valida.ArchivoBinarioType[] archivoBinario;

    private org.apache.axis.types.NMToken schemaVersion;  // attribute

    public AdjuntosBinariosType() {
    }

    public AdjuntosBinariosType(
           int cantidad,
           cl.gob.aem.valida.ArchivoBinarioType[] archivoBinario,
           org.apache.axis.types.NMToken schemaVersion) {
           this.cantidad = cantidad;
           this.archivoBinario = archivoBinario;
           this.schemaVersion = schemaVersion;
    }


    /**
     * Gets the cantidad value for this AdjuntosBinariosType.
     * 
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }


    /**
     * Sets the cantidad value for this AdjuntosBinariosType.
     * 
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Gets the archivoBinario value for this AdjuntosBinariosType.
     * 
     * @return archivoBinario
     */
    public cl.gob.aem.valida.ArchivoBinarioType[] getArchivoBinario() {
        return archivoBinario;
    }


    /**
     * Sets the archivoBinario value for this AdjuntosBinariosType.
     * 
     * @param archivoBinario
     */
    public void setArchivoBinario(cl.gob.aem.valida.ArchivoBinarioType[] archivoBinario) {
        this.archivoBinario = archivoBinario;
    }

    public cl.gob.aem.valida.ArchivoBinarioType getArchivoBinario(int i) {
        return this.archivoBinario[i];
    }

    public void setArchivoBinario(int i, cl.gob.aem.valida.ArchivoBinarioType _value) {
        this.archivoBinario[i] = _value;
    }


    /**
     * Gets the schemaVersion value for this AdjuntosBinariosType.
     * 
     * @return schemaVersion
     */
    public org.apache.axis.types.NMToken getSchemaVersion() {
        return schemaVersion;
    }


    /**
     * Sets the schemaVersion value for this AdjuntosBinariosType.
     * 
     * @param schemaVersion
     */
    public void setSchemaVersion(org.apache.axis.types.NMToken schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjuntosBinariosType)) return false;
        AdjuntosBinariosType other = (AdjuntosBinariosType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cantidad == other.getCantidad() &&
            ((this.archivoBinario==null && other.getArchivoBinario()==null) || 
             (this.archivoBinario!=null &&
              java.util.Arrays.equals(this.archivoBinario, other.getArchivoBinario()))) &&
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
        _hashCode += getCantidad();
        if (getArchivoBinario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArchivoBinario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArchivoBinario(), i);
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
        new org.apache.axis.description.TypeDesc(AdjuntosBinariosType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "AdjuntosBinariosType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SchemaVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NMTOKEN"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Cantidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivoBinario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ArchivoBinario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ArchivoBinario"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
