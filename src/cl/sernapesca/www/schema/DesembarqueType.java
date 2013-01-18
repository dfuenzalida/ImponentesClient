/**
 * DesembarqueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.sernapesca.www.schema;

public class DesembarqueType  implements java.io.Serializable {
    /* Número de folio del documento de desembarque */
    private java.math.BigInteger folio;

    /* Año de desembarque */
    private org.apache.axis.types.Year agno;

    /* Run el Armador */
    private cl.gob.aem.valida.RunType armador;

    /* Identificación de la Nave del Desembarque */
    private cl.sernapesca.www.schema.CodigoDescripcionType nave;

    /* Identificación del Puerto donde se realiza el desembarque */
    private cl.sernapesca.www.schema.CodigoDescripcionType puerto;

    /* Fecha del Zarpe del Desembarque */
    private cl.gob.aem.valida.FechaType fechaZarpe;

    /* Fecha de Llegada de la Nave */
    private cl.gob.aem.valida.FechaType fechaLlegada;

    /* Información del Arte de Pesca */
    private cl.sernapesca.www.schema.CodigoDescripcionType arte;

    /* Información del Régimen de Pesca */
    private cl.sernapesca.www.schema.CodigoDescripcionType regimen;

    /* Identificación de las Especies involucradas en el desembarque,
     * toneladas y zonas de pesca */
    private cl.sernapesca.www.schema.EspeciesType[] especies;

    private org.w3.www._2000._09.xmldsig.SignatureType signature;

    public DesembarqueType() {
    }

    public DesembarqueType(
           java.math.BigInteger folio,
           org.apache.axis.types.Year agno,
           cl.gob.aem.valida.RunType armador,
           cl.sernapesca.www.schema.CodigoDescripcionType nave,
           cl.sernapesca.www.schema.CodigoDescripcionType puerto,
           cl.gob.aem.valida.FechaType fechaZarpe,
           cl.gob.aem.valida.FechaType fechaLlegada,
           cl.sernapesca.www.schema.CodigoDescripcionType arte,
           cl.sernapesca.www.schema.CodigoDescripcionType regimen,
           cl.sernapesca.www.schema.EspeciesType[] especies,
           org.w3.www._2000._09.xmldsig.SignatureType signature) {
           this.folio = folio;
           this.agno = agno;
           this.armador = armador;
           this.nave = nave;
           this.puerto = puerto;
           this.fechaZarpe = fechaZarpe;
           this.fechaLlegada = fechaLlegada;
           this.arte = arte;
           this.regimen = regimen;
           this.especies = especies;
           this.signature = signature;
    }


    /**
     * Gets the folio value for this DesembarqueType.
     * 
     * @return folio   * Número de folio del documento de desembarque
     */
    public java.math.BigInteger getFolio() {
        return folio;
    }


    /**
     * Sets the folio value for this DesembarqueType.
     * 
     * @param folio   * Número de folio del documento de desembarque
     */
    public void setFolio(java.math.BigInteger folio) {
        this.folio = folio;
    }


    /**
     * Gets the agno value for this DesembarqueType.
     * 
     * @return agno   * Año de desembarque
     */
    public org.apache.axis.types.Year getAgno() {
        return agno;
    }


    /**
     * Sets the agno value for this DesembarqueType.
     * 
     * @param agno   * Año de desembarque
     */
    public void setAgno(org.apache.axis.types.Year agno) {
        this.agno = agno;
    }


    /**
     * Gets the armador value for this DesembarqueType.
     * 
     * @return armador   * Run el Armador
     */
    public cl.gob.aem.valida.RunType getArmador() {
        return armador;
    }


    /**
     * Sets the armador value for this DesembarqueType.
     * 
     * @param armador   * Run el Armador
     */
    public void setArmador(cl.gob.aem.valida.RunType armador) {
        this.armador = armador;
    }


    /**
     * Gets the nave value for this DesembarqueType.
     * 
     * @return nave   * Identificación de la Nave del Desembarque
     */
    public cl.sernapesca.www.schema.CodigoDescripcionType getNave() {
        return nave;
    }


    /**
     * Sets the nave value for this DesembarqueType.
     * 
     * @param nave   * Identificación de la Nave del Desembarque
     */
    public void setNave(cl.sernapesca.www.schema.CodigoDescripcionType nave) {
        this.nave = nave;
    }


    /**
     * Gets the puerto value for this DesembarqueType.
     * 
     * @return puerto   * Identificación del Puerto donde se realiza el desembarque
     */
    public cl.sernapesca.www.schema.CodigoDescripcionType getPuerto() {
        return puerto;
    }


    /**
     * Sets the puerto value for this DesembarqueType.
     * 
     * @param puerto   * Identificación del Puerto donde se realiza el desembarque
     */
    public void setPuerto(cl.sernapesca.www.schema.CodigoDescripcionType puerto) {
        this.puerto = puerto;
    }


    /**
     * Gets the fechaZarpe value for this DesembarqueType.
     * 
     * @return fechaZarpe   * Fecha del Zarpe del Desembarque
     */
    public cl.gob.aem.valida.FechaType getFechaZarpe() {
        return fechaZarpe;
    }


    /**
     * Sets the fechaZarpe value for this DesembarqueType.
     * 
     * @param fechaZarpe   * Fecha del Zarpe del Desembarque
     */
    public void setFechaZarpe(cl.gob.aem.valida.FechaType fechaZarpe) {
        this.fechaZarpe = fechaZarpe;
    }


    /**
     * Gets the fechaLlegada value for this DesembarqueType.
     * 
     * @return fechaLlegada   * Fecha de Llegada de la Nave
     */
    public cl.gob.aem.valida.FechaType getFechaLlegada() {
        return fechaLlegada;
    }


    /**
     * Sets the fechaLlegada value for this DesembarqueType.
     * 
     * @param fechaLlegada   * Fecha de Llegada de la Nave
     */
    public void setFechaLlegada(cl.gob.aem.valida.FechaType fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }


    /**
     * Gets the arte value for this DesembarqueType.
     * 
     * @return arte   * Información del Arte de Pesca
     */
    public cl.sernapesca.www.schema.CodigoDescripcionType getArte() {
        return arte;
    }


    /**
     * Sets the arte value for this DesembarqueType.
     * 
     * @param arte   * Información del Arte de Pesca
     */
    public void setArte(cl.sernapesca.www.schema.CodigoDescripcionType arte) {
        this.arte = arte;
    }


    /**
     * Gets the regimen value for this DesembarqueType.
     * 
     * @return regimen   * Información del Régimen de Pesca
     */
    public cl.sernapesca.www.schema.CodigoDescripcionType getRegimen() {
        return regimen;
    }


    /**
     * Sets the regimen value for this DesembarqueType.
     * 
     * @param regimen   * Información del Régimen de Pesca
     */
    public void setRegimen(cl.sernapesca.www.schema.CodigoDescripcionType regimen) {
        this.regimen = regimen;
    }


    /**
     * Gets the especies value for this DesembarqueType.
     * 
     * @return especies   * Identificación de las Especies involucradas en el desembarque,
     * toneladas y zonas de pesca
     */
    public cl.sernapesca.www.schema.EspeciesType[] getEspecies() {
        return especies;
    }


    /**
     * Sets the especies value for this DesembarqueType.
     * 
     * @param especies   * Identificación de las Especies involucradas en el desembarque,
     * toneladas y zonas de pesca
     */
    public void setEspecies(cl.sernapesca.www.schema.EspeciesType[] especies) {
        this.especies = especies;
    }

    public cl.sernapesca.www.schema.EspeciesType getEspecies(int i) {
        return this.especies[i];
    }

    public void setEspecies(int i, cl.sernapesca.www.schema.EspeciesType _value) {
        this.especies[i] = _value;
    }


    /**
     * Gets the signature value for this DesembarqueType.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this DesembarqueType.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DesembarqueType)) return false;
        DesembarqueType other = (DesembarqueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.folio==null && other.getFolio()==null) || 
             (this.folio!=null &&
              this.folio.equals(other.getFolio()))) &&
            ((this.agno==null && other.getAgno()==null) || 
             (this.agno!=null &&
              this.agno.equals(other.getAgno()))) &&
            ((this.armador==null && other.getArmador()==null) || 
             (this.armador!=null &&
              this.armador.equals(other.getArmador()))) &&
            ((this.nave==null && other.getNave()==null) || 
             (this.nave!=null &&
              this.nave.equals(other.getNave()))) &&
            ((this.puerto==null && other.getPuerto()==null) || 
             (this.puerto!=null &&
              this.puerto.equals(other.getPuerto()))) &&
            ((this.fechaZarpe==null && other.getFechaZarpe()==null) || 
             (this.fechaZarpe!=null &&
              this.fechaZarpe.equals(other.getFechaZarpe()))) &&
            ((this.fechaLlegada==null && other.getFechaLlegada()==null) || 
             (this.fechaLlegada!=null &&
              this.fechaLlegada.equals(other.getFechaLlegada()))) &&
            ((this.arte==null && other.getArte()==null) || 
             (this.arte!=null &&
              this.arte.equals(other.getArte()))) &&
            ((this.regimen==null && other.getRegimen()==null) || 
             (this.regimen!=null &&
              this.regimen.equals(other.getRegimen()))) &&
            ((this.especies==null && other.getEspecies()==null) || 
             (this.especies!=null &&
              java.util.Arrays.equals(this.especies, other.getEspecies()))) &&
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
        if (getFolio() != null) {
            _hashCode += getFolio().hashCode();
        }
        if (getAgno() != null) {
            _hashCode += getAgno().hashCode();
        }
        if (getArmador() != null) {
            _hashCode += getArmador().hashCode();
        }
        if (getNave() != null) {
            _hashCode += getNave().hashCode();
        }
        if (getPuerto() != null) {
            _hashCode += getPuerto().hashCode();
        }
        if (getFechaZarpe() != null) {
            _hashCode += getFechaZarpe().hashCode();
        }
        if (getFechaLlegada() != null) {
            _hashCode += getFechaLlegada().hashCode();
        }
        if (getArte() != null) {
            _hashCode += getArte().hashCode();
        }
        if (getRegimen() != null) {
            _hashCode += getRegimen().hashCode();
        }
        if (getEspecies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEspecies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEspecies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DesembarqueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "DesembarqueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Folio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Agno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Armador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Nave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "CodigoDescripcionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puerto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Puerto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "CodigoDescripcionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaZarpe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "FechaZarpe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaLlegada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "FechaLlegada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Arte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "CodigoDescripcionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regimen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Regimen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "CodigoDescripcionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("especies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "Especies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sernapesca.cl/schema", "EspeciesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
