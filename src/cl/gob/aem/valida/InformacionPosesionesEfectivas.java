/**
 * InformacionPosesionesEfectivas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformacionPosesionesEfectivas  implements java.io.Serializable {
    private java.math.BigInteger nroResolucion;

    private cl.gob.aem.valida.FechaType fechaResolucion;

    private cl.gob.aem.valida.RunType runDirectorRegional;

    private java.math.BigInteger nroInscripcion;

    private cl.gob.aem.valida.FechaType fechaInscripcion;

    private cl.gob.aem.valida.NameType nombreCausante;

    private cl.gob.aem.valida.RunType runCausante;

    private cl.gob.aem.valida.FechaType fechaDefuncion;

    private cl.gob.aem.valida.NameType[] herederos;

    private cl.gob.aem.valida.FechaType fechaPublicacion;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public InformacionPosesionesEfectivas() {
    }

    public InformacionPosesionesEfectivas(
           java.math.BigInteger nroResolucion,
           cl.gob.aem.valida.FechaType fechaResolucion,
           cl.gob.aem.valida.RunType runDirectorRegional,
           java.math.BigInteger nroInscripcion,
           cl.gob.aem.valida.FechaType fechaInscripcion,
           cl.gob.aem.valida.NameType nombreCausante,
           cl.gob.aem.valida.RunType runCausante,
           cl.gob.aem.valida.FechaType fechaDefuncion,
           cl.gob.aem.valida.NameType[] herederos,
           cl.gob.aem.valida.FechaType fechaPublicacion,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.nroResolucion = nroResolucion;
           this.fechaResolucion = fechaResolucion;
           this.runDirectorRegional = runDirectorRegional;
           this.nroInscripcion = nroInscripcion;
           this.fechaInscripcion = fechaInscripcion;
           this.nombreCausante = nombreCausante;
           this.runCausante = runCausante;
           this.fechaDefuncion = fechaDefuncion;
           this.herederos = herederos;
           this.fechaPublicacion = fechaPublicacion;
           this.signature = signature;
    }


    /**
     * Gets the nroResolucion value for this InformacionPosesionesEfectivas.
     * 
     * @return nroResolucion
     */
    public java.math.BigInteger getNroResolucion() {
        return nroResolucion;
    }


    /**
     * Sets the nroResolucion value for this InformacionPosesionesEfectivas.
     * 
     * @param nroResolucion
     */
    public void setNroResolucion(java.math.BigInteger nroResolucion) {
        this.nroResolucion = nroResolucion;
    }


    /**
     * Gets the fechaResolucion value for this InformacionPosesionesEfectivas.
     * 
     * @return fechaResolucion
     */
    public cl.gob.aem.valida.FechaType getFechaResolucion() {
        return fechaResolucion;
    }


    /**
     * Sets the fechaResolucion value for this InformacionPosesionesEfectivas.
     * 
     * @param fechaResolucion
     */
    public void setFechaResolucion(cl.gob.aem.valida.FechaType fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }


    /**
     * Gets the runDirectorRegional value for this InformacionPosesionesEfectivas.
     * 
     * @return runDirectorRegional
     */
    public cl.gob.aem.valida.RunType getRunDirectorRegional() {
        return runDirectorRegional;
    }


    /**
     * Sets the runDirectorRegional value for this InformacionPosesionesEfectivas.
     * 
     * @param runDirectorRegional
     */
    public void setRunDirectorRegional(cl.gob.aem.valida.RunType runDirectorRegional) {
        this.runDirectorRegional = runDirectorRegional;
    }


    /**
     * Gets the nroInscripcion value for this InformacionPosesionesEfectivas.
     * 
     * @return nroInscripcion
     */
    public java.math.BigInteger getNroInscripcion() {
        return nroInscripcion;
    }


    /**
     * Sets the nroInscripcion value for this InformacionPosesionesEfectivas.
     * 
     * @param nroInscripcion
     */
    public void setNroInscripcion(java.math.BigInteger nroInscripcion) {
        this.nroInscripcion = nroInscripcion;
    }


    /**
     * Gets the fechaInscripcion value for this InformacionPosesionesEfectivas.
     * 
     * @return fechaInscripcion
     */
    public cl.gob.aem.valida.FechaType getFechaInscripcion() {
        return fechaInscripcion;
    }


    /**
     * Sets the fechaInscripcion value for this InformacionPosesionesEfectivas.
     * 
     * @param fechaInscripcion
     */
    public void setFechaInscripcion(cl.gob.aem.valida.FechaType fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }


    /**
     * Gets the nombreCausante value for this InformacionPosesionesEfectivas.
     * 
     * @return nombreCausante
     */
    public cl.gob.aem.valida.NameType getNombreCausante() {
        return nombreCausante;
    }


    /**
     * Sets the nombreCausante value for this InformacionPosesionesEfectivas.
     * 
     * @param nombreCausante
     */
    public void setNombreCausante(cl.gob.aem.valida.NameType nombreCausante) {
        this.nombreCausante = nombreCausante;
    }


    /**
     * Gets the runCausante value for this InformacionPosesionesEfectivas.
     * 
     * @return runCausante
     */
    public cl.gob.aem.valida.RunType getRunCausante() {
        return runCausante;
    }


    /**
     * Sets the runCausante value for this InformacionPosesionesEfectivas.
     * 
     * @param runCausante
     */
    public void setRunCausante(cl.gob.aem.valida.RunType runCausante) {
        this.runCausante = runCausante;
    }


    /**
     * Gets the fechaDefuncion value for this InformacionPosesionesEfectivas.
     * 
     * @return fechaDefuncion
     */
    public cl.gob.aem.valida.FechaType getFechaDefuncion() {
        return fechaDefuncion;
    }


    /**
     * Sets the fechaDefuncion value for this InformacionPosesionesEfectivas.
     * 
     * @param fechaDefuncion
     */
    public void setFechaDefuncion(cl.gob.aem.valida.FechaType fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }


    /**
     * Gets the herederos value for this InformacionPosesionesEfectivas.
     * 
     * @return herederos
     */
    public cl.gob.aem.valida.NameType[] getHerederos() {
        return herederos;
    }


    /**
     * Sets the herederos value for this InformacionPosesionesEfectivas.
     * 
     * @param herederos
     */
    public void setHerederos(cl.gob.aem.valida.NameType[] herederos) {
        this.herederos = herederos;
    }


    /**
     * Gets the fechaPublicacion value for this InformacionPosesionesEfectivas.
     * 
     * @return fechaPublicacion
     */
    public cl.gob.aem.valida.FechaType getFechaPublicacion() {
        return fechaPublicacion;
    }


    /**
     * Sets the fechaPublicacion value for this InformacionPosesionesEfectivas.
     * 
     * @param fechaPublicacion
     */
    public void setFechaPublicacion(cl.gob.aem.valida.FechaType fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }


    /**
     * Gets the signature value for this InformacionPosesionesEfectivas.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this InformacionPosesionesEfectivas.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacionPosesionesEfectivas)) return false;
        InformacionPosesionesEfectivas other = (InformacionPosesionesEfectivas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroResolucion==null && other.getNroResolucion()==null) || 
             (this.nroResolucion!=null &&
              this.nroResolucion.equals(other.getNroResolucion()))) &&
            ((this.fechaResolucion==null && other.getFechaResolucion()==null) || 
             (this.fechaResolucion!=null &&
              this.fechaResolucion.equals(other.getFechaResolucion()))) &&
            ((this.runDirectorRegional==null && other.getRunDirectorRegional()==null) || 
             (this.runDirectorRegional!=null &&
              this.runDirectorRegional.equals(other.getRunDirectorRegional()))) &&
            ((this.nroInscripcion==null && other.getNroInscripcion()==null) || 
             (this.nroInscripcion!=null &&
              this.nroInscripcion.equals(other.getNroInscripcion()))) &&
            ((this.fechaInscripcion==null && other.getFechaInscripcion()==null) || 
             (this.fechaInscripcion!=null &&
              this.fechaInscripcion.equals(other.getFechaInscripcion()))) &&
            ((this.nombreCausante==null && other.getNombreCausante()==null) || 
             (this.nombreCausante!=null &&
              this.nombreCausante.equals(other.getNombreCausante()))) &&
            ((this.runCausante==null && other.getRunCausante()==null) || 
             (this.runCausante!=null &&
              this.runCausante.equals(other.getRunCausante()))) &&
            ((this.fechaDefuncion==null && other.getFechaDefuncion()==null) || 
             (this.fechaDefuncion!=null &&
              this.fechaDefuncion.equals(other.getFechaDefuncion()))) &&
            ((this.herederos==null && other.getHerederos()==null) || 
             (this.herederos!=null &&
              java.util.Arrays.equals(this.herederos, other.getHerederos()))) &&
            ((this.fechaPublicacion==null && other.getFechaPublicacion()==null) || 
             (this.fechaPublicacion!=null &&
              this.fechaPublicacion.equals(other.getFechaPublicacion()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature())));
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
        if (getNroResolucion() != null) {
            _hashCode += getNroResolucion().hashCode();
        }
        if (getFechaResolucion() != null) {
            _hashCode += getFechaResolucion().hashCode();
        }
        if (getRunDirectorRegional() != null) {
            _hashCode += getRunDirectorRegional().hashCode();
        }
        if (getNroInscripcion() != null) {
            _hashCode += getNroInscripcion().hashCode();
        }
        if (getFechaInscripcion() != null) {
            _hashCode += getFechaInscripcion().hashCode();
        }
        if (getNombreCausante() != null) {
            _hashCode += getNombreCausante().hashCode();
        }
        if (getRunCausante() != null) {
            _hashCode += getRunCausante().hashCode();
        }
        if (getFechaDefuncion() != null) {
            _hashCode += getFechaDefuncion().hashCode();
        }
        if (getHerederos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHerederos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHerederos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFechaPublicacion() != null) {
            _hashCode += getFechaPublicacion().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacionPosesionesEfectivas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">informacionPosesionesEfectivas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroResolucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nroResolucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaResolucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaResolucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runDirectorRegional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runDirectorRegional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nroInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCausante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreCausante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runCausante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runCausante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("herederos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "herederos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreHeredero"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPublicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaPublicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureType"));
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
