/**
 * RepresentanteLegal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class RepresentanteLegal  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger cantidad;

    private cl.gob.aem.valida.RepresentanteLegalRepresentante[] representante;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public RepresentanteLegal() {
    }

    public RepresentanteLegal(
           org.apache.axis.types.NonNegativeInteger cantidad,
           cl.gob.aem.valida.RepresentanteLegalRepresentante[] representante,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.cantidad = cantidad;
           this.representante = representante;
           this.signature = signature;
    }


    /**
     * Gets the cantidad value for this RepresentanteLegal.
     * 
     * @return cantidad
     */
    public org.apache.axis.types.NonNegativeInteger getCantidad() {
        return cantidad;
    }


    /**
     * Sets the cantidad value for this RepresentanteLegal.
     * 
     * @param cantidad
     */
    public void setCantidad(org.apache.axis.types.NonNegativeInteger cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Gets the representante value for this RepresentanteLegal.
     * 
     * @return representante
     */
    public cl.gob.aem.valida.RepresentanteLegalRepresentante[] getRepresentante() {
        return representante;
    }


    /**
     * Sets the representante value for this RepresentanteLegal.
     * 
     * @param representante
     */
    public void setRepresentante(cl.gob.aem.valida.RepresentanteLegalRepresentante[] representante) {
        this.representante = representante;
    }

    public cl.gob.aem.valida.RepresentanteLegalRepresentante getRepresentante(int i) {
        return this.representante[i];
    }

    public void setRepresentante(int i, cl.gob.aem.valida.RepresentanteLegalRepresentante _value) {
        this.representante[i] = _value;
    }


    /**
     * Gets the signature value for this RepresentanteLegal.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this RepresentanteLegal.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RepresentanteLegal)) return false;
        RepresentanteLegal other = (RepresentanteLegal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cantidad==null && other.getCantidad()==null) || 
             (this.cantidad!=null &&
              this.cantidad.equals(other.getCantidad()))) &&
            ((this.representante==null && other.getRepresentante()==null) || 
             (this.representante!=null &&
              java.util.Arrays.equals(this.representante, other.getRepresentante()))) &&
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
        if (getCantidad() != null) {
            _hashCode += getCantidad().hashCode();
        }
        if (getRepresentante() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepresentante());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepresentante(), i);
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
        new org.apache.axis.description.TypeDesc(RepresentanteLegal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">representanteLegal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "cantidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "representante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>representanteLegal>representante"));
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
