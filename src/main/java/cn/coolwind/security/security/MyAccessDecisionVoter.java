package cn.coolwind.security.security;

import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MyAccessDecisionVoter implements AccessDecisionVoter {
    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public int vote(Authentication authentication, Object o, Collection collection) {
        Collection<ConfigAttribute> attributes = collection;
        List<String> authorities = authentication.getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());
        List<String> attributeList = attributes
                .stream()
                .map(ConfigAttribute::getAttribute)
                .collect(Collectors.toList());
        return authorities.containsAll(attributeList) ? ACCESS_GRANTED : ACCESS_DENIED;
    }

    @Override
    public boolean supports(Class aClass) {
        return true;
    }
}
