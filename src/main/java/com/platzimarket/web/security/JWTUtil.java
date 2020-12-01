package com.platzimarket.web.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.hibernate.SimpleNaturalIdLoadAccess;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Date;

//importante el component para la inyeccion del metodo
@Component
public class JWTUtil {
    //en System currently indicamos el tiempo q queremos q la sesion queda abierta en este caso esta de 10H
    private static final String KEY= "pla4tz1";
    public String generateToken(UserDetails userDetails){
        return Jwts.builder().setSubject(userDetails.getUsername())
                .setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))  //ahy se indica la fecha actual y la fecha de expiracion
                .signWith(SignatureAlgorithm.HS256, KEY).compact();
    }

    public boolean validateToken(String token, UserDetails userDetails){
        return userDetails.getUsername().equals(extractUsername(token)) && !isTokenExpired(token);
    }
    public String extractUsername(String token){
        return getClaims(token).getSubject();
    }

    public boolean isTokenExpired(String token){
        return getClaims(token).getExpiration().before(new Date());
    }
    private Claims getClaims(String token){
        return Jwts.parser().setSigningKey(KEY).parseClaimsJws(token).getBody();
    }
}
