/**
 * ActividadesInscritas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ActividadesInscritas  implements java.io.Serializable {
    private cl.gob.aem.valida.ActividadType[] actividad;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public ActividadesInscritas() {
    }

    public ActividadesInscritas(
           cl.gob.aem.valida.ActividadType[] actividad,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.actividad = actividad;
           this.signature = signature;
    }


    /**
     * Gets the actividad value for this ActividadesInscritas.
     * 
     * @return actividad
     */
    public cl.gob.aem.valida.ActividadType[] getActividad() {
        return actividad;
    }


    /**
     * Sets the actividad value for this ActividadesInscritas.
     * 
     * @param actividad
     */
    public void setActividad(cl.gob.aem.valida.ActividadType[] actividad) {
        this.actividad = actividad;
    }

    public cl.gob.aem.valida.ActividadType getActividad(int i) {
        return this.actividad[i];
    }

    public void setActividad(int i, cl.gob.aem.valida.ActividadType _value) {
        this.actividad[i] = _value;
    }


    /**
     * Gets the signature value for this ActividadesInscritas.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ActividadesInscritas.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActividadesInscritas)) return false;
        ActividadesInscritas other = (ActividadesInscritas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actividad==null && other.getActividad()==null) || 
             (this.actividad!=null &&
              java.util.Arrays.equals(this.actividad, other.getActividad()))) &&
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
        if (getActividad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActividad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActividad(), i);
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
        new org.apache.axis.description.TypeDesc(ActividadesInscritas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">actividadesInscritas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actividad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "actividad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "actividadType"));
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
