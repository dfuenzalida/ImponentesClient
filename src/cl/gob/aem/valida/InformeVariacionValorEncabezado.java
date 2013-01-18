/**
 * InformeVariacionValorEncabezado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformeVariacionValorEncabezado  implements java.io.Serializable {
    /* Código del Despachador */
    private java.lang.String despachador;

    /* Fecha de Presentación de IVV en Aduanas */
    private cl.gob.aem.valida.FechaType fechaPresentacion;

    /* Tipo de Operación */
    private org.apache.axis.types.PositiveInteger tipoOperacion;

    /* Número del IVV */
    private org.apache.axis.types.PositiveInteger numeroIVV;

    /* Dígito Verificador del Número del IVV */
    private java.lang.String digitoVerificadorIVV;

    /* RUT Exportador */
    private cl.gob.aem.valida.RunType rutExportador;

    /* Nombre Completo del Exportador */
    private cl.gob.aem.valida.NombreType nombreExportador;

    /* Porcentaje Participación del Exportador */
    private java.math.BigDecimal porcentajeExportador;

    /* Dirección del Exportador */
    private java.lang.String direccionExportador;

    /* Código Comuna de la Dirección del Exportador */
    private org.apache.axis.types.PositiveInteger codigoComunaExportador;

    /* Código del País de destino de la exportación */
    private cl.gob.aem.valida.CodigoDescripcion3Type paisDestino;

    /* Fecha de Inicio del periodo de comercialización */
    private cl.gob.aem.valida.FechaType periodoComercializacionDesde;

    /* Fecha de Término del periodo de comercialización */
    private cl.gob.aem.valida.FechaType periodoComercializacionHasta;

    /* Moneda en que se realiza la transacción */
    private cl.gob.aem.valida.CodigoDescripcion3Type moneda;

    /* Modalidad de Venta */
    private cl.gob.aem.valida.CodigoDescripcion1Type modalidadVenta;

    /* Identifica Cláusula de venta */
    private cl.gob.aem.valida.CodigoDescripcion2Type clausulaVenta;

    /* Forma de Pago de la venta */
    private cl.gob.aem.valida.CodigoDescripcion2Type formaPago;

    /* Valor de la Cláusula de venta */
    private java.math.BigDecimal valorClausulaVenta;

    /* Valor de la comisión exterior de la venta */
    private java.math.BigDecimal valorComisionExterior;

    /* Otros gastos deducibles */
    private java.math.BigDecimal otrosGastosDeducibles;

    /* Valor líquido de Retorno */
    private java.math.BigDecimal valorLiquidoRetorno;

    /* Valor total Item */
    private org.apache.axis.types.PositiveInteger totalItem;

    /* Valor Total del FOB */
    private java.math.BigDecimal totalValorFOB;

    /* Valor del Flete */
    private java.math.BigDecimal valorFlete;

    /* Valor del Seguro */
    private java.math.BigDecimal valorSeguro;

    /* Valor del CIF */
    private java.math.BigDecimal valorCIF;

    /* Observaciones generales */
    private java.lang.String observaciones;

    public InformeVariacionValorEncabezado() {
    }

    public InformeVariacionValorEncabezado(
           java.lang.String despachador,
           cl.gob.aem.valida.FechaType fechaPresentacion,
           org.apache.axis.types.PositiveInteger tipoOperacion,
           org.apache.axis.types.PositiveInteger numeroIVV,
           java.lang.String digitoVerificadorIVV,
           cl.gob.aem.valida.RunType rutExportador,
           cl.gob.aem.valida.NombreType nombreExportador,
           java.math.BigDecimal porcentajeExportador,
           java.lang.String direccionExportador,
           org.apache.axis.types.PositiveInteger codigoComunaExportador,
           cl.gob.aem.valida.CodigoDescripcion3Type paisDestino,
           cl.gob.aem.valida.FechaType periodoComercializacionDesde,
           cl.gob.aem.valida.FechaType periodoComercializacionHasta,
           cl.gob.aem.valida.CodigoDescripcion3Type moneda,
           cl.gob.aem.valida.CodigoDescripcion1Type modalidadVenta,
           cl.gob.aem.valida.CodigoDescripcion2Type clausulaVenta,
           cl.gob.aem.valida.CodigoDescripcion2Type formaPago,
           java.math.BigDecimal valorClausulaVenta,
           java.math.BigDecimal valorComisionExterior,
           java.math.BigDecimal otrosGastosDeducibles,
           java.math.BigDecimal valorLiquidoRetorno,
           org.apache.axis.types.PositiveInteger totalItem,
           java.math.BigDecimal totalValorFOB,
           java.math.BigDecimal valorFlete,
           java.math.BigDecimal valorSeguro,
           java.math.BigDecimal valorCIF,
           java.lang.String observaciones) {
           this.despachador = despachador;
           this.fechaPresentacion = fechaPresentacion;
           this.tipoOperacion = tipoOperacion;
           this.numeroIVV = numeroIVV;
           this.digitoVerificadorIVV = digitoVerificadorIVV;
           this.rutExportador = rutExportador;
           this.nombreExportador = nombreExportador;
           this.porcentajeExportador = porcentajeExportador;
           this.direccionExportador = direccionExportador;
           this.codigoComunaExportador = codigoComunaExportador;
           this.paisDestino = paisDestino;
           this.periodoComercializacionDesde = periodoComercializacionDesde;
           this.periodoComercializacionHasta = periodoComercializacionHasta;
           this.moneda = moneda;
           this.modalidadVenta = modalidadVenta;
           this.clausulaVenta = clausulaVenta;
           this.formaPago = formaPago;
           this.valorClausulaVenta = valorClausulaVenta;
           this.valorComisionExterior = valorComisionExterior;
           this.otrosGastosDeducibles = otrosGastosDeducibles;
           this.valorLiquidoRetorno = valorLiquidoRetorno;
           this.totalItem = totalItem;
           this.totalValorFOB = totalValorFOB;
           this.valorFlete = valorFlete;
           this.valorSeguro = valorSeguro;
           this.valorCIF = valorCIF;
           this.observaciones = observaciones;
    }


    /**
     * Gets the despachador value for this InformeVariacionValorEncabezado.
     * 
     * @return despachador   * Código del Despachador
     */
    public java.lang.String getDespachador() {
        return despachador;
    }


    /**
     * Sets the despachador value for this InformeVariacionValorEncabezado.
     * 
     * @param despachador   * Código del Despachador
     */
    public void setDespachador(java.lang.String despachador) {
        this.despachador = despachador;
    }


    /**
     * Gets the fechaPresentacion value for this InformeVariacionValorEncabezado.
     * 
     * @return fechaPresentacion   * Fecha de Presentación de IVV en Aduanas
     */
    public cl.gob.aem.valida.FechaType getFechaPresentacion() {
        return fechaPresentacion;
    }


    /**
     * Sets the fechaPresentacion value for this InformeVariacionValorEncabezado.
     * 
     * @param fechaPresentacion   * Fecha de Presentación de IVV en Aduanas
     */
    public void setFechaPresentacion(cl.gob.aem.valida.FechaType fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }


    /**
     * Gets the tipoOperacion value for this InformeVariacionValorEncabezado.
     * 
     * @return tipoOperacion   * Tipo de Operación
     */
    public org.apache.axis.types.PositiveInteger getTipoOperacion() {
        return tipoOperacion;
    }


    /**
     * Sets the tipoOperacion value for this InformeVariacionValorEncabezado.
     * 
     * @param tipoOperacion   * Tipo de Operación
     */
    public void setTipoOperacion(org.apache.axis.types.PositiveInteger tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }


    /**
     * Gets the numeroIVV value for this InformeVariacionValorEncabezado.
     * 
     * @return numeroIVV   * Número del IVV
     */
    public org.apache.axis.types.PositiveInteger getNumeroIVV() {
        return numeroIVV;
    }


    /**
     * Sets the numeroIVV value for this InformeVariacionValorEncabezado.
     * 
     * @param numeroIVV   * Número del IVV
     */
    public void setNumeroIVV(org.apache.axis.types.PositiveInteger numeroIVV) {
        this.numeroIVV = numeroIVV;
    }


    /**
     * Gets the digitoVerificadorIVV value for this InformeVariacionValorEncabezado.
     * 
     * @return digitoVerificadorIVV   * Dígito Verificador del Número del IVV
     */
    public java.lang.String getDigitoVerificadorIVV() {
        return digitoVerificadorIVV;
    }


    /**
     * Sets the digitoVerificadorIVV value for this InformeVariacionValorEncabezado.
     * 
     * @param digitoVerificadorIVV   * Dígito Verificador del Número del IVV
     */
    public void setDigitoVerificadorIVV(java.lang.String digitoVerificadorIVV) {
        this.digitoVerificadorIVV = digitoVerificadorIVV;
    }


    /**
     * Gets the rutExportador value for this InformeVariacionValorEncabezado.
     * 
     * @return rutExportador   * RUT Exportador
     */
    public cl.gob.aem.valida.RunType getRutExportador() {
        return rutExportador;
    }


    /**
     * Sets the rutExportador value for this InformeVariacionValorEncabezado.
     * 
     * @param rutExportador   * RUT Exportador
     */
    public void setRutExportador(cl.gob.aem.valida.RunType rutExportador) {
        this.rutExportador = rutExportador;
    }


    /**
     * Gets the nombreExportador value for this InformeVariacionValorEncabezado.
     * 
     * @return nombreExportador   * Nombre Completo del Exportador
     */
    public cl.gob.aem.valida.NombreType getNombreExportador() {
        return nombreExportador;
    }


    /**
     * Sets the nombreExportador value for this InformeVariacionValorEncabezado.
     * 
     * @param nombreExportador   * Nombre Completo del Exportador
     */
    public void setNombreExportador(cl.gob.aem.valida.NombreType nombreExportador) {
        this.nombreExportador = nombreExportador;
    }


    /**
     * Gets the porcentajeExportador value for this InformeVariacionValorEncabezado.
     * 
     * @return porcentajeExportador   * Porcentaje Participación del Exportador
     */
    public java.math.BigDecimal getPorcentajeExportador() {
        return porcentajeExportador;
    }


    /**
     * Sets the porcentajeExportador value for this InformeVariacionValorEncabezado.
     * 
     * @param porcentajeExportador   * Porcentaje Participación del Exportador
     */
    public void setPorcentajeExportador(java.math.BigDecimal porcentajeExportador) {
        this.porcentajeExportador = porcentajeExportador;
    }


    /**
     * Gets the direccionExportador value for this InformeVariacionValorEncabezado.
     * 
     * @return direccionExportador   * Dirección del Exportador
     */
    public java.lang.String getDireccionExportador() {
        return direccionExportador;
    }


    /**
     * Sets the direccionExportador value for this InformeVariacionValorEncabezado.
     * 
     * @param direccionExportador   * Dirección del Exportador
     */
    public void setDireccionExportador(java.lang.String direccionExportador) {
        this.direccionExportador = direccionExportador;
    }


    /**
     * Gets the codigoComunaExportador value for this InformeVariacionValorEncabezado.
     * 
     * @return codigoComunaExportador   * Código Comuna de la Dirección del Exportador
     */
    public org.apache.axis.types.PositiveInteger getCodigoComunaExportador() {
        return codigoComunaExportador;
    }


    /**
     * Sets the codigoComunaExportador value for this InformeVariacionValorEncabezado.
     * 
     * @param codigoComunaExportador   * Código Comuna de la Dirección del Exportador
     */
    public void setCodigoComunaExportador(org.apache.axis.types.PositiveInteger codigoComunaExportador) {
        this.codigoComunaExportador = codigoComunaExportador;
    }


    /**
     * Gets the paisDestino value for this InformeVariacionValorEncabezado.
     * 
     * @return paisDestino   * Código del País de destino de la exportación
     */
    public cl.gob.aem.valida.CodigoDescripcion3Type getPaisDestino() {
        return paisDestino;
    }


    /**
     * Sets the paisDestino value for this InformeVariacionValorEncabezado.
     * 
     * @param paisDestino   * Código del País de destino de la exportación
     */
    public void setPaisDestino(cl.gob.aem.valida.CodigoDescripcion3Type paisDestino) {
        this.paisDestino = paisDestino;
    }


    /**
     * Gets the periodoComercializacionDesde value for this InformeVariacionValorEncabezado.
     * 
     * @return periodoComercializacionDesde   * Fecha de Inicio del periodo de comercialización
     */
    public cl.gob.aem.valida.FechaType getPeriodoComercializacionDesde() {
        return periodoComercializacionDesde;
    }


    /**
     * Sets the periodoComercializacionDesde value for this InformeVariacionValorEncabezado.
     * 
     * @param periodoComercializacionDesde   * Fecha de Inicio del periodo de comercialización
     */
    public void setPeriodoComercializacionDesde(cl.gob.aem.valida.FechaType periodoComercializacionDesde) {
        this.periodoComercializacionDesde = periodoComercializacionDesde;
    }


    /**
     * Gets the periodoComercializacionHasta value for this InformeVariacionValorEncabezado.
     * 
     * @return periodoComercializacionHasta   * Fecha de Término del periodo de comercialización
     */
    public cl.gob.aem.valida.FechaType getPeriodoComercializacionHasta() {
        return periodoComercializacionHasta;
    }


    /**
     * Sets the periodoComercializacionHasta value for this InformeVariacionValorEncabezado.
     * 
     * @param periodoComercializacionHasta   * Fecha de Término del periodo de comercialización
     */
    public void setPeriodoComercializacionHasta(cl.gob.aem.valida.FechaType periodoComercializacionHasta) {
        this.periodoComercializacionHasta = periodoComercializacionHasta;
    }


    /**
     * Gets the moneda value for this InformeVariacionValorEncabezado.
     * 
     * @return moneda   * Moneda en que se realiza la transacción
     */
    public cl.gob.aem.valida.CodigoDescripcion3Type getMoneda() {
        return moneda;
    }


    /**
     * Sets the moneda value for this InformeVariacionValorEncabezado.
     * 
     * @param moneda   * Moneda en que se realiza la transacción
     */
    public void setMoneda(cl.gob.aem.valida.CodigoDescripcion3Type moneda) {
        this.moneda = moneda;
    }


    /**
     * Gets the modalidadVenta value for this InformeVariacionValorEncabezado.
     * 
     * @return modalidadVenta   * Modalidad de Venta
     */
    public cl.gob.aem.valida.CodigoDescripcion1Type getModalidadVenta() {
        return modalidadVenta;
    }


    /**
     * Sets the modalidadVenta value for this InformeVariacionValorEncabezado.
     * 
     * @param modalidadVenta   * Modalidad de Venta
     */
    public void setModalidadVenta(cl.gob.aem.valida.CodigoDescripcion1Type modalidadVenta) {
        this.modalidadVenta = modalidadVenta;
    }


    /**
     * Gets the clausulaVenta value for this InformeVariacionValorEncabezado.
     * 
     * @return clausulaVenta   * Identifica Cláusula de venta
     */
    public cl.gob.aem.valida.CodigoDescripcion2Type getClausulaVenta() {
        return clausulaVenta;
    }


    /**
     * Sets the clausulaVenta value for this InformeVariacionValorEncabezado.
     * 
     * @param clausulaVenta   * Identifica Cláusula de venta
     */
    public void setClausulaVenta(cl.gob.aem.valida.CodigoDescripcion2Type clausulaVenta) {
        this.clausulaVenta = clausulaVenta;
    }


    /**
     * Gets the formaPago value for this InformeVariacionValorEncabezado.
     * 
     * @return formaPago   * Forma de Pago de la venta
     */
    public cl.gob.aem.valida.CodigoDescripcion2Type getFormaPago() {
        return formaPago;
    }


    /**
     * Sets the formaPago value for this InformeVariacionValorEncabezado.
     * 
     * @param formaPago   * Forma de Pago de la venta
     */
    public void setFormaPago(cl.gob.aem.valida.CodigoDescripcion2Type formaPago) {
        this.formaPago = formaPago;
    }


    /**
     * Gets the valorClausulaVenta value for this InformeVariacionValorEncabezado.
     * 
     * @return valorClausulaVenta   * Valor de la Cláusula de venta
     */
    public java.math.BigDecimal getValorClausulaVenta() {
        return valorClausulaVenta;
    }


    /**
     * Sets the valorClausulaVenta value for this InformeVariacionValorEncabezado.
     * 
     * @param valorClausulaVenta   * Valor de la Cláusula de venta
     */
    public void setValorClausulaVenta(java.math.BigDecimal valorClausulaVenta) {
        this.valorClausulaVenta = valorClausulaVenta;
    }


    /**
     * Gets the valorComisionExterior value for this InformeVariacionValorEncabezado.
     * 
     * @return valorComisionExterior   * Valor de la comisión exterior de la venta
     */
    public java.math.BigDecimal getValorComisionExterior() {
        return valorComisionExterior;
    }


    /**
     * Sets the valorComisionExterior value for this InformeVariacionValorEncabezado.
     * 
     * @param valorComisionExterior   * Valor de la comisión exterior de la venta
     */
    public void setValorComisionExterior(java.math.BigDecimal valorComisionExterior) {
        this.valorComisionExterior = valorComisionExterior;
    }


    /**
     * Gets the otrosGastosDeducibles value for this InformeVariacionValorEncabezado.
     * 
     * @return otrosGastosDeducibles   * Otros gastos deducibles
     */
    public java.math.BigDecimal getOtrosGastosDeducibles() {
        return otrosGastosDeducibles;
    }


    /**
     * Sets the otrosGastosDeducibles value for this InformeVariacionValorEncabezado.
     * 
     * @param otrosGastosDeducibles   * Otros gastos deducibles
     */
    public void setOtrosGastosDeducibles(java.math.BigDecimal otrosGastosDeducibles) {
        this.otrosGastosDeducibles = otrosGastosDeducibles;
    }


    /**
     * Gets the valorLiquidoRetorno value for this InformeVariacionValorEncabezado.
     * 
     * @return valorLiquidoRetorno   * Valor líquido de Retorno
     */
    public java.math.BigDecimal getValorLiquidoRetorno() {
        return valorLiquidoRetorno;
    }


    /**
     * Sets the valorLiquidoRetorno value for this InformeVariacionValorEncabezado.
     * 
     * @param valorLiquidoRetorno   * Valor líquido de Retorno
     */
    public void setValorLiquidoRetorno(java.math.BigDecimal valorLiquidoRetorno) {
        this.valorLiquidoRetorno = valorLiquidoRetorno;
    }


    /**
     * Gets the totalItem value for this InformeVariacionValorEncabezado.
     * 
     * @return totalItem   * Valor total Item
     */
    public org.apache.axis.types.PositiveInteger getTotalItem() {
        return totalItem;
    }


    /**
     * Sets the totalItem value for this InformeVariacionValorEncabezado.
     * 
     * @param totalItem   * Valor total Item
     */
    public void setTotalItem(org.apache.axis.types.PositiveInteger totalItem) {
        this.totalItem = totalItem;
    }


    /**
     * Gets the totalValorFOB value for this InformeVariacionValorEncabezado.
     * 
     * @return totalValorFOB   * Valor Total del FOB
     */
    public java.math.BigDecimal getTotalValorFOB() {
        return totalValorFOB;
    }


    /**
     * Sets the totalValorFOB value for this InformeVariacionValorEncabezado.
     * 
     * @param totalValorFOB   * Valor Total del FOB
     */
    public void setTotalValorFOB(java.math.BigDecimal totalValorFOB) {
        this.totalValorFOB = totalValorFOB;
    }


    /**
     * Gets the valorFlete value for this InformeVariacionValorEncabezado.
     * 
     * @return valorFlete   * Valor del Flete
     */
    public java.math.BigDecimal getValorFlete() {
        return valorFlete;
    }


    /**
     * Sets the valorFlete value for this InformeVariacionValorEncabezado.
     * 
     * @param valorFlete   * Valor del Flete
     */
    public void setValorFlete(java.math.BigDecimal valorFlete) {
        this.valorFlete = valorFlete;
    }


    /**
     * Gets the valorSeguro value for this InformeVariacionValorEncabezado.
     * 
     * @return valorSeguro   * Valor del Seguro
     */
    public java.math.BigDecimal getValorSeguro() {
        return valorSeguro;
    }


    /**
     * Sets the valorSeguro value for this InformeVariacionValorEncabezado.
     * 
     * @param valorSeguro   * Valor del Seguro
     */
    public void setValorSeguro(java.math.BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
    }


    /**
     * Gets the valorCIF value for this InformeVariacionValorEncabezado.
     * 
     * @return valorCIF   * Valor del CIF
     */
    public java.math.BigDecimal getValorCIF() {
        return valorCIF;
    }


    /**
     * Sets the valorCIF value for this InformeVariacionValorEncabezado.
     * 
     * @param valorCIF   * Valor del CIF
     */
    public void setValorCIF(java.math.BigDecimal valorCIF) {
        this.valorCIF = valorCIF;
    }


    /**
     * Gets the observaciones value for this InformeVariacionValorEncabezado.
     * 
     * @return observaciones   * Observaciones generales
     */
    public java.lang.String getObservaciones() {
        return observaciones;
    }


    /**
     * Sets the observaciones value for this InformeVariacionValorEncabezado.
     * 
     * @param observaciones   * Observaciones generales
     */
    public void setObservaciones(java.lang.String observaciones) {
        this.observaciones = observaciones;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformeVariacionValorEncabezado)) return false;
        InformeVariacionValorEncabezado other = (InformeVariacionValorEncabezado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.despachador==null && other.getDespachador()==null) || 
             (this.despachador!=null &&
              this.despachador.equals(other.getDespachador()))) &&
            ((this.fechaPresentacion==null && other.getFechaPresentacion()==null) || 
             (this.fechaPresentacion!=null &&
              this.fechaPresentacion.equals(other.getFechaPresentacion()))) &&
            ((this.tipoOperacion==null && other.getTipoOperacion()==null) || 
             (this.tipoOperacion!=null &&
              this.tipoOperacion.equals(other.getTipoOperacion()))) &&
            ((this.numeroIVV==null && other.getNumeroIVV()==null) || 
             (this.numeroIVV!=null &&
              this.numeroIVV.equals(other.getNumeroIVV()))) &&
            ((this.digitoVerificadorIVV==null && other.getDigitoVerificadorIVV()==null) || 
             (this.digitoVerificadorIVV!=null &&
              this.digitoVerificadorIVV.equals(other.getDigitoVerificadorIVV()))) &&
            ((this.rutExportador==null && other.getRutExportador()==null) || 
             (this.rutExportador!=null &&
              this.rutExportador.equals(other.getRutExportador()))) &&
            ((this.nombreExportador==null && other.getNombreExportador()==null) || 
             (this.nombreExportador!=null &&
              this.nombreExportador.equals(other.getNombreExportador()))) &&
            ((this.porcentajeExportador==null && other.getPorcentajeExportador()==null) || 
             (this.porcentajeExportador!=null &&
              this.porcentajeExportador.equals(other.getPorcentajeExportador()))) &&
            ((this.direccionExportador==null && other.getDireccionExportador()==null) || 
             (this.direccionExportador!=null &&
              this.direccionExportador.equals(other.getDireccionExportador()))) &&
            ((this.codigoComunaExportador==null && other.getCodigoComunaExportador()==null) || 
             (this.codigoComunaExportador!=null &&
              this.codigoComunaExportador.equals(other.getCodigoComunaExportador()))) &&
            ((this.paisDestino==null && other.getPaisDestino()==null) || 
             (this.paisDestino!=null &&
              this.paisDestino.equals(other.getPaisDestino()))) &&
            ((this.periodoComercializacionDesde==null && other.getPeriodoComercializacionDesde()==null) || 
             (this.periodoComercializacionDesde!=null &&
              this.periodoComercializacionDesde.equals(other.getPeriodoComercializacionDesde()))) &&
            ((this.periodoComercializacionHasta==null && other.getPeriodoComercializacionHasta()==null) || 
             (this.periodoComercializacionHasta!=null &&
              this.periodoComercializacionHasta.equals(other.getPeriodoComercializacionHasta()))) &&
            ((this.moneda==null && other.getMoneda()==null) || 
             (this.moneda!=null &&
              this.moneda.equals(other.getMoneda()))) &&
            ((this.modalidadVenta==null && other.getModalidadVenta()==null) || 
             (this.modalidadVenta!=null &&
              this.modalidadVenta.equals(other.getModalidadVenta()))) &&
            ((this.clausulaVenta==null && other.getClausulaVenta()==null) || 
             (this.clausulaVenta!=null &&
              this.clausulaVenta.equals(other.getClausulaVenta()))) &&
            ((this.formaPago==null && other.getFormaPago()==null) || 
             (this.formaPago!=null &&
              this.formaPago.equals(other.getFormaPago()))) &&
            ((this.valorClausulaVenta==null && other.getValorClausulaVenta()==null) || 
             (this.valorClausulaVenta!=null &&
              this.valorClausulaVenta.equals(other.getValorClausulaVenta()))) &&
            ((this.valorComisionExterior==null && other.getValorComisionExterior()==null) || 
             (this.valorComisionExterior!=null &&
              this.valorComisionExterior.equals(other.getValorComisionExterior()))) &&
            ((this.otrosGastosDeducibles==null && other.getOtrosGastosDeducibles()==null) || 
             (this.otrosGastosDeducibles!=null &&
              this.otrosGastosDeducibles.equals(other.getOtrosGastosDeducibles()))) &&
            ((this.valorLiquidoRetorno==null && other.getValorLiquidoRetorno()==null) || 
             (this.valorLiquidoRetorno!=null &&
              this.valorLiquidoRetorno.equals(other.getValorLiquidoRetorno()))) &&
            ((this.totalItem==null && other.getTotalItem()==null) || 
             (this.totalItem!=null &&
              this.totalItem.equals(other.getTotalItem()))) &&
            ((this.totalValorFOB==null && other.getTotalValorFOB()==null) || 
             (this.totalValorFOB!=null &&
              this.totalValorFOB.equals(other.getTotalValorFOB()))) &&
            ((this.valorFlete==null && other.getValorFlete()==null) || 
             (this.valorFlete!=null &&
              this.valorFlete.equals(other.getValorFlete()))) &&
            ((this.valorSeguro==null && other.getValorSeguro()==null) || 
             (this.valorSeguro!=null &&
              this.valorSeguro.equals(other.getValorSeguro()))) &&
            ((this.valorCIF==null && other.getValorCIF()==null) || 
             (this.valorCIF!=null &&
              this.valorCIF.equals(other.getValorCIF()))) &&
            ((this.observaciones==null && other.getObservaciones()==null) || 
             (this.observaciones!=null &&
              this.observaciones.equals(other.getObservaciones())));
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
        if (getDespachador() != null) {
            _hashCode += getDespachador().hashCode();
        }
        if (getFechaPresentacion() != null) {
            _hashCode += getFechaPresentacion().hashCode();
        }
        if (getTipoOperacion() != null) {
            _hashCode += getTipoOperacion().hashCode();
        }
        if (getNumeroIVV() != null) {
            _hashCode += getNumeroIVV().hashCode();
        }
        if (getDigitoVerificadorIVV() != null) {
            _hashCode += getDigitoVerificadorIVV().hashCode();
        }
        if (getRutExportador() != null) {
            _hashCode += getRutExportador().hashCode();
        }
        if (getNombreExportador() != null) {
            _hashCode += getNombreExportador().hashCode();
        }
        if (getPorcentajeExportador() != null) {
            _hashCode += getPorcentajeExportador().hashCode();
        }
        if (getDireccionExportador() != null) {
            _hashCode += getDireccionExportador().hashCode();
        }
        if (getCodigoComunaExportador() != null) {
            _hashCode += getCodigoComunaExportador().hashCode();
        }
        if (getPaisDestino() != null) {
            _hashCode += getPaisDestino().hashCode();
        }
        if (getPeriodoComercializacionDesde() != null) {
            _hashCode += getPeriodoComercializacionDesde().hashCode();
        }
        if (getPeriodoComercializacionHasta() != null) {
            _hashCode += getPeriodoComercializacionHasta().hashCode();
        }
        if (getMoneda() != null) {
            _hashCode += getMoneda().hashCode();
        }
        if (getModalidadVenta() != null) {
            _hashCode += getModalidadVenta().hashCode();
        }
        if (getClausulaVenta() != null) {
            _hashCode += getClausulaVenta().hashCode();
        }
        if (getFormaPago() != null) {
            _hashCode += getFormaPago().hashCode();
        }
        if (getValorClausulaVenta() != null) {
            _hashCode += getValorClausulaVenta().hashCode();
        }
        if (getValorComisionExterior() != null) {
            _hashCode += getValorComisionExterior().hashCode();
        }
        if (getOtrosGastosDeducibles() != null) {
            _hashCode += getOtrosGastosDeducibles().hashCode();
        }
        if (getValorLiquidoRetorno() != null) {
            _hashCode += getValorLiquidoRetorno().hashCode();
        }
        if (getTotalItem() != null) {
            _hashCode += getTotalItem().hashCode();
        }
        if (getTotalValorFOB() != null) {
            _hashCode += getTotalValorFOB().hashCode();
        }
        if (getValorFlete() != null) {
            _hashCode += getValorFlete().hashCode();
        }
        if (getValorSeguro() != null) {
            _hashCode += getValorSeguro().hashCode();
        }
        if (getValorCIF() != null) {
            _hashCode += getValorCIF().hashCode();
        }
        if (getObservaciones() != null) {
            _hashCode += getObservaciones().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformeVariacionValorEncabezado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>InformeVariacionValor>Encabezado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("despachador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Despachador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPresentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaPresentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TipoOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIVV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NumeroIVV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitoVerificadorIVV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DigitoVerificadorIVV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutExportador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "RutExportador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "runType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreExportador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NombreExportador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nombreType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentajeExportador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "PorcentajeExportador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionExportador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "DireccionExportador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoComunaExportador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoComunaExportador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paisDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "PaisDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoDescripcion3Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoComercializacionDesde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "PeriodoComercializacionDesde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoComercializacionHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "PeriodoComercializacionHasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Moneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoDescripcion3Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalidadVenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ModalidadVenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoDescripcion1Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clausulaVenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ClausulaVenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoDescripcion2Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FormaPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoDescripcion2Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorClausulaVenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ValorClausulaVenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorComisionExterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ValorComisionExterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otrosGastosDeducibles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "OtrosGastosDeducibles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorLiquidoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ValorLiquidoRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TotalItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorFOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TotalValorFOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorFlete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ValorFlete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorSeguro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ValorSeguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorCIF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ValorCIF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Observaciones"));
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
