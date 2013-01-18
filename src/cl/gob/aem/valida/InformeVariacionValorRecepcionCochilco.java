/**
 * InformeVariacionValorRecepcionCochilco.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformeVariacionValorRecepcionCochilco  implements java.io.Serializable {
    /* Fecha de recepción de documentos en cochilco */
    private cl.gob.aem.valida.FechaType fechaRecepcion;

    /* Fecha de digitación en cochilco */
    private cl.gob.aem.valida.FechaType fechaDigitacion;

    public InformeVariacionValorRecepcionCochilco() {
    }

    public InformeVariacionValorRecepcionCochilco(
           cl.gob.aem.valida.FechaType fechaRecepcion,
           cl.gob.aem.valida.FechaType fechaDigitacion) {
           this.fechaRecepcion = fechaRecepcion;
           this.fechaDigitacion = fechaDigitacion;
    }


    /**
     * Gets the fechaRecepcion value for this InformeVariacionValorRecepcionCochilco.
     * 
     * @return fechaRecepcion   * Fecha de recepción de documentos en cochilco
     */
    public cl.gob.aem.valida.FechaType getFechaRecepcion() {
        return fechaRecepcion;
    }


    /**
     * Sets the fechaRecepcion value for this InformeVariacionValorRecepcionCochilco.
     * 
     * @param fechaRecepcion   * Fecha de recepción de documentos en cochilco
     */
    public void setFechaRecepcion(cl.gob.aem.valida.FechaType fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }


    /**
     * Gets the fechaDigitacion value for this InformeVariacionValorRecepcionCochilco.
     * 
     * @return fechaDigitacion   * Fecha de digitación en cochilco
     */
    public cl.gob.aem.valida.FechaType getFechaDigitacion() {
        return fechaDigitacion;
    }


    /**
     * Sets the fechaDigitacion value for this InformeVariacionValorRecepcionCochilco.
     * 
     * @param fechaDigitacion   * Fecha de digitación en cochilco
     */
    public void setFechaDigitacion(cl.gob.aem.valida.FechaType fechaDigitacion) {
        this.fechaDigitacion = fechaDigitacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformeVariacionValorRecepcionCochilco)) return false;
        InformeVariacionValorRecepcionCochilco other = (InformeVariacionValorRecepcionCochilco) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaRecepcion==null && other.getFechaRecepcion()==null) || 
             (this.fechaRecepcion!=null &&
              this.fechaRecepcion.equals(other.getFechaRecepcion()))) &&
            ((this.fechaDigitacion==null && other.getFechaDigitacion()==null) || 
             (this.fechaDigitacion!=null &&
              this.fechaDigitacion.equals(other.getFechaDigitacion())));
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
        if (getFechaRecepcion() != null) {
            _hashCode += getFechaRecepcion().hashCode();
        }
        if (getFechaDigitacion() != null) {
            _hashCode += getFechaDigitacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformeVariacionValorRecepcionCochilco.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>InformeVariacionValor>RecepcionCochilco"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRecepcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaRecepcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDigitacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaDigitacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
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
