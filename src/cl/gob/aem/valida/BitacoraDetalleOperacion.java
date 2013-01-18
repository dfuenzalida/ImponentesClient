/**
 * BitacoraDetalleOperacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class BitacoraDetalleOperacion  implements java.io.Serializable {
    /* Identificador unico de la operacion para el dia */
    private java.math.BigInteger idOperacion;

    /* Matricula de la Aeronave que realiza la operación */
    private java.lang.String matricula;

    /* Modelo de la aeronave que realiza la operacion aeronautica */
    private java.lang.String modeloAeronave;

    /* Peso Maximo de Despegue para el modelo de aeronave (Unidad
     * de Medida Toneladas) */
    private java.math.BigDecimal pesoMaximoDespegue;

    /* Tipo de Operacion (A = Aterrizaje / D = Despegue) */
    private cl.gob.aem.valida.BitacoraDetalleOperacionTipoOperacion tipoOperacion;

    /* Tipo de Vuelo (N = Nacional / I = Internacional) */
    private cl.gob.aem.valida.BitacoraDetalleOperacionTipoVuelo tipoVuelo;

    /* Vuelo Regular (S = Si es Regular / N = No es Regular) */
    private cl.gob.aem.valida.BitacoraDetalleOperacionRegular regular;

    /* Fecha y Hora de la Operacion. */
    private cl.gob.aem.valida.FechaType fechaHoraOperacion;

    /* Codigo de Actividad del vuelo (Transporte de pasajeros, Carga,
     * etc.). */
    private java.lang.String actividad;

    /* Numero del Vuelo */
    private java.lang.String nroVuelo;

    /* Codigo de tres letras de la aerolinea que realizo la operacion */
    private java.lang.String aerolinea;

    /* Fecha y Hora en que la aeronave ingresa a la loza (cuando la
     * operacion es aterrizaje) o cuando se retira de la loza (cuando es
     * una operacion de despegue) */
    private cl.gob.aem.valida.FechaType fechaHoraIngresoRetiroLosa;

    /* Fecha y hora en que la aeronave se retira fuera de la loza
     * (a un hangar) en caso de ser aterrizaje / Fecha y hora en que la aeronave
     * vuelve a ingresar a la loza desde un hangar, cuando es una operacion
     * de despegue. */
    private cl.gob.aem.valida.FechaType fechaHoraIngresoRetiroHangar;

    /* Codigo OACI de la procedencia (cuando la operacion es un aterrizaje)
     * o codigo OACI del destino (cuando la operacion es un despegue) */
    private java.lang.String procedenciaDestino;

    /* Numero de la pista utilizada para la operacion (atterrizaje
     * o despegue) */
    private java.lang.String nroPista;

    /* Codigo de la ruta aerea por la cual la aeronave realiza la
     * operacion */
    private java.lang.String aerovia;

    /* Indicador de uso de luz (S = Operacion uso luz de la pista
     * / N = Operacion no uso luz de la pista) */
    private cl.gob.aem.valida.BitacoraDetalleOperacionUsoLuz usoLuz;

    /* Indicador de uso de ILS (Instrumental Landing System) (S =
     * Si uso ILS / N = No uso ILS) */
    private cl.gob.aem.valida.BitacoraDetalleOperacionUsoIls usoIls;

    /* Observacion o registro de eventos respecto a la operacion aeronautica */
    private java.lang.String observacion;

    public BitacoraDetalleOperacion() {
    }

    public BitacoraDetalleOperacion(
           java.math.BigInteger idOperacion,
           java.lang.String matricula,
           java.lang.String modeloAeronave,
           java.math.BigDecimal pesoMaximoDespegue,
           cl.gob.aem.valida.BitacoraDetalleOperacionTipoOperacion tipoOperacion,
           cl.gob.aem.valida.BitacoraDetalleOperacionTipoVuelo tipoVuelo,
           cl.gob.aem.valida.BitacoraDetalleOperacionRegular regular,
           cl.gob.aem.valida.FechaType fechaHoraOperacion,
           java.lang.String actividad,
           java.lang.String nroVuelo,
           java.lang.String aerolinea,
           cl.gob.aem.valida.FechaType fechaHoraIngresoRetiroLosa,
           cl.gob.aem.valida.FechaType fechaHoraIngresoRetiroHangar,
           java.lang.String procedenciaDestino,
           java.lang.String nroPista,
           java.lang.String aerovia,
           cl.gob.aem.valida.BitacoraDetalleOperacionUsoLuz usoLuz,
           cl.gob.aem.valida.BitacoraDetalleOperacionUsoIls usoIls,
           java.lang.String observacion) {
           this.idOperacion = idOperacion;
           this.matricula = matricula;
           this.modeloAeronave = modeloAeronave;
           this.pesoMaximoDespegue = pesoMaximoDespegue;
           this.tipoOperacion = tipoOperacion;
           this.tipoVuelo = tipoVuelo;
           this.regular = regular;
           this.fechaHoraOperacion = fechaHoraOperacion;
           this.actividad = actividad;
           this.nroVuelo = nroVuelo;
           this.aerolinea = aerolinea;
           this.fechaHoraIngresoRetiroLosa = fechaHoraIngresoRetiroLosa;
           this.fechaHoraIngresoRetiroHangar = fechaHoraIngresoRetiroHangar;
           this.procedenciaDestino = procedenciaDestino;
           this.nroPista = nroPista;
           this.aerovia = aerovia;
           this.usoLuz = usoLuz;
           this.usoIls = usoIls;
           this.observacion = observacion;
    }


    /**
     * Gets the idOperacion value for this BitacoraDetalleOperacion.
     * 
     * @return idOperacion   * Identificador unico de la operacion para el dia
     */
    public java.math.BigInteger getIdOperacion() {
        return idOperacion;
    }


    /**
     * Sets the idOperacion value for this BitacoraDetalleOperacion.
     * 
     * @param idOperacion   * Identificador unico de la operacion para el dia
     */
    public void setIdOperacion(java.math.BigInteger idOperacion) {
        this.idOperacion = idOperacion;
    }


    /**
     * Gets the matricula value for this BitacoraDetalleOperacion.
     * 
     * @return matricula   * Matricula de la Aeronave que realiza la operación
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this BitacoraDetalleOperacion.
     * 
     * @param matricula   * Matricula de la Aeronave que realiza la operación
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the modeloAeronave value for this BitacoraDetalleOperacion.
     * 
     * @return modeloAeronave   * Modelo de la aeronave que realiza la operacion aeronautica
     */
    public java.lang.String getModeloAeronave() {
        return modeloAeronave;
    }


    /**
     * Sets the modeloAeronave value for this BitacoraDetalleOperacion.
     * 
     * @param modeloAeronave   * Modelo de la aeronave que realiza la operacion aeronautica
     */
    public void setModeloAeronave(java.lang.String modeloAeronave) {
        this.modeloAeronave = modeloAeronave;
    }


    /**
     * Gets the pesoMaximoDespegue value for this BitacoraDetalleOperacion.
     * 
     * @return pesoMaximoDespegue   * Peso Maximo de Despegue para el modelo de aeronave (Unidad
     * de Medida Toneladas)
     */
    public java.math.BigDecimal getPesoMaximoDespegue() {
        return pesoMaximoDespegue;
    }


    /**
     * Sets the pesoMaximoDespegue value for this BitacoraDetalleOperacion.
     * 
     * @param pesoMaximoDespegue   * Peso Maximo de Despegue para el modelo de aeronave (Unidad
     * de Medida Toneladas)
     */
    public void setPesoMaximoDespegue(java.math.BigDecimal pesoMaximoDespegue) {
        this.pesoMaximoDespegue = pesoMaximoDespegue;
    }


    /**
     * Gets the tipoOperacion value for this BitacoraDetalleOperacion.
     * 
     * @return tipoOperacion   * Tipo de Operacion (A = Aterrizaje / D = Despegue)
     */
    public cl.gob.aem.valida.BitacoraDetalleOperacionTipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }


    /**
     * Sets the tipoOperacion value for this BitacoraDetalleOperacion.
     * 
     * @param tipoOperacion   * Tipo de Operacion (A = Aterrizaje / D = Despegue)
     */
    public void setTipoOperacion(cl.gob.aem.valida.BitacoraDetalleOperacionTipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }


    /**
     * Gets the tipoVuelo value for this BitacoraDetalleOperacion.
     * 
     * @return tipoVuelo   * Tipo de Vuelo (N = Nacional / I = Internacional)
     */
    public cl.gob.aem.valida.BitacoraDetalleOperacionTipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }


    /**
     * Sets the tipoVuelo value for this BitacoraDetalleOperacion.
     * 
     * @param tipoVuelo   * Tipo de Vuelo (N = Nacional / I = Internacional)
     */
    public void setTipoVuelo(cl.gob.aem.valida.BitacoraDetalleOperacionTipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }


    /**
     * Gets the regular value for this BitacoraDetalleOperacion.
     * 
     * @return regular   * Vuelo Regular (S = Si es Regular / N = No es Regular)
     */
    public cl.gob.aem.valida.BitacoraDetalleOperacionRegular getRegular() {
        return regular;
    }


    /**
     * Sets the regular value for this BitacoraDetalleOperacion.
     * 
     * @param regular   * Vuelo Regular (S = Si es Regular / N = No es Regular)
     */
    public void setRegular(cl.gob.aem.valida.BitacoraDetalleOperacionRegular regular) {
        this.regular = regular;
    }


    /**
     * Gets the fechaHoraOperacion value for this BitacoraDetalleOperacion.
     * 
     * @return fechaHoraOperacion   * Fecha y Hora de la Operacion.
     */
    public cl.gob.aem.valida.FechaType getFechaHoraOperacion() {
        return fechaHoraOperacion;
    }


    /**
     * Sets the fechaHoraOperacion value for this BitacoraDetalleOperacion.
     * 
     * @param fechaHoraOperacion   * Fecha y Hora de la Operacion.
     */
    public void setFechaHoraOperacion(cl.gob.aem.valida.FechaType fechaHoraOperacion) {
        this.fechaHoraOperacion = fechaHoraOperacion;
    }


    /**
     * Gets the actividad value for this BitacoraDetalleOperacion.
     * 
     * @return actividad   * Codigo de Actividad del vuelo (Transporte de pasajeros, Carga,
     * etc.).
     */
    public java.lang.String getActividad() {
        return actividad;
    }


    /**
     * Sets the actividad value for this BitacoraDetalleOperacion.
     * 
     * @param actividad   * Codigo de Actividad del vuelo (Transporte de pasajeros, Carga,
     * etc.).
     */
    public void setActividad(java.lang.String actividad) {
        this.actividad = actividad;
    }


    /**
     * Gets the nroVuelo value for this BitacoraDetalleOperacion.
     * 
     * @return nroVuelo   * Numero del Vuelo
     */
    public java.lang.String getNroVuelo() {
        return nroVuelo;
    }


    /**
     * Sets the nroVuelo value for this BitacoraDetalleOperacion.
     * 
     * @param nroVuelo   * Numero del Vuelo
     */
    public void setNroVuelo(java.lang.String nroVuelo) {
        this.nroVuelo = nroVuelo;
    }


    /**
     * Gets the aerolinea value for this BitacoraDetalleOperacion.
     * 
     * @return aerolinea   * Codigo de tres letras de la aerolinea que realizo la operacion
     */
    public java.lang.String getAerolinea() {
        return aerolinea;
    }


    /**
     * Sets the aerolinea value for this BitacoraDetalleOperacion.
     * 
     * @param aerolinea   * Codigo de tres letras de la aerolinea que realizo la operacion
     */
    public void setAerolinea(java.lang.String aerolinea) {
        this.aerolinea = aerolinea;
    }


    /**
     * Gets the fechaHoraIngresoRetiroLosa value for this BitacoraDetalleOperacion.
     * 
     * @return fechaHoraIngresoRetiroLosa   * Fecha y Hora en que la aeronave ingresa a la loza (cuando la
     * operacion es aterrizaje) o cuando se retira de la loza (cuando es
     * una operacion de despegue)
     */
    public cl.gob.aem.valida.FechaType getFechaHoraIngresoRetiroLosa() {
        return fechaHoraIngresoRetiroLosa;
    }


    /**
     * Sets the fechaHoraIngresoRetiroLosa value for this BitacoraDetalleOperacion.
     * 
     * @param fechaHoraIngresoRetiroLosa   * Fecha y Hora en que la aeronave ingresa a la loza (cuando la
     * operacion es aterrizaje) o cuando se retira de la loza (cuando es
     * una operacion de despegue)
     */
    public void setFechaHoraIngresoRetiroLosa(cl.gob.aem.valida.FechaType fechaHoraIngresoRetiroLosa) {
        this.fechaHoraIngresoRetiroLosa = fechaHoraIngresoRetiroLosa;
    }


    /**
     * Gets the fechaHoraIngresoRetiroHangar value for this BitacoraDetalleOperacion.
     * 
     * @return fechaHoraIngresoRetiroHangar   * Fecha y hora en que la aeronave se retira fuera de la loza
     * (a un hangar) en caso de ser aterrizaje / Fecha y hora en que la aeronave
     * vuelve a ingresar a la loza desde un hangar, cuando es una operacion
     * de despegue.
     */
    public cl.gob.aem.valida.FechaType getFechaHoraIngresoRetiroHangar() {
        return fechaHoraIngresoRetiroHangar;
    }


    /**
     * Sets the fechaHoraIngresoRetiroHangar value for this BitacoraDetalleOperacion.
     * 
     * @param fechaHoraIngresoRetiroHangar   * Fecha y hora en que la aeronave se retira fuera de la loza
     * (a un hangar) en caso de ser aterrizaje / Fecha y hora en que la aeronave
     * vuelve a ingresar a la loza desde un hangar, cuando es una operacion
     * de despegue.
     */
    public void setFechaHoraIngresoRetiroHangar(cl.gob.aem.valida.FechaType fechaHoraIngresoRetiroHangar) {
        this.fechaHoraIngresoRetiroHangar = fechaHoraIngresoRetiroHangar;
    }


    /**
     * Gets the procedenciaDestino value for this BitacoraDetalleOperacion.
     * 
     * @return procedenciaDestino   * Codigo OACI de la procedencia (cuando la operacion es un aterrizaje)
     * o codigo OACI del destino (cuando la operacion es un despegue)
     */
    public java.lang.String getProcedenciaDestino() {
        return procedenciaDestino;
    }


    /**
     * Sets the procedenciaDestino value for this BitacoraDetalleOperacion.
     * 
     * @param procedenciaDestino   * Codigo OACI de la procedencia (cuando la operacion es un aterrizaje)
     * o codigo OACI del destino (cuando la operacion es un despegue)
     */
    public void setProcedenciaDestino(java.lang.String procedenciaDestino) {
        this.procedenciaDestino = procedenciaDestino;
    }


    /**
     * Gets the nroPista value for this BitacoraDetalleOperacion.
     * 
     * @return nroPista   * Numero de la pista utilizada para la operacion (atterrizaje
     * o despegue)
     */
    public java.lang.String getNroPista() {
        return nroPista;
    }


    /**
     * Sets the nroPista value for this BitacoraDetalleOperacion.
     * 
     * @param nroPista   * Numero de la pista utilizada para la operacion (atterrizaje
     * o despegue)
     */
    public void setNroPista(java.lang.String nroPista) {
        this.nroPista = nroPista;
    }


    /**
     * Gets the aerovia value for this BitacoraDetalleOperacion.
     * 
     * @return aerovia   * Codigo de la ruta aerea por la cual la aeronave realiza la
     * operacion
     */
    public java.lang.String getAerovia() {
        return aerovia;
    }


    /**
     * Sets the aerovia value for this BitacoraDetalleOperacion.
     * 
     * @param aerovia   * Codigo de la ruta aerea por la cual la aeronave realiza la
     * operacion
     */
    public void setAerovia(java.lang.String aerovia) {
        this.aerovia = aerovia;
    }


    /**
     * Gets the usoLuz value for this BitacoraDetalleOperacion.
     * 
     * @return usoLuz   * Indicador de uso de luz (S = Operacion uso luz de la pista
     * / N = Operacion no uso luz de la pista)
     */
    public cl.gob.aem.valida.BitacoraDetalleOperacionUsoLuz getUsoLuz() {
        return usoLuz;
    }


    /**
     * Sets the usoLuz value for this BitacoraDetalleOperacion.
     * 
     * @param usoLuz   * Indicador de uso de luz (S = Operacion uso luz de la pista
     * / N = Operacion no uso luz de la pista)
     */
    public void setUsoLuz(cl.gob.aem.valida.BitacoraDetalleOperacionUsoLuz usoLuz) {
        this.usoLuz = usoLuz;
    }


    /**
     * Gets the usoIls value for this BitacoraDetalleOperacion.
     * 
     * @return usoIls   * Indicador de uso de ILS (Instrumental Landing System) (S =
     * Si uso ILS / N = No uso ILS)
     */
    public cl.gob.aem.valida.BitacoraDetalleOperacionUsoIls getUsoIls() {
        return usoIls;
    }


    /**
     * Sets the usoIls value for this BitacoraDetalleOperacion.
     * 
     * @param usoIls   * Indicador de uso de ILS (Instrumental Landing System) (S =
     * Si uso ILS / N = No uso ILS)
     */
    public void setUsoIls(cl.gob.aem.valida.BitacoraDetalleOperacionUsoIls usoIls) {
        this.usoIls = usoIls;
    }


    /**
     * Gets the observacion value for this BitacoraDetalleOperacion.
     * 
     * @return observacion   * Observacion o registro de eventos respecto a la operacion aeronautica
     */
    public java.lang.String getObservacion() {
        return observacion;
    }


    /**
     * Sets the observacion value for this BitacoraDetalleOperacion.
     * 
     * @param observacion   * Observacion o registro de eventos respecto a la operacion aeronautica
     */
    public void setObservacion(java.lang.String observacion) {
        this.observacion = observacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BitacoraDetalleOperacion)) return false;
        BitacoraDetalleOperacion other = (BitacoraDetalleOperacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idOperacion==null && other.getIdOperacion()==null) || 
             (this.idOperacion!=null &&
              this.idOperacion.equals(other.getIdOperacion()))) &&
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.modeloAeronave==null && other.getModeloAeronave()==null) || 
             (this.modeloAeronave!=null &&
              this.modeloAeronave.equals(other.getModeloAeronave()))) &&
            ((this.pesoMaximoDespegue==null && other.getPesoMaximoDespegue()==null) || 
             (this.pesoMaximoDespegue!=null &&
              this.pesoMaximoDespegue.equals(other.getPesoMaximoDespegue()))) &&
            ((this.tipoOperacion==null && other.getTipoOperacion()==null) || 
             (this.tipoOperacion!=null &&
              this.tipoOperacion.equals(other.getTipoOperacion()))) &&
            ((this.tipoVuelo==null && other.getTipoVuelo()==null) || 
             (this.tipoVuelo!=null &&
              this.tipoVuelo.equals(other.getTipoVuelo()))) &&
            ((this.regular==null && other.getRegular()==null) || 
             (this.regular!=null &&
              this.regular.equals(other.getRegular()))) &&
            ((this.fechaHoraOperacion==null && other.getFechaHoraOperacion()==null) || 
             (this.fechaHoraOperacion!=null &&
              this.fechaHoraOperacion.equals(other.getFechaHoraOperacion()))) &&
            ((this.actividad==null && other.getActividad()==null) || 
             (this.actividad!=null &&
              this.actividad.equals(other.getActividad()))) &&
            ((this.nroVuelo==null && other.getNroVuelo()==null) || 
             (this.nroVuelo!=null &&
              this.nroVuelo.equals(other.getNroVuelo()))) &&
            ((this.aerolinea==null && other.getAerolinea()==null) || 
             (this.aerolinea!=null &&
              this.aerolinea.equals(other.getAerolinea()))) &&
            ((this.fechaHoraIngresoRetiroLosa==null && other.getFechaHoraIngresoRetiroLosa()==null) || 
             (this.fechaHoraIngresoRetiroLosa!=null &&
              this.fechaHoraIngresoRetiroLosa.equals(other.getFechaHoraIngresoRetiroLosa()))) &&
            ((this.fechaHoraIngresoRetiroHangar==null && other.getFechaHoraIngresoRetiroHangar()==null) || 
             (this.fechaHoraIngresoRetiroHangar!=null &&
              this.fechaHoraIngresoRetiroHangar.equals(other.getFechaHoraIngresoRetiroHangar()))) &&
            ((this.procedenciaDestino==null && other.getProcedenciaDestino()==null) || 
             (this.procedenciaDestino!=null &&
              this.procedenciaDestino.equals(other.getProcedenciaDestino()))) &&
            ((this.nroPista==null && other.getNroPista()==null) || 
             (this.nroPista!=null &&
              this.nroPista.equals(other.getNroPista()))) &&
            ((this.aerovia==null && other.getAerovia()==null) || 
             (this.aerovia!=null &&
              this.aerovia.equals(other.getAerovia()))) &&
            ((this.usoLuz==null && other.getUsoLuz()==null) || 
             (this.usoLuz!=null &&
              this.usoLuz.equals(other.getUsoLuz()))) &&
            ((this.usoIls==null && other.getUsoIls()==null) || 
             (this.usoIls!=null &&
              this.usoIls.equals(other.getUsoIls()))) &&
            ((this.observacion==null && other.getObservacion()==null) || 
             (this.observacion!=null &&
              this.observacion.equals(other.getObservacion())));
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
        if (getIdOperacion() != null) {
            _hashCode += getIdOperacion().hashCode();
        }
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getModeloAeronave() != null) {
            _hashCode += getModeloAeronave().hashCode();
        }
        if (getPesoMaximoDespegue() != null) {
            _hashCode += getPesoMaximoDespegue().hashCode();
        }
        if (getTipoOperacion() != null) {
            _hashCode += getTipoOperacion().hashCode();
        }
        if (getTipoVuelo() != null) {
            _hashCode += getTipoVuelo().hashCode();
        }
        if (getRegular() != null) {
            _hashCode += getRegular().hashCode();
        }
        if (getFechaHoraOperacion() != null) {
            _hashCode += getFechaHoraOperacion().hashCode();
        }
        if (getActividad() != null) {
            _hashCode += getActividad().hashCode();
        }
        if (getNroVuelo() != null) {
            _hashCode += getNroVuelo().hashCode();
        }
        if (getAerolinea() != null) {
            _hashCode += getAerolinea().hashCode();
        }
        if (getFechaHoraIngresoRetiroLosa() != null) {
            _hashCode += getFechaHoraIngresoRetiroLosa().hashCode();
        }
        if (getFechaHoraIngresoRetiroHangar() != null) {
            _hashCode += getFechaHoraIngresoRetiroHangar().hashCode();
        }
        if (getProcedenciaDestino() != null) {
            _hashCode += getProcedenciaDestino().hashCode();
        }
        if (getNroPista() != null) {
            _hashCode += getNroPista().hashCode();
        }
        if (getAerovia() != null) {
            _hashCode += getAerovia().hashCode();
        }
        if (getUsoLuz() != null) {
            _hashCode += getUsoLuz().hashCode();
        }
        if (getUsoIls() != null) {
            _hashCode += getUsoIls().hashCode();
        }
        if (getObservacion() != null) {
            _hashCode += getObservacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BitacoraDetalleOperacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>Bitacora>Detalle>Operacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "IdOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeloAeronave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ModeloAeronave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pesoMaximoDespegue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "PesoMaximoDespegue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TipoOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>Bitacora>Detalle>Operacion>TipoOperacion"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoVuelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "TipoVuelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>Bitacora>Detalle>Operacion>TipoVuelo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Regular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>Bitacora>Detalle>Operacion>Regular"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHoraOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaHoraOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actividad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Actividad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroVuelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NroVuelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aerolinea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Aerolinea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHoraIngresoRetiroLosa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaHoraIngresoRetiroLosa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHoraIngresoRetiroHangar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "FechaHoraIngresoRetiroHangar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "fechaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedenciaDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "ProcedenciaDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroPista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "NroPista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aerovia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Aerovia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usoLuz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "UsoLuz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>Bitacora>Detalle>Operacion>UsoLuz"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usoIls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "UsoIls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>>Bitacora>Detalle>Operacion>UsoIls"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Observacion"));
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
