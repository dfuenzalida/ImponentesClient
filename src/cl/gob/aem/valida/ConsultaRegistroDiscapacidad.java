/**
 * ConsultaRegistroDiscapacidad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ConsultaRegistroDiscapacidad  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType run;

    private cl.gob.aem.valida.NameType nombre;

    private java.lang.String gradoDiscapacidadSensorial;

    private java.lang.String gradoDiscapacidadMental;

    private java.lang.String gradoDiscapacidadFisica;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public ConsultaRegistroDiscapacidad() {
    }

    public ConsultaRegistroDiscapacidad(
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.NameType nombre,
           java.lang.String gradoDiscapacidadSensorial,
           java.lang.String gradoDiscapacidadMental,
           java.lang.String gradoDiscapacidadFisica,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.run = run;
           this.nombre = nombre;
           this.gradoDiscapacidadSensorial = gradoDiscapacidadSensorial;
           this.gradoDiscapacidadMental = gradoDiscapacidadMental;
           this.gradoDiscapacidadFisica = gradoDiscapacidadFisica;
           this.signature = signature;
    }


    /**
     * Gets the run value for this ConsultaRegistroDiscapacidad.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this ConsultaRegistroDiscapacidad.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the nombre value for this ConsultaRegistroDiscapacidad.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.NameType getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ConsultaRegistroDiscapacidad.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.NameType nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the gradoDiscapacidadSensorial value for this ConsultaRegistroDiscapacidad.
     * 
     * @return gradoDiscapacidadSensorial
     */
    public java.lang.String getGradoDiscapacidadSensorial() {
        return gradoDiscapacidadSensorial;
    }


    /**
     * Sets the gradoDiscapacidadSensorial value for this ConsultaRegistroDiscapacidad.
     * 
     * @param gradoDiscapacidadSensorial
     */
    public void setGradoDiscapacidadSensorial(java.lang.String gradoDiscapacidadSensorial) {
        this.gradoDiscapacidadSensorial = gradoDiscapacidadSensorial;
    }


    /**
     * Gets the gradoDiscapacidadMental value for this ConsultaRegistroDiscapacidad.
     * 
     * @return gradoDiscapacidadMental
     */
    public java.lang.String getGradoDiscapacidadMental() {
        return gradoDiscapacidadMental;
    }


    /**
     * Sets the gradoDiscapacidadMental value for this ConsultaRegistroDiscapacidad.
     * 
     * @param gradoDiscapacidadMental
     */
    public void setGradoDiscapacidadMental(java.lang.String gradoDiscapacidadMental) {
        this.gradoDiscapacidadMental = gradoDiscapacidadMental;
    }


    /**
     * Gets the gradoDiscapacidadFisica value for this ConsultaRegistroDiscapacidad.
     * 
     * @return gradoDiscapacidadFisica
     */
    public java.lang.String getGradoDiscapacidadFisica() {
        return gradoDiscapacidadFisica;
    }


    /**
     * Sets the gradoDiscapacidadFisica value for this ConsultaRegistroDiscapacidad.
     * 
     * @param gradoDiscapacidadFisica
     */
    public void setGradoDiscapacidadFisica(java.lang.String gradoDiscapacidadFisica) {
        this.gradoDiscapacidadFisica = gradoDiscapacidadFisica;
    }


    /**
     * Gets the signature value for this ConsultaRegistroDiscapacidad.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ConsultaRegistroDiscapacidad.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaRegistroDiscapacidad)) return false;
        ConsultaRegistroDiscapacidad other = (ConsultaRegistroDiscapacidad) obj;
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
            ((this.gradoDiscapacidadSensorial==null && other.getGradoDiscapacidadSensorial()==null) || 
             (this.gradoDiscapacidadSensorial!=null &&
              this.gradoDiscapacidadSensorial.equals(other.getGradoDiscapacidadSensorial()))) &&
            ((this.gradoDiscapacidadMental==null && other.getGradoDiscapacidadMental()==null) || 
             (this.gradoDiscapacidadMental!=null &&
              this.gradoDiscapacidadMental.equals(other.getGradoDiscapacidadMental()))) &&
            ((this.gradoDiscapacidadFisica==null && other.getGradoDiscapacidadFisica()==null) || 
             (this.gradoDiscapacidadFisica!=null &&
              this.gradoDiscapacidadFisica.equals(other.getGradoDiscapacidadFisica()))) &&
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
        if (getGradoDiscapacidadSensorial() != null) {
            _hashCode += getGradoDiscapacidadSensorial().hashCode();
        }
        if (getGradoDiscapacidadMental() != null) {
            _hashCode += getGradoDiscapacidadMental().hashCode();
        }
        if (getGradoDiscapacidadFisica() != null) {
            _hashCode += getGradoDiscapacidadFisica().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaRegistroDiscapacidad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">consultaRegistroDiscapacidad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gradoDiscapacidadSensorial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "gradoDiscapacidadSensorial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gradoDiscapacidadMental");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "gradoDiscapacidadMental"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gradoDiscapacidadFisica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "gradoDiscapacidadFisica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
