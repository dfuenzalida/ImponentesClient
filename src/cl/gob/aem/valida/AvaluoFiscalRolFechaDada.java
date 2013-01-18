/**
 * AvaluoFiscalRolFechaDada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class AvaluoFiscalRolFechaDada  implements java.io.Serializable {
    private java.lang.String comuna;

    private java.lang.String manzana;

    private java.lang.String predio;

    private java.lang.String avaluo;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public AvaluoFiscalRolFechaDada() {
    }

    public AvaluoFiscalRolFechaDada(
           java.lang.String comuna,
           java.lang.String manzana,
           java.lang.String predio,
           java.lang.String avaluo,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.comuna = comuna;
           this.manzana = manzana;
           this.predio = predio;
           this.avaluo = avaluo;
           this.signature = signature;
    }


    /**
     * Gets the comuna value for this AvaluoFiscalRolFechaDada.
     * 
     * @return comuna
     */
    public java.lang.String getComuna() {
        return comuna;
    }


    /**
     * Sets the comuna value for this AvaluoFiscalRolFechaDada.
     * 
     * @param comuna
     */
    public void setComuna(java.lang.String comuna) {
        this.comuna = comuna;
    }


    /**
     * Gets the manzana value for this AvaluoFiscalRolFechaDada.
     * 
     * @return manzana
     */
    public java.lang.String getManzana() {
        return manzana;
    }


    /**
     * Sets the manzana value for this AvaluoFiscalRolFechaDada.
     * 
     * @param manzana
     */
    public void setManzana(java.lang.String manzana) {
        this.manzana = manzana;
    }


    /**
     * Gets the predio value for this AvaluoFiscalRolFechaDada.
     * 
     * @return predio
     */
    public java.lang.String getPredio() {
        return predio;
    }


    /**
     * Sets the predio value for this AvaluoFiscalRolFechaDada.
     * 
     * @param predio
     */
    public void setPredio(java.lang.String predio) {
        this.predio = predio;
    }


    /**
     * Gets the avaluo value for this AvaluoFiscalRolFechaDada.
     * 
     * @return avaluo
     */
    public java.lang.String getAvaluo() {
        return avaluo;
    }


    /**
     * Sets the avaluo value for this AvaluoFiscalRolFechaDada.
     * 
     * @param avaluo
     */
    public void setAvaluo(java.lang.String avaluo) {
        this.avaluo = avaluo;
    }


    /**
     * Gets the signature value for this AvaluoFiscalRolFechaDada.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this AvaluoFiscalRolFechaDada.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvaluoFiscalRolFechaDada)) return false;
        AvaluoFiscalRolFechaDada other = (AvaluoFiscalRolFechaDada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comuna==null && other.getComuna()==null) || 
             (this.comuna!=null &&
              this.comuna.equals(other.getComuna()))) &&
            ((this.manzana==null && other.getManzana()==null) || 
             (this.manzana!=null &&
              this.manzana.equals(other.getManzana()))) &&
            ((this.predio==null && other.getPredio()==null) || 
             (this.predio!=null &&
              this.predio.equals(other.getPredio()))) &&
            ((this.avaluo==null && other.getAvaluo()==null) || 
             (this.avaluo!=null &&
              this.avaluo.equals(other.getAvaluo()))) &&
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
        if (getComuna() != null) {
            _hashCode += getComuna().hashCode();
        }
        if (getManzana() != null) {
            _hashCode += getManzana().hashCode();
        }
        if (getPredio() != null) {
            _hashCode += getPredio().hashCode();
        }
        if (getAvaluo() != null) {
            _hashCode += getAvaluo().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvaluoFiscalRolFechaDada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">avaluoFiscalRolFechaDada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comuna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "comuna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manzana");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "manzana"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "predio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaluo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "avaluo"));
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
