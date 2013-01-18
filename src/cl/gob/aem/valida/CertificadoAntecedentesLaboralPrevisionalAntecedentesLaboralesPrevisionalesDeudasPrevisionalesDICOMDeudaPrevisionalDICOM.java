/**
 * CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM  implements java.io.Serializable {
    private java.lang.String motivo;

    private java.lang.String institucion;

    private java.math.BigDecimal montoEnUTM;

    private java.math.BigDecimal montoEnPesos;

    private org.apache.axis.types.NonNegativeInteger numero;  // attribute

    public CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM() {
    }

    public CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM(
           java.lang.String motivo,
           java.lang.String institucion,
           java.math.BigDecimal montoEnUTM,
           java.math.BigDecimal montoEnPesos,
           org.apache.axis.types.NonNegativeInteger numero) {
           this.motivo = motivo;
           this.institucion = institucion;
           this.montoEnUTM = montoEnUTM;
           this.montoEnPesos = montoEnPesos;
           this.numero = numero;
    }


    /**
     * Gets the motivo value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.
     * 
     * @return motivo
     */
    public java.lang.String getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
    }


    /**
     * Gets the institucion value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.
     * 
     * @return institucion
     */
    public java.lang.String getInstitucion() {
        return institucion;
    }


    /**
     * Sets the institucion value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.
     * 
     * @param institucion
     */
    public void setInstitucion(java.lang.String institucion) {
        this.institucion = institucion;
    }


    /**
     * Gets the montoEnUTM value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.
     * 
     * @return montoEnUTM
     */
    public java.math.BigDecimal getMontoEnUTM() {
        return montoEnUTM;
    }


    /**
     * Sets the montoEnUTM value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.
     * 
     * @param montoEnUTM
     */
    public void setMontoEnUTM(java.math.BigDecimal montoEnUTM) {
        this.montoEnUTM = montoEnUTM;
    }


    /**
     * Gets the montoEnPesos value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.
     * 
     * @return montoEnPesos
     */
    public java.math.BigDecimal getMontoEnPesos() {
        return montoEnPesos;
    }


    /**
     * Sets the montoEnPesos value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.
     * 
     * @param montoEnPesos
     */
    public void setMontoEnPesos(java.math.BigDecimal montoEnPesos) {
        this.montoEnPesos = montoEnPesos;
    }


    /**
     * Gets the numero value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.
     * 
     * @return numero
     */
    public org.apache.axis.types.NonNegativeInteger getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.
     * 
     * @param numero
     */
    public void setNumero(org.apache.axis.types.NonNegativeInteger numero) {
        this.numero = numero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM)) return false;
        CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM other = (CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo()))) &&
            ((this.institucion==null && other.getInstitucion()==null) || 
             (this.institucion!=null &&
              this.institucion.equals(other.getInstitucion()))) &&
            ((this.montoEnUTM==null && other.getMontoEnUTM()==null) || 
             (this.montoEnUTM!=null &&
              this.montoEnUTM.equals(other.getMontoEnUTM()))) &&
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
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        if (getInstitucion() != null) {
            _hashCode += getInstitucion().hashCode();
        }
        if (getMontoEnUTM() != null) {
            _hashCode += getMontoEnUTM().hashCode();
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
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionalesDeudasPrevisionalesDICOMDeudaPrevisionalDICOM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>CertificadoAntecedentesLaboralPrevisional>AntecedentesLaboralesPrevisionales>DeudasPrevisionalesDICOM>DeudaPrevisionalDICOM"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numero");
        attrField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Motivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Institucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoEnUTM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "MontoEnUTM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
