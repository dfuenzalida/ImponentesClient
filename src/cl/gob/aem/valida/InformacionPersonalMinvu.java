/**
 * InformacionPersonalMinvu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformacionPersonalMinvu  implements java.io.Serializable {
    private cl.gob.aem.valida.InformacionPersonalMinvuDatosPersonal datosPersonal;

    private cl.gob.aem.valida.InformacionPersonalMinvuMatrimonio matrimonio;

    private cl.gob.aem.valida.DatosPersonalMinvuType[] hijo;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public InformacionPersonalMinvu() {
    }

    public InformacionPersonalMinvu(
           cl.gob.aem.valida.InformacionPersonalMinvuDatosPersonal datosPersonal,
           cl.gob.aem.valida.InformacionPersonalMinvuMatrimonio matrimonio,
           cl.gob.aem.valida.DatosPersonalMinvuType[] hijo,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.datosPersonal = datosPersonal;
           this.matrimonio = matrimonio;
           this.hijo = hijo;
           this.signature = signature;
    }


    /**
     * Gets the datosPersonal value for this InformacionPersonalMinvu.
     * 
     * @return datosPersonal
     */
    public cl.gob.aem.valida.InformacionPersonalMinvuDatosPersonal getDatosPersonal() {
        return datosPersonal;
    }


    /**
     * Sets the datosPersonal value for this InformacionPersonalMinvu.
     * 
     * @param datosPersonal
     */
    public void setDatosPersonal(cl.gob.aem.valida.InformacionPersonalMinvuDatosPersonal datosPersonal) {
        this.datosPersonal = datosPersonal;
    }


    /**
     * Gets the matrimonio value for this InformacionPersonalMinvu.
     * 
     * @return matrimonio
     */
    public cl.gob.aem.valida.InformacionPersonalMinvuMatrimonio getMatrimonio() {
        return matrimonio;
    }


    /**
     * Sets the matrimonio value for this InformacionPersonalMinvu.
     * 
     * @param matrimonio
     */
    public void setMatrimonio(cl.gob.aem.valida.InformacionPersonalMinvuMatrimonio matrimonio) {
        this.matrimonio = matrimonio;
    }


    /**
     * Gets the hijo value for this InformacionPersonalMinvu.
     * 
     * @return hijo
     */
    public cl.gob.aem.valida.DatosPersonalMinvuType[] getHijo() {
        return hijo;
    }


    /**
     * Sets the hijo value for this InformacionPersonalMinvu.
     * 
     * @param hijo
     */
    public void setHijo(cl.gob.aem.valida.DatosPersonalMinvuType[] hijo) {
        this.hijo = hijo;
    }

    public cl.gob.aem.valida.DatosPersonalMinvuType getHijo(int i) {
        return this.hijo[i];
    }

    public void setHijo(int i, cl.gob.aem.valida.DatosPersonalMinvuType _value) {
        this.hijo[i] = _value;
    }


    /**
     * Gets the signature value for this InformacionPersonalMinvu.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this InformacionPersonalMinvu.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacionPersonalMinvu)) return false;
        InformacionPersonalMinvu other = (InformacionPersonalMinvu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosPersonal==null && other.getDatosPersonal()==null) || 
             (this.datosPersonal!=null &&
              this.datosPersonal.equals(other.getDatosPersonal()))) &&
            ((this.matrimonio==null && other.getMatrimonio()==null) || 
             (this.matrimonio!=null &&
              this.matrimonio.equals(other.getMatrimonio()))) &&
            ((this.hijo==null && other.getHijo()==null) || 
             (this.hijo!=null &&
              java.util.Arrays.equals(this.hijo, other.getHijo()))) &&
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
        if (getDatosPersonal() != null) {
            _hashCode += getDatosPersonal().hashCode();
        }
        if (getMatrimonio() != null) {
            _hashCode += getMatrimonio().hashCode();
        }
        if (getHijo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHijo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHijo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacionPersonalMinvu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">informacionPersonalMinvu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosPersonal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosPersonal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>informacionPersonalMinvu>datosPersonal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrimonio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "matrimonio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>informacionPersonalMinvu>matrimonio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hijo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "hijo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosPersonalMinvuType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
