/**
 * VehiculoLimitacionesDominioType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class VehiculoLimitacionesDominioType  extends cl.gob.aem.valida.VehiculoType  implements java.io.Serializable {
    private java.lang.String anotacion;

    private cl.gob.aem.valida.FechaType fechaRepertorio;

    private java.lang.String acreedor;

    private java.lang.String numeroDocumentoRol;

    private java.lang.String repertorio;

    private java.lang.String numeroRepertorio;

    public VehiculoLimitacionesDominioType() {
    }

    public VehiculoLimitacionesDominioType(
           java.lang.String tipo,
           java.lang.String aFabrica,
           java.lang.String marca,
           java.lang.String modelo,
           java.lang.String numeroMotor,
           java.lang.String numeroSerie,
           java.lang.String color,
           java.lang.String tipoCombustible,
           java.lang.String pesoBruto,
           java.lang.String chasis,
           java.lang.String vin,
           java.lang.String anotacion,
           cl.gob.aem.valida.FechaType fechaRepertorio,
           java.lang.String acreedor,
           java.lang.String numeroDocumentoRol,
           java.lang.String repertorio,
           java.lang.String numeroRepertorio) {
        super(
            tipo,
            aFabrica,
            marca,
            modelo,
            numeroMotor,
            numeroSerie,
            color,
            tipoCombustible,
            pesoBruto,
            chasis,
            vin);
        this.anotacion = anotacion;
        this.fechaRepertorio = fechaRepertorio;
        this.acreedor = acreedor;
        this.numeroDocumentoRol = numeroDocumentoRol;
        this.repertorio = repertorio;
        this.numeroRepertorio = numeroRepertorio;
    }


    /**
     * Gets the anotacion value for this VehiculoLimitacionesDominioType.
     * 
     * @return anotacion
     */
    public java.lang.String getAnotacion() {
        return anotacion;
    }


    /**
     * Sets the anotacion value for this VehiculoLimitacionesDominioType.
     * 
     * @param anotacion
     */
    public void setAnotacion(java.lang.String anotacion) {
        this.anotacion = anotacion;
    }


    /**
     * Gets the fechaRepertorio value for this VehiculoLimitacionesDominioType.
     * 
     * @return fechaRepertorio
     */
    public cl.gob.aem.valida.FechaType getFechaRepertorio() {
        return fechaRepertorio;
    }


    /**
     * Sets the fechaRepertorio value for this VehiculoLimitacionesDominioType.
     * 
     * @param fechaRepertorio
     */
    public void setFechaRepertorio(cl.gob.aem.valida.FechaType fechaRepertorio) {
        this.fechaRepertorio = fechaRepertorio;
    }


    /**
     * Gets the acreedor value for this VehiculoLimitacionesDominioType.
     * 
     * @return acreedor
     */
    public java.lang.String getAcreedor() {
        return acreedor;
    }


    /**
     * Sets the acreedor value for this VehiculoLimitacionesDominioType.
     * 
     * @param acreedor
     */
    public void setAcreedor(java.lang.String acreedor) {
        this.acreedor = acreedor;
    }


    /**
     * Gets the numeroDocumentoRol value for this VehiculoLimitacionesDominioType.
     * 
     * @return numeroDocumentoRol
     */
    public java.lang.String getNumeroDocumentoRol() {
        return numeroDocumentoRol;
    }


    /**
     * Sets the numeroDocumentoRol value for this VehiculoLimitacionesDominioType.
     * 
     * @param numeroDocumentoRol
     */
    public void setNumeroDocumentoRol(java.lang.String numeroDocumentoRol) {
        this.numeroDocumentoRol = numeroDocumentoRol;
    }


    /**
     * Gets the repertorio value for this VehiculoLimitacionesDominioType.
     * 
     * @return repertorio
     */
    public java.lang.String getRepertorio() {
        return repertorio;
    }


    /**
     * Sets the repertorio value for this VehiculoLimitacionesDominioType.
     * 
     * @param repertorio
     */
    public void setRepertorio(java.lang.String repertorio) {
        this.repertorio = repertorio;
    }


    /**
     * Gets the numeroRepertorio value for this VehiculoLimitacionesDominioType.
     * 
     * @return numeroRepertorio
     */
    public java.lang.String getNumeroRepertorio() {
        return numeroRepertorio;
    }


    /**
     * Sets the numeroRepertorio value for this VehiculoLimitacionesDominioType.
     * 
     * @param numeroRepertorio
     */
    public void setNumeroRepertorio(java.lang.String numeroRepertorio) {
        this.numeroRepertorio = numeroRepertorio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehiculoLimitacionesDominioType)) return false;
        VehiculoLimitacionesDominioType other = (VehiculoLimitacionesDominioType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.anotacion==null && other.getAnotacion()==null) || 
             (this.anotacion!=null &&
              this.anotacion.equals(other.getAnotacion()))) &&
            ((this.fechaRepertorio==null && other.getFechaRepertorio()==null) || 
             (this.fechaRepertorio!=null &&
              this.fechaRepertorio.equals(other.getFechaRepertorio()))) &&
            ((this.acreedor==null && other.getAcreedor()==null) || 
             (this.acreedor!=null &&
              this.acreedor.equals(other.getAcreedor()))) &&
            ((this.numeroDocumentoRol==null && other.getNumeroDocumentoRol()==null) || 
             (this.numeroDocumentoRol!=null &&
              this.numeroDocumentoRol.equals(other.getNumeroDocumentoRol()))) &&
            ((this.repertorio==null && other.getRepertorio()==null) || 
             (this.repertorio!=null &&
              this.repertorio.equals(other.getRepertorio()))) &&
            ((this.numeroRepertorio==null && other.getNumeroRepertorio()==null) || 
             (this.numeroRepertorio!=null &&
              this.numeroRepertorio.equals(other.getNumeroRepertorio())));
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
        if (getAnotacion() != null) {
            _hashCode += getAnotacion().hashCode();
        }
        if (getFechaRepertorio() != null) {
            _hashCode += getFechaRepertorio().hashCode();
        }
        if (getAcreedor() != null) {
            _hashCode += getAcreedor().hashCode();
        }
        if (getNumeroDocumentoRol() != null) {
            _hashCode += getNumeroDocumentoRol().hashCode();
        }
        if (getRepertorio() != null) {
            _hashCode += getRepertorio().hashCode();
        }
        if (getNumeroRepertorio() != null) {
            _hashCode += getNumeroRepertorio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehiculoLimitacionesDominioType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "vehiculoLimitacionesDominioType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anotacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "anotacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRepertorio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaRepertorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acreedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "acreedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumentoRol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "numeroDocumentoRol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repertorio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "repertorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRepertorio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "numeroRepertorio"));
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
