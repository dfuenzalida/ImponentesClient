/**
 * IdentificacionPersonaOInstitucionTypeCargo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.presidencia.interop;

public class IdentificacionPersonaOInstitucionTypeCargo  implements java.io.Serializable {
    private java.lang.String decripcionCargo;

    /* Indica el tipo cargo (Subrogante, Titular, Interino) */
    private cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeCargoTipoCargo tipoCargo;

    public IdentificacionPersonaOInstitucionTypeCargo() {
    }

    public IdentificacionPersonaOInstitucionTypeCargo(
           java.lang.String decripcionCargo,
           cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeCargoTipoCargo tipoCargo) {
           this.decripcionCargo = decripcionCargo;
           this.tipoCargo = tipoCargo;
    }


    /**
     * Gets the decripcionCargo value for this IdentificacionPersonaOInstitucionTypeCargo.
     * 
     * @return decripcionCargo
     */
    public java.lang.String getDecripcionCargo() {
        return decripcionCargo;
    }


    /**
     * Sets the decripcionCargo value for this IdentificacionPersonaOInstitucionTypeCargo.
     * 
     * @param decripcionCargo
     */
    public void setDecripcionCargo(java.lang.String decripcionCargo) {
        this.decripcionCargo = decripcionCargo;
    }


    /**
     * Gets the tipoCargo value for this IdentificacionPersonaOInstitucionTypeCargo.
     * 
     * @return tipoCargo   * Indica el tipo cargo (Subrogante, Titular, Interino)
     */
    public cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeCargoTipoCargo getTipoCargo() {
        return tipoCargo;
    }


    /**
     * Sets the tipoCargo value for this IdentificacionPersonaOInstitucionTypeCargo.
     * 
     * @param tipoCargo   * Indica el tipo cargo (Subrogante, Titular, Interino)
     */
    public void setTipoCargo(cl.presidencia.interop.IdentificacionPersonaOInstitucionTypeCargoTipoCargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionPersonaOInstitucionTypeCargo)) return false;
        IdentificacionPersonaOInstitucionTypeCargo other = (IdentificacionPersonaOInstitucionTypeCargo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.decripcionCargo==null && other.getDecripcionCargo()==null) || 
             (this.decripcionCargo!=null &&
              this.decripcionCargo.equals(other.getDecripcionCargo()))) &&
            ((this.tipoCargo==null && other.getTipoCargo()==null) || 
             (this.tipoCargo!=null &&
              this.tipoCargo.equals(other.getTipoCargo())));
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
        if (getDecripcionCargo() != null) {
            _hashCode += getDecripcionCargo().hashCode();
        }
        if (getTipoCargo() != null) {
            _hashCode += getTipoCargo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificacionPersonaOInstitucionTypeCargo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", ">IdentificacionPersonaOInstitucionType>Cargo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decripcionCargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "DecripcionCargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interop.presidencia.cl", "TipoCargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", ">>IdentificacionPersonaOInstitucionType>Cargo>TipoCargo"));
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
