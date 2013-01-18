/**
 * IdentificacionPersonaOInstitucionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.presidencia.interop;


/**
 * Tipo de datos que permite identificar a una persona o institución
 * con distintos tipos de datos
 */
public class IdentificacionPersonaOInstitucionType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    /* Tratamiento formal a aplicar a la persona definida */
    private cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeTratamiento tratamiento;

    /* Nombre de una persona */
    private cl.gob.aem.valida.NombreType nombrePersona;

    private cl.gob.aem.valida.RunType run;

    /* Identificación del cargo del emisor de la correspondencia */
    private cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeCargo cargo;

    private cl.gob.aem.valida.TelefonoType[] telefono;

    private java.lang.String[] direccionEmail;

    private cl.gob.aem.valida.DomicilioType domicilio;

    /* Tipo  asociado a los datos de esta estructura, puede ser Persona
     * o  Institución */
    private cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeTipo tipo;

    /* Sigla de la Institución o del departemento */
    private java.lang.String sigla;

    /* Nombre y Código Asigando a Institución */
    private cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeInstitucion institucion;

    private org.apache.axis.message.MessageElement [] _any;

    public IdentificacionPersonaOInstitucionType() {
    }

    public IdentificacionPersonaOInstitucionType(
           cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeTratamiento tratamiento,
           cl.gob.aem.valida.NombreType nombrePersona,
           cl.gob.aem.valida.RunType run,
           cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeCargo cargo,
           cl.gob.aem.valida.TelefonoType[] telefono,
           java.lang.String[] direccionEmail,
           cl.gob.aem.valida.DomicilioType domicilio,
           cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeTipo tipo,
           java.lang.String sigla,
           cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeInstitucion institucion,
           org.apache.axis.message.MessageElement [] _any) {
           this.tratamiento = tratamiento;
           this.nombrePersona = nombrePersona;
           this.run = run;
           this.cargo = cargo;
           this.telefono = telefono;
           this.direccionEmail = direccionEmail;
           this.domicilio = domicilio;
           this.tipo = tipo;
           this.sigla = sigla;
           this.institucion = institucion;
           this._any = _any;
    }


    /**
     * Gets the tratamiento value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return tratamiento   * Tratamiento formal a aplicar a la persona definida
     */
    public cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeTratamiento getTratamiento() {
        return tratamiento;
    }


    /**
     * Sets the tratamiento value for this IdentificacionPersonaOInstitucionType.
     * 
     * @param tratamiento   * Tratamiento formal a aplicar a la persona definida
     */
    public void setTratamiento(cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeTratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }


    /**
     * Gets the nombrePersona value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return nombrePersona   * Nombre de una persona
     */
    public cl.gob.aem.valida.NombreType getNombrePersona() {
        return nombrePersona;
    }


    /**
     * Sets the nombrePersona value for this IdentificacionPersonaOInstitucionType.
     * 
     * @param nombrePersona   * Nombre de una persona
     */
    public void setNombrePersona(cl.gob.aem.valida.NombreType nombrePersona) {
        this.nombrePersona = nombrePersona;
    }


    /**
     * Gets the run value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this IdentificacionPersonaOInstitucionType.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the cargo value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return cargo   * Identificación del cargo del emisor de la correspondencia
     */
    public cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeCargo getCargo() {
        return cargo;
    }


    /**
     * Sets the cargo value for this IdentificacionPersonaOInstitucionType.
     * 
     * @param cargo   * Identificación del cargo del emisor de la correspondencia
     */
    public void setCargo(cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeCargo cargo) {
        this.cargo = cargo;
    }


    /**
     * Gets the telefono value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return telefono
     */
    public cl.gob.aem.valida.TelefonoType[] getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this IdentificacionPersonaOInstitucionType.
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
     * Gets the direccionEmail value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return direccionEmail
     */
    public java.lang.String[] getDireccionEmail() {
        return direccionEmail;
    }


    /**
     * Sets the direccionEmail value for this IdentificacionPersonaOInstitucionType.
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
     * Gets the domicilio value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return domicilio
     */
    public cl.gob.aem.valida.DomicilioType getDomicilio() {
        return domicilio;
    }


    /**
     * Sets the domicilio value for this IdentificacionPersonaOInstitucionType.
     * 
     * @param domicilio
     */
    public void setDomicilio(cl.gob.aem.valida.DomicilioType domicilio) {
        this.domicilio = domicilio;
    }


    /**
     * Gets the tipo value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return tipo   * Tipo  asociado a los datos de esta estructura, puede ser Persona
     * o  Institución
     */
    public cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeTipo getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this IdentificacionPersonaOInstitucionType.
     * 
     * @param tipo   * Tipo  asociado a los datos de esta estructura, puede ser Persona
     * o  Institución
     */
    public void setTipo(cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeTipo tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the sigla value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return sigla   * Sigla de la Institución o del departemento
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this IdentificacionPersonaOInstitucionType.
     * 
     * @param sigla   * Sigla de la Institución o del departemento
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }


    /**
     * Gets the institucion value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return institucion   * Nombre y Código Asigando a Institución
     */
    public cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeInstitucion getInstitucion() {
        return institucion;
    }


    /**
     * Sets the institucion value for this IdentificacionPersonaOInstitucionType.
     * 
     * @param institucion   * Nombre y Código Asigando a Institución
     */
    public void setInstitucion(cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeInstitucion institucion) {
        this.institucion = institucion;
    }


    /**
     * Gets the _any value for this IdentificacionPersonaOInstitucionType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this IdentificacionPersonaOInstitucionType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionPersonaOInstitucionType)) return false;
        IdentificacionPersonaOInstitucionType other = (IdentificacionPersonaOInstitucionType) obj;
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
            ((this.nombrePersona==null && other.getNombrePersona()==null) || 
             (this.nombrePersona!=null &&
              this.nombrePersona.equals(other.getNombrePersona()))) &&
            ((this.run==null && other.getRun()==null) || 
             (this.run!=null &&
              this.run.equals(other.getRun()))) &&
            ((this.cargo==null && other.getCargo()==null) || 
             (this.cargo!=null &&
              this.cargo.equals(other.getCargo()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              java.util.Arrays.equals(this.telefono, other.getTelefono()))) &&
            ((this.direccionEmail==null && other.getDireccionEmail()==null) || 
             (this.direccionEmail!=null &&
              java.util.Arrays.equals(this.direccionEmail, other.getDireccionEmail()))) &&
            ((this.domicilio==null && other.getDomicilio()==null) || 
             (this.domicilio!=null &&
              this.domicilio.equals(other.getDomicilio()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla()))) &&
            ((this.institucion==null && other.getInstitucion()==null) || 
             (this.institucion!=null &&
              this.institucion.equals(other.getInstitucion()))) &&
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
        if (getNombrePersona() != null) {
            _hashCode += getNombrePersona().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
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
        if (getDomicilio() != null) {
            _hashCode += getDomicilio().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        if (getInstitucion() != null) {
            _hashCode += getInstitucion().hashCode();
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
        new org.apache.axis.description.TypeDesc(IdentificacionPersonaOInstitucionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", "IdentificacionPersonaOInstitucionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tratamiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Tratamiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", ">IdentificacionPersonaOInstitucionType>Tratamiento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "NombrePersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreType"));
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
        elemField.setFieldName("cargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Cargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", ">IdentificacionPersonaOInstitucionType>Cargo"));
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
        elemField.setFieldName("direccionEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DireccionEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DireccionEmail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", ">IdentificacionPersonaOInstitucionType>Tipo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Sigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "Institucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", ">IdentificacionPersonaOInstitucionType>Institucion"));
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
