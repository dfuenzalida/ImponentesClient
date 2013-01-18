/**
 * CertificadoNacimiento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoNacimiento  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType run;

    private java.math.BigInteger circunscripcion;

    private java.math.BigInteger nroInscripcion;

    private java.lang.String registro;

    private org.apache.axis.types.Year agnoInscripcion;

    private cl.gob.aem.valida.NameType nombre;

    private java.util.Date fechaNacimiento;

    private cl.gob.aem.valida.SexoValores sexo;

    private java.lang.String lugarNacimiento;

    private java.lang.String nacionalidadNacimiento;

    private cl.gob.aem.valida.NameType nombrePadre;

    private cl.gob.aem.valida.RunType runPadre;

    private cl.gob.aem.valida.NameType nombreMadre;

    private cl.gob.aem.valida.RunType runMadre;

    private java.lang.String subInscripcion;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public CertificadoNacimiento() {
    }

    public CertificadoNacimiento(
           cl.gob.aem.valida.RunType run,
           java.math.BigInteger circunscripcion,
           java.math.BigInteger nroInscripcion,
           java.lang.String registro,
           org.apache.axis.types.Year agnoInscripcion,
           cl.gob.aem.valida.NameType nombre,
           java.util.Date fechaNacimiento,
           cl.gob.aem.valida.SexoValores sexo,
           java.lang.String lugarNacimiento,
           java.lang.String nacionalidadNacimiento,
           cl.gob.aem.valida.NameType nombrePadre,
           cl.gob.aem.valida.RunType runPadre,
           cl.gob.aem.valida.NameType nombreMadre,
           cl.gob.aem.valida.RunType runMadre,
           java.lang.String subInscripcion,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.run = run;
           this.circunscripcion = circunscripcion;
           this.nroInscripcion = nroInscripcion;
           this.registro = registro;
           this.agnoInscripcion = agnoInscripcion;
           this.nombre = nombre;
           this.fechaNacimiento = fechaNacimiento;
           this.sexo = sexo;
           this.lugarNacimiento = lugarNacimiento;
           this.nacionalidadNacimiento = nacionalidadNacimiento;
           this.nombrePadre = nombrePadre;
           this.runPadre = runPadre;
           this.nombreMadre = nombreMadre;
           this.runMadre = runMadre;
           this.subInscripcion = subInscripcion;
           this.signature = signature;
    }


    /**
     * Gets the run value for this CertificadoNacimiento.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this CertificadoNacimiento.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the circunscripcion value for this CertificadoNacimiento.
     * 
     * @return circunscripcion
     */
    public java.math.BigInteger getCircunscripcion() {
        return circunscripcion;
    }


    /**
     * Sets the circunscripcion value for this CertificadoNacimiento.
     * 
     * @param circunscripcion
     */
    public void setCircunscripcion(java.math.BigInteger circunscripcion) {
        this.circunscripcion = circunscripcion;
    }


    /**
     * Gets the nroInscripcion value for this CertificadoNacimiento.
     * 
     * @return nroInscripcion
     */
    public java.math.BigInteger getNroInscripcion() {
        return nroInscripcion;
    }


    /**
     * Sets the nroInscripcion value for this CertificadoNacimiento.
     * 
     * @param nroInscripcion
     */
    public void setNroInscripcion(java.math.BigInteger nroInscripcion) {
        this.nroInscripcion = nroInscripcion;
    }


    /**
     * Gets the registro value for this CertificadoNacimiento.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this CertificadoNacimiento.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the agnoInscripcion value for this CertificadoNacimiento.
     * 
     * @return agnoInscripcion
     */
    public org.apache.axis.types.Year getAgnoInscripcion() {
        return agnoInscripcion;
    }


    /**
     * Sets the agnoInscripcion value for this CertificadoNacimiento.
     * 
     * @param agnoInscripcion
     */
    public void setAgnoInscripcion(org.apache.axis.types.Year agnoInscripcion) {
        this.agnoInscripcion = agnoInscripcion;
    }


    /**
     * Gets the nombre value for this CertificadoNacimiento.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.NameType getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this CertificadoNacimiento.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.NameType nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the fechaNacimiento value for this CertificadoNacimiento.
     * 
     * @return fechaNacimiento
     */
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this CertificadoNacimiento.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the sexo value for this CertificadoNacimiento.
     * 
     * @return sexo
     */
    public cl.gob.aem.valida.SexoValores getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this CertificadoNacimiento.
     * 
     * @param sexo
     */
    public void setSexo(cl.gob.aem.valida.SexoValores sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the lugarNacimiento value for this CertificadoNacimiento.
     * 
     * @return lugarNacimiento
     */
    public java.lang.String getLugarNacimiento() {
        return lugarNacimiento;
    }


    /**
     * Sets the lugarNacimiento value for this CertificadoNacimiento.
     * 
     * @param lugarNacimiento
     */
    public void setLugarNacimiento(java.lang.String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }


    /**
     * Gets the nacionalidadNacimiento value for this CertificadoNacimiento.
     * 
     * @return nacionalidadNacimiento
     */
    public java.lang.String getNacionalidadNacimiento() {
        return nacionalidadNacimiento;
    }


    /**
     * Sets the nacionalidadNacimiento value for this CertificadoNacimiento.
     * 
     * @param nacionalidadNacimiento
     */
    public void setNacionalidadNacimiento(java.lang.String nacionalidadNacimiento) {
        this.nacionalidadNacimiento = nacionalidadNacimiento;
    }


    /**
     * Gets the nombrePadre value for this CertificadoNacimiento.
     * 
     * @return nombrePadre
     */
    public cl.gob.aem.valida.NameType getNombrePadre() {
        return nombrePadre;
    }


    /**
     * Sets the nombrePadre value for this CertificadoNacimiento.
     * 
     * @param nombrePadre
     */
    public void setNombrePadre(cl.gob.aem.valida.NameType nombrePadre) {
        this.nombrePadre = nombrePadre;
    }


    /**
     * Gets the runPadre value for this CertificadoNacimiento.
     * 
     * @return runPadre
     */
    public cl.gob.aem.valida.RunType getRunPadre() {
        return runPadre;
    }


    /**
     * Sets the runPadre value for this CertificadoNacimiento.
     * 
     * @param runPadre
     */
    public void setRunPadre(cl.gob.aem.valida.RunType runPadre) {
        this.runPadre = runPadre;
    }


    /**
     * Gets the nombreMadre value for this CertificadoNacimiento.
     * 
     * @return nombreMadre
     */
    public cl.gob.aem.valida.NameType getNombreMadre() {
        return nombreMadre;
    }


    /**
     * Sets the nombreMadre value for this CertificadoNacimiento.
     * 
     * @param nombreMadre
     */
    public void setNombreMadre(cl.gob.aem.valida.NameType nombreMadre) {
        this.nombreMadre = nombreMadre;
    }


    /**
     * Gets the runMadre value for this CertificadoNacimiento.
     * 
     * @return runMadre
     */
    public cl.gob.aem.valida.RunType getRunMadre() {
        return runMadre;
    }


    /**
     * Sets the runMadre value for this CertificadoNacimiento.
     * 
     * @param runMadre
     */
    public void setRunMadre(cl.gob.aem.valida.RunType runMadre) {
        this.runMadre = runMadre;
    }


    /**
     * Gets the subInscripcion value for this CertificadoNacimiento.
     * 
     * @return subInscripcion
     */
    public java.lang.String getSubInscripcion() {
        return subInscripcion;
    }


    /**
     * Sets the subInscripcion value for this CertificadoNacimiento.
     * 
     * @param subInscripcion
     */
    public void setSubInscripcion(java.lang.String subInscripcion) {
        this.subInscripcion = subInscripcion;
    }


    /**
     * Gets the signature value for this CertificadoNacimiento.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this CertificadoNacimiento.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoNacimiento)) return false;
        CertificadoNacimiento other = (CertificadoNacimiento) obj;
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
            ((this.circunscripcion==null && other.getCircunscripcion()==null) || 
             (this.circunscripcion!=null &&
              this.circunscripcion.equals(other.getCircunscripcion()))) &&
            ((this.nroInscripcion==null && other.getNroInscripcion()==null) || 
             (this.nroInscripcion!=null &&
              this.nroInscripcion.equals(other.getNroInscripcion()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.agnoInscripcion==null && other.getAgnoInscripcion()==null) || 
             (this.agnoInscripcion!=null &&
              this.agnoInscripcion.equals(other.getAgnoInscripcion()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.lugarNacimiento==null && other.getLugarNacimiento()==null) || 
             (this.lugarNacimiento!=null &&
              this.lugarNacimiento.equals(other.getLugarNacimiento()))) &&
            ((this.nacionalidadNacimiento==null && other.getNacionalidadNacimiento()==null) || 
             (this.nacionalidadNacimiento!=null &&
              this.nacionalidadNacimiento.equals(other.getNacionalidadNacimiento()))) &&
            ((this.nombrePadre==null && other.getNombrePadre()==null) || 
             (this.nombrePadre!=null &&
              this.nombrePadre.equals(other.getNombrePadre()))) &&
            ((this.runPadre==null && other.getRunPadre()==null) || 
             (this.runPadre!=null &&
              this.runPadre.equals(other.getRunPadre()))) &&
            ((this.nombreMadre==null && other.getNombreMadre()==null) || 
             (this.nombreMadre!=null &&
              this.nombreMadre.equals(other.getNombreMadre()))) &&
            ((this.runMadre==null && other.getRunMadre()==null) || 
             (this.runMadre!=null &&
              this.runMadre.equals(other.getRunMadre()))) &&
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
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        if (getCircunscripcion() != null) {
            _hashCode += getCircunscripcion().hashCode();
        }
        if (getNroInscripcion() != null) {
            _hashCode += getNroInscripcion().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getAgnoInscripcion() != null) {
            _hashCode += getAgnoInscripcion().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getLugarNacimiento() != null) {
            _hashCode += getLugarNacimiento().hashCode();
        }
        if (getNacionalidadNacimiento() != null) {
            _hashCode += getNacionalidadNacimiento().hashCode();
        }
        if (getNombrePadre() != null) {
            _hashCode += getNombrePadre().hashCode();
        }
        if (getRunPadre() != null) {
            _hashCode += getRunPadre().hashCode();
        }
        if (getNombreMadre() != null) {
            _hashCode += getNombreMadre().hashCode();
        }
        if (getRunMadre() != null) {
            _hashCode += getRunMadre().hashCode();
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
        new org.apache.axis.description.TypeDesc(CertificadoNacimiento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">certificadoNacimiento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("agnoInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "agnoInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "sexoValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lugarNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "lugarNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacionalidadNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nacionalidadNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePadre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombrePadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreMadre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreMadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runMadre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runMadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
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
