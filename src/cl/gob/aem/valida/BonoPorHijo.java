/**
 * BonoPorHijo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class BonoPorHijo  implements java.io.Serializable {
    private cl.gob.aem.valida.RefDatosPersonaType datosPersona;

    private cl.gob.aem.valida.MatrimonioType matrimonio;

    private cl.gob.aem.valida.DatosPersonaType[] hijos;

    public BonoPorHijo() {
    }

    public BonoPorHijo(
           cl.gob.aem.valida.RefDatosPersonaType datosPersona,
           cl.gob.aem.valida.MatrimonioType matrimonio,
           cl.gob.aem.valida.DatosPersonaType[] hijos) {
           this.datosPersona = datosPersona;
           this.matrimonio = matrimonio;
           this.hijos = hijos;
    }


    /**
     * Gets the datosPersona value for this BonoPorHijo.
     * 
     * @return datosPersona
     */
    public cl.gob.aem.valida.RefDatosPersonaType getDatosPersona() {
        return datosPersona;
    }


    /**
     * Sets the datosPersona value for this BonoPorHijo.
     * 
     * @param datosPersona
     */
    public void setDatosPersona(cl.gob.aem.valida.RefDatosPersonaType datosPersona) {
        this.datosPersona = datosPersona;
    }


    /**
     * Gets the matrimonio value for this BonoPorHijo.
     * 
     * @return matrimonio
     */
    public cl.gob.aem.valida.MatrimonioType getMatrimonio() {
        return matrimonio;
    }


    /**
     * Sets the matrimonio value for this BonoPorHijo.
     * 
     * @param matrimonio
     */
    public void setMatrimonio(cl.gob.aem.valida.MatrimonioType matrimonio) {
        this.matrimonio = matrimonio;
    }


    /**
     * Gets the hijos value for this BonoPorHijo.
     * 
     * @return hijos
     */
    public cl.gob.aem.valida.DatosPersonaType[] getHijos() {
        return hijos;
    }


    /**
     * Sets the hijos value for this BonoPorHijo.
     * 
     * @param hijos
     */
    public void setHijos(cl.gob.aem.valida.DatosPersonaType[] hijos) {
        this.hijos = hijos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BonoPorHijo)) return false;
        BonoPorHijo other = (BonoPorHijo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosPersona==null && other.getDatosPersona()==null) || 
             (this.datosPersona!=null &&
              this.datosPersona.equals(other.getDatosPersona()))) &&
            ((this.matrimonio==null && other.getMatrimonio()==null) || 
             (this.matrimonio!=null &&
              this.matrimonio.equals(other.getMatrimonio()))) &&
            ((this.hijos==null && other.getHijos()==null) || 
             (this.hijos!=null &&
              java.util.Arrays.equals(this.hijos, other.getHijos())));
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
        if (getDatosPersona() != null) {
            _hashCode += getDatosPersona().hashCode();
        }
        if (getMatrimonio() != null) {
            _hashCode += getMatrimonio().hashCode();
        }
        if (getHijos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHijos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHijos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BonoPorHijo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">bonoPorHijo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "refDatosPersonaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrimonio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "matrimonio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "matrimonioType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hijos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "hijos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosPersonaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "hijo"));
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
