/**
 * DomicilioType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class DomicilioType  implements java.io.Serializable {
    private java.lang.String nombre;

    private java.lang.String numero;

    private java.lang.String numeroDepartamentoCasa;

    private java.lang.String numeroTorre;

    private cl.gob.aem.valida.DomicilioTypeComuna comuna;

    private cl.gob.aem.valida.DomicilioTypeProvincia provincia;

    private java.lang.String ciudad;

    private cl.gob.aem.valida.DomicilioTypeRegion region;

    private java.lang.String pais;

    private java.lang.String codigoPostal;

    private org.apache.axis.types.PositiveInteger tipo;

    private java.lang.String informacionAdicional;

    public DomicilioType() {
    }

    public DomicilioType(
           java.lang.String nombre,
           java.lang.String numero,
           java.lang.String numeroDepartamentoCasa,
           java.lang.String numeroTorre,
           cl.gob.aem.valida.DomicilioTypeComuna comuna,
           cl.gob.aem.valida.DomicilioTypeProvincia provincia,
           java.lang.String ciudad,
           cl.gob.aem.valida.DomicilioTypeRegion region,
           java.lang.String pais,
           java.lang.String codigoPostal,
           org.apache.axis.types.PositiveInteger tipo,
           java.lang.String informacionAdicional) {
           this.nombre = nombre;
           this.numero = numero;
           this.numeroDepartamentoCasa = numeroDepartamentoCasa;
           this.numeroTorre = numeroTorre;
           this.comuna = comuna;
           this.provincia = provincia;
           this.ciudad = ciudad;
           this.region = region;
           this.pais = pais;
           this.codigoPostal = codigoPostal;
           this.tipo = tipo;
           this.informacionAdicional = informacionAdicional;
    }


    /**
     * Gets the nombre value for this DomicilioType.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DomicilioType.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the numero value for this DomicilioType.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this DomicilioType.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the numeroDepartamentoCasa value for this DomicilioType.
     * 
     * @return numeroDepartamentoCasa
     */
    public java.lang.String getNumeroDepartamentoCasa() {
        return numeroDepartamentoCasa;
    }


    /**
     * Sets the numeroDepartamentoCasa value for this DomicilioType.
     * 
     * @param numeroDepartamentoCasa
     */
    public void setNumeroDepartamentoCasa(java.lang.String numeroDepartamentoCasa) {
        this.numeroDepartamentoCasa = numeroDepartamentoCasa;
    }


    /**
     * Gets the numeroTorre value for this DomicilioType.
     * 
     * @return numeroTorre
     */
    public java.lang.String getNumeroTorre() {
        return numeroTorre;
    }


    /**
     * Sets the numeroTorre value for this DomicilioType.
     * 
     * @param numeroTorre
     */
    public void setNumeroTorre(java.lang.String numeroTorre) {
        this.numeroTorre = numeroTorre;
    }


    /**
     * Gets the comuna value for this DomicilioType.
     * 
     * @return comuna
     */
    public cl.gob.aem.valida.DomicilioTypeComuna getComuna() {
        return comuna;
    }


    /**
     * Sets the comuna value for this DomicilioType.
     * 
     * @param comuna
     */
    public void setComuna(cl.gob.aem.valida.DomicilioTypeComuna comuna) {
        this.comuna = comuna;
    }


    /**
     * Gets the provincia value for this DomicilioType.
     * 
     * @return provincia
     */
    public cl.gob.aem.valida.DomicilioTypeProvincia getProvincia() {
        return provincia;
    }


    /**
     * Sets the provincia value for this DomicilioType.
     * 
     * @param provincia
     */
    public void setProvincia(cl.gob.aem.valida.DomicilioTypeProvincia provincia) {
        this.provincia = provincia;
    }


    /**
     * Gets the ciudad value for this DomicilioType.
     * 
     * @return ciudad
     */
    public java.lang.String getCiudad() {
        return ciudad;
    }


    /**
     * Sets the ciudad value for this DomicilioType.
     * 
     * @param ciudad
     */
    public void setCiudad(java.lang.String ciudad) {
        this.ciudad = ciudad;
    }


    /**
     * Gets the region value for this DomicilioType.
     * 
     * @return region
     */
    public cl.gob.aem.valida.DomicilioTypeRegion getRegion() {
        return region;
    }


    /**
     * Sets the region value for this DomicilioType.
     * 
     * @param region
     */
    public void setRegion(cl.gob.aem.valida.DomicilioTypeRegion region) {
        this.region = region;
    }


    /**
     * Gets the pais value for this DomicilioType.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this DomicilioType.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the codigoPostal value for this DomicilioType.
     * 
     * @return codigoPostal
     */
    public java.lang.String getCodigoPostal() {
        return codigoPostal;
    }


    /**
     * Sets the codigoPostal value for this DomicilioType.
     * 
     * @param codigoPostal
     */
    public void setCodigoPostal(java.lang.String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    /**
     * Gets the tipo value for this DomicilioType.
     * 
     * @return tipo
     */
    public org.apache.axis.types.PositiveInteger getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this DomicilioType.
     * 
     * @param tipo
     */
    public void setTipo(org.apache.axis.types.PositiveInteger tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the informacionAdicional value for this DomicilioType.
     * 
     * @return informacionAdicional
     */
    public java.lang.String getInformacionAdicional() {
        return informacionAdicional;
    }


    /**
     * Sets the informacionAdicional value for this DomicilioType.
     * 
     * @param informacionAdicional
     */
    public void setInformacionAdicional(java.lang.String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomicilioType)) return false;
        DomicilioType other = (DomicilioType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.numeroDepartamentoCasa==null && other.getNumeroDepartamentoCasa()==null) || 
             (this.numeroDepartamentoCasa!=null &&
              this.numeroDepartamentoCasa.equals(other.getNumeroDepartamentoCasa()))) &&
            ((this.numeroTorre==null && other.getNumeroTorre()==null) || 
             (this.numeroTorre!=null &&
              this.numeroTorre.equals(other.getNumeroTorre()))) &&
            ((this.comuna==null && other.getComuna()==null) || 
             (this.comuna!=null &&
              this.comuna.equals(other.getComuna()))) &&
            ((this.provincia==null && other.getProvincia()==null) || 
             (this.provincia!=null &&
              this.provincia.equals(other.getProvincia()))) &&
            ((this.ciudad==null && other.getCiudad()==null) || 
             (this.ciudad!=null &&
              this.ciudad.equals(other.getCiudad()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.codigoPostal==null && other.getCodigoPostal()==null) || 
             (this.codigoPostal!=null &&
              this.codigoPostal.equals(other.getCodigoPostal()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.informacionAdicional==null && other.getInformacionAdicional()==null) || 
             (this.informacionAdicional!=null &&
              this.informacionAdicional.equals(other.getInformacionAdicional())));
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
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getNumeroDepartamentoCasa() != null) {
            _hashCode += getNumeroDepartamentoCasa().hashCode();
        }
        if (getNumeroTorre() != null) {
            _hashCode += getNumeroTorre().hashCode();
        }
        if (getComuna() != null) {
            _hashCode += getComuna().hashCode();
        }
        if (getProvincia() != null) {
            _hashCode += getProvincia().hashCode();
        }
        if (getCiudad() != null) {
            _hashCode += getCiudad().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getCodigoPostal() != null) {
            _hashCode += getCodigoPostal().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getInformacionAdicional() != null) {
            _hashCode += getInformacionAdicional().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomicilioType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DomicilioType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDepartamentoCasa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroDepartamentoCasa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTorre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroTorre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comuna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Comuna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">DomicilioType>Comuna"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Provincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">DomicilioType>Provincia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Ciudad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">DomicilioType>Region"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacionAdicional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "InformacionAdicional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
