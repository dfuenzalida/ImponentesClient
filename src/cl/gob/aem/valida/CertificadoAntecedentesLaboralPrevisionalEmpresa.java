/**
 * CertificadoAntecedentesLaboralPrevisionalEmpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisionalEmpresa  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType rutEmpresa;

    private java.lang.String razonSocial;

    private cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal representanteLegal;

    private cl.gob.aem.valida.DomicilioType domicilio;

    private cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica codigoActividadEconomica;

    private java.lang.String email;

    public CertificadoAntecedentesLaboralPrevisionalEmpresa() {
    }

    public CertificadoAntecedentesLaboralPrevisionalEmpresa(
           cl.gob.aem.valida.RunType rutEmpresa,
           java.lang.String razonSocial,
           cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal representanteLegal,
           cl.gob.aem.valida.DomicilioType domicilio,
           cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica codigoActividadEconomica,
           java.lang.String email) {
           this.rutEmpresa = rutEmpresa;
           this.razonSocial = razonSocial;
           this.representanteLegal = representanteLegal;
           this.domicilio = domicilio;
           this.codigoActividadEconomica = codigoActividadEconomica;
           this.email = email;
    }


    /**
     * Gets the rutEmpresa value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @return rutEmpresa
     */
    public cl.gob.aem.valida.RunType getRutEmpresa() {
        return rutEmpresa;
    }


    /**
     * Sets the rutEmpresa value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @param rutEmpresa
     */
    public void setRutEmpresa(cl.gob.aem.valida.RunType rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }


    /**
     * Gets the razonSocial value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @return razonSocial
     */
    public java.lang.String getRazonSocial() {
        return razonSocial;
    }


    /**
     * Sets the razonSocial value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @param razonSocial
     */
    public void setRazonSocial(java.lang.String razonSocial) {
        this.razonSocial = razonSocial;
    }


    /**
     * Gets the representanteLegal value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @return representanteLegal
     */
    public cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal getRepresentanteLegal() {
        return representanteLegal;
    }


    /**
     * Sets the representanteLegal value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @param representanteLegal
     */
    public void setRepresentanteLegal(cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresaRepresentanteLegal representanteLegal) {
        this.representanteLegal = representanteLegal;
    }


    /**
     * Gets the domicilio value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @return domicilio
     */
    public cl.gob.aem.valida.DomicilioType getDomicilio() {
        return domicilio;
    }


    /**
     * Sets the domicilio value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @param domicilio
     */
    public void setDomicilio(cl.gob.aem.valida.DomicilioType domicilio) {
        this.domicilio = domicilio;
    }


    /**
     * Gets the codigoActividadEconomica value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @return codigoActividadEconomica
     */
    public cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica getCodigoActividadEconomica() {
        return codigoActividadEconomica;
    }


    /**
     * Sets the codigoActividadEconomica value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @param codigoActividadEconomica
     */
    public void setCodigoActividadEconomica(cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresaCodigoActividadEconomica codigoActividadEconomica) {
        this.codigoActividadEconomica = codigoActividadEconomica;
    }


    /**
     * Gets the email value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CertificadoAntecedentesLaboralPrevisionalEmpresa.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisionalEmpresa)) return false;
        CertificadoAntecedentesLaboralPrevisionalEmpresa other = (CertificadoAntecedentesLaboralPrevisionalEmpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rutEmpresa==null && other.getRutEmpresa()==null) || 
             (this.rutEmpresa!=null &&
              this.rutEmpresa.equals(other.getRutEmpresa()))) &&
            ((this.razonSocial==null && other.getRazonSocial()==null) || 
             (this.razonSocial!=null &&
              this.razonSocial.equals(other.getRazonSocial()))) &&
            ((this.representanteLegal==null && other.getRepresentanteLegal()==null) || 
             (this.representanteLegal!=null &&
              this.representanteLegal.equals(other.getRepresentanteLegal()))) &&
            ((this.domicilio==null && other.getDomicilio()==null) || 
             (this.domicilio!=null &&
              this.domicilio.equals(other.getDomicilio()))) &&
            ((this.codigoActividadEconomica==null && other.getCodigoActividadEconomica()==null) || 
             (this.codigoActividadEconomica!=null &&
              this.codigoActividadEconomica.equals(other.getCodigoActividadEconomica()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail())));
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
        if (getRutEmpresa() != null) {
            _hashCode += getRutEmpresa().hashCode();
        }
        if (getRazonSocial() != null) {
            _hashCode += getRazonSocial().hashCode();
        }
        if (getRepresentanteLegal() != null) {
            _hashCode += getRepresentanteLegal().hashCode();
        }
        if (getDomicilio() != null) {
            _hashCode += getDomicilio().hashCode();
        }
        if (getCodigoActividadEconomica() != null) {
            _hashCode += getCodigoActividadEconomica().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisionalEmpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>CertificadoAntecedentesLaboralPrevisional>Empresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "RutEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razonSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "RazonSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representanteLegal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "RepresentanteLegal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>CertificadoAntecedentesLaboralPrevisional>Empresa>RepresentanteLegal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Domicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DomicilioType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoActividadEconomica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoActividadEconomica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>CertificadoAntecedentesLaboralPrevisional>Empresa>CodigoActividadEconomica"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Email"));
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
