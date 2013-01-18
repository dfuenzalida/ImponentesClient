/**
 * CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM  implements java.io.Serializable {
    private java.lang.String numeroResolucion;

    private java.lang.String tipoMulta;

    private java.math.BigDecimal montoEnPesos;

    private org.apache.axis.types.NonNegativeInteger numero;  // attribute

    public CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM() {
    }

    public CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM(
           java.lang.String numeroResolucion,
           java.lang.String tipoMulta,
           java.math.BigDecimal montoEnPesos,
           org.apache.axis.types.NonNegativeInteger numero) {
           this.numeroResolucion = numeroResolucion;
           this.tipoMulta = tipoMulta;
           this.montoEnPesos = montoEnPesos;
           this.numero = numero;
    }


    /**
     * Gets the numeroResolucion value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM.
     * 
     * @return numeroResolucion
     */
    public java.lang.String getNumeroResolucion() {
        return numeroResolucion;
    }


    /**
     * Sets the numeroResolucion value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM.
     * 
     * @param numeroResolucion
     */
    public void setNumeroResolucion(java.lang.String numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }


    /**
     * Gets the tipoMulta value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM.
     * 
     * @return tipoMulta
     */
    public java.lang.String getTipoMulta() {
        return tipoMulta;
    }


    /**
     * Sets the tipoMulta value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM.
     * 
     * @param tipoMulta
     */
    public void setTipoMulta(java.lang.String tipoMulta) {
        this.tipoMulta = tipoMulta;
    }


    /**
     * Gets the montoEnPesos value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM.
     * 
     * @return montoEnPesos
     */
    public java.math.BigDecimal getMontoEnPesos() {
        return montoEnPesos;
    }


    /**
     * Sets the montoEnPesos value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM.
     * 
     * @param montoEnPesos
     */
    public void setMontoEnPesos(java.math.BigDecimal montoEnPesos) {
        this.montoEnPesos = montoEnPesos;
    }


    /**
     * Gets the numero value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM.
     * 
     * @return numero
     */
    public org.apache.axis.types.NonNegativeInteger getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM.
     * 
     * @param numero
     */
    public void setNumero(org.apache.axis.types.NonNegativeInteger numero) {
        this.numero = numero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM)) return false;
        CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM other = (CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroResolucion==null && other.getNumeroResolucion()==null) || 
             (this.numeroResolucion!=null &&
              this.numeroResolucion.equals(other.getNumeroResolucion()))) &&
            ((this.tipoMulta==null && other.getTipoMulta()==null) || 
             (this.tipoMulta!=null &&
              this.tipoMulta.equals(other.getTipoMulta()))) &&
            ((this.montoEnPesos==null && other.getMontoEnPesos()==null) || 
             (this.montoEnPesos!=null &&
              this.montoEnPesos.equals(other.getMontoEnPesos()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero())));
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
        if (getNumeroResolucion() != null) {
            _hashCode += getNumeroResolucion().hashCode();
        }
        if (getTipoMulta() != null) {
            _hashCode += getTipoMulta().hashCode();
        }
        if (getMontoEnPesos() != null) {
            _hashCode += getMontoEnPesos().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasDICOMMultaDICOM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>CertificadoAntecedentesLaboralPrevisional>AntecedentesLaboralesPrevisionales>MultasDICOM>MultaDICOM"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numero");
        attrField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroResolucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroResolucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoMulta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TipoMulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoEnPesos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "MontoEnPesos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
