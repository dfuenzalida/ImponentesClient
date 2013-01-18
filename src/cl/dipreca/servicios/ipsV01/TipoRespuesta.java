/**
 * TipoRespuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.dipreca.servicios.ipsV01;

public class TipoRespuesta  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    /* Estado de respuesta del Servicio Web. */
    private java.lang.String mensajeWebServices;

    /* Fecha Actual en la que se realizo la consulta. */
    private java.util.Date fechaInforme;

    /* R.U.T. mas Digito Verificador del Beneficiario */
    private cl.gob.aem.valida.RunType run;

    /* Nombre completo del Beneficiario */
    private cl.gob.aem.valida.NombreType nombreCompletoBeneficiario;

    /* Fecha de Nacimiento del Beneficiario */
    private java.util.Date fechaNacimiento;

    /* Sexo */
    private cl.gob.aem.valida.SexoValores sexo;

    /* Situacion del Individuo :  P: Pensionado I:Imponente. */
    private cl.dipreca.servicios.ipsV01.TipoRespuestaSituacionIndividuo situacionIndividuo;

    /* Fecha a partir fue ingresado como Imponente de DIPRECA */
    private java.util.Date fechaPension;

    /* Tipo de Pension :  S: Sobrevivencia  T: Titular N: No aplica */
    private cl.dipreca.servicios.ipsV01.TipoRespuestaTipoPension tipoPension;

    private org.apache.axis.message.MessageElement [] _any;

    private java.math.BigDecimal schemaVersion;  // attribute

    public TipoRespuesta() {
    }

    public TipoRespuesta(
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           java.lang.String mensajeWebServices,
           java.util.Date fechaInforme,
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.NombreType nombreCompletoBeneficiario,
           java.util.Date fechaNacimiento,
           cl.gob.aem.valida.SexoValores sexo,
           cl.dipreca.servicios.ipsV01.TipoRespuestaSituacionIndividuo situacionIndividuo,
           java.util.Date fechaPension,
           cl.dipreca.servicios.ipsV01.TipoRespuestaTipoPension tipoPension,
           org.apache.axis.message.MessageElement [] _any,
           java.math.BigDecimal schemaVersion) {
           this.signature = signature;
           this.mensajeWebServices = mensajeWebServices;
           this.fechaInforme = fechaInforme;
           this.run = run;
           this.nombreCompletoBeneficiario = nombreCompletoBeneficiario;
           this.fechaNacimiento = fechaNacimiento;
           this.sexo = sexo;
           this.situacionIndividuo = situacionIndividuo;
           this.fechaPension = fechaPension;
           this.tipoPension = tipoPension;
           this._any = _any;
           this.schemaVersion = schemaVersion;
    }


    /**
     * Gets the signature value for this TipoRespuesta.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this TipoRespuesta.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }


    /**
     * Gets the mensajeWebServices value for this TipoRespuesta.
     * 
     * @return mensajeWebServices   * Estado de respuesta del Servicio Web.
     */
    public java.lang.String getMensajeWebServices() {
        return mensajeWebServices;
    }


    /**
     * Sets the mensajeWebServices value for this TipoRespuesta.
     * 
     * @param mensajeWebServices   * Estado de respuesta del Servicio Web.
     */
    public void setMensajeWebServices(java.lang.String mensajeWebServices) {
        this.mensajeWebServices = mensajeWebServices;
    }


    /**
     * Gets the fechaInforme value for this TipoRespuesta.
     * 
     * @return fechaInforme   * Fecha Actual en la que se realizo la consulta.
     */
    public java.util.Date getFechaInforme() {
        return fechaInforme;
    }


    /**
     * Sets the fechaInforme value for this TipoRespuesta.
     * 
     * @param fechaInforme   * Fecha Actual en la que se realizo la consulta.
     */
    public void setFechaInforme(java.util.Date fechaInforme) {
        this.fechaInforme = fechaInforme;
    }


    /**
     * Gets the run value for this TipoRespuesta.
     * 
     * @return run   * R.U.T. mas Digito Verificador del Beneficiario
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this TipoRespuesta.
     * 
     * @param run   * R.U.T. mas Digito Verificador del Beneficiario
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the nombreCompletoBeneficiario value for this TipoRespuesta.
     * 
     * @return nombreCompletoBeneficiario   * Nombre completo del Beneficiario
     */
    public cl.gob.aem.valida.NombreType getNombreCompletoBeneficiario() {
        return nombreCompletoBeneficiario;
    }


    /**
     * Sets the nombreCompletoBeneficiario value for this TipoRespuesta.
     * 
     * @param nombreCompletoBeneficiario   * Nombre completo del Beneficiario
     */
    public void setNombreCompletoBeneficiario(cl.gob.aem.valida.NombreType nombreCompletoBeneficiario) {
        this.nombreCompletoBeneficiario = nombreCompletoBeneficiario;
    }


    /**
     * Gets the fechaNacimiento value for this TipoRespuesta.
     * 
     * @return fechaNacimiento   * Fecha de Nacimiento del Beneficiario
     */
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this TipoRespuesta.
     * 
     * @param fechaNacimiento   * Fecha de Nacimiento del Beneficiario
     */
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the sexo value for this TipoRespuesta.
     * 
     * @return sexo   * Sexo
     */
    public cl.gob.aem.valida.SexoValores getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this TipoRespuesta.
     * 
     * @param sexo   * Sexo
     */
    public void setSexo(cl.gob.aem.valida.SexoValores sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the situacionIndividuo value for this TipoRespuesta.
     * 
     * @return situacionIndividuo   * Situacion del Individuo :  P: Pensionado I:Imponente.
     */
    public cl.dipreca.servicios.ipsV01.TipoRespuestaSituacionIndividuo getSituacionIndividuo() {
        return situacionIndividuo;
    }


    /**
     * Sets the situacionIndividuo value for this TipoRespuesta.
     * 
     * @param situacionIndividuo   * Situacion del Individuo :  P: Pensionado I:Imponente.
     */
    public void setSituacionIndividuo(cl.dipreca.servicios.ipsV01.TipoRespuestaSituacionIndividuo situacionIndividuo) {
        this.situacionIndividuo = situacionIndividuo;
    }


    /**
     * Gets the fechaPension value for this TipoRespuesta.
     * 
     * @return fechaPension   * Fecha a partir fue ingresado como Imponente de DIPRECA
     */
    public java.util.Date getFechaPension() {
        return fechaPension;
    }


    /**
     * Sets the fechaPension value for this TipoRespuesta.
     * 
     * @param fechaPension   * Fecha a partir fue ingresado como Imponente de DIPRECA
     */
    public void setFechaPension(java.util.Date fechaPension) {
        this.fechaPension = fechaPension;
    }


    /**
     * Gets the tipoPension value for this TipoRespuesta.
     * 
     * @return tipoPension   * Tipo de Pension :  S: Sobrevivencia  T: Titular N: No aplica
     */
    public cl.dipreca.servicios.ipsV01.TipoRespuestaTipoPension getTipoPension() {
        return tipoPension;
    }


    /**
     * Sets the tipoPension value for this TipoRespuesta.
     * 
     * @param tipoPension   * Tipo de Pension :  S: Sobrevivencia  T: Titular N: No aplica
     */
    public void setTipoPension(cl.dipreca.servicios.ipsV01.TipoRespuestaTipoPension tipoPension) {
        this.tipoPension = tipoPension;
    }


    /**
     * Gets the _any value for this TipoRespuesta.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this TipoRespuesta.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the schemaVersion value for this TipoRespuesta.
     * 
     * @return schemaVersion
     */
    public java.math.BigDecimal getSchemaVersion() {
        return schemaVersion;
    }


    /**
     * Sets the schemaVersion value for this TipoRespuesta.
     * 
     * @param schemaVersion
     */
    public void setSchemaVersion(java.math.BigDecimal schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoRespuesta)) return false;
        TipoRespuesta other = (TipoRespuesta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.mensajeWebServices==null && other.getMensajeWebServices()==null) || 
             (this.mensajeWebServices!=null &&
              this.mensajeWebServices.equals(other.getMensajeWebServices()))) &&
            ((this.fechaInforme==null && other.getFechaInforme()==null) || 
             (this.fechaInforme!=null &&
              this.fechaInforme.equals(other.getFechaInforme()))) &&
            ((this.run==null && other.getRun()==null) || 
             (this.run!=null &&
              this.run.equals(other.getRun()))) &&
            ((this.nombreCompletoBeneficiario==null && other.getNombreCompletoBeneficiario()==null) || 
             (this.nombreCompletoBeneficiario!=null &&
              this.nombreCompletoBeneficiario.equals(other.getNombreCompletoBeneficiario()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.situacionIndividuo==null && other.getSituacionIndividuo()==null) || 
             (this.situacionIndividuo!=null &&
              this.situacionIndividuo.equals(other.getSituacionIndividuo()))) &&
            ((this.fechaPension==null && other.getFechaPension()==null) || 
             (this.fechaPension!=null &&
              this.fechaPension.equals(other.getFechaPension()))) &&
            ((this.tipoPension==null && other.getTipoPension()==null) || 
             (this.tipoPension!=null &&
              this.tipoPension.equals(other.getTipoPension()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.schemaVersion==null && other.getSchemaVersion()==null) || 
             (this.schemaVersion!=null &&
              this.schemaVersion.equals(other.getSchemaVersion())));
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
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getMensajeWebServices() != null) {
            _hashCode += getMensajeWebServices().hashCode();
        }
        if (getFechaInforme() != null) {
            _hashCode += getFechaInforme().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        if (getNombreCompletoBeneficiario() != null) {
            _hashCode += getNombreCompletoBeneficiario().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getSituacionIndividuo() != null) {
            _hashCode += getSituacionIndividuo().hashCode();
        }
        if (getFechaPension() != null) {
            _hashCode += getFechaPension().hashCode();
        }
        if (getTipoPension() != null) {
            _hashCode += getTipoPension().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSchemaVersion() != null) {
            _hashCode += getSchemaVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoRespuesta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "TipoRespuesta"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SchemaVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeWebServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "MensajeWebServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInforme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "FechaInforme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "Run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCompletoBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "NombreCompletoBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "FechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "Sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "sexoValores"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacionIndividuo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "SituacionIndividuo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", ">TipoRespuesta>SituacionIndividuo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "FechaPension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", "TipoPension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicios.dipreca.cl/ipsV01", ">TipoRespuesta>TipoPension"));
        elemField.setNillable(true);
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
