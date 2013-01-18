/**
 * RespuestaIVV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class RespuestaIVV  implements java.io.Serializable {
    private cl.gob.aem.valida.CodigoRespuestaIVVType codigo;

    private cl.gob.aem.valida.MensajeRespuestaIVVType mensaje;

    private cl.gob.aem.valida.EmisorRespuestaIVVType emisor;

    private java.lang.String error;

    private cl.gob.aem.valida.FechaType fechaHora;

    public RespuestaIVV() {
    }

    public RespuestaIVV(
           cl.gob.aem.valida.CodigoRespuestaIVVType codigo,
           cl.gob.aem.valida.MensajeRespuestaIVVType mensaje,
           cl.gob.aem.valida.EmisorRespuestaIVVType emisor,
           java.lang.String error,
           cl.gob.aem.valida.FechaType fechaHora) {
           this.codigo = codigo;
           this.mensaje = mensaje;
           this.emisor = emisor;
           this.error = error;
           this.fechaHora = fechaHora;
    }


    /**
     * Gets the codigo value for this RespuestaIVV.
     * 
     * @return codigo
     */
    public cl.gob.aem.valida.CodigoRespuestaIVVType getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this RespuestaIVV.
     * 
     * @param codigo
     */
    public void setCodigo(cl.gob.aem.valida.CodigoRespuestaIVVType codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the mensaje value for this RespuestaIVV.
     * 
     * @return mensaje
     */
    public cl.gob.aem.valida.MensajeRespuestaIVVType getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this RespuestaIVV.
     * 
     * @param mensaje
     */
    public void setMensaje(cl.gob.aem.valida.MensajeRespuestaIVVType mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the emisor value for this RespuestaIVV.
     * 
     * @return emisor
     */
    public cl.gob.aem.valida.EmisorRespuestaIVVType getEmisor() {
        return emisor;
    }


    /**
     * Sets the emisor value for this RespuestaIVV.
     * 
     * @param emisor
     */
    public void setEmisor(cl.gob.aem.valida.EmisorRespuestaIVVType emisor) {
        this.emisor = emisor;
    }


    /**
     * Gets the error value for this RespuestaIVV.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this RespuestaIVV.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the fechaHora value for this RespuestaIVV.
     * 
     * @return fechaHora
     */
    public cl.gob.aem.valida.FechaType getFechaHora() {
        return fechaHora;
    }


    /**
     * Sets the fechaHora value for this RespuestaIVV.
     * 
     * @param fechaHora
     */
    public void setFechaHora(cl.gob.aem.valida.FechaType fechaHora) {
        this.fechaHora = fechaHora;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaIVV)) return false;
        RespuestaIVV other = (RespuestaIVV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.emisor==null && other.getEmisor()==null) || 
             (this.emisor!=null &&
              this.emisor.equals(other.getEmisor()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.fechaHora==null && other.getFechaHora()==null) || 
             (this.fechaHora!=null &&
              this.fechaHora.equals(other.getFechaHora())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getEmisor() != null) {
            _hashCode += getEmisor().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getFechaHora() != null) {
            _hashCode += getFechaHora().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaIVV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">RespuestaIVV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoRespuestaIVVType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "MensajeRespuestaIVVType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Emisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "EmisorRespuestaIVVType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaHora"));
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
