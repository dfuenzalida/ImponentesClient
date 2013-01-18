/**
 * MatrimonioType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class MatrimonioType  extends cl.gob.aem.valida.DatosPersonaType  implements java.io.Serializable {
    private cl.gob.aem.valida.FechaType fechaInscripcionMatrimonio;

    private java.lang.String regimenConyugal;

    public MatrimonioType() {
    }

    public MatrimonioType(
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.NameType nombreCompleto,
           cl.gob.aem.valida.FechaType fechaNacimiento,
           cl.gob.aem.valida.FechaType fechaDefuncion,
           cl.gob.aem.valida.EstadoCivilValores estadoCivil,
           cl.gob.aem.valida.SexoValores sexo,
           cl.gob.aem.valida.FechaType fechaInscripcionMatrimonio,
           java.lang.String regimenConyugal) {
        super(
            run,
            nombreCompleto,
            fechaNacimiento,
            fechaDefuncion,
            estadoCivil,
            sexo);
        this.fechaInscripcionMatrimonio = fechaInscripcionMatrimonio;
        this.regimenConyugal = regimenConyugal;
    }


    /**
     * Gets the fechaInscripcionMatrimonio value for this MatrimonioType.
     * 
     * @return fechaInscripcionMatrimonio
     */
    public cl.gob.aem.valida.FechaType getFechaInscripcionMatrimonio() {
        return fechaInscripcionMatrimonio;
    }


    /**
     * Sets the fechaInscripcionMatrimonio value for this MatrimonioType.
     * 
     * @param fechaInscripcionMatrimonio
     */
    public void setFechaInscripcionMatrimonio(cl.gob.aem.valida.FechaType fechaInscripcionMatrimonio) {
        this.fechaInscripcionMatrimonio = fechaInscripcionMatrimonio;
    }


    /**
     * Gets the regimenConyugal value for this MatrimonioType.
     * 
     * @return regimenConyugal
     */
    public java.lang.String getRegimenConyugal() {
        return regimenConyugal;
    }


    /**
     * Sets the regimenConyugal value for this MatrimonioType.
     * 
     * @param regimenConyugal
     */
    public void setRegimenConyugal(java.lang.String regimenConyugal) {
        this.regimenConyugal = regimenConyugal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatrimonioType)) return false;
        MatrimonioType other = (MatrimonioType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fechaInscripcionMatrimonio==null && other.getFechaInscripcionMatrimonio()==null) || 
             (this.fechaInscripcionMatrimonio!=null &&
              this.fechaInscripcionMatrimonio.equals(other.getFechaInscripcionMatrimonio()))) &&
            ((this.regimenConyugal==null && other.getRegimenConyugal()==null) || 
             (this.regimenConyugal!=null &&
              this.regimenConyugal.equals(other.getRegimenConyugal())));
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
        if (getFechaInscripcionMatrimonio() != null) {
            _hashCode += getFechaInscripcionMatrimonio().hashCode();
        }
        if (getRegimenConyugal() != null) {
            _hashCode += getRegimenConyugal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatrimonioType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "matrimonioType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInscripcionMatrimonio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaInscripcionMatrimonio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regimenConyugal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "regimenConyugal"));
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
