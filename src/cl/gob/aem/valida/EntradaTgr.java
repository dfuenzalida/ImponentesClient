/**
 * EntradaTgr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class EntradaTgr  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType rut;

    private java.lang.String numeroRepertorio;

    private java.lang.String codigoOficinaSrcei;

    private org.apache.axis.types.Year solicitud;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public EntradaTgr() {
    }

    public EntradaTgr(
           cl.gob.aem.valida.RunType rut,
           java.lang.String numeroRepertorio,
           java.lang.String codigoOficinaSrcei,
           org.apache.axis.types.Year solicitud,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.rut = rut;
           this.numeroRepertorio = numeroRepertorio;
           this.codigoOficinaSrcei = codigoOficinaSrcei;
           this.solicitud = solicitud;
           this.signature = signature;
    }


    /**
     * Gets the rut value for this EntradaTgr.
     * 
     * @return rut
     */
    public cl.gob.aem.valida.RunType getRut() {
        return rut;
    }


    /**
     * Sets the rut value for this EntradaTgr.
     * 
     * @param rut
     */
    public void setRut(cl.gob.aem.valida.RunType rut) {
        this.rut = rut;
    }


    /**
     * Gets the numeroRepertorio value for this EntradaTgr.
     * 
     * @return numeroRepertorio
     */
    public java.lang.String getNumeroRepertorio() {
        return numeroRepertorio;
    }


    /**
     * Sets the numeroRepertorio value for this EntradaTgr.
     * 
     * @param numeroRepertorio
     */
    public void setNumeroRepertorio(java.lang.String numeroRepertorio) {
        this.numeroRepertorio = numeroRepertorio;
    }


    /**
     * Gets the codigoOficinaSrcei value for this EntradaTgr.
     * 
     * @return codigoOficinaSrcei
     */
    public java.lang.String getCodigoOficinaSrcei() {
        return codigoOficinaSrcei;
    }


    /**
     * Sets the codigoOficinaSrcei value for this EntradaTgr.
     * 
     * @param codigoOficinaSrcei
     */
    public void setCodigoOficinaSrcei(java.lang.String codigoOficinaSrcei) {
        this.codigoOficinaSrcei = codigoOficinaSrcei;
    }


    /**
     * Gets the solicitud value for this EntradaTgr.
     * 
     * @return solicitud
     */
    public org.apache.axis.types.Year getSolicitud() {
        return solicitud;
    }


    /**
     * Sets the solicitud value for this EntradaTgr.
     * 
     * @param solicitud
     */
    public void setSolicitud(org.apache.axis.types.Year solicitud) {
        this.solicitud = solicitud;
    }


    /**
     * Gets the signature value for this EntradaTgr.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this EntradaTgr.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntradaTgr)) return false;
        EntradaTgr other = (EntradaTgr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rut==null && other.getRut()==null) || 
             (this.rut!=null &&
              this.rut.equals(other.getRut()))) &&
            ((this.numeroRepertorio==null && other.getNumeroRepertorio()==null) || 
             (this.numeroRepertorio!=null &&
              this.numeroRepertorio.equals(other.getNumeroRepertorio()))) &&
            ((this.codigoOficinaSrcei==null && other.getCodigoOficinaSrcei()==null) || 
             (this.codigoOficinaSrcei!=null &&
              this.codigoOficinaSrcei.equals(other.getCodigoOficinaSrcei()))) &&
            ((this.solicitud==null && other.getSolicitud()==null) || 
             (this.solicitud!=null &&
              this.solicitud.equals(other.getSolicitud()))) &&
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
        if (getRut() != null) {
            _hashCode += getRut().hashCode();
        }
        if (getNumeroRepertorio() != null) {
            _hashCode += getNumeroRepertorio().hashCode();
        }
        if (getCodigoOficinaSrcei() != null) {
            _hashCode += getCodigoOficinaSrcei().hashCode();
        }
        if (getSolicitud() != null) {
            _hashCode += getSolicitud().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntradaTgr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">entradaTgr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRepertorio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "numeroRepertorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOficinaSrcei");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "codigoOficinaSrcei"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "solicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
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
