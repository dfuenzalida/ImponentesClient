/**
 * ListadoEmpleadoresEmpleador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ListadoEmpleadoresEmpleador  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType rut;

    private cl.gob.aem.valida.NameType nombre;

    private org.apache.axis.types.NonNegativeInteger indice;  // attribute

    public ListadoEmpleadoresEmpleador() {
    }

    public ListadoEmpleadoresEmpleador(
           cl.gob.aem.valida.RunType rut,
           cl.gob.aem.valida.NameType nombre,
           org.apache.axis.types.NonNegativeInteger indice) {
           this.rut = rut;
           this.nombre = nombre;
           this.indice = indice;
    }


    /**
     * Gets the rut value for this ListadoEmpleadoresEmpleador.
     * 
     * @return rut
     */
    public cl.gob.aem.valida.RunType getRut() {
        return rut;
    }


    /**
     * Sets the rut value for this ListadoEmpleadoresEmpleador.
     * 
     * @param rut
     */
    public void setRut(cl.gob.aem.valida.RunType rut) {
        this.rut = rut;
    }


    /**
     * Gets the nombre value for this ListadoEmpleadoresEmpleador.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.NameType getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ListadoEmpleadoresEmpleador.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.NameType nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the indice value for this ListadoEmpleadoresEmpleador.
     * 
     * @return indice
     */
    public org.apache.axis.types.NonNegativeInteger getIndice() {
        return indice;
    }


    /**
     * Sets the indice value for this ListadoEmpleadoresEmpleador.
     * 
     * @param indice
     */
    public void setIndice(org.apache.axis.types.NonNegativeInteger indice) {
        this.indice = indice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListadoEmpleadoresEmpleador)) return false;
        ListadoEmpleadoresEmpleador other = (ListadoEmpleadoresEmpleador) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rut==null && other.getRut()==null) || 
             (this.rut!=null &&
              this.rut.equals(other.getRut()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.indice==null && other.getIndice()==null) || 
             (this.indice!=null &&
              this.indice.equals(other.getIndice())));
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
        if (getRut() != null) {
            _hashCode += getRut().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getIndice() != null) {
            _hashCode += getIndice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListadoEmpleadoresEmpleador.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>listadoEmpleadores>empleador"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("indice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "indice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
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
