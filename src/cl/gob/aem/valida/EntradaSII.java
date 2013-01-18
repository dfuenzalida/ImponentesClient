/**
 * EntradaSII.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class EntradaSII  implements java.io.Serializable {
    private cl.gob.aem.valida.RutRolType rutRol;

    private cl.gob.aem.valida.RunType rut;

    private cl.gob.aem.valida.RolType rol;

    private java.lang.String periodo;

    private java.lang.String token;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public EntradaSII() {
    }

    public EntradaSII(
           cl.gob.aem.valida.RutRolType rutRol,
           cl.gob.aem.valida.RunType rut,
           cl.gob.aem.valida.RolType rol,
           java.lang.String periodo,
           java.lang.String token,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.rutRol = rutRol;
           this.rut = rut;
           this.rol = rol;
           this.periodo = periodo;
           this.token = token;
           this.signature = signature;
    }


    /**
     * Gets the rutRol value for this EntradaSII.
     * 
     * @return rutRol
     */
    public cl.gob.aem.valida.RutRolType getRutRol() {
        return rutRol;
    }


    /**
     * Sets the rutRol value for this EntradaSII.
     * 
     * @param rutRol
     */
    public void setRutRol(cl.gob.aem.valida.RutRolType rutRol) {
        this.rutRol = rutRol;
    }


    /**
     * Gets the rut value for this EntradaSII.
     * 
     * @return rut
     */
    public cl.gob.aem.valida.RunType getRut() {
        return rut;
    }


    /**
     * Sets the rut value for this EntradaSII.
     * 
     * @param rut
     */
    public void setRut(cl.gob.aem.valida.RunType rut) {
        this.rut = rut;
    }


    /**
     * Gets the rol value for this EntradaSII.
     * 
     * @return rol
     */
    public cl.gob.aem.valida.RolType getRol() {
        return rol;
    }


    /**
     * Sets the rol value for this EntradaSII.
     * 
     * @param rol
     */
    public void setRol(cl.gob.aem.valida.RolType rol) {
        this.rol = rol;
    }


    /**
     * Gets the periodo value for this EntradaSII.
     * 
     * @return periodo
     */
    public java.lang.String getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this EntradaSII.
     * 
     * @param periodo
     */
    public void setPeriodo(java.lang.String periodo) {
        this.periodo = periodo;
    }


    /**
     * Gets the token value for this EntradaSII.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this EntradaSII.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the signature value for this EntradaSII.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this EntradaSII.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntradaSII)) return false;
        EntradaSII other = (EntradaSII) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rutRol==null && other.getRutRol()==null) || 
             (this.rutRol!=null &&
              this.rutRol.equals(other.getRutRol()))) &&
            ((this.rut==null && other.getRut()==null) || 
             (this.rut!=null &&
              this.rut.equals(other.getRut()))) &&
            ((this.rol==null && other.getRol()==null) || 
             (this.rol!=null &&
              this.rol.equals(other.getRol()))) &&
            ((this.periodo==null && other.getPeriodo()==null) || 
             (this.periodo!=null &&
              this.periodo.equals(other.getPeriodo()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
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
        if (getRutRol() != null) {
            _hashCode += getRutRol().hashCode();
        }
        if (getRut() != null) {
            _hashCode += getRut().hashCode();
        }
        if (getRol() != null) {
            _hashCode += getRol().hashCode();
        }
        if (getPeriodo() != null) {
            _hashCode += getPeriodo().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntradaSII.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">entradaSII"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutRol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "rutRol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "rutRolType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "rol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "rolType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "periodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
