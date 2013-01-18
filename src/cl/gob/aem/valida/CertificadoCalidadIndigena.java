/**
 * CertificadoCalidadIndigena.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoCalidadIndigena  implements java.io.Serializable {
    private java.math.BigInteger numeroCertificado;

    private cl.gob.aem.valida.NombreType nombre;

    private cl.gob.aem.valida.RunType run;

    private cl.gob.aem.valida.DomicilioType domicilio;

    private cl.gob.aem.valida.CertificadoCalidadIndigenaNombreEtnia nombreEtnia;

    private java.lang.String letraCertificado;

    private java.lang.String nombreInstitucion;

    private java.util.Date fechaEntregaCertificadoOriginal;

    private java.util.Date fechaEmisionCertificadoElectronico;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public CertificadoCalidadIndigena() {
    }

    public CertificadoCalidadIndigena(
           java.math.BigInteger numeroCertificado,
           cl.gob.aem.valida.NombreType nombre,
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.DomicilioType domicilio,
           cl.gob.aem.valida.CertificadoCalidadIndigenaNombreEtnia nombreEtnia,
           java.lang.String letraCertificado,
           java.lang.String nombreInstitucion,
           java.util.Date fechaEntregaCertificadoOriginal,
           java.util.Date fechaEmisionCertificadoElectronico,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.numeroCertificado = numeroCertificado;
           this.nombre = nombre;
           this.run = run;
           this.domicilio = domicilio;
           this.nombreEtnia = nombreEtnia;
           this.letraCertificado = letraCertificado;
           this.nombreInstitucion = nombreInstitucion;
           this.fechaEntregaCertificadoOriginal = fechaEntregaCertificadoOriginal;
           this.fechaEmisionCertificadoElectronico = fechaEmisionCertificadoElectronico;
           this.signature = signature;
    }


    /**
     * Gets the numeroCertificado value for this CertificadoCalidadIndigena.
     * 
     * @return numeroCertificado
     */
    public java.math.BigInteger getNumeroCertificado() {
        return numeroCertificado;
    }


    /**
     * Sets the numeroCertificado value for this CertificadoCalidadIndigena.
     * 
     * @param numeroCertificado
     */
    public void setNumeroCertificado(java.math.BigInteger numeroCertificado) {
        this.numeroCertificado = numeroCertificado;
    }


    /**
     * Gets the nombre value for this CertificadoCalidadIndigena.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.NombreType getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this CertificadoCalidadIndigena.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.NombreType nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the run value for this CertificadoCalidadIndigena.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this CertificadoCalidadIndigena.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the domicilio value for this CertificadoCalidadIndigena.
     * 
     * @return domicilio
     */
    public cl.gob.aem.valida.DomicilioType getDomicilio() {
        return domicilio;
    }


    /**
     * Sets the domicilio value for this CertificadoCalidadIndigena.
     * 
     * @param domicilio
     */
    public void setDomicilio(cl.gob.aem.valida.DomicilioType domicilio) {
        this.domicilio = domicilio;
    }


    /**
     * Gets the nombreEtnia value for this CertificadoCalidadIndigena.
     * 
     * @return nombreEtnia
     */
    public cl.gob.aem.valida.CertificadoCalidadIndigenaNombreEtnia getNombreEtnia() {
        return nombreEtnia;
    }


    /**
     * Sets the nombreEtnia value for this CertificadoCalidadIndigena.
     * 
     * @param nombreEtnia
     */
    public void setNombreEtnia(cl.gob.aem.valida.CertificadoCalidadIndigenaNombreEtnia nombreEtnia) {
        this.nombreEtnia = nombreEtnia;
    }


    /**
     * Gets the letraCertificado value for this CertificadoCalidadIndigena.
     * 
     * @return letraCertificado
     */
    public java.lang.String getLetraCertificado() {
        return letraCertificado;
    }


    /**
     * Sets the letraCertificado value for this CertificadoCalidadIndigena.
     * 
     * @param letraCertificado
     */
    public void setLetraCertificado(java.lang.String letraCertificado) {
        this.letraCertificado = letraCertificado;
    }


    /**
     * Gets the nombreInstitucion value for this CertificadoCalidadIndigena.
     * 
     * @return nombreInstitucion
     */
    public java.lang.String getNombreInstitucion() {
        return nombreInstitucion;
    }


    /**
     * Sets the nombreInstitucion value for this CertificadoCalidadIndigena.
     * 
     * @param nombreInstitucion
     */
    public void setNombreInstitucion(java.lang.String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }


    /**
     * Gets the fechaEntregaCertificadoOriginal value for this CertificadoCalidadIndigena.
     * 
     * @return fechaEntregaCertificadoOriginal
     */
    public java.util.Date getFechaEntregaCertificadoOriginal() {
        return fechaEntregaCertificadoOriginal;
    }


    /**
     * Sets the fechaEntregaCertificadoOriginal value for this CertificadoCalidadIndigena.
     * 
     * @param fechaEntregaCertificadoOriginal
     */
    public void setFechaEntregaCertificadoOriginal(java.util.Date fechaEntregaCertificadoOriginal) {
        this.fechaEntregaCertificadoOriginal = fechaEntregaCertificadoOriginal;
    }


    /**
     * Gets the fechaEmisionCertificadoElectronico value for this CertificadoCalidadIndigena.
     * 
     * @return fechaEmisionCertificadoElectronico
     */
    public java.util.Date getFechaEmisionCertificadoElectronico() {
        return fechaEmisionCertificadoElectronico;
    }


    /**
     * Sets the fechaEmisionCertificadoElectronico value for this CertificadoCalidadIndigena.
     * 
     * @param fechaEmisionCertificadoElectronico
     */
    public void setFechaEmisionCertificadoElectronico(java.util.Date fechaEmisionCertificadoElectronico) {
        this.fechaEmisionCertificadoElectronico = fechaEmisionCertificadoElectronico;
    }


    /**
     * Gets the signature value for this CertificadoCalidadIndigena.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this CertificadoCalidadIndigena.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoCalidadIndigena)) return false;
        CertificadoCalidadIndigena other = (CertificadoCalidadIndigena) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroCertificado==null && other.getNumeroCertificado()==null) || 
             (this.numeroCertificado!=null &&
              this.numeroCertificado.equals(other.getNumeroCertificado()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.run==null && other.getRun()==null) || 
             (this.run!=null &&
              this.run.equals(other.getRun()))) &&
            ((this.domicilio==null && other.getDomicilio()==null) || 
             (this.domicilio!=null &&
              this.domicilio.equals(other.getDomicilio()))) &&
            ((this.nombreEtnia==null && other.getNombreEtnia()==null) || 
             (this.nombreEtnia!=null &&
              this.nombreEtnia.equals(other.getNombreEtnia()))) &&
            ((this.letraCertificado==null && other.getLetraCertificado()==null) || 
             (this.letraCertificado!=null &&
              this.letraCertificado.equals(other.getLetraCertificado()))) &&
            ((this.nombreInstitucion==null && other.getNombreInstitucion()==null) || 
             (this.nombreInstitucion!=null &&
              this.nombreInstitucion.equals(other.getNombreInstitucion()))) &&
            ((this.fechaEntregaCertificadoOriginal==null && other.getFechaEntregaCertificadoOriginal()==null) || 
             (this.fechaEntregaCertificadoOriginal!=null &&
              this.fechaEntregaCertificadoOriginal.equals(other.getFechaEntregaCertificadoOriginal()))) &&
            ((this.fechaEmisionCertificadoElectronico==null && other.getFechaEmisionCertificadoElectronico()==null) || 
             (this.fechaEmisionCertificadoElectronico!=null &&
              this.fechaEmisionCertificadoElectronico.equals(other.getFechaEmisionCertificadoElectronico()))) &&
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
        if (getNumeroCertificado() != null) {
            _hashCode += getNumeroCertificado().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        if (getDomicilio() != null) {
            _hashCode += getDomicilio().hashCode();
        }
        if (getNombreEtnia() != null) {
            _hashCode += getNombreEtnia().hashCode();
        }
        if (getLetraCertificado() != null) {
            _hashCode += getLetraCertificado().hashCode();
        }
        if (getNombreInstitucion() != null) {
            _hashCode += getNombreInstitucion().hashCode();
        }
        if (getFechaEntregaCertificadoOriginal() != null) {
            _hashCode += getFechaEntregaCertificadoOriginal().hashCode();
        }
        if (getFechaEmisionCertificadoElectronico() != null) {
            _hashCode += getFechaEmisionCertificadoElectronico().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoCalidadIndigena.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">CertificadoCalidadIndigena"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCertificado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroCertificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Domicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DomicilioType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreEtnia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreEtnia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>CertificadoCalidadIndigena>NombreEtnia"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letraCertificado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "LetraCertificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreInstitucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreInstitucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaEntregaCertificadoOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaEntregaCertificadoOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaEmisionCertificadoElectronico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaEmisionCertificadoElectronico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
