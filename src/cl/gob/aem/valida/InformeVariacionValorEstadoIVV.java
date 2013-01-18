/**
 * InformeVariacionValorEstadoIVV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformeVariacionValorEstadoIVV  implements java.io.Serializable {
    /* Código de estado del IVV */
    private java.lang.String codigoEstadoIVV;

    /* Descripción Estado del IVV */
    private java.lang.String descripcionEstadoIVV;

    /* Fecha registro del estado general */
    private java.util.Date fechaEstadoIVV;

    public InformeVariacionValorEstadoIVV() {
    }

    public InformeVariacionValorEstadoIVV(
           java.lang.String codigoEstadoIVV,
           java.lang.String descripcionEstadoIVV,
           java.util.Date fechaEstadoIVV) {
           this.codigoEstadoIVV = codigoEstadoIVV;
           this.descripcionEstadoIVV = descripcionEstadoIVV;
           this.fechaEstadoIVV = fechaEstadoIVV;
    }


    /**
     * Gets the codigoEstadoIVV value for this InformeVariacionValorEstadoIVV.
     * 
     * @return codigoEstadoIVV   * Código de estado del IVV
     */
    public java.lang.String getCodigoEstadoIVV() {
        return codigoEstadoIVV;
    }


    /**
     * Sets the codigoEstadoIVV value for this InformeVariacionValorEstadoIVV.
     * 
     * @param codigoEstadoIVV   * Código de estado del IVV
     */
    public void setCodigoEstadoIVV(java.lang.String codigoEstadoIVV) {
        this.codigoEstadoIVV = codigoEstadoIVV;
    }


    /**
     * Gets the descripcionEstadoIVV value for this InformeVariacionValorEstadoIVV.
     * 
     * @return descripcionEstadoIVV   * Descripción Estado del IVV
     */
    public java.lang.String getDescripcionEstadoIVV() {
        return descripcionEstadoIVV;
    }


    /**
     * Sets the descripcionEstadoIVV value for this InformeVariacionValorEstadoIVV.
     * 
     * @param descripcionEstadoIVV   * Descripción Estado del IVV
     */
    public void setDescripcionEstadoIVV(java.lang.String descripcionEstadoIVV) {
        this.descripcionEstadoIVV = descripcionEstadoIVV;
    }


    /**
     * Gets the fechaEstadoIVV value for this InformeVariacionValorEstadoIVV.
     * 
     * @return fechaEstadoIVV   * Fecha registro del estado general
     */
    public java.util.Date getFechaEstadoIVV() {
        return fechaEstadoIVV;
    }


    /**
     * Sets the fechaEstadoIVV value for this InformeVariacionValorEstadoIVV.
     * 
     * @param fechaEstadoIVV   * Fecha registro del estado general
     */
    public void setFechaEstadoIVV(java.util.Date fechaEstadoIVV) {
        this.fechaEstadoIVV = fechaEstadoIVV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformeVariacionValorEstadoIVV)) return false;
        InformeVariacionValorEstadoIVV other = (InformeVariacionValorEstadoIVV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoEstadoIVV==null && other.getCodigoEstadoIVV()==null) || 
             (this.codigoEstadoIVV!=null &&
              this.codigoEstadoIVV.equals(other.getCodigoEstadoIVV()))) &&
            ((this.descripcionEstadoIVV==null && other.getDescripcionEstadoIVV()==null) || 
             (this.descripcionEstadoIVV!=null &&
              this.descripcionEstadoIVV.equals(other.getDescripcionEstadoIVV()))) &&
            ((this.fechaEstadoIVV==null && other.getFechaEstadoIVV()==null) || 
             (this.fechaEstadoIVV!=null &&
              this.fechaEstadoIVV.equals(other.getFechaEstadoIVV())));
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
        if (getCodigoEstadoIVV() != null) {
            _hashCode += getCodigoEstadoIVV().hashCode();
        }
        if (getDescripcionEstadoIVV() != null) {
            _hashCode += getDescripcionEstadoIVV().hashCode();
        }
        if (getFechaEstadoIVV() != null) {
            _hashCode += getFechaEstadoIVV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformeVariacionValorEstadoIVV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>InformeVariacionValor>EstadoIVV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEstadoIVV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoEstadoIVV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionEstadoIVV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DescripcionEstadoIVV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaEstadoIVV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaEstadoIVV"));
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
