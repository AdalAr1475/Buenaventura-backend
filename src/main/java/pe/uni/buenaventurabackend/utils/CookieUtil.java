package pe.uni.buenaventurabackend.utils;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;


@Component
public class CookieUtil {

    public static void create(HttpServletResponse httpServletResponse, String name, String value, Boolean secure, Integer maxAge, String domain){
        Cookie cookie = new Cookie(name, value);
        cookie.setSecure(secure);
        cookie.setHttpOnly(true);
        cookie.setMaxAge(maxAge);
        cookie.setDomain(domain);
        cookie.setPath("/");
        httpServletResponse.addCookie(cookie);
    }
    public static void clear(HttpServletResponse httpServletResponse, String name,String domain,Boolean secure){
        Cookie cookie = new Cookie(name, null);
        cookie.setSecure(secure);
        cookie.setHttpOnly(true);
        cookie.setMaxAge(0);
        cookie.setDomain(domain);
        cookie.setPath("/");
        httpServletResponse.addCookie(cookie);
    }
}