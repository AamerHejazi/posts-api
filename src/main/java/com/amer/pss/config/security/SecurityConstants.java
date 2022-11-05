package com.amer.pss.config.security;

public class SecurityConstants {
    public static final String SECRET = "coursecreator";
    public static final long EXPIRATION_TIME = 864_000_00; // 1 day
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_IN_URL = "/login";
}
