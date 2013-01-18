/**
 * CorrespondenciaPresidencial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.presidencia.interop;

public class CorrespondenciaPresidencial  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    /* Nombre y Código Asigando a Institución */
    private cl.presidencia.interop.CorrespondenciaPresidencialInstitucion institucion;

    /* Código interno oficial utilizado en Presidencia */
    private java.lang.String codigoDocumentoPresidencia;

    /* Código documento enviado por las instituciones que responden
     * a la Presidencia */
    private java.lang.String codigoDocumentoRespuesta;

    /* Asunto de la correspondencia enviada */
    private java.lang.String asunto;

    /* Resumen de la correspondencia enviada */
    private java.lang.String resumen;

    /* Emisor correspondencia */
    private cl.gob.aem.valida.NombreType emisor;

    /* Destinatario correspondencia */
    private cl.gob.aem.valida.NombreType destinatario;

    /* Indica los datos de la persona que envió la correspondencia
     * a la Presidencia (Corresponencia Precedente) */
    private cl.presidencia.interop.IdentificacionPersonaOInstitucionType identificacionPersonaOInstitucion;

    /* Equivalente a la fecha estimada de respuesta */
    private cl.gob.aem.valida.FechaType fechaLimiteRespuesta;

    /* Código Tipo Correspondencia */
    private cl.presidencia.interop.CodigoTipoCorrespondenciaType codigoTipo;

    /* Pueden ser: Respuesta Institucional o Informe Gestión */
    private cl.presidencia.interop.TipoCorrespondenciaType tipo;

    /* Código Nivel Prioridad */
    private cl.presidencia.interop.CodigoPrioridadCorrespondenciaType codigoPrioridad;

    /* Rutina y Urgente */
    private cl.presidencia.interop.PrioridadCorrespondenciaType prioridad;

    /* Permite adjuntar varios archivos */
    private cl.gob.aem.valida.AdjuntosBinariosType adjuntosBinarios;

    /* Indica fecha de envío de la correspondencia Presidencial o
     * Respuesta por parte de la Institución */
    private cl.gob.aem.valida.FechaType fechaEnvio;

    private org.apache.axis.message.MessageElement [] _any;

    private java.math.BigDecimal schemaVersion;  // attribute

    public CorrespondenciaPresidencial() {
    }

    public CorrespondenciaPresidencial(
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           cl.presidencia.interop.CorrespondenciaPresidencialInstitucion institucion,
           java.lang.String codigoDocumentoPresidencia,
           java.lang.String codigoDocumentoRespuesta,
           java.lang.String asunto,
           java.lang.String resumen,
           cl.gob.aem.valida.NombreType emisor,
           cl.gob.aem.valida.NombreType destinatario,
           cl.presidencia.interop.IdentificacionPersonaOInstitucionType identificacionPersonaOInstitucion,
           cl.gob.aem.valida.FechaType fechaLimiteRespuesta,
           cl.presidencia.interop.CodigoTipoCorrespondenciaType codigoTipo,
           cl.presidencia.interop.TipoCorrespondenciaType tipo,
           cl.presidencia.interop.CodigoPrioridadCorrespondenciaType codigoPrioridad,
           cl.presidencia.interop.PrioridadCorrespondenciaType prioridad,
           cl.gob.aem.valida.AdjuntosBinariosType adjuntosBinarios,
           cl.gob.aem.valida.FechaType fechaEnvio,
           org.apache.axis.message.MessageElement [] _any,
           java.math.BigDecimal schemaVersion) {
           this.signature = signature;
           this.institucion = institucion;
           this.codigoDocumentoPresidencia = codigoDocumentoPresidencia;
           this.codigoDocumentoRespuesta = codigoDocumentoRespuesta;
           this.asunto = asunto;
           this.resumen = resumen;
           this.emisor = emisor;
           this.destinatario = destinatario;
           this.identificacionPersonaOInstitucion = identificacionPersonaOInstitucion;
           this.fechaLimiteRespuesta = fechaLimiteRespuesta;
           this.codigoTipo = codigoTipo;
           this.tipo = tipo;
           this.codigoPrioridad = codigoPrioridad;
           this.prioridad = prioridad;
           this.adjuntosBinarios = adjuntosBinarios;
           this.fechaEnvio = fechaEnvio;
           this._any = _any;
           this.schemaVersion = schemaVersion;
    }


    /**
     * Gets the signature value for this CorrespondenciaPresidencial.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this CorrespondenciaPresidencial.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }


    /**
     * Gets the institucion value for this CorrespondenciaPresidencial.
     * 
     * @return institucion   * Nombre y Código Asigando a Institución
     */
    public cl.presidencia.interop.CorrespondenciaPresidencialInstitucion getInstitucion() {
        return institucion;
    }


    /**
     * Sets the institucion value for this CorrespondenciaPresidencial.
     * 
     * @param institucion   * Nombre y Código Asigando a Institución
     */
    public void setInstitucion(cl.presidencia.interop.CorrespondenciaPresidencialInstitucion institucion) {
        this.institucion = institucion;
    }


    /**
     * Gets the codigoDocumentoPresidencia value for this CorrespondenciaPresidencial.
     * 
     * @return codigoDocumentoPresidencia   * Código interno oficial utilizado en Presidencia
     */
    public java.lang.String getCodigoDocumentoPresidencia() {
        return codigoDocumentoPresidencia;
    }


    /**
     * Sets the codigoDocumentoPresidencia value for this CorrespondenciaPresidencial.
     * 
     * @param codigoDocumentoPresidencia   * Código interno oficial utilizado en Presidencia
     */
    public void setCodigoDocumentoPresidencia(java.lang.String codigoDocumentoPresidencia) {
        this.codigoDocumentoPresidencia = codigoDocumentoPresidencia;
    }


    /**
     * Gets the codigoDocumentoRespuesta value for this CorrespondenciaPresidencial.
     * 
     * @return codigoDocumentoRespuesta   * Código documento enviado por las instituciones que responden
     * a la Presidencia
     */
    public java.lang.String getCodigoDocumentoRespuesta() {
        return codigoDocumentoRespuesta;
    }


    /**
     * Sets the codigoDocumentoRespuesta value for this CorrespondenciaPresidencial.
     * 
     * @param codigoDocumentoRespuesta   * Código documento enviado por las instituciones que responden
     * a la Presidencia
     */
    public void setCodigoDocumentoRespuesta(java.lang.String codigoDocumentoRespuesta) {
        this.codigoDocumentoRespuesta = codigoDocumentoRespuesta;
    }


    /**
     * Gets the asunto value for this CorrespondenciaPresidencial.
     * 
     * @return asunto   * Asunto de la correspondencia enviada
     */
    public java.lang.String getAsunto() {
        return asunto;
    }


    /**
     * Sets the asunto value for this CorrespondenciaPresidencial.
     * 
     * @param asunto   * Asunto de la correspondencia enviada
     */
    public void setAsunto(java.lang.String asunto) {
        this.asunto = asunto;
    }


    /**
     * Gets the resumen value for this CorrespondenciaPresidencial.
     * 
     * @return resumen   * Resumen de la correspondencia enviada
     */
    public java.lang.String getResumen() {
        return resumen;
    }


    /**
     * Sets the resumen value for this CorrespondenciaPresidencial.
     * 
     * @param resumen   * Resumen de la correspondencia enviada
     */
    public void setResumen(java.lang.String resumen) {
        this.resumen = resumen;
    }


    /**
     * Gets the emisor value for this CorrespondenciaPresidencial.
     * 
     * @return emisor   * Emisor correspondencia
     */
    public cl.gob.aem.valida.NombreType getEmisor() {
        return emisor;
    }


    /**
     * Sets the emisor value for this CorrespondenciaPresidencial.
     * 
     * @param emisor   * Emisor correspondencia
     */
    public void setEmisor(cl.gob.aem.valida.NombreType emisor) {
        this.emisor = emisor;
    }


    /**
     * Gets the destinatario value for this CorrespondenciaPresidencial.
     * 
     * @return destinatario   * Destinatario correspondencia
     */
    public cl.gob.aem.valida.NombreType getDestinatario() {
        return destinatario;
    }


    /**
     * Sets the destinatario value for this CorrespondenciaPresidencial.
     * 
     * @param destinatario   * Destinatario correspondencia
     */
    public void setDestinatario(cl.gob.aem.valida.NombreType destinatario) {
        this.destinatario = destinatario;
    }


    /**
     * Gets the identificacionPersonaOInstitucion value for this CorrespondenciaPresidencial.
     * 
     * @return identificacionPersonaOInstitucion   * Indica los datos de la persona que envió la correspondencia
     * a la Presidencia (Corresponencia Precedente)
     */
    public cl.presidencia.interop.IdentificacionPersonaOInstitucionType getIdentificacionPersonaOInstitucion() {
        return identificacionPersonaOInstitucion;
    }


    /**
     * Sets the identificacionPersonaOInstitucion value for this CorrespondenciaPresidencial.
     * 
     * @param identificacionPersonaOInstitucion   * Indica los datos de la persona que envió la correspondencia
     * a la Presidencia (Corresponencia Precedente)
     */
    public void setIdentificacionPersonaOInstitucion(cl.presidencia.interop.IdentificacionPersonaOInstitucionType identificacionPersonaOInstitucion) {
        this.identificacionPersonaOInstitucion = identificacionPersonaOInstitucion;
    }


    /**
     * Gets the fechaLimiteRespuesta value for this CorrespondenciaPresidencial.
     * 
     * @return fechaLimiteRespuesta   * Equivalente a la fecha estimada de respuesta
     */
    public cl.gob.aem.valida.FechaType getFechaLimiteRespuesta() {
        return fechaLimiteRespuesta;
    }


    /**
     * Sets the fechaLimiteRespuesta value for this CorrespondenciaPresidencial.
     * 
     * @param fechaLimiteRespuesta   * Equivalente a la fecha estimada de respuesta
     */
    public void setFechaLimiteRespuesta(cl.gob.aem.valida.FechaType fechaLimiteRespuesta) {
        this.fechaLimiteRespuesta = fechaLimiteRespuesta;
    }


    /**
     * Gets the codigoTipo value for this CorrespondenciaPresidencial.
     * 
     * @return codigoTipo   * Código Tipo Correspondencia
     */
    public cl.presidencia.interop.CodigoTipoCorrespondenciaType getCodigoTipo() {
        return codigoTipo;
    }


    /**
     * Sets the codigoTipo value for this CorrespondenciaPresidencial.
     * 
     * @param codigoTipo   * Código Tipo Correspondencia
     */
    public void setCodigoTipo(cl.presidencia.interop.CodigoTipoCorrespondenciaType codigoTipo) {
        this.codigoTipo = codigoTipo;
    }


    /**
     * Gets the tipo value for this CorrespondenciaPresidencial.
     * 
     * @return tipo   * Pueden ser: Respuesta Institucional o Informe Gestión
     */
    public cl.presidencia.interop.TipoCorrespondenciaType getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this CorrespondenciaPresidencial.
     * 
     * @param tipo   * Pueden ser: Respuesta Institucional o Informe Gestión
     */
    public void setTipo(cl.presidencia.interop.TipoCorrespondenciaType tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the codigoPrioridad value for this CorrespondenciaPresidencial.
     * 
     * @return codigoPrioridad   * Código Nivel Prioridad
     */
    public cl.presidencia.interop.CodigoPrioridadCorrespondenciaType getCodigoPrioridad() {
        return codigoPrioridad;
    }


    /**
     * Sets the codigoPrioridad value for this CorrespondenciaPresidencial.
     * 
     * @param codigoPrioridad   * Código Nivel Prioridad
     */
    public void setCodigoPrioridad(cl.presidencia.interop.CodigoPrioridadCorrespondenciaType codigoPrioridad) {
        this.codigoPrioridad = codigoPrioridad;
    }


    /**
     * Gets the prioridad value for this CorrespondenciaPresidencial.
     * 
     * @return prioridad   * Rutina y Urgente
     */
    public cl.presidencia.interop.PrioridadCorrespondenciaType getPrioridad() {
        return prioridad;
    }


    /**
     * Sets the prioridad value for this CorrespondenciaPresidencial.
     * 
     * @param prioridad   * Rutina y Urgente
     */
    public void setPrioridad(cl.presidencia.interop.PrioridadCorrespondenciaType prioridad) {
        this.prioridad = prioridad;
    }


    /**
     * Gets the adjuntosBinarios value for this CorrespondenciaPresidencial.
     * 
     * @return adjuntosBinarios   * Permite adjuntar varios archivos
     */
    public cl.gob.aem.valida.AdjuntosBinariosType getAdjuntosBinarios() {
        return adjuntosBinarios;
    }


    /**
     * Sets the adjuntosBinarios value for this CorrespondenciaPresidencial.
     * 
     * @param adjuntosBinarios   * Permite adjuntar varios archivos
     */
    public void setAdjuntosBinarios(cl.gob.aem.valida.AdjuntosBinariosType adjuntosBinarios) {
        this.adjuntosBinarios = adjuntosBinarios;
    }


    /**
     * Gets the fechaEnvio value for this CorrespondenciaPresidencial.
     * 
     * @return fechaEnvio   * Indica fecha de envío de la correspondencia Presidencial o
     * Respuesta por parte de la Institución
     */
    public cl.gob.aem.valida.FechaType getFechaEnvio() {
        return fechaEnvio;
    }


    /**
     * Sets the fechaEnvio value for this CorrespondenciaPresidencial.
     * 
     * @param fechaEnvio   * Indica fecha de envío de la correspondencia Presidencial o
     * Respuesta por parte de la Institución
     */
    public void setFechaEnvio(cl.gob.aem.valida.FechaType fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }


    /**
     * Gets the _any value for this CorrespondenciaPresidencial.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this CorrespondenciaPresidencial.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the schemaVersion value for this CorrespondenciaPresidencial.
     * 
     * @return schemaVersion
     */
    public java.math.BigDecimal getSchemaVersion() {
        return schemaVersion;
    }


    /**
     * Sets the schemaVersion value for this CorrespondenciaPresidencial.
     * 
     * @param schemaVersion
     */
    public void setSchemaVersion(java.math.BigDecimal schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorrespondenciaPresidencial)) return false;
        CorrespondenciaPresidencial other = (CorrespondenciaPresidencial) obj;
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
            ((this.institucion==null && other.getInstitucion()==null) || 
             (this.institucion!=null &&
              this.institucion.equals(other.getInstitucion()))) &&
            ((this.codigoDocumentoPresidencia==null && other.getCodigoDocumentoPresidencia()==null) || 
             (this.codigoDocumentoPresidencia!=null &&
              this.codigoDocumentoPresidencia.equals(other.getCodigoDocumentoPresidencia()))) &&
            ((this.codigoDocumentoRespuesta==null && other.getCodigoDocumentoRespuesta()==null) || 
             (this.codigoDocumentoRespuesta!=null &&
              this.codigoDocumentoRespuesta.equals(other.getCodigoDocumentoRespuesta()))) &&
            ((this.asunto==null && other.getAsunto()==null) || 
             (this.asunto!=null &&
              this.asunto.equals(other.getAsunto()))) &&
            ((this.resumen==null && other.getResumen()==null) || 
             (this.resumen!=null &&
              this.resumen.equals(other.getResumen()))) &&
            ((this.emisor==null && other.getEmisor()==null) || 
             (this.emisor!=null &&
              this.emisor.equals(other.getEmisor()))) &&
            ((this.destinatario==null && other.getDestinatario()==null) || 
             (this.destinatario!=null &&
              this.destinatario.equals(other.getDestinatario()))) &&
            ((this.identificacionPersonaOInstitucion==null && other.getIdentificacionPersonaOInstitucion()==null) || 
             (this.identificacionPersonaOInstitucion!=null &&
              this.identificacionPersonaOInstitucion.equals(other.getIdentificacionPersonaOInstitucion()))) &&
            ((this.fechaLimiteRespuesta==null && other.getFechaLimiteRespuesta()==null) || 
             (this.fechaLimiteRespuesta!=null &&
              this.fechaLimiteRespuesta.equals(other.getFechaLimiteRespuesta()))) &&
            ((this.codigoTipo==null && other.getCodigoTipo()==null) || 
             (this.codigoTipo!=null &&
              this.codigoTipo.equals(other.getCodigoTipo()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.codigoPrioridad==null && other.getCodigoPrioridad()==null) || 
             (this.codigoPrioridad!=null &&
              this.codigoPrioridad.equals(other.getCodigoPrioridad()))) &&
            ((this.prioridad==null && other.getPrioridad()==null) || 
             (this.prioridad!=null &&
              this.prioridad.equals(other.getPrioridad()))) &&
            ((this.adjuntosBinarios==null && other.getAdjuntosBinarios()==null) || 
             (this.adjuntosBinarios!=null &&
              this.adjuntosBinarios.equals(other.getAdjuntosBinarios()))) &&
            ((this.fechaEnvio==null && other.getFechaEnvio()==null) || 
             (this.fechaEnvio!=null &&
              this.fechaEnvio.equals(other.getFechaEnvio()))) &&
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
        if (getInstitucion() != null) {
            _hashCode += getInstitucion().hashCode();
        }
        if (getCodigoDocumentoPresidencia() != null) {
            _hashCode += getCodigoDocumentoPresidencia().hashCode();
        }
        if (getCodigoDocumentoRespuesta() != null) {
            _hashCode += getCodigoDocumentoRespuesta().hashCode();
        }
        if (getAsunto() != null) {
            _hashCode += getAsunto().hashCode();
        }
        if (getResumen() != null) {
            _hashCode += getResumen().hashCode();
        }
        if (getEmisor() != null) {
            _hashCode += getEmisor().hashCode();
        }
        if (getDestinatario() != null) {
            _hashCode += getDestinatario().hashCode();
        }
        if (getIdentificacionPersonaOInstitucion() != null) {
            _hashCode += getIdentificacionPersonaOInstitucion().hashCode();
        }
        if (getFechaLimiteRespuesta() != null) {
            _hashCode += getFechaLimiteRespuesta().hashCode();
        }
        if (getCodigoTipo() != null) {
            _hashCode += getCodigoTipo().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getCodigoPrioridad() != null) {
            _hashCode += getCodigoPrioridad().hashCode();
        }
        if (getPrioridad() != null) {
            _hashCode += getPrioridad().hashCode();
        }
        if (getAdjuntosBinarios() != null) {
            _hashCode += getAdjuntosBinarios().hashCode();
        }
        if (getFechaEnvio() != null) {
            _hashCode += getFechaEnvio().hashCode();
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
        new org.apache.axis.description.TypeDesc(CorrespondenciaPresidencial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", ">CorrespondenciaPresidencial"));
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
        elemField.setFieldName("institucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Institucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", ">>CorrespondenciaPresidencial>Institucion"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoDocumentoPresidencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "CodigoDocumentoPresidencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoDocumentoRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "CodigoDocumentoRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asunto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Asunto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resumen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Resumen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Emisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Destinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionPersonaOInstitucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "IdentificacionPersonaOInstitucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", "IdentificacionPersonaOInstitucionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaLimiteRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "FechaLimiteRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "CodigoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", "CodigoTipoCorrespondenciaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", "TipoCorrespondenciaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPrioridad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "CodigoPrioridad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", "CodigoPrioridadCorrespondenciaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioridad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Prioridad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", "PrioridadCorrespondenciaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjuntosBinarios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "AdjuntosBinarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "AdjuntosBinariosType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaEnvio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "FechaEnvio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
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
