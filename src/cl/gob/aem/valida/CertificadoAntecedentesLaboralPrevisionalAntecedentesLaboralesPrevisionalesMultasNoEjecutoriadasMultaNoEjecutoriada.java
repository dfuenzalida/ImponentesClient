/**
 * CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada  implements java.io.Serializable {
    private java.lang.String numeroMulta;

    private java.math.BigDecimal numeroUnidadMonetaria;

    private int codigoUnidadMonetaria;

    private cl.gob.aem.valida.UnidadMonetariaType unidadMonetaria;

    private org.apache.axis.types.NonNegativeInteger numero;  // attribute

    public CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada() {
    }

    public CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada(
           java.lang.String numeroMulta,
           java.math.BigDecimal numeroUnidadMonetaria,
           int codigoUnidadMonetaria,
           cl.gob.aem.valida.UnidadMonetariaType unidadMonetaria,
           org.apache.axis.types.NonNegativeInteger numero) {
           this.numeroMulta = numeroMulta;
           this.numeroUnidadMonetaria = numeroUnidadMonetaria;
           this.codigoUnidadMonetaria = codigoUnidadMonetaria;
           this.unidadMonetaria = unidadMonetaria;
           this.numero = numero;
    }


    /**
     * Gets the numeroMulta value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.
     * 
     * @return numeroMulta
     */
    public java.lang.String getNumeroMulta() {
        return numeroMulta;
    }


    /**
     * Sets the numeroMulta value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.
     * 
     * @param numeroMulta
     */
    public void setNumeroMulta(java.lang.String numeroMulta) {
        this.numeroMulta = numeroMulta;
    }


    /**
     * Gets the numeroUnidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.
     * 
     * @return numeroUnidadMonetaria
     */
    public java.math.BigDecimal getNumeroUnidadMonetaria() {
        return numeroUnidadMonetaria;
    }


    /**
     * Sets the numeroUnidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.
     * 
     * @param numeroUnidadMonetaria
     */
    public void setNumeroUnidadMonetaria(java.math.BigDecimal numeroUnidadMonetaria) {
        this.numeroUnidadMonetaria = numeroUnidadMonetaria;
    }


    /**
     * Gets the codigoUnidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.
     * 
     * @return codigoUnidadMonetaria
     */
    public int getCodigoUnidadMonetaria() {
        return codigoUnidadMonetaria;
    }


    /**
     * Sets the codigoUnidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.
     * 
     * @param codigoUnidadMonetaria
     */
    public void setCodigoUnidadMonetaria(int codigoUnidadMonetaria) {
        this.codigoUnidadMonetaria = codigoUnidadMonetaria;
    }


    /**
     * Gets the unidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.
     * 
     * @return unidadMonetaria
     */
    public cl.gob.aem.valida.UnidadMonetariaType getUnidadMonetaria() {
        return unidadMonetaria;
    }


    /**
     * Sets the unidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.
     * 
     * @param unidadMonetaria
     */
    public void setUnidadMonetaria(cl.gob.aem.valida.UnidadMonetariaType unidadMonetaria) {
        this.unidadMonetaria = unidadMonetaria;
    }


    /**
     * Gets the numero value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.
     * 
     * @return numero
     */
    public org.apache.axis.types.NonNegativeInteger getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.
     * 
     * @param numero
     */
    public void setNumero(org.apache.axis.types.NonNegativeInteger numero) {
        this.numero = numero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada)) return false;
        CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada other = (CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroMulta==null && other.getNumeroMulta()==null) || 
             (this.numeroMulta!=null &&
              this.numeroMulta.equals(other.getNumeroMulta()))) &&
            ((this.numeroUnidadMonetaria==null && other.getNumeroUnidadMonetaria()==null) || 
             (this.numeroUnidadMonetaria!=null &&
              this.numeroUnidadMonetaria.equals(other.getNumeroUnidadMonetaria()))) &&
            this.codigoUnidadMonetaria == other.getCodigoUnidadMonetaria() &&
            ((this.unidadMonetaria==null && other.getUnidadMonetaria()==null) || 
             (this.unidadMonetaria!=null &&
              this.unidadMonetaria.equals(other.getUnidadMonetaria()))) &&
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
        if (getNumeroMulta() != null) {
            _hashCode += getNumeroMulta().hashCode();
        }
        if (getNumeroUnidadMonetaria() != null) {
            _hashCode += getNumeroUnidadMonetaria().hashCode();
        }
        _hashCode += getCodigoUnidadMonetaria();
        if (getUnidadMonetaria() != null) {
            _hashCode += getUnidadMonetaria().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasNoEjecutoriadasMultaNoEjecutoriada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>CertificadoAntecedentesLaboralPrevisional>AntecedentesLaboralesPrevisionales>MultasNoEjecutoriadas>MultaNoEjecutoriada"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numero");
        attrField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroMulta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroMulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroUnidadMonetaria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroUnidadMonetaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUnidadMonetaria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoUnidadMonetaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadMonetaria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "UnidadMonetaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "UnidadMonetariaType"));
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
