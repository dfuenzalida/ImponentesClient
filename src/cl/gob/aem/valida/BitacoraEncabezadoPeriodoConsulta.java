/**
 * BitacoraEncabezadoPeriodoConsulta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class BitacoraEncabezadoPeriodoConsulta  implements java.io.Serializable {
    /* Fecha de Inicio para la consulta */
    private java.util.Date fechaInicio;

    /* Fecha de Fin para la consulta */
    private java.util.Date fechaFinal;

    public BitacoraEncabezadoPeriodoConsulta() {
    }

    public BitacoraEncabezadoPeriodoConsulta(
           java.util.Date fechaInicio,
           java.util.Date fechaFinal) {
           this.fechaInicio = fechaInicio;
           this.fechaFinal = fechaFinal;
    }


    /**
     * Gets the fechaInicio value for this BitacoraEncabezadoPeriodoConsulta.
     * 
     * @return fechaInicio   * Fecha de Inicio para la consulta
     */
    public java.util.Date getFechaInicio() {
        return fechaInicio;
    }


    /**
     * Sets the fechaInicio value for this BitacoraEncabezadoPeriodoConsulta.
     * 
     * @param fechaInicio   * Fecha de Inicio para la consulta
     */
    public void setFechaInicio(java.util.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    /**
     * Gets the fechaFinal value for this BitacoraEncabezadoPeriodoConsulta.
     * 
     * @return fechaFinal   * Fecha de Fin para la consulta
     */
    public java.util.Date getFechaFinal() {
        return fechaFinal;
    }


    /**
     * Sets the fechaFinal value for this BitacoraEncabezadoPeriodoConsulta.
     * 
     * @param fechaFinal   * Fecha de Fin para la consulta
     */
    public void setFechaFinal(java.util.Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BitacoraEncabezadoPeriodoConsulta)) return false;
        BitacoraEncabezadoPeriodoConsulta other = (BitacoraEncabezadoPeriodoConsulta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaInicio==null && other.getFechaInicio()==null) || 
             (this.fechaInicio!=null &&
              this.fechaInicio.equals(other.getFechaInicio()))) &&
            ((this.fechaFinal==null && other.getFechaFinal()==null) || 
             (this.fechaFinal!=null &&
              this.fechaFinal.equals(other.getFechaFinal())));
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
        if (getFechaInicio() != null) {
            _hashCode += getFechaInicio().hashCode();
        }
        if (getFechaFinal() != null) {
            _hashCode += getFechaFinal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BitacoraEncabezadoPeriodoConsulta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>Bitacora>Encabezado>PeriodoConsulta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
