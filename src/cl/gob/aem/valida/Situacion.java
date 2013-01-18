/**
 * Situacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class Situacion  implements java.io.Serializable {
    /* Lista Controlada que indica la Situación del Individuo */
    private cl.gob.aem.valida.SituacionSituacion situacion;

    /* Corresponde al número de folio de la Ficha de Protección Social
     * si tiene */
    private java.math.BigInteger folio;

    public Situacion() {
    }

    public Situacion(
           cl.gob.aem.valida.SituacionSituacion situacion,
           java.math.BigInteger folio) {
           this.situacion = situacion;
           this.folio = folio;
    }


    /**
     * Gets the situacion value for this Situacion.
     * 
     * @return situacion   * Lista Controlada que indica la Situación del Individuo
     */
    public cl.gob.aem.valida.SituacionSituacion getSituacion() {
        return situacion;
    }


    /**
     * Sets the situacion value for this Situacion.
     * 
     * @param situacion   * Lista Controlada que indica la Situación del Individuo
     */
    public void setSituacion(cl.gob.aem.valida.SituacionSituacion situacion) {
        this.situacion = situacion;
    }


    /**
     * Gets the folio value for this Situacion.
     * 
     * @return folio   * Corresponde al número de folio de la Ficha de Protección Social
     * si tiene
     */
    public java.math.BigInteger getFolio() {
        return folio;
    }


    /**
     * Sets the folio value for this Situacion.
     * 
     * @param folio   * Corresponde al número de folio de la Ficha de Protección Social
     * si tiene
     */
    public void setFolio(java.math.BigInteger folio) {
        this.folio = folio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Situacion)) return false;
        Situacion other = (Situacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.situacion==null && other.getSituacion()==null) || 
             (this.situacion!=null &&
              this.situacion.equals(other.getSituacion()))) &&
            ((this.folio==null && other.getFolio()==null) || 
             (this.folio!=null &&
              this.folio.equals(other.getFolio())));
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
        if (getSituacion() != null) {
            _hashCode += getSituacion().hashCode();
        }
        if (getFolio() != null) {
            _hashCode += getFolio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Situacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Situacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Situacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">Situacion>Situacion"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Folio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
