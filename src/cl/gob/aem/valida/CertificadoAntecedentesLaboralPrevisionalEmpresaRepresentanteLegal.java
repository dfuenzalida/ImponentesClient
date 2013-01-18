/**
 * CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType rut;

    private cl.gob.aem.valida.NameType nombre;

    public CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal() {
    }

    public CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal(
           cl.gob.aem.valida.RunType rut,
           cl.gob.aem.valida.NameType nombre) {
           this.rut = rut;
           this.nombre = nombre;
    }


    /**
     * Gets the rut value for this CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal.
     * 
     * @return rut
     */
    public cl.gob.aem.valida.RunType getRut() {
        return rut;
    }


    /**
     * Sets the rut value for this CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal.
     * 
     * @param rut
     */
    public void setRut(cl.gob.aem.valida.RunType rut) {
        this.rut = rut;
    }


    /**
     * Gets the nombre value for this CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.NameType getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.NameType nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal)) return false;
        CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal other = (CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rut==null && other.getRut()==null) || 
             (this.rut!=null &&
              this.rut.equals(other.getRut()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre())));
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
        if (getRut() != null) {
            _hashCode += getRut().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>CertificadoAntecedentesLaboralPrevisional>Empresa>RepresentanteLegal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
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
