/**
 * EncabezadoSobre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;


/**
 * Nombre Esquema: EncabezadoSobre
 * 		
 * 		  Tipo Esquema: Basal
 * 
 * 		  Descripcion: 
 * 			  Encabezado de un Sobre DS 81
 * 
 * 		  Descripcion Campos:
 * 		    -fechaHora: Fecha y hora
 * 		    -proveedor: Tipo complejo (Institucion proveedora, nombre del
 * servicio, respuesta del servicio)
 * 		    -consumidor: Tipo complejo (nombre de la Institucion que consume
 * el tramite y nombre del tramite)
 * 		    -fechaHoraReq: Fecha y hora de uso opcional para el proveedor
 * de servicios 
 *                     -emisor: Nombre del emisor (elemento opcional)
 * 
 * 		    -metadataOperacional: Estado Glosa de la operacion
 * 		    -idSobre: Identifica el sobre es unico para la plataforma, texto.
 * 		    -Signature: Firma del sobre
 * 
 * 		  Tramites que utilizan este esquema:
 * 		
 * 
 * 		  Observaciones:
 * 		    No hay observaciones.
 */
public class EncabezadoSobre  implements java.io.Serializable {
    private java.lang.String idSobre;

    private java.util.Calendar fechaHora;

    private cl.gob.aem.valida.ProveedorType proveedor;

    private cl.gob.aem.valida.ConsumidorType consumidor;

    private java.util.Calendar fechaHoraReq;

    private java.lang.String emisor;

    private cl.gob.aem.valida.EstadoGlosaSobreType metadataOperacional;

    public EncabezadoSobre() {
    }

    public EncabezadoSobre(
           java.lang.String idSobre,
           java.util.Calendar fechaHora,
           cl.gob.aem.valida.ProveedorType proveedor,
           cl.gob.aem.valida.ConsumidorType consumidor,
           java.util.Calendar fechaHoraReq,
           java.lang.String emisor,
           cl.gob.aem.valida.EstadoGlosaSobreType metadataOperacional) {
           this.idSobre = idSobre;
           this.fechaHora = fechaHora;
           this.proveedor = proveedor;
           this.consumidor = consumidor;
           this.fechaHoraReq = fechaHoraReq;
           this.emisor = emisor;
           this.metadataOperacional = metadataOperacional;
    }


    /**
     * Gets the idSobre value for this EncabezadoSobre.
     * 
     * @return idSobre
     */
    public java.lang.String getIdSobre() {
        return idSobre;
    }


    /**
     * Sets the idSobre value for this EncabezadoSobre.
     * 
     * @param idSobre
     */
    public void setIdSobre(java.lang.String idSobre) {
        this.idSobre = idSobre;
    }


    /**
     * Gets the fechaHora value for this EncabezadoSobre.
     * 
     * @return fechaHora
     */
    public java.util.Calendar getFechaHora() {
        return fechaHora;
    }


    /**
     * Sets the fechaHora value for this EncabezadoSobre.
     * 
     * @param fechaHora
     */
    public void setFechaHora(java.util.Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }


    /**
     * Gets the proveedor value for this EncabezadoSobre.
     * 
     * @return proveedor
     */
    public cl.gob.aem.valida.ProveedorType getProveedor() {
        return proveedor;
    }


    /**
     * Sets the proveedor value for this EncabezadoSobre.
     * 
     * @param proveedor
     */
    public void setProveedor(cl.gob.aem.valida.ProveedorType proveedor) {
        this.proveedor = proveedor;
    }


    /**
     * Gets the consumidor value for this EncabezadoSobre.
     * 
     * @return consumidor
     */
    public cl.gob.aem.valida.ConsumidorType getConsumidor() {
        return consumidor;
    }


    /**
     * Sets the consumidor value for this EncabezadoSobre.
     * 
     * @param consumidor
     */
    public void setConsumidor(cl.gob.aem.valida.ConsumidorType consumidor) {
        this.consumidor = consumidor;
    }


    /**
     * Gets the fechaHoraReq value for this EncabezadoSobre.
     * 
     * @return fechaHoraReq
     */
    public java.util.Calendar getFechaHoraReq() {
        return fechaHoraReq;
    }


    /**
     * Sets the fechaHoraReq value for this EncabezadoSobre.
     * 
     * @param fechaHoraReq
     */
    public void setFechaHoraReq(java.util.Calendar fechaHoraReq) {
        this.fechaHoraReq = fechaHoraReq;
    }


    /**
     * Gets the emisor value for this EncabezadoSobre.
     * 
     * @return emisor
     */
    public java.lang.String getEmisor() {
        return emisor;
    }


    /**
     * Sets the emisor value for this EncabezadoSobre.
     * 
     * @param emisor
     */
    public void setEmisor(java.lang.String emisor) {
        this.emisor = emisor;
    }


    /**
     * Gets the metadataOperacional value for this EncabezadoSobre.
     * 
     * @return metadataOperacional
     */
    public cl.gob.aem.valida.EstadoGlosaSobreType getMetadataOperacional() {
        return metadataOperacional;
    }


    /**
     * Sets the metadataOperacional value for this EncabezadoSobre.
     * 
     * @param metadataOperacional
     */
    public void setMetadataOperacional(cl.gob.aem.valida.EstadoGlosaSobreType metadataOperacional) {
        this.metadataOperacional = metadataOperacional;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EncabezadoSobre)) return false;
        EncabezadoSobre other = (EncabezadoSobre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idSobre==null && other.getIdSobre()==null) || 
             (this.idSobre!=null &&
              this.idSobre.equals(other.getIdSobre()))) &&
            ((this.fechaHora==null && other.getFechaHora()==null) || 
             (this.fechaHora!=null &&
              this.fechaHora.equals(other.getFechaHora()))) &&
            ((this.proveedor==null && other.getProveedor()==null) || 
             (this.proveedor!=null &&
              this.proveedor.equals(other.getProveedor()))) &&
            ((this.consumidor==null && other.getConsumidor()==null) || 
             (this.consumidor!=null &&
              this.consumidor.equals(other.getConsumidor()))) &&
            ((this.fechaHoraReq==null && other.getFechaHoraReq()==null) || 
             (this.fechaHoraReq!=null &&
              this.fechaHoraReq.equals(other.getFechaHoraReq()))) &&
            ((this.emisor==null && other.getEmisor()==null) || 
             (this.emisor!=null &&
              this.emisor.equals(other.getEmisor()))) &&
            ((this.metadataOperacional==null && other.getMetadataOperacional()==null) || 
             (this.metadataOperacional!=null &&
              this.metadataOperacional.equals(other.getMetadataOperacional())));
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
        if (getIdSobre() != null) {
            _hashCode += getIdSobre().hashCode();
        }
        if (getFechaHora() != null) {
            _hashCode += getFechaHora().hashCode();
        }
        if (getProveedor() != null) {
            _hashCode += getProveedor().hashCode();
        }
        if (getConsumidor() != null) {
            _hashCode += getConsumidor().hashCode();
        }
        if (getFechaHoraReq() != null) {
            _hashCode += getFechaHoraReq().hashCode();
        }
        if (getEmisor() != null) {
            _hashCode += getEmisor().hashCode();
        }
        if (getMetadataOperacional() != null) {
            _hashCode += getMetadataOperacional().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EncabezadoSobre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "encabezadoSobre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSobre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "idSobre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "proveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "proveedorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumidor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "consumidor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "consumidorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHoraReq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaHoraReq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "emisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataOperacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "metadataOperacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "estadoGlosaSobreType"));
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
