/**
 * EntradaSRCel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class EntradaSRCel  implements java.io.Serializable {
    private cl.gob.aem.valida.RunType[] run;

    private cl.gob.aem.valida.NameType nombre;

    private java.lang.String ppu;

    private cl.gob.aem.valida.RunType runb;

    private java.lang.String tipoDocumento;

    private java.lang.String numeroSerie;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public EntradaSRCel() {
    }

    public EntradaSRCel(
           cl.gob.aem.valida.RunType[] run,
           cl.gob.aem.valida.NameType nombre,
           java.lang.String ppu,
           cl.gob.aem.valida.RunType runb,
           java.lang.String tipoDocumento,
           java.lang.String numeroSerie,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.run = run;
           this.nombre = nombre;
           this.ppu = ppu;
           this.runb = runb;
           this.tipoDocumento = tipoDocumento;
           this.numeroSerie = numeroSerie;
           this.signature = signature;
    }


    /**
     * Gets the run value for this EntradaSRCel.
     * 
     * @return run
     */
    public cl.gob.aem.valida.RunType[] getRun() {
        return run;
    }


    /**
     * Sets the run value for this EntradaSRCel.
     * 
     * @param run
     */
    public void setRun(cl.gob.aem.valida.RunType[] run) {
        this.run = run;
    }

    public cl.gob.aem.valida.RunType getRun(int i) {
        return this.run[i];
    }

    public void setRun(int i, cl.gob.aem.valida.RunType _value) {
        this.run[i] = _value;
    }


    /**
     * Gets the nombre value for this EntradaSRCel.
     * 
     * @return nombre
     */
    public cl.gob.aem.valida.NameType getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this EntradaSRCel.
     * 
     * @param nombre
     */
    public void setNombre(cl.gob.aem.valida.NameType nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the ppu value for this EntradaSRCel.
     * 
     * @return ppu
     */
    public java.lang.String getPpu() {
        return ppu;
    }


    /**
     * Sets the ppu value for this EntradaSRCel.
     * 
     * @param ppu
     */
    public void setPpu(java.lang.String ppu) {
        this.ppu = ppu;
    }


    /**
     * Gets the runb value for this EntradaSRCel.
     * 
     * @return runb
     */
    public cl.gob.aem.valida.RunType getRunb() {
        return runb;
    }


    /**
     * Sets the runb value for this EntradaSRCel.
     * 
     * @param runb
     */
    public void setRunb(cl.gob.aem.valida.RunType runb) {
        this.runb = runb;
    }


    /**
     * Gets the tipoDocumento value for this EntradaSRCel.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this EntradaSRCel.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the numeroSerie value for this EntradaSRCel.
     * 
     * @return numeroSerie
     */
    public java.lang.String getNumeroSerie() {
        return numeroSerie;
    }


    /**
     * Sets the numeroSerie value for this EntradaSRCel.
     * 
     * @param numeroSerie
     */
    public void setNumeroSerie(java.lang.String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }


    /**
     * Gets the signature value for this EntradaSRCel.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this EntradaSRCel.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntradaSRCel)) return false;
        EntradaSRCel other = (EntradaSRCel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.run==null && other.getRun()==null) || 
             (this.run!=null &&
              java.util.Arrays.equals(this.run, other.getRun()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.ppu==null && other.getPpu()==null) || 
             (this.ppu!=null &&
              this.ppu.equals(other.getPpu()))) &&
            ((this.runb==null && other.getRunb()==null) || 
             (this.runb!=null &&
              this.runb.equals(other.getRunb()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.numeroSerie==null && other.getNumeroSerie()==null) || 
             (this.numeroSerie!=null &&
              this.numeroSerie.equals(other.getNumeroSerie()))) &&
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
        if (getRun() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRun());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRun(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getPpu() != null) {
            _hashCode += getPpu().hashCode();
        }
        if (getRunb() != null) {
            _hashCode += getRunb().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getNumeroSerie() != null) {
            _hashCode += getNumeroSerie().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntradaSRCel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">entradaSRCel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "run"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ppu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "numeroSerie"));
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
