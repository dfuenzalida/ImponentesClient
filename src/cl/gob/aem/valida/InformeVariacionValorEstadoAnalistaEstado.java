/**
 * InformeVariacionValorEstadoAnalistaEstado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformeVariacionValorEstadoAnalistaEstado  implements java.io.Serializable {
    /* Código del Servicio que hace la observacion y/o estado. Los
     * valores posibles son: 1 que indica COCHILCO y 2  que indica ADUANA */
    private org.apache.axis.types.PositiveInteger codigoServicio;

    /* Código del estado */
    private org.apache.axis.types.PositiveInteger codigoEstado;

    /* Descripción estado */
    private java.lang.String descripcionEstado;

    /* Observaciones del Analista */
    private java.lang.String observacionAnalista;

    /* Fecha de realización de la observación */
    private cl.gob.aem.valida.FechaType fechaObservacion;

    public InformeVariacionValorEstadoAnalistaEstado() {
    }

    public InformeVariacionValorEstadoAnalistaEstado(
           org.apache.axis.types.PositiveInteger codigoServicio,
           org.apache.axis.types.PositiveInteger codigoEstado,
           java.lang.String descripcionEstado,
           java.lang.String observacionAnalista,
           cl.gob.aem.valida.FechaType fechaObservacion) {
           this.codigoServicio = codigoServicio;
           this.codigoEstado = codigoEstado;
           this.descripcionEstado = descripcionEstado;
           this.observacionAnalista = observacionAnalista;
           this.fechaObservacion = fechaObservacion;
    }


    /**
     * Gets the codigoServicio value for this InformeVariacionValorEstadoAnalistaEstado.
     * 
     * @return codigoServicio   * Código del Servicio que hace la observacion y/o estado. Los
     * valores posibles son: 1 que indica COCHILCO y 2  que indica ADUANA
     */
    public org.apache.axis.types.PositiveInteger getCodigoServicio() {
        return codigoServicio;
    }


    /**
     * Sets the codigoServicio value for this InformeVariacionValorEstadoAnalistaEstado.
     * 
     * @param codigoServicio   * Código del Servicio que hace la observacion y/o estado. Los
     * valores posibles son: 1 que indica COCHILCO y 2  que indica ADUANA
     */
    public void setCodigoServicio(org.apache.axis.types.PositiveInteger codigoServicio) {
        this.codigoServicio = codigoServicio;
    }


    /**
     * Gets the codigoEstado value for this InformeVariacionValorEstadoAnalistaEstado.
     * 
     * @return codigoEstado   * Código del estado
     */
    public org.apache.axis.types.PositiveInteger getCodigoEstado() {
        return codigoEstado;
    }


    /**
     * Sets the codigoEstado value for this InformeVariacionValorEstadoAnalistaEstado.
     * 
     * @param codigoEstado   * Código del estado
     */
    public void setCodigoEstado(org.apache.axis.types.PositiveInteger codigoEstado) {
        this.codigoEstado = codigoEstado;
    }


    /**
     * Gets the descripcionEstado value for this InformeVariacionValorEstadoAnalistaEstado.
     * 
     * @return descripcionEstado   * Descripción estado
     */
    public java.lang.String getDescripcionEstado() {
        return descripcionEstado;
    }


    /**
     * Sets the descripcionEstado value for this InformeVariacionValorEstadoAnalistaEstado.
     * 
     * @param descripcionEstado   * Descripción estado
     */
    public void setDescripcionEstado(java.lang.String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }


    /**
     * Gets the observacionAnalista value for this InformeVariacionValorEstadoAnalistaEstado.
     * 
     * @return observacionAnalista   * Observaciones del Analista
     */
    public java.lang.String getObservacionAnalista() {
        return observacionAnalista;
    }


    /**
     * Sets the observacionAnalista value for this InformeVariacionValorEstadoAnalistaEstado.
     * 
     * @param observacionAnalista   * Observaciones del Analista
     */
    public void setObservacionAnalista(java.lang.String observacionAnalista) {
        this.observacionAnalista = observacionAnalista;
    }


    /**
     * Gets the fechaObservacion value for this InformeVariacionValorEstadoAnalistaEstado.
     * 
     * @return fechaObservacion   * Fecha de realización de la observación
     */
    public cl.gob.aem.valida.FechaType getFechaObservacion() {
        return fechaObservacion;
    }


    /**
     * Sets the fechaObservacion value for this InformeVariacionValorEstadoAnalistaEstado.
     * 
     * @param fechaObservacion   * Fecha de realización de la observación
     */
    public void setFechaObservacion(cl.gob.aem.valida.FechaType fechaObservacion) {
        this.fechaObservacion = fechaObservacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformeVariacionValorEstadoAnalistaEstado)) return false;
        InformeVariacionValorEstadoAnalistaEstado other = (InformeVariacionValorEstadoAnalistaEstado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoServicio==null && other.getCodigoServicio()==null) || 
             (this.codigoServicio!=null &&
              this.codigoServicio.equals(other.getCodigoServicio()))) &&
            ((this.codigoEstado==null && other.getCodigoEstado()==null) || 
             (this.codigoEstado!=null &&
              this.codigoEstado.equals(other.getCodigoEstado()))) &&
            ((this.descripcionEstado==null && other.getDescripcionEstado()==null) || 
             (this.descripcionEstado!=null &&
              this.descripcionEstado.equals(other.getDescripcionEstado()))) &&
            ((this.observacionAnalista==null && other.getObservacionAnalista()==null) || 
             (this.observacionAnalista!=null &&
              this.observacionAnalista.equals(other.getObservacionAnalista()))) &&
            ((this.fechaObservacion==null && other.getFechaObservacion()==null) || 
             (this.fechaObservacion!=null &&
              this.fechaObservacion.equals(other.getFechaObservacion())));
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
        if (getCodigoServicio() != null) {
            _hashCode += getCodigoServicio().hashCode();
        }
        if (getCodigoEstado() != null) {
            _hashCode += getCodigoEstado().hashCode();
        }
        if (getDescripcionEstado() != null) {
            _hashCode += getDescripcionEstado().hashCode();
        }
        if (getObservacionAnalista() != null) {
            _hashCode += getObservacionAnalista().hashCode();
        }
        if (getFechaObservacion() != null) {
            _hashCode += getFechaObservacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformeVariacionValorEstadoAnalistaEstado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>InformeVariacionValor>EstadoAnalista>Estado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoEstado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DescripcionEstado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacionAnalista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ObservacionAnalista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaObservacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaObservacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
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
