package cn.coolwind.security.security;

import cn.coolwind.security.entity.PermissionEntity;
import cn.coolwind.security.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import java.util.Collection;

public class MySecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    private PermissionRepository permissionRepository;

    public MySecurityMetadataSource(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        FilterInvocation filterInvocation = (FilterInvocation) o;
        String uri = filterInvocation.getHttpRequest().getRequestURI();
        PermissionEntity permission = permissionRepository.getByUrl(uri);
        if (permission != null) {
            return SecurityConfig.createList(permission.getCode());
        }
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
