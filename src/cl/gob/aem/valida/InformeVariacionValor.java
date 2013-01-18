/**
 * InformeVariacionValor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformeVariacionValor  implements java.io.Serializable {
    /* Identificación del Documento IVV */
    private cl.gob.aem.valida.InformeVariacionValorEncabezado encabezado;

    /* Productos o elementos exportados */
    private cl.gob.aem.valida.InformeVariacionValorItem[] item;

    /* Inicio de Observaciones de Analistas */
    private cl.gob.aem.valida.InformeVariacionValorEstadoAnalistaEstado[] estadoAnalista;

    /* Inicio datos de recepción de Cochilco */
    private cl.gob.aem.valida.InformeVariacionValorRecepcionCochilco recepcionCochilco;

    /* Estado general de IVV */
    private cl.gob.aem.valida.InformeVariacionValorEstadoIVV estadoIVV;

    public InformeVariacionValor() {
    }

    public InformeVariacionValor(
           cl.gob.aem.valida.InformeVariacionValorEncabezado encabezado,
           cl.gob.aem.valida.InformeVariacionValorItem[] item,
           cl.gob.aem.valida.InformeVariacionValorEstadoAnalistaEstado[] estadoAnalista,
           cl.gob.aem.valida.InformeVariacionValorRecepcionCochilco recepcionCochilco,
           cl.gob.aem.valida.InformeVariacionValorEstadoIVV estadoIVV) {
           this.encabezado = encabezado;
           this.item = item;
           this.estadoAnalista = estadoAnalista;
           this.recepcionCochilco = recepcionCochilco;
           this.estadoIVV = estadoIVV;
    }


    /**
     * Gets the encabezado value for this InformeVariacionValor.
     * 
     * @return encabezado   * Identificación del Documento IVV
     */
    public cl.gob.aem.valida.InformeVariacionValorEncabezado getEncabezado() {
        return encabezado;
    }


    /**
     * Sets the encabezado value for this InformeVariacionValor.
     * 
     * @param encabezado   * Identificación del Documento IVV
     */
    public void setEncabezado(cl.gob.aem.valida.InformeVariacionValorEncabezado encabezado) {
        this.encabezado = encabezado;
    }


    /**
     * Gets the item value for this InformeVariacionValor.
     * 
     * @return item   * Productos o elementos exportados
     */
    public cl.gob.aem.valida.InformeVariacionValorItem[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this InformeVariacionValor.
     * 
     * @param item   * Productos o elementos exportados
     */
    public void setItem(cl.gob.aem.valida.InformeVariacionValorItem[] item) {
        this.item = item;
    }

    public cl.gob.aem.valida.InformeVariacionValorItem getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, cl.gob.aem.valida.InformeVariacionValorItem _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the estadoAnalista value for this InformeVariacionValor.
     * 
     * @return estadoAnalista   * Inicio de Observaciones de Analistas
     */
    public cl.gob.aem.valida.InformeVariacionValorEstadoAnalistaEstado[] getEstadoAnalista() {
        return estadoAnalista;
    }


    /**
     * Sets the estadoAnalista value for this InformeVariacionValor.
     * 
     * @param estadoAnalista   * Inicio de Observaciones de Analistas
     */
    public void setEstadoAnalista(cl.gob.aem.valida.InformeVariacionValorEstadoAnalistaEstado[] estadoAnalista) {
        this.estadoAnalista = estadoAnalista;
    }


    /**
     * Gets the recepcionCochilco value for this InformeVariacionValor.
     * 
     * @return recepcionCochilco   * Inicio datos de recepción de Cochilco
     */
    public cl.gob.aem.valida.InformeVariacionValorRecepcionCochilco getRecepcionCochilco() {
        return recepcionCochilco;
    }


    /**
     * Sets the recepcionCochilco value for this InformeVariacionValor.
     * 
     * @param recepcionCochilco   * Inicio datos de recepción de Cochilco
     */
    public void setRecepcionCochilco(cl.gob.aem.valida.InformeVariacionValorRecepcionCochilco recepcionCochilco) {
        this.recepcionCochilco = recepcionCochilco;
    }


    /**
     * Gets the estadoIVV value for this InformeVariacionValor.
     * 
     * @return estadoIVV   * Estado general de IVV
     */
    public cl.gob.aem.valida.InformeVariacionValorEstadoIVV getEstadoIVV() {
        return estadoIVV;
    }


    /**
     * Sets the estadoIVV value for this InformeVariacionValor.
     * 
     * @param estadoIVV   * Estado general de IVV
     */
    public void setEstadoIVV(cl.gob.aem.valida.InformeVariacionValorEstadoIVV estadoIVV) {
        this.estadoIVV = estadoIVV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformeVariacionValor)) return false;
        InformeVariacionValor other = (InformeVariacionValor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.encabezado==null && other.getEncabezado()==null) || 
             (this.encabezado!=null &&
              this.encabezado.equals(other.getEncabezado()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.estadoAnalista==null && other.getEstadoAnalista()==null) || 
             (this.estadoAnalista!=null &&
              java.util.Arrays.equals(this.estadoAnalista, other.getEstadoAnalista()))) &&
            ((this.recepcionCochilco==null && other.getRecepcionCochilco()==null) || 
             (this.recepcionCochilco!=null &&
              this.recepcionCochilco.equals(other.getRecepcionCochilco()))) &&
            ((this.estadoIVV==null && other.getEstadoIVV()==null) || 
             (this.estadoIVV!=null &&
              this.estadoIVV.equals(other.getEstadoIVV())));
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
        if (getEncabezado() != null) {
            _hashCode += getEncabezado().hashCode();
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstadoAnalista() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstadoAnalista());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstadoAnalista(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecepcionCochilco() != null) {
            _hashCode += getRecepcionCochilco().hashCode();
        }
        if (getEstadoIVV() != null) {
            _hashCode += getEstadoIVV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformeVariacionValor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">InformeVariacionValor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encabezado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Encabezado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>InformeVariacionValor>Encabezado"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>InformeVariacionValor>Item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoAnalista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "EstadoAnalista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>InformeVariacionValor>EstadoAnalista>Estado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Estado"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recepcionCochilco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "RecepcionCochilco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>InformeVariacionValor>RecepcionCochilco"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoIVV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "EstadoIVV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>InformeVariacionValor>EstadoIVV"));
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
