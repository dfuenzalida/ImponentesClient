/**
 * CertificadoMatrimonio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoMatrimonio  implements java.io.Serializable {
    private java.math.BigInteger circunscripcion;

    private java.math.BigInteger nroInscripcion;

    private java.lang.String registro;

    private org.apache.axis.types.Year agno;

    private java.util.Date fechaInscripcion;

    private cl.gob.aem.valida.ContrayenteTypeDatosContrayente[] datosContrayentes;

    private java.util.Date fechaCelebracion;

    private org.apache.axis.types.Time horaCelebracion;

    private java.lang.String lugarCelebracion;

    private java.lang.String subInscripcion;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public CertificadoMatrimonio() {
    }

    public CertificadoMatrimonio(
           java.math.BigInteger circunscripcion,
           java.math.BigInteger nroInscripcion,
           java.lang.String registro,
           org.apache.axis.types.Year agno,
           java.util.Date fechaInscripcion,
           cl.gob.aem.valida.ContrayenteTypeDatosContrayente[] datosContrayentes,
           java.util.Date fechaCelebracion,
           org.apache.axis.types.Time horaCelebracion,
           java.lang.String lugarCelebracion,
           java.lang.String subInscripcion,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.circunscripcion = circunscripcion;
           this.nroInscripcion = nroInscripcion;
           this.registro = registro;
           this.agno = agno;
           this.fechaInscripcion = fechaInscripcion;
           this.datosContrayentes = datosContrayentes;
           this.fechaCelebracion = fechaCelebracion;
           this.horaCelebracion = horaCelebracion;
           this.lugarCelebracion = lugarCelebracion;
           this.subInscripcion = subInscripcion;
           this.signature = signature;
    }


    /**
     * Gets the circunscripcion value for this CertificadoMatrimonio.
     * 
     * @return circunscripcion
     */
    public java.math.BigInteger getCircunscripcion() {
        return circunscripcion;
    }


    /**
     * Sets the circunscripcion value for this CertificadoMatrimonio.
     * 
     * @param circunscripcion
     */
    public void setCircunscripcion(java.math.BigInteger circunscripcion) {
        this.circunscripcion = circunscripcion;
    }


    /**
     * Gets the nroInscripcion value for this CertificadoMatrimonio.
     * 
     * @return nroInscripcion
     */
    public java.math.BigInteger getNroInscripcion() {
        return nroInscripcion;
    }


    /**
     * Sets the nroInscripcion value for this CertificadoMatrimonio.
     * 
     * @param nroInscripcion
     */
    public void setNroInscripcion(java.math.BigInteger nroInscripcion) {
        this.nroInscripcion = nroInscripcion;
    }


    /**
     * Gets the registro value for this CertificadoMatrimonio.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this CertificadoMatrimonio.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the agno value for this CertificadoMatrimonio.
     * 
     * @return agno
     */
    public org.apache.axis.types.Year getAgno() {
        return agno;
    }


    /**
     * Sets the agno value for this CertificadoMatrimonio.
     * 
     * @param agno
     */
    public void setAgno(org.apache.axis.types.Year agno) {
        this.agno = agno;
    }


    /**
     * Gets the fechaInscripcion value for this CertificadoMatrimonio.
     * 
     * @return fechaInscripcion
     */
    public java.util.Date getFechaInscripcion() {
        return fechaInscripcion;
    }


    /**
     * Sets the fechaInscripcion value for this CertificadoMatrimonio.
     * 
     * @param fechaInscripcion
     */
    public void setFechaInscripcion(java.util.Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }


    /**
     * Gets the datosContrayentes value for this CertificadoMatrimonio.
     * 
     * @return datosContrayentes
     */
    public cl.gob.aem.valida.ContrayenteTypeDatosContrayente[] getDatosContrayentes() {
        return datosContrayentes;
    }


    /**
     * Sets the datosContrayentes value for this CertificadoMatrimonio.
     * 
     * @param datosContrayentes
     */
    public void setDatosContrayentes(cl.gob.aem.valida.ContrayenteTypeDatosContrayente[] datosContrayentes) {
        this.datosContrayentes = datosContrayentes;
    }


    /**
     * Gets the fechaCelebracion value for this CertificadoMatrimonio.
     * 
     * @return fechaCelebracion
     */
    public java.util.Date getFechaCelebracion() {
        return fechaCelebracion;
    }


    /**
     * Sets the fechaCelebracion value for this CertificadoMatrimonio.
     * 
     * @param fechaCelebracion
     */
    public void setFechaCelebracion(java.util.Date fechaCelebracion) {
        this.fechaCelebracion = fechaCelebracion;
    }


    /**
     * Gets the horaCelebracion value for this CertificadoMatrimonio.
     * 
     * @return horaCelebracion
     */
    public org.apache.axis.types.Time getHoraCelebracion() {
        return horaCelebracion;
    }


    /**
     * Sets the horaCelebracion value for this CertificadoMatrimonio.
     * 
     * @param horaCelebracion
     */
    public void setHoraCelebracion(org.apache.axis.types.Time horaCelebracion) {
        this.horaCelebracion = horaCelebracion;
    }


    /**
     * Gets the lugarCelebracion value for this CertificadoMatrimonio.
     * 
     * @return lugarCelebracion
     */
    public java.lang.String getLugarCelebracion() {
        return lugarCelebracion;
    }


    /**
     * Sets the lugarCelebracion value for this CertificadoMatrimonio.
     * 
     * @param lugarCelebracion
     */
    public void setLugarCelebracion(java.lang.String lugarCelebracion) {
        this.lugarCelebracion = lugarCelebracion;
    }


    /**
     * Gets the subInscripcion value for this CertificadoMatrimonio.
     * 
     * @return subInscripcion
     */
    public java.lang.String getSubInscripcion() {
        return subInscripcion;
    }


    /**
     * Sets the subInscripcion value for this CertificadoMatrimonio.
     * 
     * @param subInscripcion
     */
    public void setSubInscripcion(java.lang.String subInscripcion) {
        this.subInscripcion = subInscripcion;
    }


    /**
     * Gets the signature value for this CertificadoMatrimonio.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this CertificadoMatrimonio.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificadoMatrimonio)) return false;
        CertificadoMatrimonio other = (CertificadoMatrimonio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.circunscripcion==null && other.getCircunscripcion()==null) || 
             (this.circunscripcion!=null &&
              this.circunscripcion.equals(other.getCircunscripcion()))) &&
            ((this.nroInscripcion==null && other.getNroInscripcion()==null) || 
             (this.nroInscripcion!=null &&
              this.nroInscripcion.equals(other.getNroInscripcion()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.agno==null && other.getAgno()==null) || 
             (this.agno!=null &&
              this.agno.equals(other.getAgno()))) &&
            ((this.fechaInscripcion==null && other.getFechaInscripcion()==null) || 
             (this.fechaInscripcion!=null &&
              this.fechaInscripcion.equals(other.getFechaInscripcion()))) &&
            ((this.datosContrayentes==null && other.getDatosContrayentes()==null) || 
             (this.datosContrayentes!=null &&
              java.util.Arrays.equals(this.datosContrayentes, other.getDatosContrayentes()))) &&
            ((this.fechaCelebracion==null && other.getFechaCelebracion()==null) || 
             (this.fechaCelebracion!=null &&
              this.fechaCelebracion.equals(other.getFechaCelebracion()))) &&
            ((this.horaCelebracion==null && other.getHoraCelebracion()==null) || 
             (this.horaCelebracion!=null &&
              this.horaCelebracion.equals(other.getHoraCelebracion()))) &&
            ((this.lugarCelebracion==null && other.getLugarCelebracion()==null) || 
             (this.lugarCelebracion!=null &&
              this.lugarCelebracion.equals(other.getLugarCelebracion()))) &&
            ((this.subInscripcion==null && other.getSubInscripcion()==null) || 
             (this.subInscripcion!=null &&
              this.subInscripcion.equals(other.getSubInscripcion()))) &&
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
        if (getCircunscripcion() != null) {
            _hashCode += getCircunscripcion().hashCode();
        }
        if (getNroInscripcion() != null) {
            _hashCode += getNroInscripcion().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getAgno() != null) {
            _hashCode += getAgno().hashCode();
        }
        if (getFechaInscripcion() != null) {
            _hashCode += getFechaInscripcion().hashCode();
        }
        if (getDatosContrayentes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatosContrayentes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatosContrayentes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFechaCelebracion() != null) {
            _hashCode += getFechaCelebracion().hashCode();
        }
        if (getHoraCelebracion() != null) {
            _hashCode += getHoraCelebracion().hashCode();
        }
        if (getLugarCelebracion() != null) {
            _hashCode += getLugarCelebracion().hashCode();
        }
        if (getSubInscripcion() != null) {
            _hashCode += getSubInscripcion().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificadoMatrimonio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">certificadoMatrimonio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circunscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "circunscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nroInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "agno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosContrayentes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosContrayentes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">contrayenteType>datosContrayente"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosContrayente"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCelebracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaCelebracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaCelebracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "horaCelebracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lugarCelebracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "lugarCelebracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "subInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
