/**
 * PropietarioVehiculoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class PropietarioVehiculoType  implements java.io.Serializable {
    private cl.gob.aem.valida.NameType nombrePersonaNatural;

    private java.lang.String razonSocial;

    private cl.gob.aem.valida.RunType run;

    private cl.gob.aem.valida.FechaType fechaAdquisicion;

    private java.lang.String oficinaInscripcion;

    private java.math.BigInteger numeroOficina;

    public PropietarioVehiculoType() {
    }

    public PropietarioVehiculoType(
           cl.gob.aem.valida.NameType nombrePersonaNatural,
           java.lang.String razonSocial,
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.FechaType fechaAdquisicion,
           java.lang.String oficinaInscripcion,
           java.math.BigInteger numeroOficina) {
           this.nombrePersonaNatural = nombrePersonaNatural;
           this.razonSocial = razonSocial;
           this.run = run;
           this.fechaAdquisicion = fechaAdquisicion;
           this.oficinaInscripcion = oficinaInscripcion;
           this.numeroOficina = numeroOficina;
    }


    /**
     * Gets the nombrePersonaNatural value for this PropietarioVehiculoType.
     * 
     * @return nombrePersonaNatural
     */
    public cl.gob.aem.valida.NameType getNombrePersonaNatural() {
        return nombrePersonaNatural;
    }


    /**
     * Sets the nombrePersonaNatural value for this PropietarioVehiculoType.
     * 
     * @param nombrePersonaNatural
     */
    public void setNombrePersonaNatural(cl.gob.aem.valida.NameType nombrePersonaNatural) {
        this.nombrePersonaNatural = nombrePersonaNatural;
    }


    /**
     * Gets the razonSocial value for this PropietarioVehiculoType.
     * 
     * @return razonSocial
     */
    public java.lang.String getRazonSocial() {
        return razonSocial;
    }


    /**
     * Sets the razonSocial value for this PropietarioVehiculoType.
     * 
     * @param razonSocial
     */
    public void setRazonSocial(java.lang.String razonSocial) {
        this.razonSocial = razonSocial;
    }


    /**
     * Gets the run value for this PropietarioVehiculoType.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType getRun() {
        return run;
    }


    /**
     * Sets the run value for this PropietarioVehiculoType.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType run) {
        this.run = run;
    }


    /**
     * Gets the fechaAdquisicion value for this PropietarioVehiculoType.
     * 
     * @return fechaAdquisicion
     */
    public cl.gob.aem.valida.FechaType getFechaAdquisicion() {
        return fechaAdquisicion;
    }


    /**
     * Sets the fechaAdquisicion value for this PropietarioVehiculoType.
     * 
     * @param fechaAdquisicion
     */
    public void setFechaAdquisicion(cl.gob.aem.valida.FechaType fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }


    /**
     * Gets the oficinaInscripcion value for this PropietarioVehiculoType.
     * 
     * @return oficinaInscripcion
     */
    public java.lang.String getOficinaInscripcion() {
        return oficinaInscripcion;
    }


    /**
     * Sets the oficinaInscripcion value for this PropietarioVehiculoType.
     * 
     * @param oficinaInscripcion
     */
    public void setOficinaInscripcion(java.lang.String oficinaInscripcion) {
        this.oficinaInscripcion = oficinaInscripcion;
    }


    /**
     * Gets the numeroOficina value for this PropietarioVehiculoType.
     * 
     * @return numeroOficina
     */
    public java.math.BigInteger getNumeroOficina() {
        return numeroOficina;
    }


    /**
     * Sets the numeroOficina value for this PropietarioVehiculoType.
     * 
     * @param numeroOficina
     */
    public void setNumeroOficina(java.math.BigInteger numeroOficina) {
        this.numeroOficina = numeroOficina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropietarioVehiculoType)) return false;
        PropietarioVehiculoType other = (PropietarioVehiculoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombrePersonaNatural==null && other.getNombrePersonaNatural()==null) || 
             (this.nombrePersonaNatural!=null &&
              this.nombrePersonaNatural.equals(other.getNombrePersonaNatural()))) &&
            ((this.razonSocial==null && other.getRazonSocial()==null) || 
             (this.razonSocial!=null &&
              this.razonSocial.equals(other.getRazonSocial()))) &&
            ((this.run==null && other.getRun()==null) || 
             (this.run!=null &&
              this.run.equals(other.getRun()))) &&
            ((this.fechaAdquisicion==null && other.getFechaAdquisicion()==null) || 
             (this.fechaAdquisicion!=null &&
              this.fechaAdquisicion.equals(other.getFechaAdquisicion()))) &&
            ((this.oficinaInscripcion==null && other.getOficinaInscripcion()==null) || 
             (this.oficinaInscripcion!=null &&
              this.oficinaInscripcion.equals(other.getOficinaInscripcion()))) &&
            ((this.numeroOficina==null && other.getNumeroOficina()==null) || 
             (this.numeroOficina!=null &&
              this.numeroOficina.equals(other.getNumeroOficina())));
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
        if (getNombrePersonaNatural() != null) {
            _hashCode += getNombrePersonaNatural().hashCode();
        }
        if (getRazonSocial() != null) {
            _hashCode += getRazonSocial().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        if (getFechaAdquisicion() != null) {
            _hashCode += getFechaAdquisicion().hashCode();
        }
        if (getOficinaInscripcion() != null) {
            _hashCode += getOficinaInscripcion().hashCode();
        }
        if (getNumeroOficina() != null) {
            _hashCode += getNumeroOficina().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropietarioVehiculoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "propietarioVehiculoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePersonaNatural");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombrePersonaNatural"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razonSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "razonSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAdquisicion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaAdquisicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oficinaInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "oficinaInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroOficina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "numeroOficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
