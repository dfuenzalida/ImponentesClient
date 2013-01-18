/**
 * DiscapacidadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class DiscapacidadType  implements java.io.Serializable {
    private cl.gob.aem.valida.FechaType fechaVencimiento;

    private java.lang.String gradoDiscapacidadSensorial;

    private java.lang.String gradoDiscapacidadMental;

    private java.lang.String gradoDiscapacidadFisica;

    public DiscapacidadType() {
    }

    public DiscapacidadType(
           cl.gob.aem.valida.FechaType fechaVencimiento,
           java.lang.String gradoDiscapacidadSensorial,
           java.lang.String gradoDiscapacidadMental,
           java.lang.String gradoDiscapacidadFisica) {
           this.fechaVencimiento = fechaVencimiento;
           this.gradoDiscapacidadSensorial = gradoDiscapacidadSensorial;
           this.gradoDiscapacidadMental = gradoDiscapacidadMental;
           this.gradoDiscapacidadFisica = gradoDiscapacidadFisica;
    }


    /**
     * Gets the fechaVencimiento value for this DiscapacidadType.
     * 
     * @return fechaVencimiento
     */
    public cl.gob.aem.valida.FechaType getFechaVencimiento() {
        return fechaVencimiento;
    }


    /**
     * Sets the fechaVencimiento value for this DiscapacidadType.
     * 
     * @param fechaVencimiento
     */
    public void setFechaVencimiento(cl.gob.aem.valida.FechaType fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    /**
     * Gets the gradoDiscapacidadSensorial value for this DiscapacidadType.
     * 
     * @return gradoDiscapacidadSensorial
     */
    public java.lang.String getGradoDiscapacidadSensorial() {
        return gradoDiscapacidadSensorial;
    }


    /**
     * Sets the gradoDiscapacidadSensorial value for this DiscapacidadType.
     * 
     * @param gradoDiscapacidadSensorial
     */
    public void setGradoDiscapacidadSensorial(java.lang.String gradoDiscapacidadSensorial) {
        this.gradoDiscapacidadSensorial = gradoDiscapacidadSensorial;
    }


    /**
     * Gets the gradoDiscapacidadMental value for this DiscapacidadType.
     * 
     * @return gradoDiscapacidadMental
     */
    public java.lang.String getGradoDiscapacidadMental() {
        return gradoDiscapacidadMental;
    }


    /**
     * Sets the gradoDiscapacidadMental value for this DiscapacidadType.
     * 
     * @param gradoDiscapacidadMental
     */
    public void setGradoDiscapacidadMental(java.lang.String gradoDiscapacidadMental) {
        this.gradoDiscapacidadMental = gradoDiscapacidadMental;
    }


    /**
     * Gets the gradoDiscapacidadFisica value for this DiscapacidadType.
     * 
     * @return gradoDiscapacidadFisica
     */
    public java.lang.String getGradoDiscapacidadFisica() {
        return gradoDiscapacidadFisica;
    }


    /**
     * Sets the gradoDiscapacidadFisica value for this DiscapacidadType.
     * 
     * @param gradoDiscapacidadFisica
     */
    public void setGradoDiscapacidadFisica(java.lang.String gradoDiscapacidadFisica) {
        this.gradoDiscapacidadFisica = gradoDiscapacidadFisica;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiscapacidadType)) return false;
        DiscapacidadType other = (DiscapacidadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaVencimiento==null && other.getFechaVencimiento()==null) || 
             (this.fechaVencimiento!=null &&
              this.fechaVencimiento.equals(other.getFechaVencimiento()))) &&
            ((this.gradoDiscapacidadSensorial==null && other.getGradoDiscapacidadSensorial()==null) || 
             (this.gradoDiscapacidadSensorial!=null &&
              this.gradoDiscapacidadSensorial.equals(other.getGradoDiscapacidadSensorial()))) &&
            ((this.gradoDiscapacidadMental==null && other.getGradoDiscapacidadMental()==null) || 
             (this.gradoDiscapacidadMental!=null &&
              this.gradoDiscapacidadMental.equals(other.getGradoDiscapacidadMental()))) &&
            ((this.gradoDiscapacidadFisica==null && other.getGradoDiscapacidadFisica()==null) || 
             (this.gradoDiscapacidadFisica!=null &&
              this.gradoDiscapacidadFisica.equals(other.getGradoDiscapacidadFisica())));
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
        if (getFechaVencimiento() != null) {
            _hashCode += getFechaVencimiento().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiscapacidadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "discapacidadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVencimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaVencimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
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
