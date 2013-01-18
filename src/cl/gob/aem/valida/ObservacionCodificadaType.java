/**
 * ObservacionCodificadaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ObservacionCodificadaType  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger codigo;

    private java.lang.String valor;

    private java.lang.String glosa;

    public ObservacionCodificadaType() {
    }

    public ObservacionCodificadaType(
           org.apache.axis.types.PositiveInteger codigo,
           java.lang.String valor,
           java.lang.String glosa) {
           this.codigo = codigo;
           this.valor = valor;
           this.glosa = glosa;
    }


    /**
     * Gets the codigo value for this ObservacionCodificadaType.
     * 
     * @return codigo
     */
    public org.apache.axis.types.PositiveInteger getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this ObservacionCodificadaType.
     * 
     * @param codigo
     */
    public void setCodigo(org.apache.axis.types.PositiveInteger codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the valor value for this ObservacionCodificadaType.
     * 
     * @return valor
     */
    public java.lang.String getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this ObservacionCodificadaType.
     * 
     * @param valor
     */
    public void setValor(java.lang.String valor) {
        this.valor = valor;
    }


    /**
     * Gets the glosa value for this ObservacionCodificadaType.
     * 
     * @return glosa
     */
    public java.lang.String getGlosa() {
        return glosa;
    }


    /**
     * Sets the glosa value for this ObservacionCodificadaType.
     * 
     * @param glosa
     */
    public void setGlosa(java.lang.String glosa) {
        this.glosa = glosa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObservacionCodificadaType)) return false;
        ObservacionCodificadaType other = (ObservacionCodificadaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.glosa==null && other.getGlosa()==null) || 
             (this.glosa!=null &&
              this.glosa.equals(other.getGlosa())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getGlosa() != null) {
            _hashCode += getGlosa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObservacionCodificadaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ObservacionCodificadaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glosa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Glosa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
