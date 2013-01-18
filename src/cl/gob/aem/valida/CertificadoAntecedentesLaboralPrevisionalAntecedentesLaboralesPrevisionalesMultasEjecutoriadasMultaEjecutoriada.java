/**
 * CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada  implements java.io.Serializable {
    private java.lang.String numeroMulta;

    private java.math.BigDecimal numeroUnidadMonetaria;

    private int codigoUnidadMonetaria;

    private cl.gob.aem.valida.UnidadMonetariaType unidadMonetaria;

    private int codigoOficina;

    private int codigoEstado;

    private cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriadaEstadoTGR estadoTGR;

    private java.lang.String descripcionEstadoTGR;

    private org.apache.axis.types.NonNegativeInteger numero;  // attribute

    public CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada() {
    }

    public CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada(
           java.lang.String numeroMulta,
           java.math.BigDecimal numeroUnidadMonetaria,
           int codigoUnidadMonetaria,
           cl.gob.aem.valida.UnidadMonetariaType unidadMonetaria,
           int codigoOficina,
           int codigoEstado,
           cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriadaEstadoTGR estadoTGR,
           java.lang.String descripcionEstadoTGR,
           org.apache.axis.types.NonNegativeInteger numero) {
           this.numeroMulta = numeroMulta;
           this.numeroUnidadMonetaria = numeroUnidadMonetaria;
           this.codigoUnidadMonetaria = codigoUnidadMonetaria;
           this.unidadMonetaria = unidadMonetaria;
           this.codigoOficina = codigoOficina;
           this.codigoEstado = codigoEstado;
           this.estadoTGR = estadoTGR;
           this.descripcionEstadoTGR = descripcionEstadoTGR;
           this.numero = numero;
    }


    /**
     * Gets the numeroMulta value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @return numeroMulta
     */
    public java.lang.String getNumeroMulta() {
        return numeroMulta;
    }


    /**
     * Sets the numeroMulta value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @param numeroMulta
     */
    public void setNumeroMulta(java.lang.String numeroMulta) {
        this.numeroMulta = numeroMulta;
    }


    /**
     * Gets the numeroUnidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @return numeroUnidadMonetaria
     */
    public java.math.BigDecimal getNumeroUnidadMonetaria() {
        return numeroUnidadMonetaria;
    }


    /**
     * Sets the numeroUnidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @param numeroUnidadMonetaria
     */
    public void setNumeroUnidadMonetaria(java.math.BigDecimal numeroUnidadMonetaria) {
        this.numeroUnidadMonetaria = numeroUnidadMonetaria;
    }


    /**
     * Gets the codigoUnidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @return codigoUnidadMonetaria
     */
    public int getCodigoUnidadMonetaria() {
        return codigoUnidadMonetaria;
    }


    /**
     * Sets the codigoUnidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @param codigoUnidadMonetaria
     */
    public void setCodigoUnidadMonetaria(int codigoUnidadMonetaria) {
        this.codigoUnidadMonetaria = codigoUnidadMonetaria;
    }


    /**
     * Gets the unidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @return unidadMonetaria
     */
    public cl.gob.aem.valida.UnidadMonetariaType getUnidadMonetaria() {
        return unidadMonetaria;
    }


    /**
     * Sets the unidadMonetaria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @param unidadMonetaria
     */
    public void setUnidadMonetaria(cl.gob.aem.valida.UnidadMonetariaType unidadMonetaria) {
        this.unidadMonetaria = unidadMonetaria;
    }


    /**
     * Gets the codigoOficina value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @return codigoOficina
     */
    public int getCodigoOficina() {
        return codigoOficina;
    }


    /**
     * Sets the codigoOficina value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @param codigoOficina
     */
    public void setCodigoOficina(int codigoOficina) {
        this.codigoOficina = codigoOficina;
    }


    /**
     * Gets the codigoEstado value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @return codigoEstado
     */
    public int getCodigoEstado() {
        return codigoEstado;
    }


    /**
     * Sets the codigoEstado value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @param codigoEstado
     */
    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }


    /**
     * Gets the estadoTGR value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @return estadoTGR
     */
    public cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriadaEstadoTGR getEstadoTGR() {
        return estadoTGR;
    }


    /**
     * Sets the estadoTGR value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @param estadoTGR
     */
    public void setEstadoTGR(cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriadaEstadoTGR estadoTGR) {
        this.estadoTGR = estadoTGR;
    }


    /**
     * Gets the descripcionEstadoTGR value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @return descripcionEstadoTGR
     */
    public java.lang.String getDescripcionEstadoTGR() {
        return descripcionEstadoTGR;
    }


    /**
     * Sets the descripcionEstadoTGR value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @param descripcionEstadoTGR
     */
    public void setDescripcionEstadoTGR(java.lang.String descripcionEstadoTGR) {
        this.descripcionEstadoTGR = descripcionEstadoTGR;
    }


    /**
     * Gets the numero value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @return numero
     */
    public org.apache.axis.types.NonNegativeInteger getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.
     * 
     * @param numero
     */
    public void setNumero(org.apache.axis.types.NonNegativeInteger numero) {
        this.numero = numero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada)) return false;
        CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada other = (CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada) obj;
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
            this.codigoOficina == other.getCodigoOficina() &&
            this.codigoEstado == other.getCodigoEstado() &&
            ((this.estadoTGR==null && other.getEstadoTGR()==null) || 
             (this.estadoTGR!=null &&
              this.estadoTGR.equals(other.getEstadoTGR()))) &&
            ((this.descripcionEstadoTGR==null && other.getDescripcionEstadoTGR()==null) || 
             (this.descripcionEstadoTGR!=null &&
              this.descripcionEstadoTGR.equals(other.getDescripcionEstadoTGR()))) &&
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
        _hashCode += getCodigoOficina();
        _hashCode += getCodigoEstado();
        if (getEstadoTGR() != null) {
            _hashCode += getEstadoTGR().hashCode();
        }
        if (getDescripcionEstadoTGR() != null) {
            _hashCode += getDescripcionEstadoTGR().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMultasEjecutoriadasMultaEjecutoriada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>CertificadoAntecedentesLaboralPrevisional>AntecedentesLaboralesPrevisionales>MultasEjecutoriadas>MultaEjecutoriada"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOficina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoOficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoEstado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoTGR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "EstadoTGR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>>CertificadoAntecedentesLaboralPrevisional>AntecedentesLaboralesPrevisionales>MultasEjecutoriadas>MultaEjecutoriada>EstadoTGR"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionEstadoTGR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DescripcionEstadoTGR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
