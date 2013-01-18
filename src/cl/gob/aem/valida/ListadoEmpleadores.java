/**
 * ListadoEmpleadores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ListadoEmpleadores  implements java.io.Serializable {
    private cl.gob.aem.valida.ListadoEmpleadoresEmpleador[] empleador;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    private org.apache.axis.types.NonNegativeInteger registrosTotales;  // attribute

    public ListadoEmpleadores() {
    }

    public ListadoEmpleadores(
           cl.gob.aem.valida.ListadoEmpleadoresEmpleador[] empleador,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           org.apache.axis.types.NonNegativeInteger registrosTotales) {
           this.empleador = empleador;
           this.signature = signature;
           this.registrosTotales = registrosTotales;
    }


    /**
     * Gets the empleador value for this ListadoEmpleadores.
     * 
     * @return empleador
     */
    public cl.gob.aem.valida.ListadoEmpleadoresEmpleador[] getEmpleador() {
        return empleador;
    }


    /**
     * Sets the empleador value for this ListadoEmpleadores.
     * 
     * @param empleador
     */
    public void setEmpleador(cl.gob.aem.valida.ListadoEmpleadoresEmpleador[] empleador) {
        this.empleador = empleador;
    }

    public cl.gob.aem.valida.ListadoEmpleadoresEmpleador getEmpleador(int i) {
        return this.empleador[i];
    }

    public void setEmpleador(int i, cl.gob.aem.valida.ListadoEmpleadoresEmpleador _value) {
        this.empleador[i] = _value;
    }


    /**
     * Gets the signature value for this ListadoEmpleadores.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ListadoEmpleadores.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }


    /**
     * Gets the registrosTotales value for this ListadoEmpleadores.
     * 
     * @return registrosTotales
     */
    public org.apache.axis.types.NonNegativeInteger getRegistrosTotales() {
        return registrosTotales;
    }


    /**
     * Sets the registrosTotales value for this ListadoEmpleadores.
     * 
     * @param registrosTotales
     */
    public void setRegistrosTotales(org.apache.axis.types.NonNegativeInteger registrosTotales) {
        this.registrosTotales = registrosTotales;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListadoEmpleadores)) return false;
        ListadoEmpleadores other = (ListadoEmpleadores) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.empleador==null && other.getEmpleador()==null) || 
             (this.empleador!=null &&
              java.util.Arrays.equals(this.empleador, other.getEmpleador()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.registrosTotales==null && other.getRegistrosTotales()==null) || 
             (this.registrosTotales!=null &&
              this.registrosTotales.equals(other.getRegistrosTotales())));
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
        if (getEmpleador() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmpleador());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmpleador(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getRegistrosTotales() != null) {
            _hashCode += getRegistrosTotales().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListadoEmpleadores.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">listadoEmpleadores"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("registrosTotales");
        attrField.setXmlName(new javax.xml.namespace.QName("", "registrosTotales"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empleador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "empleador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>listadoEmpleadores>empleador"));
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
