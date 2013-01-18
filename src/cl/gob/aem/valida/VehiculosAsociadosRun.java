/**
 * VehiculosAsociadosRun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class VehiculosAsociadosRun  implements java.io.Serializable {
    private java.lang.String[] listadoPatentes;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public VehiculosAsociadosRun() {
    }

    public VehiculosAsociadosRun(
           java.lang.String[] listadoPatentes,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.listadoPatentes = listadoPatentes;
           this.signature = signature;
    }


    /**
     * Gets the listadoPatentes value for this VehiculosAsociadosRun.
     * 
     * @return listadoPatentes
     */
    public java.lang.String[] getListadoPatentes() {
        return listadoPatentes;
    }


    /**
     * Sets the listadoPatentes value for this VehiculosAsociadosRun.
     * 
     * @param listadoPatentes
     */
    public void setListadoPatentes(java.lang.String[] listadoPatentes) {
        this.listadoPatentes = listadoPatentes;
    }


    /**
     * Gets the signature value for this VehiculosAsociadosRun.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this VehiculosAsociadosRun.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehiculosAsociadosRun)) return false;
        VehiculosAsociadosRun other = (VehiculosAsociadosRun) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listadoPatentes==null && other.getListadoPatentes()==null) || 
             (this.listadoPatentes!=null &&
              java.util.Arrays.equals(this.listadoPatentes, other.getListadoPatentes()))) &&
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
        if (getListadoPatentes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListadoPatentes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListadoPatentes(), i);
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
        new org.apache.axis.description.TypeDesc(VehiculosAsociadosRun.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">vehiculosAsociadosRun"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listadoPatentes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "listadoPatentes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "patente"));
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
