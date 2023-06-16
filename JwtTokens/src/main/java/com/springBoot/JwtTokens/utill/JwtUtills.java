package com.springBoot.JwtTokens.utill;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springBoot.JwtTokens.entity.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@SuppressWarnings("unused")
@Component

public class JwtUtills {

	   @Value("${jwt.secret}")
	   private String secretKey;

	   public String extractUsername(String token) {
	       return extractClaim(token, Claims::getSubject);
	   }

	   public Date extractExpirationDate(String token) {
	       return extractClaim(token, Claims::getExpiration);
	   }

	   public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
	       final Claims claims = extractAllClaims(token);
	       return claimsResolver.apply(claims);
	   }

	   private Claims extractAllClaims(String token) {
	       return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
	   }

	   private boolean isTokenExpired(String token) {
	       return extractExpirationDate(token).before(new Date());
	   }

	   public String generateToken(User userDetails) {
	       Map<String, Object> claims = new HashMap<>();
	       return createToken(claims, userDetails.toString());
	   }

	   private String createToken(Map<String, Object> claims, String subject) {
	       final Date now = new Date();
	       final Date expirationDate = new Date(now.getTime() + 1000 * 60 * 60 * 10); 
	       return Jwts.builder()
	               .setClaims(claims)
	               .setSubject(subject)
	               .setIssuedAt(now)
	               .setExpiration(expirationDate)
	               .signWith(SignatureAlgorithm.HS256, secretKey)
	               .compact();
	   }

	   public boolean validateToken(String token, User userDetails) {
	       final String username = extractUsername(token);
	       return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	   }
	}
	
