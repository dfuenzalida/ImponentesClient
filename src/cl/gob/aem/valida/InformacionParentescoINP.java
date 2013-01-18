/**
 * InformacionParentescoINP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformacionParentescoINP  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType runPersona;

    private cl.gob.aem.valida.NameType nombrePersona;

    private cl.gob.aem.valida.FechaType fechaNacimientoPersona;

    private cl.gob.aem.valida.ParentescoValores parentesco;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public InformacionParentescoINP() {
    }

    public InformacionParentescoINP(
           cl.gob.aem.valida.RunType runPersona,
           cl.gob.aem.valida.NameType nombrePersona,
           cl.gob.aem.valida.FechaType fechaNacimientoPersona,
           cl.gob.aem.valida.ParentescoValores parentesco,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.runPersona = runPersona;
           this.nombrePersona = nombrePersona;
           this.fechaNacimientoPersona = fechaNacimientoPersona;
           this.parentesco = parentesco;
           this.signature = signature;
    }


    /**
     * Gets the runPersona value for this InformacionParentescoINP.
     * 
     * @return runPersona
     */
    public cl.gob.aem.valida.RunType getRunPersona() {
        return runPersona;
    }


    /**
     * Sets the runPersona value for this InformacionParentescoINP.
     * 
     * @param runPersona
     */
    public void setRunPersona(cl.gob.aem.valida.RunType runPersona) {
        this.runPersona = runPersona;
    }


    /**
     * Gets the nombrePersona value for this InformacionParentescoINP.
     * 
     * @return nombrePersona
     */
    public cl.gob.aem.valida.NameType getNombrePersona() {
        return nombrePersona;
    }


    /**
     * Sets the nombrePersona value for this InformacionParentescoINP.
     * 
     * @param nombrePersona
     */
    public void setNombrePersona(cl.gob.aem.valida.NameType nombrePersona) {
        this.nombrePersona = nombrePersona;
    }


    /**
     * Gets the fechaNacimientoPersona value for this InformacionParentescoINP.
     * 
     * @return fechaNacimientoPersona
     */
    public cl.gob.aem.valida.FechaType getFechaNacimientoPersona() {
        return fechaNacimientoPersona;
    }


    /**
     * Sets the fechaNacimientoPersona value for this InformacionParentescoINP.
     * 
     * @param fechaNacimientoPersona
     */
    public void setFechaNacimientoPersona(cl.gob.aem.valida.FechaType fechaNacimientoPersona) {
        this.fechaNacimientoPersona = fechaNacimientoPersona;
    }


    /**
     * Gets the parentesco value for this InformacionParentescoINP.
     * 
     * @return parentesco
     */
    public cl.gob.aem.valida.ParentescoValores getParentesco() {
        return parentesco;
    }


    /**
     * Sets the parentesco value for this InformacionParentescoINP.
     * 
     * @param parentesco
     */
    public void setParentesco(cl.gob.aem.valida.ParentescoValores parentesco) {
        this.parentesco = parentesco;
    }


    /**
     * Gets the signature value for this InformacionParentescoINP.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this InformacionParentescoINP.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacionParentescoINP)) return false;
        InformacionParentescoINP other = (InformacionParentescoINP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.runPersona==null && other.getRunPersona()==null) || 
             (this.runPersona!=null &&
              this.runPersona.equals(other.getRunPersona()))) &&
            ((this.nombrePersona==null && other.getNombrePersona()==null) || 
             (this.nombrePersona!=null &&
              this.nombrePersona.equals(other.getNombrePersona()))) &&
            ((this.fechaNacimientoPersona==null && other.getFechaNacimientoPersona()==null) || 
             (this.fechaNacimientoPersona!=null &&
              this.fechaNacimientoPersona.equals(other.getFechaNacimientoPersona()))) &&
            ((this.parentesco==null && other.getParentesco()==null) || 
             (this.parentesco!=null &&
              this.parentesco.equals(other.getParentesco()))) &&
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
        if (getRunPersona() != null) {
            _hashCode += getRunPersona().hashCode();
        }
        if (getNombrePersona() != null) {
            _hashCode += getNombrePersona().hashCode();
        }
        if (getFechaNacimientoPersona() != null) {
            _hashCode += getFechaNacimientoPersona().hashCode();
        }
        if (getParentesco() != null) {
            _hashCode += getParentesco().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacionParentescoINP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">informacionParentescoINP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombrePersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimientoPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaNacimientoPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentesco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "parentesco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "parentescoValores"));
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
