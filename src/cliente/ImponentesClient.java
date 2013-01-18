package cliente;

import java.math.BigInteger;
import java.net.URL;
import java.util.Calendar;

import javax.xml.namespace.QName;

import org.apache.axis.message.MessageElement;
import org.apache.axis.types.PositiveInteger;
import org.apache.axis.types.Token;
import org.w3.www._2000._09.xmldsig.X509DataType;
import org.w3.www._2000._09.xmldsig.X509IssuerSerialType;

import cl.dipreca.servicios.ipsV01.TipoEntrada;
import cl.gob.aem.valida.ConsultaImponentesDiprecaBindingStub;
import cl.gob.aem.valida.ConsumidorType;
import cl.gob.aem.valida.ConsumidorTypeCertificado;
import cl.gob.aem.valida.CuerpoSobre;
import cl.gob.aem.valida.DocumentoType;
import cl.gob.aem.valida.EncabezadoSobre;
import cl.gob.aem.valida.EstadoGlosaSobreType;
import cl.gob.aem.valida.EstadoGlosaType;
import cl.gob.aem.valida.EstadoSobreType;
import cl.gob.aem.valida.InstitucionesValores;
import cl.gob.aem.valida.ProveedorType;
import cl.gob.aem.valida.ProveedorTypeServicios;
import cl.gob.aem.valida.RunType;
import cl.gob.aem.valida.ServiciosValores;
import cl.gob.aem.valida.Sobre;
import cl.gob.aem.valida.TramitesValores;

public class ImponentesClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		ConsultaImponentesDiprecaBindingStub service = 
			new ConsultaImponentesDiprecaBindingStub(new URL("http://127.0.0.1:11647/ImponentesService/services/ConsultaImponentesDiprecaSoapPort"), null);
		

		/*
		 * Encabezado del sobre
		 */
		
		EncabezadoSobre encabezadoSobre = new EncabezadoSobre();
		
		X509DataType certificado = new X509DataType();
		certificado.setX509IssuerSerial(new X509IssuerSerialType("IN", new BigInteger("0")));
		
		encabezadoSobre.setConsumidor(
				new ConsumidorType(
						InstitucionesValores.IPS, TramitesValores.value5 /* SISTEMA PENSION SOLIDARIA */, 
						new ConsumidorTypeCertificado( certificado )));
		
		// encabezadoSobre.setEmisor("IMPONENTES-CLIENT");
		encabezadoSobre.setFechaHora(Calendar.getInstance());
		encabezadoSobre.setFechaHoraReq(Calendar.getInstance());
		encabezadoSobre.setIdSobre("123456789");
		encabezadoSobre.setMetadataOperacional(new EstadoGlosaSobreType(EstadoSobreType.value1 /* Estado sobre */, "GLOSA SOBRE AQUI"));
		
		ProveedorTypeServicios proveedorTypeServicios = new ProveedorTypeServicios(
					new ServiciosValores[]{ ServiciosValores.value58 /* "IMPONENTES DIPRECA" */ },
					new EstadoGlosaType[]{ new EstadoGlosaType("ESTADO GLOSA 2", "GLOSA 2") }
					);
		
		encabezadoSobre.setProveedor( new ProveedorType(InstitucionesValores.DIPRECA, proveedorTypeServicios));
		
		/*
		 * Cuerpo del sobre
		 */
		
		CuerpoSobre cuerpoSobre = new CuerpoSobre();
		
		TipoEntrada parametrosConsulta = new TipoEntrada();
		// parametrosConsulta.setPassIPS("PASSWORD");
		// parametrosConsulta.setRutImponente(new RunType(new PositiveInteger("4476269"), new Token("0")));
		parametrosConsulta.setRutIPS(new RunType(new PositiveInteger("4895102"), new Token("3")));
		
		DocumentoType documentoCuerpo = new DocumentoType( new MessageElement[]{
			new MessageElement(new QName("http://servicios.dipreca.cl/ipsV01", "EntradaDatosImponente"), parametrosConsulta)	
		});
		
		
		cuerpoSobre.setDocumento(documentoCuerpo);
		
		/*
		 * Materializacion de la consulta
		 */
		
		// Sobre sobre = new Sobre(encabezado, cuerpo, signature);
		Sobre datosConsulta = new Sobre(encabezadoSobre, new CuerpoSobre[]{ cuerpoSobre }, null);		
		Sobre datosRespuesta = service.consultaImponentesDipreca( datosConsulta );

		/*
		 * Obtencion de los datos de la respuesta
		 */
		
		System.out.println(datosRespuesta.toString());
	}

}

