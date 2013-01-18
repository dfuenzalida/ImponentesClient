/**
 * BitacoraDatosGestion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;


/**
 * Datos que dan cuenta del resultado de la
 *                 solicitud
 */
public class BitacoraDatosGestion  implements java.io.Serializable {
    /* Fecha en que se generó la solicitud de los datos de las
     *                     aeronaves */
    private cl.gob.aem.valida.FechaType fechaHoraSolicitud;

    /* Fecha en que se respondío la solicitud */
    private cl.gob.aem.valida.FechaType fechaHoraRespuesta;

    /* Mensaje relativo al proceso */
    private java.lang.String mensaje;

    /* Firma Electronica del mensaje */
    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public BitacoraDatosGestion() {
    }

    public BitacoraDatosGestion(
           cl.gob.aem.valida.FechaType fechaHoraSolicitud,
           cl.gob.aem.valida.FechaType fechaHoraRespuesta,
           java.lang.String mensaje,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.fechaHoraSolicitud = fechaHoraSolicitud;
           this.fechaHoraRespuesta = fechaHoraRespuesta;
           this.mensaje = mensaje;
           this.signature = signature;
    }


    /**
     * Gets the fechaHoraSolicitud value for this BitacoraDatosGestion.
     * 
     * @return fechaHoraSolicitud   * Fecha en que se generó la solicitud de los datos de las
     *                     aeronaves
     */
    public cl.gob.aem.valida.FechaType getFechaHoraSolicitud() {
        return fechaHoraSolicitud;
    }


    /**
     * Sets the fechaHoraSolicitud value for this BitacoraDatosGestion.
     * 
     * @param fechaHoraSolicitud   * Fecha en que se generó la solicitud de los datos de las
     *                     aeronaves
     */
    public void setFechaHoraSolicitud(cl.gob.aem.valida.FechaType fechaHoraSolicitud) {
        this.fechaHoraSolicitud = fechaHoraSolicitud;
    }


    /**
     * Gets the fechaHoraRespuesta value for this BitacoraDatosGestion.
     * 
     * @return fechaHoraRespuesta   * Fecha en que se respondío la solicitud
     */
    public cl.gob.aem.valida.FechaType getFechaHoraRespuesta() {
        return fechaHoraRespuesta;
    }


    /**
     * Sets the fechaHoraRespuesta value for this BitacoraDatosGestion.
     * 
     * @param fechaHoraRespuesta   * Fecha en que se respondío la solicitud
     */
    public void setFechaHoraRespuesta(cl.gob.aem.valida.FechaType fechaHoraRespuesta) {
        this.fechaHoraRespuesta = fechaHoraRespuesta;
    }


    /**
     * Gets the mensaje value for this BitacoraDatosGestion.
     * 
     * @return mensaje   * Mensaje relativo al proceso
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this BitacoraDatosGestion.
     * 
     * @param mensaje   * Mensaje relativo al proceso
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the signature value for this BitacoraDatosGestion.
     * 
     * @return signature   * Firma Electronica del mensaje
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this BitacoraDatosGestion.
     * 
     * @param signature   * Firma Electronica del mensaje
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BitacoraDatosGestion)) return false;
        BitacoraDatosGestion other = (BitacoraDatosGestion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaHoraSolicitud==null && other.getFechaHoraSolicitud()==null) || 
             (this.fechaHoraSolicitud!=null &&
              this.fechaHoraSolicitud.equals(other.getFechaHoraSolicitud()))) &&
            ((this.fechaHoraRespuesta==null && other.getFechaHoraRespuesta()==null) || 
             (this.fechaHoraRespuesta!=null &&
              this.fechaHoraRespuesta.equals(other.getFechaHoraRespuesta()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature())));
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
        if (getFechaHoraSolicitud() != null) {
            _hashCode += getFechaHoraSolicitud().hashCode();
        }
        if (getFechaHoraRespuesta() != null) {
            _hashCode += getFechaHoraRespuesta().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BitacoraDatosGestion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>Bitacora>DatosGestion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHoraSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaHoraSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHoraRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaHoraRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureType"));
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
