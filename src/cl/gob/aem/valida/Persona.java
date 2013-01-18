/**
 * Persona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class Persona  implements java.io.Serializable {
    /* Run de la Persona consultada */
    private cl.gob.aem.valida.RunType run;

    /* Nombre Completo de la persona consultada */
    private cl.gob.aem.valida.NombreType nombreCompleto;

    /* Fecha de Nacimiento de la persona consultada */
    private java.util.Date fechaNacimiento;

    /* Sexo de la persona consultada */
    private cl.gob.aem.valida.SexoValores sexo;

    public Persona() {
    }

    public Persona(
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.NombreType nombreCompleto,
           java.util.Date fechaNacimiento,
           cl.gob.aem.valida.SexoValores sexo) {
           this.run = run;
           this.nombreCompleto = nombreCompleto;
           this.fechaNacimiento = fechaNacimiento;
           this.sexo = sexo;
    }


    /**
     * Gets the run value for this Persona.
     * 
     * @return run   * Run de la Persona consultada
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this Persona.
     * 
     * @param run   * Run de la Persona consultada
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the nombreCompleto value for this Persona.
     * 
     * @return nombreCompleto   * Nombre Completo de la persona consultada
     */
    public cl.gob.aem.valida.NombreType getNombreCompleto() {
        return nombreCompleto;
    }


    /**
     * Sets the nombreCompleto value for this Persona.
     * 
     * @param nombreCompleto   * Nombre Completo de la persona consultada
     */
    public void setNombreCompleto(cl.gob.aem.valida.NombreType nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    /**
     * Gets the fechaNacimiento value for this Persona.
     * 
     * @return fechaNacimiento   * Fecha de Nacimiento de la persona consultada
     */
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this Persona.
     * 
     * @param fechaNacimiento   * Fecha de Nacimiento de la persona consultada
     */
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the sexo value for this Persona.
     * 
     * @return sexo   * Sexo de la persona consultada
     */
    public cl.gob.aem.valida.SexoValores getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this Persona.
     * 
     * @param sexo   * Sexo de la persona consultada
     */
    public void setSexo(cl.gob.aem.valida.SexoValores sexo) {
        this.sexo = sexo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Persona)) return false;
        Persona other = (Persona) obj;
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
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Persona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Persona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCompleto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreCompleto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Sexo"));
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
