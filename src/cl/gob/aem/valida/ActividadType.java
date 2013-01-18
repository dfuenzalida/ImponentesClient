/**
 * ActividadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;


/**
 * Nombre Esquema: Actividades
 * 			Tipo Esquema: Basal
 * 			Descripcion: 
 * 				Este esquema define los elementos pertenecientes a las Actividades
 * Económicas Asociadas a un Contribuyente.
 * 			Descripción Elementos:
 * 			- actividad: String
 * 			- categoria: String
 * 			- descripcion: String
 * 			- fechaInicio: fecha
 * 
 * 			Trámites que utilizan este esquema:
 * 			- Proceso de cobranza: TGR
 * 			- Pago de bonificaciones: TGR
 * 
 * 			Observaciones:
 * 			* No hay observaciones.
 */
public class ActividadType  implements java.io.Serializable {
    private java.lang.String codigoActividad;

    private java.lang.String categoria;

    private java.lang.String descripcion;

    private cl.gob.aem.valida.FechaType fechaInicio;

    public ActividadType() {
    }

    public ActividadType(
           java.lang.String codigoActividad,
           java.lang.String categoria,
           java.lang.String descripcion,
           cl.gob.aem.valida.FechaType fechaInicio) {
           this.codigoActividad = codigoActividad;
           this.categoria = categoria;
           this.descripcion = descripcion;
           this.fechaInicio = fechaInicio;
    }


    /**
     * Gets the codigoActividad value for this ActividadType.
     * 
     * @return codigoActividad
     */
    public java.lang.String getCodigoActividad() {
        return codigoActividad;
    }


    /**
     * Sets the codigoActividad value for this ActividadType.
     * 
     * @param codigoActividad
     */
    public void setCodigoActividad(java.lang.String codigoActividad) {
        this.codigoActividad = codigoActividad;
    }


    /**
     * Gets the categoria value for this ActividadType.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this ActividadType.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the descripcion value for this ActividadType.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this ActividadType.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the fechaInicio value for this ActividadType.
     * 
     * @return fechaInicio
     */
    public cl.gob.aem.valida.FechaType getFechaInicio() {
        return fechaInicio;
    }


    /**
     * Sets the fechaInicio value for this ActividadType.
     * 
     * @param fechaInicio
     */
    public void setFechaInicio(cl.gob.aem.valida.FechaType fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActividadType)) return false;
        ActividadType other = (ActividadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoActividad==null && other.getCodigoActividad()==null) || 
             (this.codigoActividad!=null &&
              this.codigoActividad.equals(other.getCodigoActividad()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.fechaInicio==null && other.getFechaInicio()==null) || 
             (this.fechaInicio!=null &&
              this.fechaInicio.equals(other.getFechaInicio())));
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
        if (getCodigoActividad() != null) {
            _hashCode += getCodigoActividad().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getFechaInicio() != null) {
            _hashCode += getFechaInicio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActividadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "actividadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoActividad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "codigoActividad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaInicio"));
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
