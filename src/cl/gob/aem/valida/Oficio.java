/**
 * Oficio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class Oficio  extends cl.gob.aem.valida.OficioType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.apache.axis.message.MessageElement [] _any;

    public Oficio() {
    }
    
    /*

    public Oficio(
           org.apache.axis.types.NMToken schemaVersion,
           java.lang.String ID,
           java.lang.String numeroOficio,
           cl.gob.aem.valida.OficioTypeNivelConfidencialidad nivelConfidencialidad,
           java.lang.String tipo,
           java.lang.String materia,
           java.lang.String antecedente,
           java.lang.String lugar,
           java.util.Date fechaEmision,
           cl.gob.aem.valida.IdentifiacionInstitucionOPersonaType emisor,
           cl.gob.aem.valida.IdentifiacionInstitucionOPersonaType destinatario,
           cl.gob.aem.valida.OficioTypeMayorJerarquiaEmisorDestinatario mayorJerarquiaEmisorDestinatario,
           cl.gob.aem.valida.TextoEstructuradoXHTMLType cuerpo,
           cl.gob.aem.valida.ListaDistribucionTypeReceptor[] listaDistribucion,
           cl.gob.aem.valida.AdjuntosBinariosType adjuntosBinarios,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           org.apache.axis.message.MessageElement [] _any) {
        super(
            schemaVersion,
            ID,
            numeroOficio,
            nivelConfidencialidad,
            tipo,
            materia,
            antecedente,
            lugar,
            fechaEmision,
            emisor,
            destinatario,
            mayorJerarquiaEmisorDestinatario,
            cuerpo,
            listaDistribucion,
            adjuntosBinarios,
            signature);
        this._any = _any;
    }
    */


    /**
     * Gets the _any value for this Oficio.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this Oficio.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Oficio)) return false;
        Oficio other = (Oficio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        int _hashCode = super.hashCode();
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
        new org.apache.axis.description.TypeDesc(Oficio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">Oficio"));
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
