package com.consultorio.comun;

 public class Constantes {
	 public static final String URL_FRONT_END="*";
	 
	//PATH DE MODULOS
	public static final String PATH_TURNO="turno";
	public static final String PATH_ESPECIALISTA="especialista";
	public static final String PATH_RESERVAS="reservas";
	
	//URL
	//login
	public static final String URL_LOGIN="/signin";
	public static final String URL_LOGOUT="/sigout";	
	
	//TURNOS
	public static final String URL_CREAR_TURNO="/crearTurno"; 
	public static final String URL_LISTAR_TURNO="/listarTurnos";
	public static final String URL_ELIMINAR_TURNO="/eliminarTurno";
	public static final String URL_CONSULTAR_DISPONIBLES="/consultarDisponibilidad";
	
	//PACIENTES
	public static final String URL_CREAR_PACIENTES="/crearTurno"; 
	public static final String URL_LISTAR_PACIENTES="/listarTurnos";
	public static final String URL_ELIMINAR_PACIENTES="/eliminarTurno";
	
	//ESPECIALISTAS
	public static final String URL_CREAR_ESPECIALISTAS="/agregarEspecialista"; 
	public static final String URL_LISTAR_ESPECIALISTAS="/listarEspecialista";
	public static final String URL_ELIMINAR_ESPECIALISTA="/eliminarEspecialista";
	public static final String URL_MODIFICAR_ESPECIALISTA="/modificarEspecialista";
	public static final String URL_OBTENER_ESPECIALISTA="/obtenerEspecialista";
	
	//RESERVAS
	public static final String URL_CREAR_RESERVA="/crearReserva"; 
	public static final String URL_LISTAR_RESERVA="/listarReserva"; 
	
	
	// Spring Security
	public static final String LOGIN_URL = "/login";
	public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
	public static final String TOKEN_BEARER_PREFIX = "Bearer ";

	// JWT
	public static final String ISSUER_INFO = "https://www.autentia.com/";
	public static final String SUPER_SECRET_KEY = "1234";
	public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day

}
