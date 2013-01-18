/**
 * OficioType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;


/**
 * Esqueleto base de un documento: Oficio
 */
public class OficioType  implements java.io.Serializable {
    /* Numero del oficio (alfanumerico) */
    private java.lang.String numeroOficio;

    /* Nivel de Confidencialidad del oficio. Puede ser : PUBLICO,
     * RESERVADO o SECRETO */
    private cl.gob.aem.valida.OficioTypeNivelConfidencialidad nivelConfidencialidad;

    /* Tipo de Oficio (ordinario, exento,...) */
    private java.lang.String tipo;

    /* Materia del oficio */
    private java.lang.String materia;

    /* Antecedentes del oficio */
    private java.lang.String antecedente;

    /* Lugar de emisión del oficio */
    private java.lang.String lugar;

    private java.util.Date fechaEmision;

    /* Emisor del oficio */
    private cl.gob.aem.valida.IdentifiacionInstitucionOPersonaType emisor;

    /* Destinatario del Oficio */
    private cl.gob.aem.valida.IdentifiacionInstitucionOPersonaType destinatario;

    /* Indica cual del Emisor o Destinatario tiene mayor rango. */
    private cl.gob.aem.valida.OficioTypeMayorJerarquiaEmisorDestinatario mayorJerarquiaEmisorDestinatario;

    /* Cuerpo del oficio */
    private cl.gob.aem.valida.TextoEstructuradoXHTMLType cuerpo;

    /* Lista de distribución del documento (opcional) */
    private cl.gob.aem.valida.ListaDistribucionTypeReceptor[] listaDistribucion;

    private cl.gob.aem.valida.AdjuntosBinariosType adjuntosBinarios;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    private org.apache.axis.types.NMToken schemaVersion;  // attribute

    private java.lang.String ID;  // attribute

    public OficioType() {
    }

    public OficioType(
           java.lang.String numeroOficio,
           cl.gob.aem.valida.OficioTypeNivelConfidencialidad nivelConfidencialidad,
           java.lang.String tipo,
           java.lang.String materia,
           java.lang.String antecedente,
           java.lang.String lugar,
           java.util.Date fechaEmision,
           cl.gob.aem.valida.IdentifiacionInstitucionOPersonaType emisor,
           cl.gob.aem.valida.IdentifiacionInstitucionOPersonaType destinatario,
           cl.gob.aem.valida.OficioTypeMayorJerarquiaEmisorDestinatario mayorJerarquiaEmisorDestinatario,
           cl.gob.aem.valida.TextoEstructuradoXHTMLType cuerpo,
           cl.gob.aem.valida.ListaDistribucionTypeReceptor[] listaDistribucion,
           cl.gob.aem.valida.AdjuntosBinariosType adjuntosBinarios,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           org.apache.axis.types.NMToken schemaVersion,
           java.lang.String ID) {
           this.numeroOficio = numeroOficio;
           this.nivelConfidencialidad = nivelConfidencialidad;
           this.tipo = tipo;
           this.materia = materia;
           this.antecedente = antecedente;
           this.lugar = lugar;
           this.fechaEmision = fechaEmision;
           this.emisor = emisor;
           this.destinatario = destinatario;
           this.mayorJerarquiaEmisorDestinatario = mayorJerarquiaEmisorDestinatario;
           this.cuerpo = cuerpo;
           this.listaDistribucion = listaDistribucion;
           this.adjuntosBinarios = adjuntosBinarios;
           this.signature = signature;
           this.schemaVersion = schemaVersion;
           this.ID = ID;
    }


    /**
     * Gets the numeroOficio value for this OficioType.
     * 
     * @return numeroOficio   * Numero del oficio (alfanumerico)
     */
    public java.lang.String getNumeroOficio() {
        return numeroOficio;
    }


    /**
     * Sets the numeroOficio value for this OficioType.
     * 
     * @param numeroOficio   * Numero del oficio (alfanumerico)
     */
    public void setNumeroOficio(java.lang.String numeroOficio) {
        this.numeroOficio = numeroOficio;
    }


    /**
     * Gets the nivelConfidencialidad value for this OficioType.
     * 
     * @return nivelConfidencialidad   * Nivel de Confidencialidad del oficio. Puede ser : PUBLICO,
     * RESERVADO o SECRETO
     */
    public cl.gob.aem.valida.OficioTypeNivelConfidencialidad getNivelConfidencialidad() {
        return nivelConfidencialidad;
    }


    /**
     * Sets the nivelConfidencialidad value for this OficioType.
     * 
     * @param nivelConfidencialidad   * Nivel de Confidencialidad del oficio. Puede ser : PUBLICO,
     * RESERVADO o SECRETO
     */
    public void setNivelConfidencialidad(cl.gob.aem.valida.OficioTypeNivelConfidencialidad nivelConfidencialidad) {
        this.nivelConfidencialidad = nivelConfidencialidad;
    }


    /**
     * Gets the tipo value for this OficioType.
     * 
     * @return tipo   * Tipo de Oficio (ordinario, exento,...)
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this OficioType.
     * 
     * @param tipo   * Tipo de Oficio (ordinario, exento,...)
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the materia value for this OficioType.
     * 
     * @return materia   * Materia del oficio
     */
    public java.lang.String getMateria() {
        return materia;
    }


    /**
     * Sets the materia value for this OficioType.
     * 
     * @param materia   * Materia del oficio
     */
    public void setMateria(java.lang.String materia) {
        this.materia = materia;
    }


    /**
     * Gets the antecedente value for this OficioType.
     * 
     * @return antecedente   * Antecedentes del oficio
     */
    public java.lang.String getAntecedente() {
        return antecedente;
    }


    /**
     * Sets the antecedente value for this OficioType.
     * 
     * @param antecedente   * Antecedentes del oficio
     */
    public void setAntecedente(java.lang.String antecedente) {
        this.antecedente = antecedente;
    }


    /**
     * Gets the lugar value for this OficioType.
     * 
     * @return lugar   * Lugar de emisión del oficio
     */
    public java.lang.String getLugar() {
        return lugar;
    }


    /**
     * Sets the lugar value for this OficioType.
     * 
     * @param lugar   * Lugar de emisión del oficio
     */
    public void setLugar(java.lang.String lugar) {
        this.lugar = lugar;
    }


    /**
     * Gets the fechaEmision value for this OficioType.
     * 
     * @return fechaEmision
     */
    public java.util.Date getFechaEmision() {
        return fechaEmision;
    }


    /**
     * Sets the fechaEmision value for this OficioType.
     * 
     * @param fechaEmision
     */
    public void setFechaEmision(java.util.Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }


    /**
     * Gets the emisor value for this OficioType.
     * 
     * @return emisor   * Emisor del oficio
     */
    public cl.gob.aem.valida.IdentifiacionInstitucionOPersonaType getEmisor() {
        return emisor;
    }


    /**
     * Sets the emisor value for this OficioType.
     * 
     * @param emisor   * Emisor del oficio
     */
    public void setEmisor(cl.gob.aem.valida.IdentifiacionInstitucionOPersonaType emisor) {
        this.emisor = emisor;
    }


    /**
     * Gets the destinatario value for this OficioType.
     * 
     * @return destinatario   * Destinatario del Oficio
     */
    public cl.gob.aem.valida.IdentifiacionInstitucionOPersonaType getDestinatario() {
        return destinatario;
    }


    /**
     * Sets the destinatario value for this OficioType.
     * 
     * @param destinatario   * Destinatario del Oficio
     */
    public void setDestinatario(cl.gob.aem.valida.IdentifiacionInstitucionOPersonaType destinatario) {
        this.destinatario = destinatario;
    }


    /**
     * Gets the mayorJerarquiaEmisorDestinatario value for this OficioType.
     * 
     * @return mayorJerarquiaEmisorDestinatario   * Indica cual del Emisor o Destinatario tiene mayor rango.
     */
    public cl.gob.aem.valida.OficioTypeMayorJerarquiaEmisorDestinatario getMayorJerarquiaEmisorDestinatario() {
        return mayorJerarquiaEmisorDestinatario;
    }


    /**
     * Sets the mayorJerarquiaEmisorDestinatario value for this OficioType.
     * 
     * @param mayorJerarquiaEmisorDestinatario   * Indica cual del Emisor o Destinatario tiene mayor rango.
     */
    public void setMayorJerarquiaEmisorDestinatario(cl.gob.aem.valida.OficioTypeMayorJerarquiaEmisorDestinatario mayorJerarquiaEmisorDestinatario) {
        this.mayorJerarquiaEmisorDestinatario = mayorJerarquiaEmisorDestinatario;
    }


    /**
     * Gets the cuerpo value for this OficioType.
     * 
     * @return cuerpo   * Cuerpo del oficio
     */
    public cl.gob.aem.valida.TextoEstructuradoXHTMLType getCuerpo() {
        return cuerpo;
    }


    /**
     * Sets the cuerpo value for this OficioType.
     * 
     * @param cuerpo   * Cuerpo del oficio
     */
    public void setCuerpo(cl.gob.aem.valida.TextoEstructuradoXHTMLType cuerpo) {
        this.cuerpo = cuerpo;
    }


    /**
     * Gets the listaDistribucion value for this OficioType.
     * 
     * @return listaDistribucion   * Lista de distribución del documento (opcional)
     */
    public cl.gob.aem.valida.ListaDistribucionTypeReceptor[] getListaDistribucion() {
        return listaDistribucion;
    }


    /**
     * Sets the listaDistribucion value for this OficioType.
     * 
     * @param listaDistribucion   * Lista de distribución del documento (opcional)
     */
    public void setListaDistribucion(cl.gob.aem.valida.ListaDistribucionTypeReceptor[] listaDistribucion) {
        this.listaDistribucion = listaDistribucion;
    }


    /**
     * Gets the adjuntosBinarios value for this OficioType.
     * 
     * @return adjuntosBinarios
     */
    public cl.gob.aem.valida.AdjuntosBinariosType getAdjuntosBinarios() {
        return adjuntosBinarios;
    }


    /**
     * Sets the adjuntosBinarios value for this OficioType.
     * 
     * @param adjuntosBinarios
     */
    public void setAdjuntosBinarios(cl.gob.aem.valida.AdjuntosBinariosType adjuntosBinarios) {
        this.adjuntosBinarios = adjuntosBinarios;
    }


    /**
     * Gets the signature value for this OficioType.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this OficioType.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }


    /**
     * Gets the schemaVersion value for this OficioType.
     * 
     * @return schemaVersion
     */
    public org.apache.axis.types.NMToken getSchemaVersion() {
        return schemaVersion;
    }


    /**
     * Sets the schemaVersion value for this OficioType.
     * 
     * @param schemaVersion
     */
    public void setSchemaVersion(org.apache.axis.types.NMToken schemaVersion) {
        this.schemaVersion = schemaVersion;
    }


    /**
     * Gets the ID value for this OficioType.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this OficioType.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OficioType)) return false;
        OficioType other = (OficioType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroOficio==null && other.getNumeroOficio()==null) || 
             (this.numeroOficio!=null &&
              this.numeroOficio.equals(other.getNumeroOficio()))) &&
            ((this.nivelConfidencialidad==null && other.getNivelConfidencialidad()==null) || 
             (this.nivelConfidencialidad!=null &&
              this.nivelConfidencialidad.equals(other.getNivelConfidencialidad()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.materia==null && other.getMateria()==null) || 
             (this.materia!=null &&
              this.materia.equals(other.getMateria()))) &&
            ((this.antecedente==null && other.getAntecedente()==null) || 
             (this.antecedente!=null &&
              this.antecedente.equals(other.getAntecedente()))) &&
            ((this.lugar==null && other.getLugar()==null) || 
             (this.lugar!=null &&
              this.lugar.equals(other.getLugar()))) &&
            ((this.fechaEmision==null && other.getFechaEmision()==null) || 
             (this.fechaEmision!=null &&
              this.fechaEmision.equals(other.getFechaEmision()))) &&
            ((this.emisor==null && other.getEmisor()==null) || 
             (this.emisor!=null &&
              this.emisor.equals(other.getEmisor()))) &&
            ((this.destinatario==null && other.getDestinatario()==null) || 
             (this.destinatario!=null &&
              this.destinatario.equals(other.getDestinatario()))) &&
            ((this.mayorJerarquiaEmisorDestinatario==null && other.getMayorJerarquiaEmisorDestinatario()==null) || 
             (this.mayorJerarquiaEmisorDestinatario!=null &&
              this.mayorJerarquiaEmisorDestinatario.equals(other.getMayorJerarquiaEmisorDestinatario()))) &&
            ((this.cuerpo==null && other.getCuerpo()==null) || 
             (this.cuerpo!=null &&
              this.cuerpo.equals(other.getCuerpo()))) &&
            ((this.listaDistribucion==null && other.getListaDistribucion()==null) || 
             (this.listaDistribucion!=null &&
              java.util.Arrays.equals(this.listaDistribucion, other.getListaDistribucion()))) &&
            ((this.adjuntosBinarios==null && other.getAdjuntosBinarios()==null) || 
             (this.adjuntosBinarios!=null &&
              this.adjuntosBinarios.equals(other.getAdjuntosBinarios()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.schemaVersion==null && other.getSchemaVersion()==null) || 
             (this.schemaVersion!=null &&
              this.schemaVersion.equals(other.getSchemaVersion()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID())));
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
        if (getNumeroOficio() != null) {
            _hashCode += getNumeroOficio().hashCode();
        }
        if (getNivelConfidencialidad() != null) {
            _hashCode += getNivelConfidencialidad().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getMateria() != null) {
            _hashCode += getMateria().hashCode();
        }
        if (getAntecedente() != null) {
            _hashCode += getAntecedente().hashCode();
        }
        if (getLugar() != null) {
            _hashCode += getLugar().hashCode();
        }
        if (getFechaEmision() != null) {
            _hashCode += getFechaEmision().hashCode();
        }
        if (getEmisor() != null) {
            _hashCode += getEmisor().hashCode();
        }
        if (getDestinatario() != null) {
            _hashCode += getDestinatario().hashCode();
        }
        if (getMayorJerarquiaEmisorDestinatario() != null) {
            _hashCode += getMayorJerarquiaEmisorDestinatario().hashCode();
        }
        if (getCuerpo() != null) {
            _hashCode += getCuerpo().hashCode();
        }
        if (getListaDistribucion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaDistribucion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaDistribucion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdjuntosBinarios() != null) {
            _hashCode += getAdjuntosBinarios().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getSchemaVersion() != null) {
            _hashCode += getSchemaVersion().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OficioType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "OficioType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SchemaVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NMTOKEN"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroOficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroOficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelConfidencialidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NivelConfidencialidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">OficioType>NivelConfidencialidad"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Materia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antecedente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Antecedente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lugar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Lugar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaEmision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaEmision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Emisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "IdentifiacionInstitucionOPersonaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Destinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "IdentifiacionInstitucionOPersonaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mayorJerarquiaEmisorDestinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "MayorJerarquiaEmisorDestinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">OficioType>MayorJerarquiaEmisorDestinatario"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuerpo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Cuerpo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TextoEstructuradoXHTMLType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaDistribucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ListaDistribucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ListaDistribucionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjuntosBinarios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "AdjuntosBinarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "AdjuntosBinariosType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureType"));
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
