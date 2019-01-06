package com.union.security;

import com.union.dao.ResourceDtoMapper;
import com.union.dao.UserDtoMapper;
import com.union.model.ResourceDto;
import com.union.model.UserDto;
import com.union.service.ResourceService;
import com.union.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * Created by wxb on 2018/10/26 0026.
 * 自定义的元数据源类，用来提供鉴权过程中，访问资源所需的角色
 */
@Component
public class MySecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    ResourceService resourceService;
    //本方法返回访问资源所需的角色集合
    AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        //从object中得到需要访问的资源，即网址
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        //从数据库中得到所有资源，以及对应的角色
        List<ResourceDto> resourceDtoList = resourceService.selectAllResource();
        for (ResourceDto resource : resourceDtoList) {
            //首先进行地址匹配
            if (antPathMatcher.match(resource.getUrl(), requestUrl)
                    && resource.getRolesArray().length > 0) {
                return SecurityConfig.createList(resource.getRolesArray());
            }
        }
        //匹配不成功返回一个特殊的ROLE_NONE
        return SecurityConfig.createList("ROLE_NONE");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}