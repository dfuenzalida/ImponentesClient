/**
 * VehiculoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class VehiculoType  implements java.io.Serializable {
    private java.lang.String tipo;

    private java.lang.String aFabrica;

    private java.lang.String marca;

    private java.lang.String modelo;

    private java.lang.String numeroMotor;

    private java.lang.String numeroSerie;

    private java.lang.String color;

    private java.lang.String tipoCombustible;

    private java.lang.String pesoBruto;

    private java.lang.String chasis;

    private java.lang.String vin;

    public VehiculoType() {
    }

    public VehiculoType(
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
           java.lang.String vin) {
           this.tipo = tipo;
           this.aFabrica = aFabrica;
           this.marca = marca;
           this.modelo = modelo;
           this.numeroMotor = numeroMotor;
           this.numeroSerie = numeroSerie;
           this.color = color;
           this.tipoCombustible = tipoCombustible;
           this.pesoBruto = pesoBruto;
           this.chasis = chasis;
           this.vin = vin;
    }


    /**
     * Gets the tipo value for this VehiculoType.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this VehiculoType.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the aFabrica value for this VehiculoType.
     * 
     * @return aFabrica
     */
    public java.lang.String getAFabrica() {
        return aFabrica;
    }


    /**
     * Sets the aFabrica value for this VehiculoType.
     * 
     * @param aFabrica
     */
    public void setAFabrica(java.lang.String aFabrica) {
        this.aFabrica = aFabrica;
    }


    /**
     * Gets the marca value for this VehiculoType.
     * 
     * @return marca
     */
    public java.lang.String getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this VehiculoType.
     * 
     * @param marca
     */
    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }


    /**
     * Gets the modelo value for this VehiculoType.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this VehiculoType.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the numeroMotor value for this VehiculoType.
     * 
     * @return numeroMotor
     */
    public java.lang.String getNumeroMotor() {
        return numeroMotor;
    }


    /**
     * Sets the numeroMotor value for this VehiculoType.
     * 
     * @param numeroMotor
     */
    public void setNumeroMotor(java.lang.String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }


    /**
     * Gets the numeroSerie value for this VehiculoType.
     * 
     * @return numeroSerie
     */
    public java.lang.String getNumeroSerie() {
        return numeroSerie;
    }


    /**
     * Sets the numeroSerie value for this VehiculoType.
     * 
     * @param numeroSerie
     */
    public void setNumeroSerie(java.lang.String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }


    /**
     * Gets the color value for this VehiculoType.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this VehiculoType.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the tipoCombustible value for this VehiculoType.
     * 
     * @return tipoCombustible
     */
    public java.lang.String getTipoCombustible() {
        return tipoCombustible;
    }


    /**
     * Sets the tipoCombustible value for this VehiculoType.
     * 
     * @param tipoCombustible
     */
    public void setTipoCombustible(java.lang.String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    /**
     * Gets the pesoBruto value for this VehiculoType.
     * 
     * @return pesoBruto
     */
    public java.lang.String getPesoBruto() {
        return pesoBruto;
    }


    /**
     * Sets the pesoBruto value for this VehiculoType.
     * 
     * @param pesoBruto
     */
    public void setPesoBruto(java.lang.String pesoBruto) {
        this.pesoBruto = pesoBruto;
    }


    /**
     * Gets the chasis value for this VehiculoType.
     * 
     * @return chasis
     */
    public java.lang.String getChasis() {
        return chasis;
    }


    /**
     * Sets the chasis value for this VehiculoType.
     * 
     * @param chasis
     */
    public void setChasis(java.lang.String chasis) {
        this.chasis = chasis;
    }


    /**
     * Gets the vin value for this VehiculoType.
     * 
     * @return vin
     */
    public java.lang.String getVin() {
        return vin;
    }


    /**
     * Sets the vin value for this VehiculoType.
     * 
     * @param vin
     */
    public void setVin(java.lang.String vin) {
        this.vin = vin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehiculoType)) return false;
        VehiculoType other = (VehiculoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.aFabrica==null && other.getAFabrica()==null) || 
             (this.aFabrica!=null &&
              this.aFabrica.equals(other.getAFabrica()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.numeroMotor==null && other.getNumeroMotor()==null) || 
             (this.numeroMotor!=null &&
              this.numeroMotor.equals(other.getNumeroMotor()))) &&
            ((this.numeroSerie==null && other.getNumeroSerie()==null) || 
             (this.numeroSerie!=null &&
              this.numeroSerie.equals(other.getNumeroSerie()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.tipoCombustible==null && other.getTipoCombustible()==null) || 
             (this.tipoCombustible!=null &&
              this.tipoCombustible.equals(other.getTipoCombustible()))) &&
            ((this.pesoBruto==null && other.getPesoBruto()==null) || 
             (this.pesoBruto!=null &&
              this.pesoBruto.equals(other.getPesoBruto()))) &&
            ((this.chasis==null && other.getChasis()==null) || 
             (this.chasis!=null &&
              this.chasis.equals(other.getChasis()))) &&
            ((this.vin==null && other.getVin()==null) || 
             (this.vin!=null &&
              this.vin.equals(other.getVin())));
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
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getAFabrica() != null) {
            _hashCode += getAFabrica().hashCode();
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getNumeroMotor() != null) {
            _hashCode += getNumeroMotor().hashCode();
        }
        if (getNumeroSerie() != null) {
            _hashCode += getNumeroSerie().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getTipoCombustible() != null) {
            _hashCode += getTipoCombustible().hashCode();
        }
        if (getPesoBruto() != null) {
            _hashCode += getPesoBruto().hashCode();
        }
        if (getChasis() != null) {
            _hashCode += getChasis().hashCode();
        }
        if (getVin() != null) {
            _hashCode += getVin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehiculoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "vehiculoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AFabrica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "aFabrica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "marca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroMotor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "numeroMotor"));
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
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCombustible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "tipoCombustible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pesoBruto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "pesoBruto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chasis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "chasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "vin"));
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
