/**
 * CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica  implements java.io.Serializable {
    private int identificadorCodigoActividadEconomica;

    private java.lang.String codigo;

    private java.lang.String descripcion;

    public CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica() {
    }

    public CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica(
           int identificadorCodigoActividadEconomica,
           java.lang.String codigo,
           java.lang.String descripcion) {
           this.identificadorCodigoActividadEconomica = identificadorCodigoActividadEconomica;
           this.codigo = codigo;
           this.descripcion = descripcion;
    }


    /**
     * Gets the identificadorCodigoActividadEconomica value for this CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica.
     * 
     * @return identificadorCodigoActividadEconomica
     */
    public int getIdentificadorCodigoActividadEconomica() {
        return identificadorCodigoActividadEconomica;
    }


    /**
     * Sets the identificadorCodigoActividadEconomica value for this CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica.
     * 
     * @param identificadorCodigoActividadEconomica
     */
    public void setIdentificadorCodigoActividadEconomica(int identificadorCodigoActividadEconomica) {
        this.identificadorCodigoActividadEconomica = identificadorCodigoActividadEconomica;
    }


    /**
     * Gets the codigo value for this CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the descripcion value for this CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica)) return false;
        CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica other = (CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.identificadorCodigoActividadEconomica == other.getIdentificadorCodigoActividadEconomica() &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion())));
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
        _hashCode += getIdentificadorCodigoActividadEconomica();
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>CertificadoAntecedentesLaboralPrevisional>Empresa>CodigoActividadEconomica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorCodigoActividadEconomica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "IdentificadorCodigoActividadEconomica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Descripcion"));
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
