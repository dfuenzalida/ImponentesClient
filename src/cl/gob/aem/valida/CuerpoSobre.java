/**
 * CuerpoSobre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;


/**
 * Nombre Esquema: CuerpoSobre
 * 		
 * 		  Tipo Esquema: Basal
 * 
 * 		  Descripcion: 
 * 			  Encabezado de un Sobre DS 81
 * 
 * 		  Descripcion Campos:
 * 
 * 		    -messageDigest: Digest del Documento
 * 		    -metodoMessageDigest: Metodo utilizado
 * 		    -metodoFirmaMessageDigest: Texto con el metodo de firma del
 * Message Digest
 * 		    -metodoCanonizacion: Metodo utilizado
 * 		    -documento: Documento (datos intercambiados, que podran venir
 * encriptados, a traves de algun metodo)
 * 
 *                     Referencia : http://www.w3.org/TR/2002/REC-xmldsig-core-20020212/xmldsig-core-schema.xsd#rawX509Certificate
 * 
 * 		  Trámites que utilizan este esquema:
 * 
 * 		  Observaciones:
 * 		    *No hay observaciones.
 */
public class CuerpoSobre  implements java.io.Serializable {
    private org.w3.www._2000._09.xmldsig.SignedInfoType referencia;

    private byte[] messageDigest;

    private org.w3.www._2000._09.xmldsig.DigestMethodType metodoMessageDigest;

    private cl.gob.aem.valida.DocumentoType documento;

    public CuerpoSobre() {
    }

    public CuerpoSobre(
           org.w3.www._2000._09.xmldsig.SignedInfoType referencia,
           byte[] messageDigest,
           org.w3.www._2000._09.xmldsig.DigestMethodType metodoMessageDigest,
           cl.gob.aem.valida.DocumentoType documento) {
           this.referencia = referencia;
           this.messageDigest = messageDigest;
           this.metodoMessageDigest = metodoMessageDigest;
           this.documento = documento;
    }


    /**
     * Gets the referencia value for this CuerpoSobre.
     * 
     * @return referencia
     */
    public org.w3.www._2000._09.xmldsig.SignedInfoType getReferencia() {
        return referencia;
    }


    /**
     * Sets the referencia value for this CuerpoSobre.
     * 
     * @param referencia
     */
    public void setReferencia(org.w3.www._2000._09.xmldsig.SignedInfoType referencia) {
        this.referencia = referencia;
    }


    /**
     * Gets the messageDigest value for this CuerpoSobre.
     * 
     * @return messageDigest
     */
    public byte[] getMessageDigest() {
        return messageDigest;
    }


    /**
     * Sets the messageDigest value for this CuerpoSobre.
     * 
     * @param messageDigest
     */
    public void setMessageDigest(byte[] messageDigest) {
        this.messageDigest = messageDigest;
    }


    /**
     * Gets the metodoMessageDigest value for this CuerpoSobre.
     * 
     * @return metodoMessageDigest
     */
    public org.w3.www._2000._09.xmldsig.DigestMethodType getMetodoMessageDigest() {
        return metodoMessageDigest;
    }


    /**
     * Sets the metodoMessageDigest value for this CuerpoSobre.
     * 
     * @param metodoMessageDigest
     */
    public void setMetodoMessageDigest(org.w3.www._2000._09.xmldsig.DigestMethodType metodoMessageDigest) {
        this.metodoMessageDigest = metodoMessageDigest;
    }


    /**
     * Gets the documento value for this CuerpoSobre.
     * 
     * @return documento
     */
    public cl.gob.aem.valida.DocumentoType getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this CuerpoSobre.
     * 
     * @param documento
     */
    public void setDocumento(cl.gob.aem.valida.DocumentoType documento) {
        this.documento = documento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CuerpoSobre)) return false;
        CuerpoSobre other = (CuerpoSobre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referencia==null && other.getReferencia()==null) || 
             (this.referencia!=null &&
              this.referencia.equals(other.getReferencia()))) &&
            ((this.messageDigest==null && other.getMessageDigest()==null) || 
             (this.messageDigest!=null &&
              java.util.Arrays.equals(this.messageDigest, other.getMessageDigest()))) &&
            ((this.metodoMessageDigest==null && other.getMetodoMessageDigest()==null) || 
             (this.metodoMessageDigest!=null &&
              this.metodoMessageDigest.equals(other.getMetodoMessageDigest()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento())));
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
        if (getReferencia() != null) {
            _hashCode += getReferencia().hashCode();
        }
        if (getMessageDigest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessageDigest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessageDigest(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetodoMessageDigest() != null) {
            _hashCode += getMetodoMessageDigest().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CuerpoSobre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "cuerpoSobre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "referencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDigest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "messageDigest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metodoMessageDigest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "metodoMessageDigest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "documentoType"));
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
