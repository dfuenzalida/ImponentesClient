/**
 * CertificadoAnotacionesVigentePatentePropietariosAnteriores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoAnotacionesVigentePatentePropietariosAnteriores  implements java.io.Serializable {
    private cl.gob.aem.valida.PropietarioVehiculoType propietarioAnterior;

    public CertificadoAnotacionesVigentePatentePropietariosAnteriores() {
    }

    public CertificadoAnotacionesVigentePatentePropietariosAnteriores(
           cl.gob.aem.valida.PropietarioVehiculoType propietarioAnterior) {
           this.propietarioAnterior = propietarioAnterior;
    }


    /**
     * Gets the propietarioAnterior value for this CertificadoAnotacionesVigentePatentePropietariosAnteriores.
     * 
     * @return propietarioAnterior
     */
    public cl.gob.aem.valida.PropietarioVehiculoType getPropietarioAnterior() {
        return propietarioAnterior;
    }


    /**
     * Sets the propietarioAnterior value for this CertificadoAnotacionesVigentePatentePropietariosAnteriores.
     * 
     * @param propietarioAnterior
     */
    public void setPropietarioAnterior(cl.gob.aem.valida.PropietarioVehiculoType propietarioAnterior) {
        this.propietarioAnterior = propietarioAnterior;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoAnotacionesVigentePatentePropietariosAnteriores)) return false;
        CertificadoAnotacionesVigentePatentePropietariosAnteriores other = (CertificadoAnotacionesVigentePatentePropietariosAnteriores) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propietarioAnterior==null && other.getPropietarioAnterior()==null) || 
             (this.propietarioAnterior!=null &&
              this.propietarioAnterior.equals(other.getPropietarioAnterior())));
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
        if (getPropietarioAnterior() != null) {
            _hashCode += getPropietarioAnterior().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoAnotacionesVigentePatentePropietariosAnteriores.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>certificadoAnotacionesVigentePatente>PropietariosAnteriores"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propietarioAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "propietarioAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "propietarioVehiculoType"));
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
