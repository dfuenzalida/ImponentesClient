/**
 * Programa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class Programa  implements java.io.Serializable {
    /* ID del Programa */
    private java.lang.String id;

    /* Fecha de Ingreso al Programa */
    private java.util.Date fechaIngreso;

    /* Número de Serie asociado al  programa */
    private java.math.BigInteger cohorte;

    /* Fase en que la persona está en el programa */
    private cl.gob.aem.valida.ProgramaFase fase;

    /* Código de la comuna en que fue otorgado el beneficio */
    private cl.gob.aem.valida.CodigoComunaValores comuna;

    public Programa() {
    }

    public Programa(
           java.lang.String id,
           java.util.Date fechaIngreso,
           java.math.BigInteger cohorte,
           cl.gob.aem.valida.ProgramaFase fase,
           cl.gob.aem.valida.CodigoComunaValores comuna) {
           this.id = id;
           this.fechaIngreso = fechaIngreso;
           this.cohorte = cohorte;
           this.fase = fase;
           this.comuna = comuna;
    }


    /**
     * Gets the id value for this Programa.
     * 
     * @return id   * ID del Programa
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Programa.
     * 
     * @param id   * ID del Programa
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the fechaIngreso value for this Programa.
     * 
     * @return fechaIngreso   * Fecha de Ingreso al Programa
     */
    public java.util.Date getFechaIngreso() {
        return fechaIngreso;
    }


    /**
     * Sets the fechaIngreso value for this Programa.
     * 
     * @param fechaIngreso   * Fecha de Ingreso al Programa
     */
    public void setFechaIngreso(java.util.Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    /**
     * Gets the cohorte value for this Programa.
     * 
     * @return cohorte   * Número de Serie asociado al  programa
     */
    public java.math.BigInteger getCohorte() {
        return cohorte;
    }


    /**
     * Sets the cohorte value for this Programa.
     * 
     * @param cohorte   * Número de Serie asociado al  programa
     */
    public void setCohorte(java.math.BigInteger cohorte) {
        this.cohorte = cohorte;
    }


    /**
     * Gets the fase value for this Programa.
     * 
     * @return fase   * Fase en que la persona está en el programa
     */
    public cl.gob.aem.valida.ProgramaFase getFase() {
        return fase;
    }


    /**
     * Sets the fase value for this Programa.
     * 
     * @param fase   * Fase en que la persona está en el programa
     */
    public void setFase(cl.gob.aem.valida.ProgramaFase fase) {
        this.fase = fase;
    }


    /**
     * Gets the comuna value for this Programa.
     * 
     * @return comuna   * Código de la comuna en que fue otorgado el beneficio
     */
    public cl.gob.aem.valida.CodigoComunaValores getComuna() {
        return comuna;
    }


    /**
     * Sets the comuna value for this Programa.
     * 
     * @param comuna   * Código de la comuna en que fue otorgado el beneficio
     */
    public void setComuna(cl.gob.aem.valida.CodigoComunaValores comuna) {
        this.comuna = comuna;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Programa)) return false;
        Programa other = (Programa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.fechaIngreso==null && other.getFechaIngreso()==null) || 
             (this.fechaIngreso!=null &&
              this.fechaIngreso.equals(other.getFechaIngreso()))) &&
            ((this.cohorte==null && other.getCohorte()==null) || 
             (this.cohorte!=null &&
              this.cohorte.equals(other.getCohorte()))) &&
            ((this.fase==null && other.getFase()==null) || 
             (this.fase!=null &&
              this.fase.equals(other.getFase()))) &&
            ((this.comuna==null && other.getComuna()==null) || 
             (this.comuna!=null &&
              this.comuna.equals(other.getComuna())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getFechaIngreso() != null) {
            _hashCode += getFechaIngreso().hashCode();
        }
        if (getCohorte() != null) {
            _hashCode += getCohorte().hashCode();
        }
        if (getFase() != null) {
            _hashCode += getFase().hashCode();
        }
        if (getComuna() != null) {
            _hashCode += getComuna().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Programa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Programa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaIngreso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaIngreso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cohorte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Cohorte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Fase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">Programa>Fase"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comuna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Comuna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "codigoComunaValores"));
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
