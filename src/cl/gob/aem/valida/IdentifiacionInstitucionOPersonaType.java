/**
 * IdentifiacionInstitucionOPersonaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;


/**
 * Tipo de datos que permite identificar a una persona o institución
 * con distintos tipos de datos
 */
public class IdentifiacionInstitucionOPersonaType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    /* Tratamiento formal a aplicar a la persona definida */
    private cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeTratamiento tratamiento;

    /* Nombre de una Institución */
    private cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeNombreInstitucionGlosaLinea[] nombreInstitucion;

    /* Nombre de una persona */
    private cl.gob.aem.valida.NameType nombrePersona;

    /* Nombre completo de una persona */
    private java.lang.String glosaPersona;

    /* Sigla de la Institución o del departemento */
    private java.lang.String sigla;

    private cl.gob.aem.valida.RunType run;

    private cl.gob.aem.valida.RunType rut;

    /* Cargo de la persona */
    private cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeCargo cargo;

    private cl.gob.aem.valida.TelefonoType[] telefono;

    private cl.gob.aem.valida.TelefonoType[] telefonoMovil;

    private cl.gob.aem.valida.TelefonoType[] fax;

    private java.lang.String[] direccionEmail;

    /* Url del Sitio web */
    private org.apache.axis.types.URI urlSitioWeb;

    private cl.gob.aem.valida.DomicilioType domicilio;

    /* Tipo  asociado a los datos de esta estructura, puede ser Persona
     * o  Institución */
    private cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeTipo tipo;

    private org.apache.axis.message.MessageElement [] _any;

    public IdentifiacionInstitucionOPersonaType() {
    }

    public IdentifiacionInstitucionOPersonaType(
           cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeTratamiento tratamiento,
           cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeNombreInstitucionGlosaLinea[] nombreInstitucion,
           cl.gob.aem.valida.NameType nombrePersona,
           java.lang.String glosaPersona,
           java.lang.String sigla,
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.RunType rut,
           cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeCargo cargo,
           cl.gob.aem.valida.TelefonoType[] telefono,
           cl.gob.aem.valida.TelefonoType[] telefonoMovil,
           cl.gob.aem.valida.TelefonoType[] fax,
           java.lang.String[] direccionEmail,
           org.apache.axis.types.URI urlSitioWeb,
           cl.gob.aem.valida.DomicilioType domicilio,
           cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeTipo tipo,
           org.apache.axis.message.MessageElement [] _any) {
           this.tratamiento = tratamiento;
           this.nombreInstitucion = nombreInstitucion;
           this.nombrePersona = nombrePersona;
           this.glosaPersona = glosaPersona;
           this.sigla = sigla;
           this.run = run;
           this.rut = rut;
           this.cargo = cargo;
           this.telefono = telefono;
           this.telefonoMovil = telefonoMovil;
           this.fax = fax;
           this.direccionEmail = direccionEmail;
           this.urlSitioWeb = urlSitioWeb;
           this.domicilio = domicilio;
           this.tipo = tipo;
           this._any = _any;
    }


    /**
     * Gets the tratamiento value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return tratamiento   * Tratamiento formal a aplicar a la persona definida
     */
    public cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeTratamiento getTratamiento() {
        return tratamiento;
    }


    /**
     * Sets the tratamiento value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param tratamiento   * Tratamiento formal a aplicar a la persona definida
     */
    public void setTratamiento(cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeTratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }


    /**
     * Gets the nombreInstitucion value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return nombreInstitucion   * Nombre de una Institución
     */
    public cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeNombreInstitucionGlosaLinea[] getNombreInstitucion() {
        return nombreInstitucion;
    }


    /**
     * Sets the nombreInstitucion value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param nombreInstitucion   * Nombre de una Institución
     */
    public void setNombreInstitucion(cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeNombreInstitucionGlosaLinea[] nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }


    /**
     * Gets the nombrePersona value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return nombrePersona   * Nombre de una persona
     */
    public cl.gob.aem.valida.NameType getNombrePersona() {
        return nombrePersona;
    }


    /**
     * Sets the nombrePersona value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param nombrePersona   * Nombre de una persona
     */
    public void setNombrePersona(cl.gob.aem.valida.NameType nombrePersona) {
        this.nombrePersona = nombrePersona;
    }


    /**
     * Gets the glosaPersona value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return glosaPersona   * Nombre completo de una persona
     */
    public java.lang.String getGlosaPersona() {
        return glosaPersona;
    }


    /**
     * Sets the glosaPersona value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param glosaPersona   * Nombre completo de una persona
     */
    public void setGlosaPersona(java.lang.String glosaPersona) {
        this.glosaPersona = glosaPersona;
    }


    /**
     * Gets the sigla value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return sigla   * Sigla de la Institución o del departemento
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param sigla   * Sigla de la Institución o del departemento
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }


    /**
     * Gets the run value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the rut value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return rut
     */
    public cl.gob.aem.valida.RunType getRut() {
        return rut;
    }


    /**
     * Sets the rut value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param rut
     */
    public void setRut(cl.gob.aem.valida.RunType rut) {
        this.rut = rut;
    }


    /**
     * Gets the cargo value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return cargo   * Cargo de la persona
     */
    public cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeCargo getCargo() {
        return cargo;
    }


    /**
     * Sets the cargo value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param cargo   * Cargo de la persona
     */
    public void setCargo(cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeCargo cargo) {
        this.cargo = cargo;
    }


    /**
     * Gets the telefono value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return telefono
     */
    public cl.gob.aem.valida.TelefonoType[] getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param telefono
     */
    public void setTelefono(cl.gob.aem.valida.TelefonoType[] telefono) {
        this.telefono = telefono;
    }

    public cl.gob.aem.valida.TelefonoType getTelefono(int i) {
        return this.telefono[i];
    }

    public void setTelefono(int i, cl.gob.aem.valida.TelefonoType _value) {
        this.telefono[i] = _value;
    }


    /**
     * Gets the telefonoMovil value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return telefonoMovil
     */
    public cl.gob.aem.valida.TelefonoType[] getTelefonoMovil() {
        return telefonoMovil;
    }


    /**
     * Sets the telefonoMovil value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param telefonoMovil
     */
    public void setTelefonoMovil(cl.gob.aem.valida.TelefonoType[] telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public cl.gob.aem.valida.TelefonoType getTelefonoMovil(int i) {
        return this.telefonoMovil[i];
    }

    public void setTelefonoMovil(int i, cl.gob.aem.valida.TelefonoType _value) {
        this.telefonoMovil[i] = _value;
    }


    /**
     * Gets the fax value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return fax
     */
    public cl.gob.aem.valida.TelefonoType[] getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param fax
     */
    public void setFax(cl.gob.aem.valida.TelefonoType[] fax) {
        this.fax = fax;
    }

    public cl.gob.aem.valida.TelefonoType getFax(int i) {
        return this.fax[i];
    }

    public void setFax(int i, cl.gob.aem.valida.TelefonoType _value) {
        this.fax[i] = _value;
    }


    /**
     * Gets the direccionEmail value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return direccionEmail
     */
    public java.lang.String[] getDireccionEmail() {
        return direccionEmail;
    }


    /**
     * Sets the direccionEmail value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param direccionEmail
     */
    public void setDireccionEmail(java.lang.String[] direccionEmail) {
        this.direccionEmail = direccionEmail;
    }

    public java.lang.String getDireccionEmail(int i) {
        return this.direccionEmail[i];
    }

    public void setDireccionEmail(int i, java.lang.String _value) {
        this.direccionEmail[i] = _value;
    }


    /**
     * Gets the urlSitioWeb value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return urlSitioWeb   * Url del Sitio web
     */
    public org.apache.axis.types.URI getUrlSitioWeb() {
        return urlSitioWeb;
    }


    /**
     * Sets the urlSitioWeb value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param urlSitioWeb   * Url del Sitio web
     */
    public void setUrlSitioWeb(org.apache.axis.types.URI urlSitioWeb) {
        this.urlSitioWeb = urlSitioWeb;
    }


    /**
     * Gets the domicilio value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return domicilio
     */
    public cl.gob.aem.valida.DomicilioType getDomicilio() {
        return domicilio;
    }


    /**
     * Sets the domicilio value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param domicilio
     */
    public void setDomicilio(cl.gob.aem.valida.DomicilioType domicilio) {
        this.domicilio = domicilio;
    }


    /**
     * Gets the tipo value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return tipo   * Tipo  asociado a los datos de esta estructura, puede ser Persona
     * o  Institución
     */
    public cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeTipo getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param tipo   * Tipo  asociado a los datos de esta estructura, puede ser Persona
     * o  Institución
     */
    public void setTipo(cl.gob.aem.valida.IdentifiacionInstitucionOPersonaTypeTipo tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the _any value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this IdentifiacionInstitucionOPersonaType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentifiacionInstitucionOPersonaType)) return false;
        IdentifiacionInstitucionOPersonaType other = (IdentifiacionInstitucionOPersonaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tratamiento==null && other.getTratamiento()==null) || 
             (this.tratamiento!=null &&
              this.tratamiento.equals(other.getTratamiento()))) &&
            ((this.nombreInstitucion==null && other.getNombreInstitucion()==null) || 
             (this.nombreInstitucion!=null &&
              java.util.Arrays.equals(this.nombreInstitucion, other.getNombreInstitucion()))) &&
            ((this.nombrePersona==null && other.getNombrePersona()==null) || 
             (this.nombrePersona!=null &&
              this.nombrePersona.equals(other.getNombrePersona()))) &&
            ((this.glosaPersona==null && other.getGlosaPersona()==null) || 
             (this.glosaPersona!=null &&
              this.glosaPersona.equals(other.getGlosaPersona()))) &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla()))) &&
            ((this.run==null && other.getRun()==null) || 
             (this.run!=null &&
              this.run.equals(other.getRun()))) &&
            ((this.rut==null && other.getRut()==null) || 
             (this.rut!=null &&
              this.rut.equals(other.getRut()))) &&
            ((this.cargo==null && other.getCargo()==null) || 
             (this.cargo!=null &&
              this.cargo.equals(other.getCargo()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              java.util.Arrays.equals(this.telefono, other.getTelefono()))) &&
            ((this.telefonoMovil==null && other.getTelefonoMovil()==null) || 
             (this.telefonoMovil!=null &&
              java.util.Arrays.equals(this.telefonoMovil, other.getTelefonoMovil()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              java.util.Arrays.equals(this.fax, other.getFax()))) &&
            ((this.direccionEmail==null && other.getDireccionEmail()==null) || 
             (this.direccionEmail!=null &&
              java.util.Arrays.equals(this.direccionEmail, other.getDireccionEmail()))) &&
            ((this.urlSitioWeb==null && other.getUrlSitioWeb()==null) || 
             (this.urlSitioWeb!=null &&
              this.urlSitioWeb.equals(other.getUrlSitioWeb()))) &&
            ((this.domicilio==null && other.getDomicilio()==null) || 
             (this.domicilio!=null &&
              this.domicilio.equals(other.getDomicilio()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getTratamiento() != null) {
            _hashCode += getTratamiento().hashCode();
        }
        if (getNombreInstitucion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNombreInstitucion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNombreInstitucion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNombrePersona() != null) {
            _hashCode += getNombrePersona().hashCode();
        }
        if (getGlosaPersona() != null) {
            _hashCode += getGlosaPersona().hashCode();
        }
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        if (getRut() != null) {
            _hashCode += getRut().hashCode();
        }
        if (getCargo() != null) {
            _hashCode += getCargo().hashCode();
        }
        if (getTelefono() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelefono());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelefono(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelefonoMovil() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelefonoMovil());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelefonoMovil(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDireccionEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDireccionEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDireccionEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrlSitioWeb() != null) {
            _hashCode += getUrlSitioWeb().hashCode();
        }
        if (getDomicilio() != null) {
            _hashCode += getDomicilio().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentifiacionInstitucionOPersonaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "IdentifiacionInstitucionOPersonaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tratamiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Tratamiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">IdentifiacionInstitucionOPersonaType>Tratamiento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreInstitucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreInstitucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>IdentifiacionInstitucionOPersonaType>NombreInstitucion>GlosaLinea"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "GlosaLinea"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombrePersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glosaPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "GlosaPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Sigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Cargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">IdentifiacionInstitucionOPersonaType>Cargo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Telefono"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoMovil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TelefonoMovil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TelefonoMovil"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Fax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DireccionEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DireccionEmail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlSitioWeb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "UrlSitioWeb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Domicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DomicilioType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">IdentifiacionInstitucionOPersonaType>Tipo"));
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
