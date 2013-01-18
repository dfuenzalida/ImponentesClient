/**
 * CertificadoAntecedentesLaboralPrevisionalPieDeFirma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisionalPieDeFirma  implements java.io.Serializable {
    private cl.gob.aem.valida.NameType nombreFirma;

    private java.lang.String cargoFirma;

    public CertificadoAntecedentesLaboralPrevisionalPieDeFirma() {
    }

    public CertificadoAntecedentesLaboralPrevisionalPieDeFirma(
           cl.gob.aem.valida.NameType nombreFirma,
           java.lang.String cargoFirma) {
           this.nombreFirma = nombreFirma;
           this.cargoFirma = cargoFirma;
    }


    /**
     * Gets the nombreFirma value for this CertificadoAntecedentesLaboralPrevisionalPieDeFirma.
     * 
     * @return nombreFirma
     */
    public cl.gob.aem.valida.NameType getNombreFirma() {
        return nombreFirma;
    }


    /**
     * Sets the nombreFirma value for this CertificadoAntecedentesLaboralPrevisionalPieDeFirma.
     * 
     * @param nombreFirma
     */
    public void setNombreFirma(cl.gob.aem.valida.NameType nombreFirma) {
        this.nombreFirma = nombreFirma;
    }


    /**
     * Gets the cargoFirma value for this CertificadoAntecedentesLaboralPrevisionalPieDeFirma.
     * 
     * @return cargoFirma
     */
    public java.lang.String getCargoFirma() {
        return cargoFirma;
    }


    /**
     * Sets the cargoFirma value for this CertificadoAntecedentesLaboralPrevisionalPieDeFirma.
     * 
     * @param cargoFirma
     */
    public void setCargoFirma(java.lang.String cargoFirma) {
        this.cargoFirma = cargoFirma;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisionalPieDeFirma)) return false;
        CertificadoAntecedentesLaboralPrevisionalPieDeFirma other = (CertificadoAntecedentesLaboralPrevisionalPieDeFirma) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombreFirma==null && other.getNombreFirma()==null) || 
             (this.nombreFirma!=null &&
              this.nombreFirma.equals(other.getNombreFirma()))) &&
            ((this.cargoFirma==null && other.getCargoFirma()==null) || 
             (this.cargoFirma!=null &&
              this.cargoFirma.equals(other.getCargoFirma())));
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
        if (getNombreFirma() != null) {
            _hashCode += getNombreFirma().hashCode();
        }
        if (getCargoFirma() != null) {
            _hashCode += getCargoFirma().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisionalPieDeFirma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>CertificadoAntecedentesLaboralPrevisional>PieDeFirma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreFirma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreFirma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoFirma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CargoFirma"));
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
