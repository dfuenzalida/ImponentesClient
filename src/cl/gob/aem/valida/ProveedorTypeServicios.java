/**
 * ProveedorTypeServicios.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ProveedorTypeServicios  implements java.io.Serializable {
    private cl.gob.aem.valida.ServiciosValores[] servicio;

    private cl.gob.aem.valida.EstadoGlosaType[] respuestaServicio;

    public ProveedorTypeServicios() {
    }

    public ProveedorTypeServicios(
           cl.gob.aem.valida.ServiciosValores[] servicio,
           cl.gob.aem.valida.EstadoGlosaType[] respuestaServicio) {
           this.servicio = servicio;
           this.respuestaServicio = respuestaServicio;
    }


    /**
     * Gets the servicio value for this ProveedorTypeServicios.
     * 
     * @return servicio
     */
    public cl.gob.aem.valida.ServiciosValores[] getServicio() {
        return servicio;
    }


    /**
     * Sets the servicio value for this ProveedorTypeServicios.
     * 
     * @param servicio
     */
    public void setServicio(cl.gob.aem.valida.ServiciosValores[] servicio) {
        this.servicio = servicio;
    }

    public cl.gob.aem.valida.ServiciosValores getServicio(int i) {
        return this.servicio[i];
    }

    public void setServicio(int i, cl.gob.aem.valida.ServiciosValores _value) {
        this.servicio[i] = _value;
    }


    /**
     * Gets the respuestaServicio value for this ProveedorTypeServicios.
     * 
     * @return respuestaServicio
     */
    public cl.gob.aem.valida.EstadoGlosaType[] getRespuestaServicio() {
        return respuestaServicio;
    }


    /**
     * Sets the respuestaServicio value for this ProveedorTypeServicios.
     * 
     * @param respuestaServicio
     */
    public void setRespuestaServicio(cl.gob.aem.valida.EstadoGlosaType[] respuestaServicio) {
        this.respuestaServicio = respuestaServicio;
    }

    public cl.gob.aem.valida.EstadoGlosaType getRespuestaServicio(int i) {
        return this.respuestaServicio[i];
    }

    public void setRespuestaServicio(int i, cl.gob.aem.valida.EstadoGlosaType _value) {
        this.respuestaServicio[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProveedorTypeServicios)) return false;
        ProveedorTypeServicios other = (ProveedorTypeServicios) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicio==null && other.getServicio()==null) || 
             (this.servicio!=null &&
              java.util.Arrays.equals(this.servicio, other.getServicio()))) &&
            ((this.respuestaServicio==null && other.getRespuestaServicio()==null) || 
             (this.respuestaServicio!=null &&
              java.util.Arrays.equals(this.respuestaServicio, other.getRespuestaServicio())));
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
        if (getServicio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRespuestaServicio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRespuestaServicio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRespuestaServicio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProveedorTypeServicios.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">proveedorType>servicios"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "servicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "serviciosValores"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "respuestaServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "estadoGlosaType"));
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
