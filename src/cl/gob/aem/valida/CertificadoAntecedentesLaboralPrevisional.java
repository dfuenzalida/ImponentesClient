/**
 * CertificadoAntecedentesLaboralPrevisional.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAntecedentesLaboralPrevisional  implements java.io.Serializable {
    private int idCertificado;

    private cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalFolio folio;

    private java.lang.String encabezado;

    private cl.gob.aem.valida.FechaType vigencia;

    private java.lang.String codigoVerificacion;

    private cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresa empresa;

    private cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalPieDeFirma pieDeFirma;

    private cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionales antecedentesLaboralesPrevisionales;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public CertificadoAntecedentesLaboralPrevisional() {
    }

    public CertificadoAntecedentesLaboralPrevisional(
           int idCertificado,
           cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalFolio folio,
           java.lang.String encabezado,
           cl.gob.aem.valida.FechaType vigencia,
           java.lang.String codigoVerificacion,
           cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresa empresa,
           cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalPieDeFirma pieDeFirma,
           cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionales antecedentesLaboralesPrevisionales,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.idCertificado = idCertificado;
           this.folio = folio;
           this.encabezado = encabezado;
           this.vigencia = vigencia;
           this.codigoVerificacion = codigoVerificacion;
           this.empresa = empresa;
           this.pieDeFirma = pieDeFirma;
           this.antecedentesLaboralesPrevisionales = antecedentesLaboralesPrevisionales;
           this.signature = signature;
    }


    /**
     * Gets the idCertificado value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @return idCertificado
     */
    public int getIdCertificado() {
        return idCertificado;
    }


    /**
     * Sets the idCertificado value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @param idCertificado
     */
    public void setIdCertificado(int idCertificado) {
        this.idCertificado = idCertificado;
    }


    /**
     * Gets the folio value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @return folio
     */
    public cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalFolio getFolio() {
        return folio;
    }


    /**
     * Sets the folio value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @param folio
     */
    public void setFolio(cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalFolio folio) {
        this.folio = folio;
    }


    /**
     * Gets the encabezado value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @return encabezado
     */
    public java.lang.String getEncabezado() {
        return encabezado;
    }


    /**
     * Sets the encabezado value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @param encabezado
     */
    public void setEncabezado(java.lang.String encabezado) {
        this.encabezado = encabezado;
    }


    /**
     * Gets the vigencia value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @return vigencia
     */
    public cl.gob.aem.valida.FechaType getVigencia() {
        return vigencia;
    }


    /**
     * Sets the vigencia value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @param vigencia
     */
    public void setVigencia(cl.gob.aem.valida.FechaType vigencia) {
        this.vigencia = vigencia;
    }


    /**
     * Gets the codigoVerificacion value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @return codigoVerificacion
     */
    public java.lang.String getCodigoVerificacion() {
        return codigoVerificacion;
    }


    /**
     * Sets the codigoVerificacion value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @param codigoVerificacion
     */
    public void setCodigoVerificacion(java.lang.String codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }


    /**
     * Gets the empresa value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @return empresa
     */
    public cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresa getEmpresa() {
        return empresa;
    }


    /**
     * Sets the empresa value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @param empresa
     */
    public void setEmpresa(cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalEmpresa empresa) {
        this.empresa = empresa;
    }


    /**
     * Gets the pieDeFirma value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @return pieDeFirma
     */
    public cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalPieDeFirma getPieDeFirma() {
        return pieDeFirma;
    }


    /**
     * Sets the pieDeFirma value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @param pieDeFirma
     */
    public void setPieDeFirma(cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalPieDeFirma pieDeFirma) {
        this.pieDeFirma = pieDeFirma;
    }


    /**
     * Gets the antecedentesLaboralesPrevisionales value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @return antecedentesLaboralesPrevisionales
     */
    public cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionales getAntecedentesLaboralesPrevisionales() {
        return antecedentesLaboralesPrevisionales;
    }


    /**
     * Sets the antecedentesLaboralesPrevisionales value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @param antecedentesLaboralesPrevisionales
     */
    public void setAntecedentesLaboralesPrevisionales(cl.gob.aem.valida.CertificadoAntecedentesLaboralPrevisionalAntecedentesLaboralesPrevisionales antecedentesLaboralesPrevisionales) {
        this.antecedentesLaboralesPrevisionales = antecedentesLaboralesPrevisionales;
    }


    /**
     * Gets the signature value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this CertificadoAntecedentesLaboralPrevisional.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAntecedentesLaboralPrevisional)) return false;
        CertificadoAntecedentesLaboralPrevisional other = (CertificadoAntecedentesLaboralPrevisional) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idCertificado == other.getIdCertificado() &&
            ((this.folio==null && other.getFolio()==null) || 
             (this.folio!=null &&
              this.folio.equals(other.getFolio()))) &&
            ((this.encabezado==null && other.getEncabezado()==null) || 
             (this.encabezado!=null &&
              this.encabezado.equals(other.getEncabezado()))) &&
            ((this.vigencia==null && other.getVigencia()==null) || 
             (this.vigencia!=null &&
              this.vigencia.equals(other.getVigencia()))) &&
            ((this.codigoVerificacion==null && other.getCodigoVerificacion()==null) || 
             (this.codigoVerificacion!=null &&
              this.codigoVerificacion.equals(other.getCodigoVerificacion()))) &&
            ((this.empresa==null && other.getEmpresa()==null) || 
             (this.empresa!=null &&
              this.empresa.equals(other.getEmpresa()))) &&
            ((this.pieDeFirma==null && other.getPieDeFirma()==null) || 
             (this.pieDeFirma!=null &&
              this.pieDeFirma.equals(other.getPieDeFirma()))) &&
            ((this.antecedentesLaboralesPrevisionales==null && other.getAntecedentesLaboralesPrevisionales()==null) || 
             (this.antecedentesLaboralesPrevisionales!=null &&
              this.antecedentesLaboralesPrevisionales.equals(other.getAntecedentesLaboralesPrevisionales()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature())));
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
        _hashCode += getIdCertificado();
        if (getFolio() != null) {
            _hashCode += getFolio().hashCode();
        }
        if (getEncabezado() != null) {
            _hashCode += getEncabezado().hashCode();
        }
        if (getVigencia() != null) {
            _hashCode += getVigencia().hashCode();
        }
        if (getCodigoVerificacion() != null) {
            _hashCode += getCodigoVerificacion().hashCode();
        }
        if (getEmpresa() != null) {
            _hashCode += getEmpresa().hashCode();
        }
        if (getPieDeFirma() != null) {
            _hashCode += getPieDeFirma().hashCode();
        }
        if (getAntecedentesLaboralesPrevisionales() != null) {
            _hashCode += getAntecedentesLaboralesPrevisionales().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAntecedentesLaboralPrevisional.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">CertificadoAntecedentesLaboralPrevisional"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCertificado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "IdCertificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Folio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>CertificadoAntecedentesLaboralPrevisional>Folio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encabezado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Encabezado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Vigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoVerificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoVerificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Empresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>CertificadoAntecedentesLaboralPrevisional>Empresa"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pieDeFirma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "PieDeFirma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>CertificadoAntecedentesLaboralPrevisional>PieDeFirma"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antecedentesLaboralesPrevisionales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "AntecedentesLaboralesPrevisionales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>CertificadoAntecedentesLaboralPrevisional>AntecedentesLaboralesPrevisionales"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureType"));
        elemField.setMinOccurs(0);
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
