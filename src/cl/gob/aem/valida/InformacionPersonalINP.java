/**
 * InformacionPersonalINP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformacionPersonalINP  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType run;

    private cl.gob.aem.valida.NameType nombre;

    private cl.gob.aem.valida.FechaType fechaNacimiento;

    private cl.gob.aem.valida.FechaType fechaDefuncion;

    private cl.gob.aem.valida.EstadoCivilValores estadoCivil;

    private cl.gob.aem.valida.SexoValores sexo;

    private java.lang.String nacionalidad;

    private java.math.BigInteger circunscripcionNacimiento;

    private java.lang.String profesion;

    private cl.gob.aem.valida.FechaType fechaDeMuertePresunta;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public InformacionPersonalINP() {
    }

    public InformacionPersonalINP(
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.NameType nombre,
           cl.gob.aem.valida.FechaType fechaNacimiento,
           cl.gob.aem.valida.FechaType fechaDefuncion,
           cl.gob.aem.valida.EstadoCivilValores estadoCivil,
           cl.gob.aem.valida.SexoValores sexo,
           java.lang.String nacionalidad,
           java.math.BigInteger circunscripcionNacimiento,
           java.lang.String profesion,
           cl.gob.aem.valida.FechaType fechaDeMuertePresunta,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.run = run;
           this.nombre = nombre;
           this.fechaNacimiento = fechaNacimiento;
           this.fechaDefuncion = fechaDefuncion;
           this.estadoCivil = estadoCivil;
           this.sexo = sexo;
           this.nacionalidad = nacionalidad;
           this.circunscripcionNacimiento = circunscripcionNacimiento;
           this.profesion = profesion;
           this.fechaDeMuertePresunta = fechaDeMuertePresunta;
           this.signature = signature;
    }


    /**
     * Gets the run value for this InformacionPersonalINP.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this InformacionPersonalINP.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the nombre value for this InformacionPersonalINP.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.NameType getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this InformacionPersonalINP.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.NameType nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the fechaNacimiento value for this InformacionPersonalINP.
     * 
     * @return fechaNacimiento
     */
    public cl.gob.aem.valida.FechaType getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this InformacionPersonalINP.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(cl.gob.aem.valida.FechaType fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the fechaDefuncion value for this InformacionPersonalINP.
     * 
     * @return fechaDefuncion
     */
    public cl.gob.aem.valida.FechaType getFechaDefuncion() {
        return fechaDefuncion;
    }


    /**
     * Sets the fechaDefuncion value for this InformacionPersonalINP.
     * 
     * @param fechaDefuncion
     */
    public void setFechaDefuncion(cl.gob.aem.valida.FechaType fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }


    /**
     * Gets the estadoCivil value for this InformacionPersonalINP.
     * 
     * @return estadoCivil
     */
    public cl.gob.aem.valida.EstadoCivilValores getEstadoCivil() {
        return estadoCivil;
    }


    /**
     * Sets the estadoCivil value for this InformacionPersonalINP.
     * 
     * @param estadoCivil
     */
    public void setEstadoCivil(cl.gob.aem.valida.EstadoCivilValores estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    /**
     * Gets the sexo value for this InformacionPersonalINP.
     * 
     * @return sexo
     */
    public cl.gob.aem.valida.SexoValores getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this InformacionPersonalINP.
     * 
     * @param sexo
     */
    public void setSexo(cl.gob.aem.valida.SexoValores sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the nacionalidad value for this InformacionPersonalINP.
     * 
     * @return nacionalidad
     */
    public java.lang.String getNacionalidad() {
        return nacionalidad;
    }


    /**
     * Sets the nacionalidad value for this InformacionPersonalINP.
     * 
     * @param nacionalidad
     */
    public void setNacionalidad(java.lang.String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    /**
     * Gets the circunscripcionNacimiento value for this InformacionPersonalINP.
     * 
     * @return circunscripcionNacimiento
     */
    public java.math.BigInteger getCircunscripcionNacimiento() {
        return circunscripcionNacimiento;
    }


    /**
     * Sets the circunscripcionNacimiento value for this InformacionPersonalINP.
     * 
     * @param circunscripcionNacimiento
     */
    public void setCircunscripcionNacimiento(java.math.BigInteger circunscripcionNacimiento) {
        this.circunscripcionNacimiento = circunscripcionNacimiento;
    }


    /**
     * Gets the profesion value for this InformacionPersonalINP.
     * 
     * @return profesion
     */
    public java.lang.String getProfesion() {
        return profesion;
    }


    /**
     * Sets the profesion value for this InformacionPersonalINP.
     * 
     * @param profesion
     */
    public void setProfesion(java.lang.String profesion) {
        this.profesion = profesion;
    }


    /**
     * Gets the fechaDeMuertePresunta value for this InformacionPersonalINP.
     * 
     * @return fechaDeMuertePresunta
     */
    public cl.gob.aem.valida.FechaType getFechaDeMuertePresunta() {
        return fechaDeMuertePresunta;
    }


    /**
     * Sets the fechaDeMuertePresunta value for this InformacionPersonalINP.
     * 
     * @param fechaDeMuertePresunta
     */
    public void setFechaDeMuertePresunta(cl.gob.aem.valida.FechaType fechaDeMuertePresunta) {
        this.fechaDeMuertePresunta = fechaDeMuertePresunta;
    }


    /**
     * Gets the signature value for this InformacionPersonalINP.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this InformacionPersonalINP.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacionPersonalINP)) return false;
        InformacionPersonalINP other = (InformacionPersonalINP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.run==null && other.getRun()==null) || 
             (this.run!=null &&
              this.run.equals(other.getRun()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.fechaDefuncion==null && other.getFechaDefuncion()==null) || 
             (this.fechaDefuncion!=null &&
              this.fechaDefuncion.equals(other.getFechaDefuncion()))) &&
            ((this.estadoCivil==null && other.getEstadoCivil()==null) || 
             (this.estadoCivil!=null &&
              this.estadoCivil.equals(other.getEstadoCivil()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.nacionalidad==null && other.getNacionalidad()==null) || 
             (this.nacionalidad!=null &&
              this.nacionalidad.equals(other.getNacionalidad()))) &&
            ((this.circunscripcionNacimiento==null && other.getCircunscripcionNacimiento()==null) || 
             (this.circunscripcionNacimiento!=null &&
              this.circunscripcionNacimiento.equals(other.getCircunscripcionNacimiento()))) &&
            ((this.profesion==null && other.getProfesion()==null) || 
             (this.profesion!=null &&
              this.profesion.equals(other.getProfesion()))) &&
            ((this.fechaDeMuertePresunta==null && other.getFechaDeMuertePresunta()==null) || 
             (this.fechaDeMuertePresunta!=null &&
              this.fechaDeMuertePresunta.equals(other.getFechaDeMuertePresunta()))) &&
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
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getFechaDefuncion() != null) {
            _hashCode += getFechaDefuncion().hashCode();
        }
        if (getEstadoCivil() != null) {
            _hashCode += getEstadoCivil().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getNacionalidad() != null) {
            _hashCode += getNacionalidad().hashCode();
        }
        if (getCircunscripcionNacimiento() != null) {
            _hashCode += getCircunscripcionNacimiento().hashCode();
        }
        if (getProfesion() != null) {
            _hashCode += getProfesion().hashCode();
        }
        if (getFechaDeMuertePresunta() != null) {
            _hashCode += getFechaDeMuertePresunta().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacionPersonalINP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">informacionPersonalINP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCivil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "estadoCivil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "estadoCivilValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "sexoValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacionalidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nacionalidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circunscripcionNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "circunscripcionNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profesion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "profesion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDeMuertePresunta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaDeMuertePresunta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
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
