/**
 * FechaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class FechaType  implements java.io.Serializable {
    private java.util.Date fechaValida;

    private java.lang.String fechaTruncada;

    private java.util.Calendar fechaHoraValida;

    private org.apache.axis.types.YearMonth fechaAgnoMes;

    private java.math.BigDecimal fechaUNIX;

    public FechaType() {
    }

    public FechaType(
           java.util.Date fechaValida,
           java.lang.String fechaTruncada,
           java.util.Calendar fechaHoraValida,
           org.apache.axis.types.YearMonth fechaAgnoMes,
           java.math.BigDecimal fechaUNIX) {
           this.fechaValida = fechaValida;
           this.fechaTruncada = fechaTruncada;
           this.fechaHoraValida = fechaHoraValida;
           this.fechaAgnoMes = fechaAgnoMes;
           this.fechaUNIX = fechaUNIX;
    }


    /**
     * Gets the fechaValida value for this FechaType.
     * 
     * @return fechaValida
     */
    public java.util.Date getFechaValida() {
        return fechaValida;
    }


    /**
     * Sets the fechaValida value for this FechaType.
     * 
     * @param fechaValida
     */
    public void setFechaValida(java.util.Date fechaValida) {
        this.fechaValida = fechaValida;
    }


    /**
     * Gets the fechaTruncada value for this FechaType.
     * 
     * @return fechaTruncada
     */
    public java.lang.String getFechaTruncada() {
        return fechaTruncada;
    }


    /**
     * Sets the fechaTruncada value for this FechaType.
     * 
     * @param fechaTruncada
     */
    public void setFechaTruncada(java.lang.String fechaTruncada) {
        this.fechaTruncada = fechaTruncada;
    }


    /**
     * Gets the fechaHoraValida value for this FechaType.
     * 
     * @return fechaHoraValida
     */
    public java.util.Calendar getFechaHoraValida() {
        return fechaHoraValida;
    }


    /**
     * Sets the fechaHoraValida value for this FechaType.
     * 
     * @param fechaHoraValida
     */
    public void setFechaHoraValida(java.util.Calendar fechaHoraValida) {
        this.fechaHoraValida = fechaHoraValida;
    }


    /**
     * Gets the fechaAgnoMes value for this FechaType.
     * 
     * @return fechaAgnoMes
     */
    public org.apache.axis.types.YearMonth getFechaAgnoMes() {
        return fechaAgnoMes;
    }


    /**
     * Sets the fechaAgnoMes value for this FechaType.
     * 
     * @param fechaAgnoMes
     */
    public void setFechaAgnoMes(org.apache.axis.types.YearMonth fechaAgnoMes) {
        this.fechaAgnoMes = fechaAgnoMes;
    }


    /**
     * Gets the fechaUNIX value for this FechaType.
     * 
     * @return fechaUNIX
     */
    public java.math.BigDecimal getFechaUNIX() {
        return fechaUNIX;
    }


    /**
     * Sets the fechaUNIX value for this FechaType.
     * 
     * @param fechaUNIX
     */
    public void setFechaUNIX(java.math.BigDecimal fechaUNIX) {
        this.fechaUNIX = fechaUNIX;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FechaType)) return false;
        FechaType other = (FechaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaValida==null && other.getFechaValida()==null) || 
             (this.fechaValida!=null &&
              this.fechaValida.equals(other.getFechaValida()))) &&
            ((this.fechaTruncada==null && other.getFechaTruncada()==null) || 
             (this.fechaTruncada!=null &&
              this.fechaTruncada.equals(other.getFechaTruncada()))) &&
            ((this.fechaHoraValida==null && other.getFechaHoraValida()==null) || 
             (this.fechaHoraValida!=null &&
              this.fechaHoraValida.equals(other.getFechaHoraValida()))) &&
            ((this.fechaAgnoMes==null && other.getFechaAgnoMes()==null) || 
             (this.fechaAgnoMes!=null &&
              this.fechaAgnoMes.equals(other.getFechaAgnoMes()))) &&
            ((this.fechaUNIX==null && other.getFechaUNIX()==null) || 
             (this.fechaUNIX!=null &&
              this.fechaUNIX.equals(other.getFechaUNIX())));
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
        if (getFechaValida() != null) {
            _hashCode += getFechaValida().hashCode();
        }
        if (getFechaTruncada() != null) {
            _hashCode += getFechaTruncada().hashCode();
        }
        if (getFechaHoraValida() != null) {
            _hashCode += getFechaHoraValida().hashCode();
        }
        if (getFechaAgnoMes() != null) {
            _hashCode += getFechaAgnoMes().hashCode();
        }
        if (getFechaUNIX() != null) {
            _hashCode += getFechaUNIX().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FechaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaValida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaValida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaTruncada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaTruncada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHoraValida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaHoraValida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAgnoMes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaAgnoMes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYearMonth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaUNIX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaUNIX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
