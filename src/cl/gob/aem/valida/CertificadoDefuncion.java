/**
 * CertificadoDefuncion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoDefuncion  implements java.io.Serializable {
    private java.math.BigInteger circunscripcion;

    private java.math.BigInteger nroInscripcion;

    private java.lang.String registro;

    private org.apache.axis.types.Year agno;

    private java.util.Date fechaInscripcion;

    private cl.gob.aem.valida.NameType nombreInscrito;

    private cl.gob.aem.valida.RunType run;

    private cl.gob.aem.valida.SexoValores sexo;

    private java.util.Date fechaDefuncion;

    private java.util.Date fechaNacimiento;

    private org.apache.axis.types.Time horaMinutoDefuncion;

    private java.lang.String lugarDefuncion;

    private cl.gob.aem.valida.CertificadoDefuncionCausaDef causaDef;

    private java.lang.String subInscripcion;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public CertificadoDefuncion() {
    }

    public CertificadoDefuncion(
           java.math.BigInteger circunscripcion,
           java.math.BigInteger nroInscripcion,
           java.lang.String registro,
           org.apache.axis.types.Year agno,
           java.util.Date fechaInscripcion,
           cl.gob.aem.valida.NameType nombreInscrito,
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.SexoValores sexo,
           java.util.Date fechaDefuncion,
           java.util.Date fechaNacimiento,
           org.apache.axis.types.Time horaMinutoDefuncion,
           java.lang.String lugarDefuncion,
           cl.gob.aem.valida.CertificadoDefuncionCausaDef causaDef,
           java.lang.String subInscripcion,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.circunscripcion = circunscripcion;
           this.nroInscripcion = nroInscripcion;
           this.registro = registro;
           this.agno = agno;
           this.fechaInscripcion = fechaInscripcion;
           this.nombreInscrito = nombreInscrito;
           this.run = run;
           this.sexo = sexo;
           this.fechaDefuncion = fechaDefuncion;
           this.fechaNacimiento = fechaNacimiento;
           this.horaMinutoDefuncion = horaMinutoDefuncion;
           this.lugarDefuncion = lugarDefuncion;
           this.causaDef = causaDef;
           this.subInscripcion = subInscripcion;
           this.signature = signature;
    }


    /**
     * Gets the circunscripcion value for this CertificadoDefuncion.
     * 
     * @return circunscripcion
     */
    public java.math.BigInteger getCircunscripcion() {
        return circunscripcion;
    }


    /**
     * Sets the circunscripcion value for this CertificadoDefuncion.
     * 
     * @param circunscripcion
     */
    public void setCircunscripcion(java.math.BigInteger circunscripcion) {
        this.circunscripcion = circunscripcion;
    }


    /**
     * Gets the nroInscripcion value for this CertificadoDefuncion.
     * 
     * @return nroInscripcion
     */
    public java.math.BigInteger getNroInscripcion() {
        return nroInscripcion;
    }


    /**
     * Sets the nroInscripcion value for this CertificadoDefuncion.
     * 
     * @param nroInscripcion
     */
    public void setNroInscripcion(java.math.BigInteger nroInscripcion) {
        this.nroInscripcion = nroInscripcion;
    }


    /**
     * Gets the registro value for this CertificadoDefuncion.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this CertificadoDefuncion.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the agno value for this CertificadoDefuncion.
     * 
     * @return agno
     */
    public org.apache.axis.types.Year getAgno() {
        return agno;
    }


    /**
     * Sets the agno value for this CertificadoDefuncion.
     * 
     * @param agno
     */
    public void setAgno(org.apache.axis.types.Year agno) {
        this.agno = agno;
    }


    /**
     * Gets the fechaInscripcion value for this CertificadoDefuncion.
     * 
     * @return fechaInscripcion
     */
    public java.util.Date getFechaInscripcion() {
        return fechaInscripcion;
    }


    /**
     * Sets the fechaInscripcion value for this CertificadoDefuncion.
     * 
     * @param fechaInscripcion
     */
    public void setFechaInscripcion(java.util.Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }


    /**
     * Gets the nombreInscrito value for this CertificadoDefuncion.
     * 
     * @return nombreInscrito
     */
    public cl.gob.aem.valida.NameType getNombreInscrito() {
        return nombreInscrito;
    }


    /**
     * Sets the nombreInscrito value for this CertificadoDefuncion.
     * 
     * @param nombreInscrito
     */
    public void setNombreInscrito(cl.gob.aem.valida.NameType nombreInscrito) {
        this.nombreInscrito = nombreInscrito;
    }


    /**
     * Gets the run value for this CertificadoDefuncion.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this CertificadoDefuncion.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the sexo value for this CertificadoDefuncion.
     * 
     * @return sexo
     */
    public cl.gob.aem.valida.SexoValores getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this CertificadoDefuncion.
     * 
     * @param sexo
     */
    public void setSexo(cl.gob.aem.valida.SexoValores sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the fechaDefuncion value for this CertificadoDefuncion.
     * 
     * @return fechaDefuncion
     */
    public java.util.Date getFechaDefuncion() {
        return fechaDefuncion;
    }


    /**
     * Sets the fechaDefuncion value for this CertificadoDefuncion.
     * 
     * @param fechaDefuncion
     */
    public void setFechaDefuncion(java.util.Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }


    /**
     * Gets the fechaNacimiento value for this CertificadoDefuncion.
     * 
     * @return fechaNacimiento
     */
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this CertificadoDefuncion.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the horaMinutoDefuncion value for this CertificadoDefuncion.
     * 
     * @return horaMinutoDefuncion
     */
    public org.apache.axis.types.Time getHoraMinutoDefuncion() {
        return horaMinutoDefuncion;
    }


    /**
     * Sets the horaMinutoDefuncion value for this CertificadoDefuncion.
     * 
     * @param horaMinutoDefuncion
     */
    public void setHoraMinutoDefuncion(org.apache.axis.types.Time horaMinutoDefuncion) {
        this.horaMinutoDefuncion = horaMinutoDefuncion;
    }


    /**
     * Gets the lugarDefuncion value for this CertificadoDefuncion.
     * 
     * @return lugarDefuncion
     */
    public java.lang.String getLugarDefuncion() {
        return lugarDefuncion;
    }


    /**
     * Sets the lugarDefuncion value for this CertificadoDefuncion.
     * 
     * @param lugarDefuncion
     */
    public void setLugarDefuncion(java.lang.String lugarDefuncion) {
        this.lugarDefuncion = lugarDefuncion;
    }


    /**
     * Gets the causaDef value for this CertificadoDefuncion.
     * 
     * @return causaDef
     */
    public cl.gob.aem.valida.CertificadoDefuncionCausaDef getCausaDef() {
        return causaDef;
    }


    /**
     * Sets the causaDef value for this CertificadoDefuncion.
     * 
     * @param causaDef
     */
    public void setCausaDef(cl.gob.aem.valida.CertificadoDefuncionCausaDef causaDef) {
        this.causaDef = causaDef;
    }


    /**
     * Gets the subInscripcion value for this CertificadoDefuncion.
     * 
     * @return subInscripcion
     */
    public java.lang.String getSubInscripcion() {
        return subInscripcion;
    }


    /**
     * Sets the subInscripcion value for this CertificadoDefuncion.
     * 
     * @param subInscripcion
     */
    public void setSubInscripcion(java.lang.String subInscripcion) {
        this.subInscripcion = subInscripcion;
    }


    /**
     * Gets the signature value for this CertificadoDefuncion.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this CertificadoDefuncion.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoDefuncion)) return false;
        CertificadoDefuncion other = (CertificadoDefuncion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.circunscripcion==null && other.getCircunscripcion()==null) || 
             (this.circunscripcion!=null &&
              this.circunscripcion.equals(other.getCircunscripcion()))) &&
            ((this.nroInscripcion==null && other.getNroInscripcion()==null) || 
             (this.nroInscripcion!=null &&
              this.nroInscripcion.equals(other.getNroInscripcion()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.agno==null && other.getAgno()==null) || 
             (this.agno!=null &&
              this.agno.equals(other.getAgno()))) &&
            ((this.fechaInscripcion==null && other.getFechaInscripcion()==null) || 
             (this.fechaInscripcion!=null &&
              this.fechaInscripcion.equals(other.getFechaInscripcion()))) &&
            ((this.nombreInscrito==null && other.getNombreInscrito()==null) || 
             (this.nombreInscrito!=null &&
              this.nombreInscrito.equals(other.getNombreInscrito()))) &&
            ((this.run==null && other.getRun()==null) || 
             (this.run!=null &&
              this.run.equals(other.getRun()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.fechaDefuncion==null && other.getFechaDefuncion()==null) || 
             (this.fechaDefuncion!=null &&
              this.fechaDefuncion.equals(other.getFechaDefuncion()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.horaMinutoDefuncion==null && other.getHoraMinutoDefuncion()==null) || 
             (this.horaMinutoDefuncion!=null &&
              this.horaMinutoDefuncion.equals(other.getHoraMinutoDefuncion()))) &&
            ((this.lugarDefuncion==null && other.getLugarDefuncion()==null) || 
             (this.lugarDefuncion!=null &&
              this.lugarDefuncion.equals(other.getLugarDefuncion()))) &&
            ((this.causaDef==null && other.getCausaDef()==null) || 
             (this.causaDef!=null &&
              this.causaDef.equals(other.getCausaDef()))) &&
            ((this.subInscripcion==null && other.getSubInscripcion()==null) || 
             (this.subInscripcion!=null &&
              this.subInscripcion.equals(other.getSubInscripcion()))) &&
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
        if (getCircunscripcion() != null) {
            _hashCode += getCircunscripcion().hashCode();
        }
        if (getNroInscripcion() != null) {
            _hashCode += getNroInscripcion().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getAgno() != null) {
            _hashCode += getAgno().hashCode();
        }
        if (getFechaInscripcion() != null) {
            _hashCode += getFechaInscripcion().hashCode();
        }
        if (getNombreInscrito() != null) {
            _hashCode += getNombreInscrito().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getFechaDefuncion() != null) {
            _hashCode += getFechaDefuncion().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getHoraMinutoDefuncion() != null) {
            _hashCode += getHoraMinutoDefuncion().hashCode();
        }
        if (getLugarDefuncion() != null) {
            _hashCode += getLugarDefuncion().hashCode();
        }
        if (getCausaDef() != null) {
            _hashCode += getCausaDef().hashCode();
        }
        if (getSubInscripcion() != null) {
            _hashCode += getSubInscripcion().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoDefuncion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">certificadoDefuncion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circunscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "circunscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nroInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "agno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreInscrito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreInscrito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "sexoValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaMinutoDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "horaMinutoDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lugarDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "lugarDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaDef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "causaDef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>certificadoDefuncion>causaDef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "subInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
