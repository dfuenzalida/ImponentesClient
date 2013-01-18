/**
 * DireccionesContribuyenteDireccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class DireccionesContribuyenteDireccion  extends cl.gob.aem.valida.DireccionType  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger indice;  // attribute

    public DireccionesContribuyenteDireccion() {
    }

    public DireccionesContribuyenteDireccion(
           java.lang.String nombreDireccion,
           java.lang.String numeroDireccion,
           java.lang.String regionDireccion,
           java.lang.String comunaDireccion,
           java.lang.String provinciaDireccion,
           java.lang.String numeroDepartamentoCasa,
           java.lang.String numeroTorre,
           java.lang.String codigoPostal,
           org.apache.axis.types.PositiveInteger tipoDireccion,
           java.lang.String infoAdicional,
           org.apache.axis.types.NonNegativeInteger indice) {
        super(
            nombreDireccion,
            numeroDireccion,
            regionDireccion,
            comunaDireccion,
            provinciaDireccion,
            numeroDepartamentoCasa,
            numeroTorre,
            codigoPostal,
            tipoDireccion,
            infoAdicional);
        this.indice = indice;
    }


    /**
     * Gets the indice value for this DireccionesContribuyenteDireccion.
     * 
     * @return indice
     */
    public org.apache.axis.types.NonNegativeInteger getIndice() {
        return indice;
    }


    /**
     * Sets the indice value for this DireccionesContribuyenteDireccion.
     * 
     * @param indice
     */
    public void setIndice(org.apache.axis.types.NonNegativeInteger indice) {
        this.indice = indice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DireccionesContribuyenteDireccion)) return false;
        DireccionesContribuyenteDireccion other = (DireccionesContribuyenteDireccion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.indice==null && other.getIndice()==null) || 
             (this.indice!=null &&
              this.indice.equals(other.getIndice())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getIndice() != null) {
            _hashCode += getIndice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DireccionesContribuyenteDireccion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>direccionesContribuyente>direccion"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("indice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "indice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
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
