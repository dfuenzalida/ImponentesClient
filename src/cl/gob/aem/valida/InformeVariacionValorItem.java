/**
 * InformeVariacionValorItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformeVariacionValorItem  implements java.io.Serializable {
    /* Número correlativo de Item */
    private org.apache.axis.types.PositiveInteger numeroItem;

    /* Nombre del Producto */
    private java.lang.String nombreItem;

    /* Características del Producto */
    private java.lang.String[] atributos;

    /* Arancel del Producto */
    private java.lang.String arancel;

    /* Identificación de la medida del producto */
    private cl.gob.aem.valida.CodigoDescripcion2Type medida;

    /* Cantidad de la Mercancía */
    private java.math.BigDecimal cantidadMercancia;

    /* FOB Unitario del Item */
    private java.math.BigDecimal FOBUnitario;

    /* FOB dólar */
    private java.math.BigDecimal FOBDollar;

    /* Observaciones al item */
    private cl.gob.aem.valida.ObservacionCodificadaType[] observacionesItem;

    public InformeVariacionValorItem() {
    }

    public InformeVariacionValorItem(
           org.apache.axis.types.PositiveInteger numeroItem,
           java.lang.String nombreItem,
           java.lang.String[] atributos,
           java.lang.String arancel,
           cl.gob.aem.valida.CodigoDescripcion2Type medida,
           java.math.BigDecimal cantidadMercancia,
           java.math.BigDecimal FOBUnitario,
           java.math.BigDecimal FOBDollar,
           cl.gob.aem.valida.ObservacionCodificadaType[] observacionesItem) {
           this.numeroItem = numeroItem;
           this.nombreItem = nombreItem;
           this.atributos = atributos;
           this.arancel = arancel;
           this.medida = medida;
           this.cantidadMercancia = cantidadMercancia;
           this.FOBUnitario = FOBUnitario;
           this.FOBDollar = FOBDollar;
           this.observacionesItem = observacionesItem;
    }


    /**
     * Gets the numeroItem value for this InformeVariacionValorItem.
     * 
     * @return numeroItem   * Número correlativo de Item
     */
    public org.apache.axis.types.PositiveInteger getNumeroItem() {
        return numeroItem;
    }


    /**
     * Sets the numeroItem value for this InformeVariacionValorItem.
     * 
     * @param numeroItem   * Número correlativo de Item
     */
    public void setNumeroItem(org.apache.axis.types.PositiveInteger numeroItem) {
        this.numeroItem = numeroItem;
    }


    /**
     * Gets the nombreItem value for this InformeVariacionValorItem.
     * 
     * @return nombreItem   * Nombre del Producto
     */
    public java.lang.String getNombreItem() {
        return nombreItem;
    }


    /**
     * Sets the nombreItem value for this InformeVariacionValorItem.
     * 
     * @param nombreItem   * Nombre del Producto
     */
    public void setNombreItem(java.lang.String nombreItem) {
        this.nombreItem = nombreItem;
    }


    /**
     * Gets the atributos value for this InformeVariacionValorItem.
     * 
     * @return atributos   * Características del Producto
     */
    public java.lang.String[] getAtributos() {
        return atributos;
    }


    /**
     * Sets the atributos value for this InformeVariacionValorItem.
     * 
     * @param atributos   * Características del Producto
     */
    public void setAtributos(java.lang.String[] atributos) {
        this.atributos = atributos;
    }

    public java.lang.String getAtributos(int i) {
        return this.atributos[i];
    }

    public void setAtributos(int i, java.lang.String _value) {
        this.atributos[i] = _value;
    }


    /**
     * Gets the arancel value for this InformeVariacionValorItem.
     * 
     * @return arancel   * Arancel del Producto
     */
    public java.lang.String getArancel() {
        return arancel;
    }


    /**
     * Sets the arancel value for this InformeVariacionValorItem.
     * 
     * @param arancel   * Arancel del Producto
     */
    public void setArancel(java.lang.String arancel) {
        this.arancel = arancel;
    }


    /**
     * Gets the medida value for this InformeVariacionValorItem.
     * 
     * @return medida   * Identificación de la medida del producto
     */
    public cl.gob.aem.valida.CodigoDescripcion2Type getMedida() {
        return medida;
    }


    /**
     * Sets the medida value for this InformeVariacionValorItem.
     * 
     * @param medida   * Identificación de la medida del producto
     */
    public void setMedida(cl.gob.aem.valida.CodigoDescripcion2Type medida) {
        this.medida = medida;
    }


    /**
     * Gets the cantidadMercancia value for this InformeVariacionValorItem.
     * 
     * @return cantidadMercancia   * Cantidad de la Mercancía
     */
    public java.math.BigDecimal getCantidadMercancia() {
        return cantidadMercancia;
    }


    /**
     * Sets the cantidadMercancia value for this InformeVariacionValorItem.
     * 
     * @param cantidadMercancia   * Cantidad de la Mercancía
     */
    public void setCantidadMercancia(java.math.BigDecimal cantidadMercancia) {
        this.cantidadMercancia = cantidadMercancia;
    }


    /**
     * Gets the FOBUnitario value for this InformeVariacionValorItem.
     * 
     * @return FOBUnitario   * FOB Unitario del Item
     */
    public java.math.BigDecimal getFOBUnitario() {
        return FOBUnitario;
    }


    /**
     * Sets the FOBUnitario value for this InformeVariacionValorItem.
     * 
     * @param FOBUnitario   * FOB Unitario del Item
     */
    public void setFOBUnitario(java.math.BigDecimal FOBUnitario) {
        this.FOBUnitario = FOBUnitario;
    }


    /**
     * Gets the FOBDollar value for this InformeVariacionValorItem.
     * 
     * @return FOBDollar   * FOB dólar
     */
    public java.math.BigDecimal getFOBDollar() {
        return FOBDollar;
    }


    /**
     * Sets the FOBDollar value for this InformeVariacionValorItem.
     * 
     * @param FOBDollar   * FOB dólar
     */
    public void setFOBDollar(java.math.BigDecimal FOBDollar) {
        this.FOBDollar = FOBDollar;
    }


    /**
     * Gets the observacionesItem value for this InformeVariacionValorItem.
     * 
     * @return observacionesItem   * Observaciones al item
     */
    public cl.gob.aem.valida.ObservacionCodificadaType[] getObservacionesItem() {
        return observacionesItem;
    }


    /**
     * Sets the observacionesItem value for this InformeVariacionValorItem.
     * 
     * @param observacionesItem   * Observaciones al item
     */
    public void setObservacionesItem(cl.gob.aem.valida.ObservacionCodificadaType[] observacionesItem) {
        this.observacionesItem = observacionesItem;
    }

    public cl.gob.aem.valida.ObservacionCodificadaType getObservacionesItem(int i) {
        return this.observacionesItem[i];
    }

    public void setObservacionesItem(int i, cl.gob.aem.valida.ObservacionCodificadaType _value) {
        this.observacionesItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformeVariacionValorItem)) return false;
        InformeVariacionValorItem other = (InformeVariacionValorItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroItem==null && other.getNumeroItem()==null) || 
             (this.numeroItem!=null &&
              this.numeroItem.equals(other.getNumeroItem()))) &&
            ((this.nombreItem==null && other.getNombreItem()==null) || 
             (this.nombreItem!=null &&
              this.nombreItem.equals(other.getNombreItem()))) &&
            ((this.atributos==null && other.getAtributos()==null) || 
             (this.atributos!=null &&
              java.util.Arrays.equals(this.atributos, other.getAtributos()))) &&
            ((this.arancel==null && other.getArancel()==null) || 
             (this.arancel!=null &&
              this.arancel.equals(other.getArancel()))) &&
            ((this.medida==null && other.getMedida()==null) || 
             (this.medida!=null &&
              this.medida.equals(other.getMedida()))) &&
            ((this.cantidadMercancia==null && other.getCantidadMercancia()==null) || 
             (this.cantidadMercancia!=null &&
              this.cantidadMercancia.equals(other.getCantidadMercancia()))) &&
            ((this.FOBUnitario==null && other.getFOBUnitario()==null) || 
             (this.FOBUnitario!=null &&
              this.FOBUnitario.equals(other.getFOBUnitario()))) &&
            ((this.FOBDollar==null && other.getFOBDollar()==null) || 
             (this.FOBDollar!=null &&
              this.FOBDollar.equals(other.getFOBDollar()))) &&
            ((this.observacionesItem==null && other.getObservacionesItem()==null) || 
             (this.observacionesItem!=null &&
              java.util.Arrays.equals(this.observacionesItem, other.getObservacionesItem())));
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
        if (getNumeroItem() != null) {
            _hashCode += getNumeroItem().hashCode();
        }
        if (getNombreItem() != null) {
            _hashCode += getNombreItem().hashCode();
        }
        if (getAtributos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtributos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtributos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArancel() != null) {
            _hashCode += getArancel().hashCode();
        }
        if (getMedida() != null) {
            _hashCode += getMedida().hashCode();
        }
        if (getCantidadMercancia() != null) {
            _hashCode += getCantidadMercancia().hashCode();
        }
        if (getFOBUnitario() != null) {
            _hashCode += getFOBUnitario().hashCode();
        }
        if (getFOBDollar() != null) {
            _hashCode += getFOBDollar().hashCode();
        }
        if (getObservacionesItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObservacionesItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObservacionesItem(), i);
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
        new org.apache.axis.description.TypeDesc(InformeVariacionValorItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>InformeVariacionValor>Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atributos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Atributos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>InformeVariacionValor>Item>Atributos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arancel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Arancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Medida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoDescripcion2Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadMercancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CantidadMercancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FOBUnitario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FOBUnitario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FOBDollar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FOBDollar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacionesItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ObservacionesItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ObservacionCodificadaType"));
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
