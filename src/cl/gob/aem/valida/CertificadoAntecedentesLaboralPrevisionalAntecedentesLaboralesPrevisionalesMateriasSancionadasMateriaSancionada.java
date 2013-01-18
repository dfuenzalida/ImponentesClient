/**
 * CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada  implements java.io.Serializable {
    private int codigoTipoMateria;

    private java.lang.String descripcionMateria;

    private int numeroSanciones6Meses;

    private int numeroSanciones12Meses;

    private org.apache.axis.types.NonNegativeInteger numero;  // attribute

    public CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada() {
    }

    public CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada(
           int codigoTipoMateria,
           java.lang.String descripcionMateria,
           int numeroSanciones6Meses,
           int numeroSanciones12Meses,
           org.apache.axis.types.NonNegativeInteger numero) {
           this.codigoTipoMateria = codigoTipoMateria;
           this.descripcionMateria = descripcionMateria;
           this.numeroSanciones6Meses = numeroSanciones6Meses;
           this.numeroSanciones12Meses = numeroSanciones12Meses;
           this.numero = numero;
    }


    /**
     * Gets the codigoTipoMateria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.
     * 
     * @return codigoTipoMateria
     */
    public int getCodigoTipoMateria() {
        return codigoTipoMateria;
    }


    /**
     * Sets the codigoTipoMateria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.
     * 
     * @param codigoTipoMateria
     */
    public void setCodigoTipoMateria(int codigoTipoMateria) {
        this.codigoTipoMateria = codigoTipoMateria;
    }


    /**
     * Gets the descripcionMateria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.
     * 
     * @return descripcionMateria
     */
    public java.lang.String getDescripcionMateria() {
        return descripcionMateria;
    }


    /**
     * Sets the descripcionMateria value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.
     * 
     * @param descripcionMateria
     */
    public void setDescripcionMateria(java.lang.String descripcionMateria) {
        this.descripcionMateria = descripcionMateria;
    }


    /**
     * Gets the numeroSanciones6Meses value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.
     * 
     * @return numeroSanciones6Meses
     */
    public int getNumeroSanciones6Meses() {
        return numeroSanciones6Meses;
    }


    /**
     * Sets the numeroSanciones6Meses value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.
     * 
     * @param numeroSanciones6Meses
     */
    public void setNumeroSanciones6Meses(int numeroSanciones6Meses) {
        this.numeroSanciones6Meses = numeroSanciones6Meses;
    }


    /**
     * Gets the numeroSanciones12Meses value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.
     * 
     * @return numeroSanciones12Meses
     */
    public int getNumeroSanciones12Meses() {
        return numeroSanciones12Meses;
    }


    /**
     * Sets the numeroSanciones12Meses value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.
     * 
     * @param numeroSanciones12Meses
     */
    public void setNumeroSanciones12Meses(int numeroSanciones12Meses) {
        this.numeroSanciones12Meses = numeroSanciones12Meses;
    }


    /**
     * Gets the numero value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.
     * 
     * @return numero
     */
    public org.apache.axis.types.NonNegativeInteger getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.
     * 
     * @param numero
     */
    public void setNumero(org.apache.axis.types.NonNegativeInteger numero) {
        this.numero = numero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada)) return false;
        CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada other = (CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoTipoMateria == other.getCodigoTipoMateria() &&
            ((this.descripcionMateria==null && other.getDescripcionMateria()==null) || 
             (this.descripcionMateria!=null &&
              this.descripcionMateria.equals(other.getDescripcionMateria()))) &&
            this.numeroSanciones6Meses == other.getNumeroSanciones6Meses() &&
            this.numeroSanciones12Meses == other.getNumeroSanciones12Meses() &&
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
        _hashCode += getCodigoTipoMateria();
        if (getDescripcionMateria() != null) {
            _hashCode += getDescripcionMateria().hashCode();
        }
        _hashCode += getNumeroSanciones6Meses();
        _hashCode += getNumeroSanciones12Meses();
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesMateriasSancionadasMateriaSancionada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>CertificadoAntecedentesLaboralPrevisional>AntecedentesLaboralesPrevisionales>MateriasSancionadas>MateriaSancionada"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numero");
        attrField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoMateria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoTipoMateria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionMateria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DescripcionMateria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSanciones6Meses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroSanciones6Meses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSanciones12Meses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroSanciones12Meses"));
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
