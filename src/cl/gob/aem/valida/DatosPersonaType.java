/**
 * DatosPersonaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class DatosPersonaType  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType run;

    private cl.gob.aem.valida.NameType nombreCompleto;

    private cl.gob.aem.valida.FechaType fechaNacimiento;

    private cl.gob.aem.valida.FechaType fechaDefuncion;

    private cl.gob.aem.valida.EstadoCivilValores estadoCivil;

    private cl.gob.aem.valida.SexoValores sexo;

    public DatosPersonaType() {
    }

    public DatosPersonaType(
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.NameType nombreCompleto,
           cl.gob.aem.valida.FechaType fechaNacimiento,
           cl.gob.aem.valida.FechaType fechaDefuncion,
           cl.gob.aem.valida.EstadoCivilValores estadoCivil,
           cl.gob.aem.valida.SexoValores sexo) {
           this.run = run;
           this.nombreCompleto = nombreCompleto;
           this.fechaNacimiento = fechaNacimiento;
           this.fechaDefuncion = fechaDefuncion;
           this.estadoCivil = estadoCivil;
           this.sexo = sexo;
    }


    /**
     * Gets the run value for this DatosPersonaType.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this DatosPersonaType.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the nombreCompleto value for this DatosPersonaType.
     * 
     * @return nombreCompleto
     */
    public cl.gob.aem.valida.NameType getNombreCompleto() {
        return nombreCompleto;
    }


    /**
     * Sets the nombreCompleto value for this DatosPersonaType.
     * 
     * @param nombreCompleto
     */
    public void setNombreCompleto(cl.gob.aem.valida.NameType nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    /**
     * Gets the fechaNacimiento value for this DatosPersonaType.
     * 
     * @return fechaNacimiento
     */
    public cl.gob.aem.valida.FechaType getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this DatosPersonaType.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(cl.gob.aem.valida.FechaType fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the fechaDefuncion value for this DatosPersonaType.
     * 
     * @return fechaDefuncion
     */
    public cl.gob.aem.valida.FechaType getFechaDefuncion() {
        return fechaDefuncion;
    }


    /**
     * Sets the fechaDefuncion value for this DatosPersonaType.
     * 
     * @param fechaDefuncion
     */
    public void setFechaDefuncion(cl.gob.aem.valida.FechaType fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }


    /**
     * Gets the estadoCivil value for this DatosPersonaType.
     * 
     * @return estadoCivil
     */
    public cl.gob.aem.valida.EstadoCivilValores getEstadoCivil() {
        return estadoCivil;
    }


    /**
     * Sets the estadoCivil value for this DatosPersonaType.
     * 
     * @param estadoCivil
     */
    public void setEstadoCivil(cl.gob.aem.valida.EstadoCivilValores estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    /**
     * Gets the sexo value for this DatosPersonaType.
     * 
     * @return sexo
     */
    public cl.gob.aem.valida.SexoValores getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this DatosPersonaType.
     * 
     * @param sexo
     */
    public void setSexo(cl.gob.aem.valida.SexoValores sexo) {
        this.sexo = sexo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosPersonaType)) return false;
        DatosPersonaType other = (DatosPersonaType) obj;
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
            ((this.nombreCompleto==null && other.getNombreCompleto()==null) || 
             (this.nombreCompleto!=null &&
              this.nombreCompleto.equals(other.getNombreCompleto()))) &&
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
              this.sexo.equals(other.getSexo())));
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
        if (getNombreCompleto() != null) {
            _hashCode += getNombreCompleto().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosPersonaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosPersonaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCompleto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreCompleto"));
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
        elemField.setMinOccurs(0);
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
