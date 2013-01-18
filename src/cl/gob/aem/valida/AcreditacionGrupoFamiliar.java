/**
 * AcreditacionGrupoFamiliar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class AcreditacionGrupoFamiliar  implements java.io.Serializable {
    private cl.gob.aem.valida.AcreditacionPersonaType datosCausante;

    private cl.gob.aem.valida.AcreditacionPersonaType datosHijo;

    private cl.gob.aem.valida.AcreditacionPersonaType datosConyuge;

    private java.util.Date fechaInscripcionMatrimonio;

    private java.math.BigInteger partidaMatrimonio;

    private java.lang.String registroMatrimonio;

    private org.apache.axis.types.Year agnoInscripcion;

    private java.lang.String numeroOficina;

    private java.lang.String oficina;

    private java.lang.String regimenConyugal;

    private java.lang.String subInscripcion;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public AcreditacionGrupoFamiliar() {
    }

    public AcreditacionGrupoFamiliar(
           cl.gob.aem.valida.AcreditacionPersonaType datosCausante,
           cl.gob.aem.valida.AcreditacionPersonaType datosHijo,
           cl.gob.aem.valida.AcreditacionPersonaType datosConyuge,
           java.util.Date fechaInscripcionMatrimonio,
           java.math.BigInteger partidaMatrimonio,
           java.lang.String registroMatrimonio,
           org.apache.axis.types.Year agnoInscripcion,
           java.lang.String numeroOficina,
           java.lang.String oficina,
           java.lang.String regimenConyugal,
           java.lang.String subInscripcion,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.datosCausante = datosCausante;
           this.datosHijo = datosHijo;
           this.datosConyuge = datosConyuge;
           this.fechaInscripcionMatrimonio = fechaInscripcionMatrimonio;
           this.partidaMatrimonio = partidaMatrimonio;
           this.registroMatrimonio = registroMatrimonio;
           this.agnoInscripcion = agnoInscripcion;
           this.numeroOficina = numeroOficina;
           this.oficina = oficina;
           this.regimenConyugal = regimenConyugal;
           this.subInscripcion = subInscripcion;
           this.signature = signature;
    }


    /**
     * Gets the datosCausante value for this AcreditacionGrupoFamiliar.
     * 
     * @return datosCausante
     */
    public cl.gob.aem.valida.AcreditacionPersonaType getDatosCausante() {
        return datosCausante;
    }


    /**
     * Sets the datosCausante value for this AcreditacionGrupoFamiliar.
     * 
     * @param datosCausante
     */
    public void setDatosCausante(cl.gob.aem.valida.AcreditacionPersonaType datosCausante) {
        this.datosCausante = datosCausante;
    }


    /**
     * Gets the datosHijo value for this AcreditacionGrupoFamiliar.
     * 
     * @return datosHijo
     */
    public cl.gob.aem.valida.AcreditacionPersonaType getDatosHijo() {
        return datosHijo;
    }


    /**
     * Sets the datosHijo value for this AcreditacionGrupoFamiliar.
     * 
     * @param datosHijo
     */
    public void setDatosHijo(cl.gob.aem.valida.AcreditacionPersonaType datosHijo) {
        this.datosHijo = datosHijo;
    }


    /**
     * Gets the datosConyuge value for this AcreditacionGrupoFamiliar.
     * 
     * @return datosConyuge
     */
    public cl.gob.aem.valida.AcreditacionPersonaType getDatosConyuge() {
        return datosConyuge;
    }


    /**
     * Sets the datosConyuge value for this AcreditacionGrupoFamiliar.
     * 
     * @param datosConyuge
     */
    public void setDatosConyuge(cl.gob.aem.valida.AcreditacionPersonaType datosConyuge) {
        this.datosConyuge = datosConyuge;
    }


    /**
     * Gets the fechaInscripcionMatrimonio value for this AcreditacionGrupoFamiliar.
     * 
     * @return fechaInscripcionMatrimonio
     */
    public java.util.Date getFechaInscripcionMatrimonio() {
        return fechaInscripcionMatrimonio;
    }


    /**
     * Sets the fechaInscripcionMatrimonio value for this AcreditacionGrupoFamiliar.
     * 
     * @param fechaInscripcionMatrimonio
     */
    public void setFechaInscripcionMatrimonio(java.util.Date fechaInscripcionMatrimonio) {
        this.fechaInscripcionMatrimonio = fechaInscripcionMatrimonio;
    }


    /**
     * Gets the partidaMatrimonio value for this AcreditacionGrupoFamiliar.
     * 
     * @return partidaMatrimonio
     */
    public java.math.BigInteger getPartidaMatrimonio() {
        return partidaMatrimonio;
    }


    /**
     * Sets the partidaMatrimonio value for this AcreditacionGrupoFamiliar.
     * 
     * @param partidaMatrimonio
     */
    public void setPartidaMatrimonio(java.math.BigInteger partidaMatrimonio) {
        this.partidaMatrimonio = partidaMatrimonio;
    }


    /**
     * Gets the registroMatrimonio value for this AcreditacionGrupoFamiliar.
     * 
     * @return registroMatrimonio
     */
    public java.lang.String getRegistroMatrimonio() {
        return registroMatrimonio;
    }


    /**
     * Sets the registroMatrimonio value for this AcreditacionGrupoFamiliar.
     * 
     * @param registroMatrimonio
     */
    public void setRegistroMatrimonio(java.lang.String registroMatrimonio) {
        this.registroMatrimonio = registroMatrimonio;
    }


    /**
     * Gets the agnoInscripcion value for this AcreditacionGrupoFamiliar.
     * 
     * @return agnoInscripcion
     */
    public org.apache.axis.types.Year getAgnoInscripcion() {
        return agnoInscripcion;
    }


    /**
     * Sets the agnoInscripcion value for this AcreditacionGrupoFamiliar.
     * 
     * @param agnoInscripcion
     */
    public void setAgnoInscripcion(org.apache.axis.types.Year agnoInscripcion) {
        this.agnoInscripcion = agnoInscripcion;
    }


    /**
     * Gets the numeroOficina value for this AcreditacionGrupoFamiliar.
     * 
     * @return numeroOficina
     */
    public java.lang.String getNumeroOficina() {
        return numeroOficina;
    }


    /**
     * Sets the numeroOficina value for this AcreditacionGrupoFamiliar.
     * 
     * @param numeroOficina
     */
    public void setNumeroOficina(java.lang.String numeroOficina) {
        this.numeroOficina = numeroOficina;
    }


    /**
     * Gets the oficina value for this AcreditacionGrupoFamiliar.
     * 
     * @return oficina
     */
    public java.lang.String getOficina() {
        return oficina;
    }


    /**
     * Sets the oficina value for this AcreditacionGrupoFamiliar.
     * 
     * @param oficina
     */
    public void setOficina(java.lang.String oficina) {
        this.oficina = oficina;
    }


    /**
     * Gets the regimenConyugal value for this AcreditacionGrupoFamiliar.
     * 
     * @return regimenConyugal
     */
    public java.lang.String getRegimenConyugal() {
        return regimenConyugal;
    }


    /**
     * Sets the regimenConyugal value for this AcreditacionGrupoFamiliar.
     * 
     * @param regimenConyugal
     */
    public void setRegimenConyugal(java.lang.String regimenConyugal) {
        this.regimenConyugal = regimenConyugal;
    }


    /**
     * Gets the subInscripcion value for this AcreditacionGrupoFamiliar.
     * 
     * @return subInscripcion
     */
    public java.lang.String getSubInscripcion() {
        return subInscripcion;
    }


    /**
     * Sets the subInscripcion value for this AcreditacionGrupoFamiliar.
     * 
     * @param subInscripcion
     */
    public void setSubInscripcion(java.lang.String subInscripcion) {
        this.subInscripcion = subInscripcion;
    }


    /**
     * Gets the signature value for this AcreditacionGrupoFamiliar.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this AcreditacionGrupoFamiliar.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcreditacionGrupoFamiliar)) return false;
        AcreditacionGrupoFamiliar other = (AcreditacionGrupoFamiliar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosCausante==null && other.getDatosCausante()==null) || 
             (this.datosCausante!=null &&
              this.datosCausante.equals(other.getDatosCausante()))) &&
            ((this.datosHijo==null && other.getDatosHijo()==null) || 
             (this.datosHijo!=null &&
              this.datosHijo.equals(other.getDatosHijo()))) &&
            ((this.datosConyuge==null && other.getDatosConyuge()==null) || 
             (this.datosConyuge!=null &&
              this.datosConyuge.equals(other.getDatosConyuge()))) &&
            ((this.fechaInscripcionMatrimonio==null && other.getFechaInscripcionMatrimonio()==null) || 
             (this.fechaInscripcionMatrimonio!=null &&
              this.fechaInscripcionMatrimonio.equals(other.getFechaInscripcionMatrimonio()))) &&
            ((this.partidaMatrimonio==null && other.getPartidaMatrimonio()==null) || 
             (this.partidaMatrimonio!=null &&
              this.partidaMatrimonio.equals(other.getPartidaMatrimonio()))) &&
            ((this.registroMatrimonio==null && other.getRegistroMatrimonio()==null) || 
             (this.registroMatrimonio!=null &&
              this.registroMatrimonio.equals(other.getRegistroMatrimonio()))) &&
            ((this.agnoInscripcion==null && other.getAgnoInscripcion()==null) || 
             (this.agnoInscripcion!=null &&
              this.agnoInscripcion.equals(other.getAgnoInscripcion()))) &&
            ((this.numeroOficina==null && other.getNumeroOficina()==null) || 
             (this.numeroOficina!=null &&
              this.numeroOficina.equals(other.getNumeroOficina()))) &&
            ((this.oficina==null && other.getOficina()==null) || 
             (this.oficina!=null &&
              this.oficina.equals(other.getOficina()))) &&
            ((this.regimenConyugal==null && other.getRegimenConyugal()==null) || 
             (this.regimenConyugal!=null &&
              this.regimenConyugal.equals(other.getRegimenConyugal()))) &&
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
        if (getDatosCausante() != null) {
            _hashCode += getDatosCausante().hashCode();
        }
        if (getDatosHijo() != null) {
            _hashCode += getDatosHijo().hashCode();
        }
        if (getDatosConyuge() != null) {
            _hashCode += getDatosConyuge().hashCode();
        }
        if (getFechaInscripcionMatrimonio() != null) {
            _hashCode += getFechaInscripcionMatrimonio().hashCode();
        }
        if (getPartidaMatrimonio() != null) {
            _hashCode += getPartidaMatrimonio().hashCode();
        }
        if (getRegistroMatrimonio() != null) {
            _hashCode += getRegistroMatrimonio().hashCode();
        }
        if (getAgnoInscripcion() != null) {
            _hashCode += getAgnoInscripcion().hashCode();
        }
        if (getNumeroOficina() != null) {
            _hashCode += getNumeroOficina().hashCode();
        }
        if (getOficina() != null) {
            _hashCode += getOficina().hashCode();
        }
        if (getRegimenConyugal() != null) {
            _hashCode += getRegimenConyugal().hashCode();
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
        new org.apache.axis.description.TypeDesc(AcreditacionGrupoFamiliar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">acreditacionGrupoFamiliar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosCausante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosCausante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "acreditacionPersonaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosHijo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosHijo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "acreditacionPersonaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosConyuge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "datosConyuge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "acreditacionPersonaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInscripcionMatrimonio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaInscripcionMatrimonio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partidaMatrimonio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "partidaMatrimonio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroMatrimonio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "registroMatrimonio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agnoInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "agnoInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroOficina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "numeroOficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oficina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "oficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regimenConyugal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "regimenConyugal"));
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
