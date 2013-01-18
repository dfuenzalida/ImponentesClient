/**
 * ValidacionFallecidosINP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ValidacionFallecidosINP  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType run;

    private cl.gob.aem.valida.NameType nombre;

    private java.util.Date fechaNacimiento;

    private java.util.Date fechaDefuncion;

    private java.util.Date fechaDeMuertePresunta;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public ValidacionFallecidosINP() {
    }

    public ValidacionFallecidosINP(
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.NameType nombre,
           java.util.Date fechaNacimiento,
           java.util.Date fechaDefuncion,
           java.util.Date fechaDeMuertePresunta,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.run = run;
           this.nombre = nombre;
           this.fechaNacimiento = fechaNacimiento;
           this.fechaDefuncion = fechaDefuncion;
           this.fechaDeMuertePresunta = fechaDeMuertePresunta;
           this.signature = signature;
    }


    /**
     * Gets the run value for this ValidacionFallecidosINP.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this ValidacionFallecidosINP.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the nombre value for this ValidacionFallecidosINP.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.NameType getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ValidacionFallecidosINP.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.NameType nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the fechaNacimiento value for this ValidacionFallecidosINP.
     * 
     * @return fechaNacimiento
     */
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this ValidacionFallecidosINP.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the fechaDefuncion value for this ValidacionFallecidosINP.
     * 
     * @return fechaDefuncion
     */
    public java.util.Date getFechaDefuncion() {
        return fechaDefuncion;
    }


    /**
     * Sets the fechaDefuncion value for this ValidacionFallecidosINP.
     * 
     * @param fechaDefuncion
     */
    public void setFechaDefuncion(java.util.Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }


    /**
     * Gets the fechaDeMuertePresunta value for this ValidacionFallecidosINP.
     * 
     * @return fechaDeMuertePresunta
     */
    public java.util.Date getFechaDeMuertePresunta() {
        return fechaDeMuertePresunta;
    }


    /**
     * Sets the fechaDeMuertePresunta value for this ValidacionFallecidosINP.
     * 
     * @param fechaDeMuertePresunta
     */
    public void setFechaDeMuertePresunta(java.util.Date fechaDeMuertePresunta) {
        this.fechaDeMuertePresunta = fechaDeMuertePresunta;
    }


    /**
     * Gets the signature value for this ValidacionFallecidosINP.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ValidacionFallecidosINP.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidacionFallecidosINP)) return false;
        ValidacionFallecidosINP other = (ValidacionFallecidosINP) obj;
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
        new org.apache.axis.description.TypeDesc(ValidacionFallecidosINP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">validacionFallecidosINP"));
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
        elemField.setFieldName("fechaDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDeMuertePresunta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaDeMuertePresunta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
