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

import com.consultorio.comun.CodigoDto;
import com.consultorio.comun.Constantes;
import com.consultorio.excepciones.Respuesta;
import com.examen.logica.Codigo;
import com.examen.logica.Operaciones;


@RestController
@RequestMapping("test")

public class CodigoController {

	
    @RequestMapping( value= "/verificar" ,  method = RequestMethod.GET)
    public Respuesta  verificarcion(@RequestBody CodigoDto codigoDto) {
    	Respuesta respuesta = new Respuesta();
    	try {
    		Operaciones operaciones = new Operaciones();
    		Codigo codigo = new Codigo(codigoDto.getCodigo());
    		
    		respuesta.setCodigo(codigo);
    		if (operaciones.verificar(codigo)) {
    			respuesta.setMensaje("El codigo verificador es correcto");
    			return respuesta;
    		}
    		respuesta.setMensaje("El codigo verificador es incorrecto");
    		return respuesta;
		} catch (Exception e) {
			respuesta.setMensaje("El codigo no responde al formato solicitado");  
		}
    	return respuesta;
    }
    
    

    
    
}
