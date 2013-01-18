/**
 * BitacoraEncabezado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;


/**
 * Datos de la bitacora que caracterizan la unidad donde se realizaron
 * las operaciones aeronauticas y el periodo en que se llevaron a
 *                 cabo
 */
public class BitacoraEncabezado  implements java.io.Serializable {
    /* Codigo definido por la OACI para la unidad (aerodromo /
     *                     aeropuerto) */
    private java.lang.String codigoOACI;

    /* Nombre completo de la unidad */
    private java.lang.String nombreUnidad;

    private cl.gob.aem.valida.BitacoraEncabezadoRegion region;

    private cl.gob.aem.valida.BitacoraEncabezadoPeriodoConsulta periodoConsulta;

    /* Cantidad de Operaciones generadas por el periodo de
     *                     consulta */
    private long cantidadOperaciones;

    public BitacoraEncabezado() {
    }

    public BitacoraEncabezado(
           java.lang.String codigoOACI,
           java.lang.String nombreUnidad,
           cl.gob.aem.valida.BitacoraEncabezadoRegion region,
           cl.gob.aem.valida.BitacoraEncabezadoPeriodoConsulta periodoConsulta,
           long cantidadOperaciones) {
           this.codigoOACI = codigoOACI;
           this.nombreUnidad = nombreUnidad;
           this.region = region;
           this.periodoConsulta = periodoConsulta;
           this.cantidadOperaciones = cantidadOperaciones;
    }


    /**
     * Gets the codigoOACI value for this BitacoraEncabezado.
     * 
     * @return codigoOACI   * Codigo definido por la OACI para la unidad (aerodromo /
     *                     aeropuerto)
     */
    public java.lang.String getCodigoOACI() {
        return codigoOACI;
    }


    /**
     * Sets the codigoOACI value for this BitacoraEncabezado.
     * 
     * @param codigoOACI   * Codigo definido por la OACI para la unidad (aerodromo /
     *                     aeropuerto)
     */
    public void setCodigoOACI(java.lang.String codigoOACI) {
        this.codigoOACI = codigoOACI;
    }


    /**
     * Gets the nombreUnidad value for this BitacoraEncabezado.
     * 
     * @return nombreUnidad   * Nombre completo de la unidad
     */
    public java.lang.String getNombreUnidad() {
        return nombreUnidad;
    }


    /**
     * Sets the nombreUnidad value for this BitacoraEncabezado.
     * 
     * @param nombreUnidad   * Nombre completo de la unidad
     */
    public void setNombreUnidad(java.lang.String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }


    /**
     * Gets the region value for this BitacoraEncabezado.
     * 
     * @return region
     */
    public cl.gob.aem.valida.BitacoraEncabezadoRegion getRegion() {
        return region;
    }


    /**
     * Sets the region value for this BitacoraEncabezado.
     * 
     * @param region
     */
    public void setRegion(cl.gob.aem.valida.BitacoraEncabezadoRegion region) {
        this.region = region;
    }


    /**
     * Gets the periodoConsulta value for this BitacoraEncabezado.
     * 
     * @return periodoConsulta
     */
    public cl.gob.aem.valida.BitacoraEncabezadoPeriodoConsulta getPeriodoConsulta() {
        return periodoConsulta;
    }


    /**
     * Sets the periodoConsulta value for this BitacoraEncabezado.
     * 
     * @param periodoConsulta
     */
    public void setPeriodoConsulta(cl.gob.aem.valida.BitacoraEncabezadoPeriodoConsulta periodoConsulta) {
        this.periodoConsulta = periodoConsulta;
    }


    /**
     * Gets the cantidadOperaciones value for this BitacoraEncabezado.
     * 
     * @return cantidadOperaciones   * Cantidad de Operaciones generadas por el periodo de
     *                     consulta
     */
    public long getCantidadOperaciones() {
        return cantidadOperaciones;
    }


    /**
     * Sets the cantidadOperaciones value for this BitacoraEncabezado.
     * 
     * @param cantidadOperaciones   * Cantidad de Operaciones generadas por el periodo de
     *                     consulta
     */
    public void setCantidadOperaciones(long cantidadOperaciones) {
        this.cantidadOperaciones = cantidadOperaciones;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BitacoraEncabezado)) return false;
        BitacoraEncabezado other = (BitacoraEncabezado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoOACI==null && other.getCodigoOACI()==null) || 
             (this.codigoOACI!=null &&
              this.codigoOACI.equals(other.getCodigoOACI()))) &&
            ((this.nombreUnidad==null && other.getNombreUnidad()==null) || 
             (this.nombreUnidad!=null &&
              this.nombreUnidad.equals(other.getNombreUnidad()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.periodoConsulta==null && other.getPeriodoConsulta()==null) || 
             (this.periodoConsulta!=null &&
              this.periodoConsulta.equals(other.getPeriodoConsulta()))) &&
            this.cantidadOperaciones == other.getCantidadOperaciones();
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
        if (getCodigoOACI() != null) {
            _hashCode += getCodigoOACI().hashCode();
        }
        if (getNombreUnidad() != null) {
            _hashCode += getNombreUnidad().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getPeriodoConsulta() != null) {
            _hashCode += getPeriodoConsulta().hashCode();
        }
        _hashCode += new Long(getCantidadOperaciones()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BitacoraEncabezado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>Bitacora>Encabezado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOACI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoOACI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreUnidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreUnidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>Bitacora>Encabezado>Region"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoConsulta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "PeriodoConsulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>Bitacora>Encabezado>PeriodoConsulta"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadOperaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CantidadOperaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
