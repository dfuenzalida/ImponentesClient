/**
 * ListaDistribucionTypeReceptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ListaDistribucionTypeReceptor  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    /* Nombre de la Unidad Receptora cuando aplica */
    private java.lang.String nombreUnidad;

    /* Nombre del Receptor cuando aplica */
    private cl.gob.aem.valida.NameType nombreReceptor;

    /* Cargo del receptor cuando aplica */
    private java.lang.String cargoReceptor;

    /* Nombre de la Institución Receptora */
    private java.lang.String nombreInstitucion;

    private org.apache.axis.message.MessageElement [] _any;

    public ListaDistribucionTypeReceptor() {
    }

    public ListaDistribucionTypeReceptor(
           java.lang.String nombreUnidad,
           cl.gob.aem.valida.NameType nombreReceptor,
           java.lang.String cargoReceptor,
           java.lang.String nombreInstitucion,
           org.apache.axis.message.MessageElement [] _any) {
           this.nombreUnidad = nombreUnidad;
           this.nombreReceptor = nombreReceptor;
           this.cargoReceptor = cargoReceptor;
           this.nombreInstitucion = nombreInstitucion;
           this._any = _any;
    }


    /**
     * Gets the nombreUnidad value for this ListaDistribucionTypeReceptor.
     * 
     * @return nombreUnidad   * Nombre de la Unidad Receptora cuando aplica
     */
    public java.lang.String getNombreUnidad() {
        return nombreUnidad;
    }


    /**
     * Sets the nombreUnidad value for this ListaDistribucionTypeReceptor.
     * 
     * @param nombreUnidad   * Nombre de la Unidad Receptora cuando aplica
     */
    public void setNombreUnidad(java.lang.String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }


    /**
     * Gets the nombreReceptor value for this ListaDistribucionTypeReceptor.
     * 
     * @return nombreReceptor   * Nombre del Receptor cuando aplica
     */
    public cl.gob.aem.valida.NameType getNombreReceptor() {
        return nombreReceptor;
    }


    /**
     * Sets the nombreReceptor value for this ListaDistribucionTypeReceptor.
     * 
     * @param nombreReceptor   * Nombre del Receptor cuando aplica
     */
    public void setNombreReceptor(cl.gob.aem.valida.NameType nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }


    /**
     * Gets the cargoReceptor value for this ListaDistribucionTypeReceptor.
     * 
     * @return cargoReceptor   * Cargo del receptor cuando aplica
     */
    public java.lang.String getCargoReceptor() {
        return cargoReceptor;
    }


    /**
     * Sets the cargoReceptor value for this ListaDistribucionTypeReceptor.
     * 
     * @param cargoReceptor   * Cargo del receptor cuando aplica
     */
    public void setCargoReceptor(java.lang.String cargoReceptor) {
        this.cargoReceptor = cargoReceptor;
    }


    /**
     * Gets the nombreInstitucion value for this ListaDistribucionTypeReceptor.
     * 
     * @return nombreInstitucion   * Nombre de la Institución Receptora
     */
    public java.lang.String getNombreInstitucion() {
        return nombreInstitucion;
    }


    /**
     * Sets the nombreInstitucion value for this ListaDistribucionTypeReceptor.
     * 
     * @param nombreInstitucion   * Nombre de la Institución Receptora
     */
    public void setNombreInstitucion(java.lang.String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }


    /**
     * Gets the _any value for this ListaDistribucionTypeReceptor.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ListaDistribucionTypeReceptor.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaDistribucionTypeReceptor)) return false;
        ListaDistribucionTypeReceptor other = (ListaDistribucionTypeReceptor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombreUnidad==null && other.getNombreUnidad()==null) || 
             (this.nombreUnidad!=null &&
              this.nombreUnidad.equals(other.getNombreUnidad()))) &&
            ((this.nombreReceptor==null && other.getNombreReceptor()==null) || 
             (this.nombreReceptor!=null &&
              this.nombreReceptor.equals(other.getNombreReceptor()))) &&
            ((this.cargoReceptor==null && other.getCargoReceptor()==null) || 
             (this.cargoReceptor!=null &&
              this.cargoReceptor.equals(other.getCargoReceptor()))) &&
            ((this.nombreInstitucion==null && other.getNombreInstitucion()==null) || 
             (this.nombreInstitucion!=null &&
              this.nombreInstitucion.equals(other.getNombreInstitucion()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getNombreUnidad() != null) {
            _hashCode += getNombreUnidad().hashCode();
        }
        if (getNombreReceptor() != null) {
            _hashCode += getNombreReceptor().hashCode();
        }
        if (getCargoReceptor() != null) {
            _hashCode += getCargoReceptor().hashCode();
        }
        if (getNombreInstitucion() != null) {
            _hashCode += getNombreInstitucion().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaDistribucionTypeReceptor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">ListaDistribucionType>Receptor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreUnidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreUnidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreReceptor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreReceptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoReceptor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CargoReceptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreInstitucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreInstitucion"));
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
