package com.consultorio.especialista.service;

import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;

import io.jsonwebtoken.SignatureAlgorithm;

public class TokenAuthenticationService {

	static final long EXPIRATIONTIME = 864_000_000; // 10 days
    static final String SECRET = "ThisIsASecret";
    static final String TOKEN_PREFIX = "Bearer";
    static final String HEADER_STRING = "Authorization";
    
  
	/*
	 * public static void addAuthentication(HttpServletResponse res, String
	 * username) {
	 * 
	 * String jwt = createToken(username);
	 * 
	 * res.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + jwt); }
	 * 
	 * 
	 * public static String createToken(String username) { String jwt = Jwt
	 * .setSubject(username) .setExpiration(new Date(System.currentTimeMillis() +
	 * EXPIRATIONTIME)) .signWith(SignatureAlgorithm.HS512, SECRET) .compact();
	 * 
	 * return jwt; }
	 */
    
    
}
