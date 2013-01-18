/**
 * CertificadoAntecedentesLaboralPrevisionalFolio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisionalFolio  implements java.io.Serializable {
    private int codigoOficina;

    private java.lang.String agno;

    private int numeroComision;

    public CertificadoAntecedentesLaboralPrevisionalFolio() {
    }

    public CertificadoAntecedentesLaboralPrevisionalFolio(
           int codigoOficina,
           java.lang.String agno,
           int numeroComision) {
           this.codigoOficina = codigoOficina;
           this.agno = agno;
           this.numeroComision = numeroComision;
    }


    /**
     * Gets the codigoOficina value for this CertificadoAntecedentesLaboralPrevisionalFolio.
     * 
     * @return codigoOficina
     */
    public int getCodigoOficina() {
        return codigoOficina;
    }


    /**
     * Sets the codigoOficina value for this CertificadoAntecedentesLaboralPrevisionalFolio.
     * 
     * @param codigoOficina
     */
    public void setCodigoOficina(int codigoOficina) {
        this.codigoOficina = codigoOficina;
    }


    /**
     * Gets the agno value for this CertificadoAntecedentesLaboralPrevisionalFolio.
     * 
     * @return agno
     */
    public java.lang.String getAgno() {
        return agno;
    }


    /**
     * Sets the agno value for this CertificadoAntecedentesLaboralPrevisionalFolio.
     * 
     * @param agno
     */
    public void setAgno(java.lang.String agno) {
        this.agno = agno;
    }


    /**
     * Gets the numeroComision value for this CertificadoAntecedentesLaboralPrevisionalFolio.
     * 
     * @return numeroComision
     */
    public int getNumeroComision() {
        return numeroComision;
    }


    /**
     * Sets the numeroComision value for this CertificadoAntecedentesLaboralPrevisionalFolio.
     * 
     * @param numeroComision
     */
    public void setNumeroComision(int numeroComision) {
        this.numeroComision = numeroComision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisionalFolio)) return false;
        CertificadoAntecedentesLaboralPrevisionalFolio other = (CertificadoAntecedentesLaboralPrevisionalFolio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoOficina == other.getCodigoOficina() &&
            ((this.agno==null && other.getAgno()==null) || 
             (this.agno!=null &&
              this.agno.equals(other.getAgno()))) &&
            this.numeroComision == other.getNumeroComision();
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
        _hashCode += getCodigoOficina();
        if (getAgno() != null) {
            _hashCode += getAgno().hashCode();
        }
        _hashCode += getNumeroComision();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisionalFolio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>CertificadoAntecedentesLaboralPrevisional>Folio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOficina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoOficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Agno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroComision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroComision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
