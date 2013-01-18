/**
 * ExamenVIHType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ExamenVIHType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    /* Identificador correlativo del examen */
    private java.lang.String folioExamenVIH;

    /* tipo de establecimiento paciente */
    private int tipoEstablecimiento;

    /* codigo del establecimiento paciente */
    private java.lang.String codigoEstablecimiento;

    /* fecha de toma de muestra paciente */
    private cl.gob.aem.valida.FechaType fechaTomaMuestra;

    /* codigo de la prestación isp */
    private java.lang.String codigoPrestacion;

    /* nombre de la prestación isp */
    private java.lang.String nombrePrestacion;

    /* codigo de identificación del paciente */
    private java.lang.String codigoIdentidad;

    /* fecha de recepción muestra isp */
    private cl.gob.aem.valida.FechaType fechaRecepcion;

    /* valor del resultado del examen */
    private int resultadoExamen;

    /* número de reegistro interno isp */
    private java.lang.String nroRegistroIsp;

    /* fecha de despacho resultado isp */
    private cl.gob.aem.valida.FechaType fechaDespachoIsp;

    /* codigo de identidad anterior del paciente */
    private java.lang.String codigoIdentidadAnterior;

    /* fecha de proceso de la muestra del paciente */
    private cl.gob.aem.valida.FechaType fechaDeProceso;

    private org.apache.axis.message.MessageElement [] _any;

    private java.math.BigDecimal schemaVersion;  // attribute

    public ExamenVIHType() {
    }

    public ExamenVIHType(
           java.lang.String folioExamenVIH,
           int tipoEstablecimiento,
           java.lang.String codigoEstablecimiento,
           cl.gob.aem.valida.FechaType fechaTomaMuestra,
           java.lang.String codigoPrestacion,
           java.lang.String nombrePrestacion,
           java.lang.String codigoIdentidad,
           cl.gob.aem.valida.FechaType fechaRecepcion,
           int resultadoExamen,
           java.lang.String nroRegistroIsp,
           cl.gob.aem.valida.FechaType fechaDespachoIsp,
           java.lang.String codigoIdentidadAnterior,
           cl.gob.aem.valida.FechaType fechaDeProceso,
           org.apache.axis.message.MessageElement [] _any,
           java.math.BigDecimal schemaVersion) {
           this.folioExamenVIH = folioExamenVIH;
           this.tipoEstablecimiento = tipoEstablecimiento;
           this.codigoEstablecimiento = codigoEstablecimiento;
           this.fechaTomaMuestra = fechaTomaMuestra;
           this.codigoPrestacion = codigoPrestacion;
           this.nombrePrestacion = nombrePrestacion;
           this.codigoIdentidad = codigoIdentidad;
           this.fechaRecepcion = fechaRecepcion;
           this.resultadoExamen = resultadoExamen;
           this.nroRegistroIsp = nroRegistroIsp;
           this.fechaDespachoIsp = fechaDespachoIsp;
           this.codigoIdentidadAnterior = codigoIdentidadAnterior;
           this.fechaDeProceso = fechaDeProceso;
           this._any = _any;
           this.schemaVersion = schemaVersion;
    }


    /**
     * Gets the folioExamenVIH value for this ExamenVIHType.
     * 
     * @return folioExamenVIH   * Identificador correlativo del examen
     */
    public java.lang.String getFolioExamenVIH() {
        return folioExamenVIH;
    }


    /**
     * Sets the folioExamenVIH value for this ExamenVIHType.
     * 
     * @param folioExamenVIH   * Identificador correlativo del examen
     */
    public void setFolioExamenVIH(java.lang.String folioExamenVIH) {
        this.folioExamenVIH = folioExamenVIH;
    }


    /**
     * Gets the tipoEstablecimiento value for this ExamenVIHType.
     * 
     * @return tipoEstablecimiento   * tipo de establecimiento paciente
     */
    public int getTipoEstablecimiento() {
        return tipoEstablecimiento;
    }


    /**
     * Sets the tipoEstablecimiento value for this ExamenVIHType.
     * 
     * @param tipoEstablecimiento   * tipo de establecimiento paciente
     */
    public void setTipoEstablecimiento(int tipoEstablecimiento) {
        this.tipoEstablecimiento = tipoEstablecimiento;
    }


    /**
     * Gets the codigoEstablecimiento value for this ExamenVIHType.
     * 
     * @return codigoEstablecimiento   * codigo del establecimiento paciente
     */
    public java.lang.String getCodigoEstablecimiento() {
        return codigoEstablecimiento;
    }


    /**
     * Sets the codigoEstablecimiento value for this ExamenVIHType.
     * 
     * @param codigoEstablecimiento   * codigo del establecimiento paciente
     */
    public void setCodigoEstablecimiento(java.lang.String codigoEstablecimiento) {
        this.codigoEstablecimiento = codigoEstablecimiento;
    }


    /**
     * Gets the fechaTomaMuestra value for this ExamenVIHType.
     * 
     * @return fechaTomaMuestra   * fecha de toma de muestra paciente
     */
    public cl.gob.aem.valida.FechaType getFechaTomaMuestra() {
        return fechaTomaMuestra;
    }


    /**
     * Sets the fechaTomaMuestra value for this ExamenVIHType.
     * 
     * @param fechaTomaMuestra   * fecha de toma de muestra paciente
     */
    public void setFechaTomaMuestra(cl.gob.aem.valida.FechaType fechaTomaMuestra) {
        this.fechaTomaMuestra = fechaTomaMuestra;
    }


    /**
     * Gets the codigoPrestacion value for this ExamenVIHType.
     * 
     * @return codigoPrestacion   * codigo de la prestación isp
     */
    public java.lang.String getCodigoPrestacion() {
        return codigoPrestacion;
    }


    /**
     * Sets the codigoPrestacion value for this ExamenVIHType.
     * 
     * @param codigoPrestacion   * codigo de la prestación isp
     */
    public void setCodigoPrestacion(java.lang.String codigoPrestacion) {
        this.codigoPrestacion = codigoPrestacion;
    }


    /**
     * Gets the nombrePrestacion value for this ExamenVIHType.
     * 
     * @return nombrePrestacion   * nombre de la prestación isp
     */
    public java.lang.String getNombrePrestacion() {
        return nombrePrestacion;
    }


    /**
     * Sets the nombrePrestacion value for this ExamenVIHType.
     * 
     * @param nombrePrestacion   * nombre de la prestación isp
     */
    public void setNombrePrestacion(java.lang.String nombrePrestacion) {
        this.nombrePrestacion = nombrePrestacion;
    }


    /**
     * Gets the codigoIdentidad value for this ExamenVIHType.
     * 
     * @return codigoIdentidad   * codigo de identificación del paciente
     */
    public java.lang.String getCodigoIdentidad() {
        return codigoIdentidad;
    }


    /**
     * Sets the codigoIdentidad value for this ExamenVIHType.
     * 
     * @param codigoIdentidad   * codigo de identificación del paciente
     */
    public void setCodigoIdentidad(java.lang.String codigoIdentidad) {
        this.codigoIdentidad = codigoIdentidad;
    }


    /**
     * Gets the fechaRecepcion value for this ExamenVIHType.
     * 
     * @return fechaRecepcion   * fecha de recepción muestra isp
     */
    public cl.gob.aem.valida.FechaType getFechaRecepcion() {
        return fechaRecepcion;
    }


    /**
     * Sets the fechaRecepcion value for this ExamenVIHType.
     * 
     * @param fechaRecepcion   * fecha de recepción muestra isp
     */
    public void setFechaRecepcion(cl.gob.aem.valida.FechaType fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }


    /**
     * Gets the resultadoExamen value for this ExamenVIHType.
     * 
     * @return resultadoExamen   * valor del resultado del examen
     */
    public int getResultadoExamen() {
        return resultadoExamen;
    }


    /**
     * Sets the resultadoExamen value for this ExamenVIHType.
     * 
     * @param resultadoExamen   * valor del resultado del examen
     */
    public void setResultadoExamen(int resultadoExamen) {
        this.resultadoExamen = resultadoExamen;
    }


    /**
     * Gets the nroRegistroIsp value for this ExamenVIHType.
     * 
     * @return nroRegistroIsp   * número de reegistro interno isp
     */
    public java.lang.String getNroRegistroIsp() {
        return nroRegistroIsp;
    }


    /**
     * Sets the nroRegistroIsp value for this ExamenVIHType.
     * 
     * @param nroRegistroIsp   * número de reegistro interno isp
     */
    public void setNroRegistroIsp(java.lang.String nroRegistroIsp) {
        this.nroRegistroIsp = nroRegistroIsp;
    }


    /**
     * Gets the fechaDespachoIsp value for this ExamenVIHType.
     * 
     * @return fechaDespachoIsp   * fecha de despacho resultado isp
     */
    public cl.gob.aem.valida.FechaType getFechaDespachoIsp() {
        return fechaDespachoIsp;
    }


    /**
     * Sets the fechaDespachoIsp value for this ExamenVIHType.
     * 
     * @param fechaDespachoIsp   * fecha de despacho resultado isp
     */
    public void setFechaDespachoIsp(cl.gob.aem.valida.FechaType fechaDespachoIsp) {
        this.fechaDespachoIsp = fechaDespachoIsp;
    }


    /**
     * Gets the codigoIdentidadAnterior value for this ExamenVIHType.
     * 
     * @return codigoIdentidadAnterior   * codigo de identidad anterior del paciente
     */
    public java.lang.String getCodigoIdentidadAnterior() {
        return codigoIdentidadAnterior;
    }


    /**
     * Sets the codigoIdentidadAnterior value for this ExamenVIHType.
     * 
     * @param codigoIdentidadAnterior   * codigo de identidad anterior del paciente
     */
    public void setCodigoIdentidadAnterior(java.lang.String codigoIdentidadAnterior) {
        this.codigoIdentidadAnterior = codigoIdentidadAnterior;
    }


    /**
     * Gets the fechaDeProceso value for this ExamenVIHType.
     * 
     * @return fechaDeProceso   * fecha de proceso de la muestra del paciente
     */
    public cl.gob.aem.valida.FechaType getFechaDeProceso() {
        return fechaDeProceso;
    }


    /**
     * Sets the fechaDeProceso value for this ExamenVIHType.
     * 
     * @param fechaDeProceso   * fecha de proceso de la muestra del paciente
     */
    public void setFechaDeProceso(cl.gob.aem.valida.FechaType fechaDeProceso) {
        this.fechaDeProceso = fechaDeProceso;
    }


    /**
     * Gets the _any value for this ExamenVIHType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ExamenVIHType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the schemaVersion value for this ExamenVIHType.
     * 
     * @return schemaVersion
     */
    public java.math.BigDecimal getSchemaVersion() {
        return schemaVersion;
    }


    /**
     * Sets the schemaVersion value for this ExamenVIHType.
     * 
     * @param schemaVersion
     */
    public void setSchemaVersion(java.math.BigDecimal schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExamenVIHType)) return false;
        ExamenVIHType other = (ExamenVIHType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.folioExamenVIH==null && other.getFolioExamenVIH()==null) || 
             (this.folioExamenVIH!=null &&
              this.folioExamenVIH.equals(other.getFolioExamenVIH()))) &&
            this.tipoEstablecimiento == other.getTipoEstablecimiento() &&
            ((this.codigoEstablecimiento==null && other.getCodigoEstablecimiento()==null) || 
             (this.codigoEstablecimiento!=null &&
              this.codigoEstablecimiento.equals(other.getCodigoEstablecimiento()))) &&
            ((this.fechaTomaMuestra==null && other.getFechaTomaMuestra()==null) || 
             (this.fechaTomaMuestra!=null &&
              this.fechaTomaMuestra.equals(other.getFechaTomaMuestra()))) &&
            ((this.codigoPrestacion==null && other.getCodigoPrestacion()==null) || 
             (this.codigoPrestacion!=null &&
              this.codigoPrestacion.equals(other.getCodigoPrestacion()))) &&
            ((this.nombrePrestacion==null && other.getNombrePrestacion()==null) || 
             (this.nombrePrestacion!=null &&
              this.nombrePrestacion.equals(other.getNombrePrestacion()))) &&
            ((this.codigoIdentidad==null && other.getCodigoIdentidad()==null) || 
             (this.codigoIdentidad!=null &&
              this.codigoIdentidad.equals(other.getCodigoIdentidad()))) &&
            ((this.fechaRecepcion==null && other.getFechaRecepcion()==null) || 
             (this.fechaRecepcion!=null &&
              this.fechaRecepcion.equals(other.getFechaRecepcion()))) &&
            this.resultadoExamen == other.getResultadoExamen() &&
            ((this.nroRegistroIsp==null && other.getNroRegistroIsp()==null) || 
             (this.nroRegistroIsp!=null &&
              this.nroRegistroIsp.equals(other.getNroRegistroIsp()))) &&
            ((this.fechaDespachoIsp==null && other.getFechaDespachoIsp()==null) || 
             (this.fechaDespachoIsp!=null &&
              this.fechaDespachoIsp.equals(other.getFechaDespachoIsp()))) &&
            ((this.codigoIdentidadAnterior==null && other.getCodigoIdentidadAnterior()==null) || 
             (this.codigoIdentidadAnterior!=null &&
              this.codigoIdentidadAnterior.equals(other.getCodigoIdentidadAnterior()))) &&
            ((this.fechaDeProceso==null && other.getFechaDeProceso()==null) || 
             (this.fechaDeProceso!=null &&
              this.fechaDeProceso.equals(other.getFechaDeProceso()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.schemaVersion==null && other.getSchemaVersion()==null) || 
             (this.schemaVersion!=null &&
              this.schemaVersion.equals(other.getSchemaVersion())));
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
        if (getFolioExamenVIH() != null) {
            _hashCode += getFolioExamenVIH().hashCode();
        }
        _hashCode += getTipoEstablecimiento();
        if (getCodigoEstablecimiento() != null) {
            _hashCode += getCodigoEstablecimiento().hashCode();
        }
        if (getFechaTomaMuestra() != null) {
            _hashCode += getFechaTomaMuestra().hashCode();
        }
        if (getCodigoPrestacion() != null) {
            _hashCode += getCodigoPrestacion().hashCode();
        }
        if (getNombrePrestacion() != null) {
            _hashCode += getNombrePrestacion().hashCode();
        }
        if (getCodigoIdentidad() != null) {
            _hashCode += getCodigoIdentidad().hashCode();
        }
        if (getFechaRecepcion() != null) {
            _hashCode += getFechaRecepcion().hashCode();
        }
        _hashCode += getResultadoExamen();
        if (getNroRegistroIsp() != null) {
            _hashCode += getNroRegistroIsp().hashCode();
        }
        if (getFechaDespachoIsp() != null) {
            _hashCode += getFechaDespachoIsp().hashCode();
        }
        if (getCodigoIdentidadAnterior() != null) {
            _hashCode += getCodigoIdentidadAnterior().hashCode();
        }
        if (getFechaDeProceso() != null) {
            _hashCode += getFechaDeProceso().hashCode();
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
        if (getSchemaVersion() != null) {
            _hashCode += getSchemaVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExamenVIHType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ExamenVIHType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SchemaVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folioExamenVIH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FolioExamenVIH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEstablecimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TipoEstablecimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEstablecimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoEstablecimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaTomaMuestra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaTomaMuestra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPrestacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoPrestacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePrestacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombrePrestacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoIdentidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoIdentidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRecepcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaRecepcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoExamen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ResultadoExamen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroRegistroIsp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NroRegistroIsp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDespachoIsp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaDespachoIsp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoIdentidadAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoIdentidadAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDeProceso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaDeProceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
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
