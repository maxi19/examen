package com.consultorio.controladores;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.consultorio.comun.Constantes;


@RestController
@RequestMapping(Constantes.PATH_ESPECIALISTA)
@CrossOrigin (origins=Constantes.URL_FRONT_END, methods = {RequestMethod.GET, RequestMethod.POST} )

public class EspecialistaController {

	private static final Logger log = LoggerFactory.getLogger(EspecialistaController.class);
	
/*
	@Autowired
	private EspecialistaService especialistaService;
	
	
    @RequestMapping( value= Constantes.URL_CREAR_ESPECIALISTAS ,  method = RequestMethod.POST)
    public Respuesta<EspecialistaDto> agregarEspecialista(@RequestBody EspecialistaDto especialistaDto) {
    	Respuesta<EspecialistaDto> respuesta = especialistaService.agregarEspecialista(especialistaDto);
    	if (TipoRespuestaEnum.OK.equals(respuesta.getEstadoRespuesta())) {
    		ItemMensaje item = new ItemMensaje();
    		item.setMensaje("se cargo el especialista");
    		item.setTipoErrorEnum(TipoErrorEnum.OPERACION_EXITOSA);
    		respuesta.setItemMensaje(item);
    		return respuesta;
	} else if(TipoRespuestaEnum.WARNING.equals(respuesta.getEstadoRespuesta())) {
		//TERMIANR
	} else if (TipoRespuestaEnum.ERROR.equals(respuesta.getEstadoRespuesta())) {
		//TERMINAR
	}
       return respuesta;
    }
    
    

    
    @GetMapping(Constantes.URL_MODIFICAR_ESPECIALISTA)
    public Respuesta<EspecialistaDto> modificarEspecialista(@RequestBody EspecialistaDto especialistaDto) {
    	Respuesta<EspecialistaDto> respuesta = especialistaService.modificarEspecialista(especialistaDto);
	    if (TipoRespuestaEnum.OK.equals(respuesta.getEstadoRespuesta())) {
				return respuesta;
		} else if(TipoRespuestaEnum.WARNING.equals(respuesta.getEstadoRespuesta())) {
			//TERMIANR
		} else if (TipoRespuestaEnum.ERROR.equals(respuesta.getEstadoRespuesta())) {
			//TERMINAR
		}
    	return respuesta;
    }
    
    
    */

    
}
