/**
 * Sobre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class Sobre  implements java.io.Serializable {
    private cl.gob.aem.valida.EncabezadoSobre encabezado;

    private cl.gob.aem.valida.CuerpoSobre[] cuerpo;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public Sobre() {
    }

    public Sobre(
           cl.gob.aem.valida.EncabezadoSobre encabezado,
           cl.gob.aem.valida.CuerpoSobre[] cuerpo,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.encabezado = encabezado;
           this.cuerpo = cuerpo;
           this.signature = signature;
    }


    /**
     * Gets the encabezado value for this Sobre.
     * 
     * @return encabezado
     */
    public cl.gob.aem.valida.EncabezadoSobre getEncabezado() {
        return encabezado;
    }


    /**
     * Sets the encabezado value for this Sobre.
     * 
     * @param encabezado
     */
    public void setEncabezado(cl.gob.aem.valida.EncabezadoSobre encabezado) {
        this.encabezado = encabezado;
    }


    /**
     * Gets the cuerpo value for this Sobre.
     * 
     * @return cuerpo
     */
    public cl.gob.aem.valida.CuerpoSobre[] getCuerpo() {
        return cuerpo;
    }


    /**
     * Sets the cuerpo value for this Sobre.
     * 
     * @param cuerpo
     */
    public void setCuerpo(cl.gob.aem.valida.CuerpoSobre[] cuerpo) {
        this.cuerpo = cuerpo;
    }

    public cl.gob.aem.valida.CuerpoSobre getCuerpo(int i) {
        return this.cuerpo[i];
    }

    public void setCuerpo(int i, cl.gob.aem.valida.CuerpoSobre _value) {
        this.cuerpo[i] = _value;
    }


    /**
     * Gets the signature value for this Sobre.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this Sobre.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sobre)) return false;
        Sobre other = (Sobre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.encabezado==null && other.getEncabezado()==null) || 
             (this.encabezado!=null &&
              this.encabezado.equals(other.getEncabezado()))) &&
            ((this.cuerpo==null && other.getCuerpo()==null) || 
             (this.cuerpo!=null &&
              java.util.Arrays.equals(this.cuerpo, other.getCuerpo()))) &&
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
        if (getEncabezado() != null) {
            _hashCode += getEncabezado().hashCode();
        }
        if (getCuerpo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCuerpo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCuerpo(), i);
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
        new org.apache.axis.description.TypeDesc(Sobre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">sobre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encabezado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "encabezado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "encabezadoSobre"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuerpo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "cuerpo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "cuerpoSobre"));
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
