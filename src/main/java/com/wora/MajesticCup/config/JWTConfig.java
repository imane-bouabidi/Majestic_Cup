//package com.wora.MajesticCup.config;
//
//import io.jsonwebtoken.*;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//public class JWTConfig {
//
//    private final String secretKey = "mySecretKey";
//
//    public String generateToken(Authentication authentication) {
//        User user = (User) authentication.getPrincipal();
//        long expirationTime = 86400000;
//        return Jwts.builder()
//                .setSubject(user.getUsername())
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
//                .signWith(SignatureAlgorithm.HS512, secretKey)
//                .compact();
//    }
//
//    public boolean validateToken(String token) {
//        try {
//            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
//            return true;
//        } catch (SignatureException | ExpiredJwtException | MalformedJwtException e) {
//            return false;
//        }
//    }
//
//    public String extractUsername(String token) {
//        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
//    }
//}
