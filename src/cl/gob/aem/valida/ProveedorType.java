/**
 * ProveedorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ProveedorType  implements java.io.Serializable {
    private cl.gob.aem.valida.InstitucionesValores nombre;

    private cl.gob.aem.valida.ProveedorTypeServicios servicios;

    public ProveedorType() {
    }

    public ProveedorType(
           cl.gob.aem.valida.InstitucionesValores nombre,
           cl.gob.aem.valida.ProveedorTypeServicios servicios) {
           this.nombre = nombre;
           this.servicios = servicios;
    }


    /**
     * Gets the nombre value for this ProveedorType.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.InstitucionesValores getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ProveedorType.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.InstitucionesValores nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the servicios value for this ProveedorType.
     * 
     * @return servicios
     */
    public cl.gob.aem.valida.ProveedorTypeServicios getServicios() {
        return servicios;
    }


    /**
     * Sets the servicios value for this ProveedorType.
     * 
     * @param servicios
     */
    public void setServicios(cl.gob.aem.valida.ProveedorTypeServicios servicios) {
        this.servicios = servicios;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProveedorType)) return false;
        ProveedorType other = (ProveedorType) obj;
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
            ((this.servicios==null && other.getServicios()==null) || 
             (this.servicios!=null &&
              this.servicios.equals(other.getServicios())));
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
        if (getServicios() != null) {
            _hashCode += getServicios().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProveedorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "proveedorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "institucionesValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "servicios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">proveedorType>servicios"));
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
