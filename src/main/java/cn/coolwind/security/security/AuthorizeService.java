package cn.coolwind.security.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service("authorizeService")
public class AuthorizeService {

    public boolean check(Authentication authentication, HttpServletRequest request) {
        Object principal = authentication.getPrincipal();
        if (principal != null && principal instanceof UserDetails) {
            UserDetails user = (UserDetails) principal;
            Set<SimpleGrantedAuthority> authorities = (Set<SimpleGrantedAuthority>) user.getAuthorities();
            boolean contains = authorities.stream()
                    .map(SimpleGrantedAuthority::getAuthority)
                    .anyMatch(request.getRequestURI()::equals);
            return contains;
        }
        return false;
    }
}
