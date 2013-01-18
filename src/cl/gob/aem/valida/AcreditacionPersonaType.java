/**
 * AcreditacionPersonaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class AcreditacionPersonaType  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType run;

    private cl.gob.aem.valida.NameType nombre;

    private java.util.Date fechaNacimiento;

    private java.math.BigInteger partida;

    private java.lang.String registro;

    private org.apache.axis.types.Year agnoInscripcion;

    private java.lang.String numeroOficina;

    private java.lang.String oficina;

    private java.lang.String subInscripcion;

    private java.lang.String registroDefuncion;

    private cl.gob.aem.valida.RunType runMadre;

    private cl.gob.aem.valida.NameType nombreMadre;

    private cl.gob.aem.valida.RunType runPadre;

    private cl.gob.aem.valida.NameType nombrePadre;

    public AcreditacionPersonaType() {
    }

    public AcreditacionPersonaType(
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.NameType nombre,
           java.util.Date fechaNacimiento,
           java.math.BigInteger partida,
           java.lang.String registro,
           org.apache.axis.types.Year agnoInscripcion,
           java.lang.String numeroOficina,
           java.lang.String oficina,
           java.lang.String subInscripcion,
           java.lang.String registroDefuncion,
           cl.gob.aem.valida.RunType runMadre,
           cl.gob.aem.valida.NameType nombreMadre,
           cl.gob.aem.valida.RunType runPadre,
           cl.gob.aem.valida.NameType nombrePadre) {
           this.run = run;
           this.nombre = nombre;
           this.fechaNacimiento = fechaNacimiento;
           this.partida = partida;
           this.registro = registro;
           this.agnoInscripcion = agnoInscripcion;
           this.numeroOficina = numeroOficina;
           this.oficina = oficina;
           this.subInscripcion = subInscripcion;
           this.registroDefuncion = registroDefuncion;
           this.runMadre = runMadre;
           this.nombreMadre = nombreMadre;
           this.runPadre = runPadre;
           this.nombrePadre = nombrePadre;
    }


    /**
     * Gets the run value for this AcreditacionPersonaType.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this AcreditacionPersonaType.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the nombre value for this AcreditacionPersonaType.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.NameType getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this AcreditacionPersonaType.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.NameType nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the fechaNacimiento value for this AcreditacionPersonaType.
     * 
     * @return fechaNacimiento
     */
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this AcreditacionPersonaType.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the partida value for this AcreditacionPersonaType.
     * 
     * @return partida
     */
    public java.math.BigInteger getPartida() {
        return partida;
    }


    /**
     * Sets the partida value for this AcreditacionPersonaType.
     * 
     * @param partida
     */
    public void setPartida(java.math.BigInteger partida) {
        this.partida = partida;
    }


    /**
     * Gets the registro value for this AcreditacionPersonaType.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this AcreditacionPersonaType.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the agnoInscripcion value for this AcreditacionPersonaType.
     * 
     * @return agnoInscripcion
     */
    public org.apache.axis.types.Year getAgnoInscripcion() {
        return agnoInscripcion;
    }


    /**
     * Sets the agnoInscripcion value for this AcreditacionPersonaType.
     * 
     * @param agnoInscripcion
     */
    public void setAgnoInscripcion(org.apache.axis.types.Year agnoInscripcion) {
        this.agnoInscripcion = agnoInscripcion;
    }


    /**
     * Gets the numeroOficina value for this AcreditacionPersonaType.
     * 
     * @return numeroOficina
     */
    public java.lang.String getNumeroOficina() {
        return numeroOficina;
    }


    /**
     * Sets the numeroOficina value for this AcreditacionPersonaType.
     * 
     * @param numeroOficina
     */
    public void setNumeroOficina(java.lang.String numeroOficina) {
        this.numeroOficina = numeroOficina;
    }


    /**
     * Gets the oficina value for this AcreditacionPersonaType.
     * 
     * @return oficina
     */
    public java.lang.String getOficina() {
        return oficina;
    }


    /**
     * Sets the oficina value for this AcreditacionPersonaType.
     * 
     * @param oficina
     */
    public void setOficina(java.lang.String oficina) {
        this.oficina = oficina;
    }


    /**
     * Gets the subInscripcion value for this AcreditacionPersonaType.
     * 
     * @return subInscripcion
     */
    public java.lang.String getSubInscripcion() {
        return subInscripcion;
    }


    /**
     * Sets the subInscripcion value for this AcreditacionPersonaType.
     * 
     * @param subInscripcion
     */
    public void setSubInscripcion(java.lang.String subInscripcion) {
        this.subInscripcion = subInscripcion;
    }


    /**
     * Gets the registroDefuncion value for this AcreditacionPersonaType.
     * 
     * @return registroDefuncion
     */
    public java.lang.String getRegistroDefuncion() {
        return registroDefuncion;
    }


    /**
     * Sets the registroDefuncion value for this AcreditacionPersonaType.
     * 
     * @param registroDefuncion
     */
    public void setRegistroDefuncion(java.lang.String registroDefuncion) {
        this.registroDefuncion = registroDefuncion;
    }


    /**
     * Gets the runMadre value for this AcreditacionPersonaType.
     * 
     * @return runMadre
     */
    public cl.gob.aem.valida.RunType getRunMadre() {
        return runMadre;
    }


    /**
     * Sets the runMadre value for this AcreditacionPersonaType.
     * 
     * @param runMadre
     */
    public void setRunMadre(cl.gob.aem.valida.RunType runMadre) {
        this.runMadre = runMadre;
    }


    /**
     * Gets the nombreMadre value for this AcreditacionPersonaType.
     * 
     * @return nombreMadre
     */
    public cl.gob.aem.valida.NameType getNombreMadre() {
        return nombreMadre;
    }


    /**
     * Sets the nombreMadre value for this AcreditacionPersonaType.
     * 
     * @param nombreMadre
     */
    public void setNombreMadre(cl.gob.aem.valida.NameType nombreMadre) {
        this.nombreMadre = nombreMadre;
    }


    /**
     * Gets the runPadre value for this AcreditacionPersonaType.
     * 
     * @return runPadre
     */
    public cl.gob.aem.valida.RunType getRunPadre() {
        return runPadre;
    }


    /**
     * Sets the runPadre value for this AcreditacionPersonaType.
     * 
     * @param runPadre
     */
    public void setRunPadre(cl.gob.aem.valida.RunType runPadre) {
        this.runPadre = runPadre;
    }


    /**
     * Gets the nombrePadre value for this AcreditacionPersonaType.
     * 
     * @return nombrePadre
     */
    public cl.gob.aem.valida.NameType getNombrePadre() {
        return nombrePadre;
    }


    /**
     * Sets the nombrePadre value for this AcreditacionPersonaType.
     * 
     * @param nombrePadre
     */
    public void setNombrePadre(cl.gob.aem.valida.NameType nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcreditacionPersonaType)) return false;
        AcreditacionPersonaType other = (AcreditacionPersonaType) obj;
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
            ((this.partida==null && other.getPartida()==null) || 
             (this.partida!=null &&
              this.partida.equals(other.getPartida()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.agnoInscripcion==null && other.getAgnoInscripcion()==null) || 
             (this.agnoInscripcion!=null &&
              this.agnoInscripcion.equals(other.getAgnoInscripcion()))) &&
            ((this.numeroOficina==null && other.getNumeroOficina()==null) || 
             (this.numeroOficina!=null &&
              this.numeroOficina.equals(other.getNumeroOficina()))) &&
            ((this.oficina==null && other.getOficina()==null) || 
             (this.oficina!=null &&
              this.oficina.equals(other.getOficina()))) &&
            ((this.subInscripcion==null && other.getSubInscripcion()==null) || 
             (this.subInscripcion!=null &&
              this.subInscripcion.equals(other.getSubInscripcion()))) &&
            ((this.registroDefuncion==null && other.getRegistroDefuncion()==null) || 
             (this.registroDefuncion!=null &&
              this.registroDefuncion.equals(other.getRegistroDefuncion()))) &&
            ((this.runMadre==null && other.getRunMadre()==null) || 
             (this.runMadre!=null &&
              this.runMadre.equals(other.getRunMadre()))) &&
            ((this.nombreMadre==null && other.getNombreMadre()==null) || 
             (this.nombreMadre!=null &&
              this.nombreMadre.equals(other.getNombreMadre()))) &&
            ((this.runPadre==null && other.getRunPadre()==null) || 
             (this.runPadre!=null &&
              this.runPadre.equals(other.getRunPadre()))) &&
            ((this.nombrePadre==null && other.getNombrePadre()==null) || 
             (this.nombrePadre!=null &&
              this.nombrePadre.equals(other.getNombrePadre())));
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
        if (getPartida() != null) {
            _hashCode += getPartida().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getAgnoInscripcion() != null) {
            _hashCode += getAgnoInscripcion().hashCode();
        }
        if (getNumeroOficina() != null) {
            _hashCode += getNumeroOficina().hashCode();
        }
        if (getOficina() != null) {
            _hashCode += getOficina().hashCode();
        }
        if (getSubInscripcion() != null) {
            _hashCode += getSubInscripcion().hashCode();
        }
        if (getRegistroDefuncion() != null) {
            _hashCode += getRegistroDefuncion().hashCode();
        }
        if (getRunMadre() != null) {
            _hashCode += getRunMadre().hashCode();
        }
        if (getNombreMadre() != null) {
            _hashCode += getNombreMadre().hashCode();
        }
        if (getRunPadre() != null) {
            _hashCode += getRunPadre().hashCode();
        }
        if (getNombrePadre() != null) {
            _hashCode += getNombrePadre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcreditacionPersonaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "acreditacionPersonaType"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "partida"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroOficina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "numeroOficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oficina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "oficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "subInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "registroDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runMadre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runMadre"));
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
        elemField.setFieldName("runPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePadre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombrePadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
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
