package com.pp.managesystem.security.interceptor;

import com.pp.managesystem.dao.SysUrlAuthMapper;
import com.pp.managesystem.entity.SysUrlAuth;
import com.pp.managesystem.entity.SysUrlAuthExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MySecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    private SysUrlAuthMapper sysUrlAuthMapper;
    private Map<String, Collection<ConfigAttribute>> map = null;

    /**
     * 加载权限表中所有操作请求权限
     */
    public void loadResourceDefine() {
        map = new HashMap<>(16);
        Collection<ConfigAttribute> configAttributes;
        ConfigAttribute cfg;
        // 获取启用的权限操作请求
        List<SysUrlAuth> sysUrlAuths = sysUrlAuthMapper.selectByExample(new SysUrlAuthExample());

        for (SysUrlAuth sysUrlAuth : sysUrlAuths) {
            String url = sysUrlAuth.getUaUrl();
            String[] roles = sysUrlAuth.getUaAuth().split(",");
            Collection<ConfigAttribute> attributes = new ArrayList<>();
            for (String role : roles) {
                attributes.add(new SecurityConfig(role));
            }
            // 占位符，需要权限才能访问的资源 都需要添加一个占位符，保证value不是空的
//            attributes.add(new SecurityConfig("@needAuth"));
            map.put(url, attributes);
        }

//        configAttributes = new ArrayList<>();
//        for (SysUrlAuth sysUrlAuth : sysUrlAuths) {
//                cfg = new SecurityConfig(sysUrlAuth.getUaAuth());
//                //作为MyAccessDecisionManager类的decide的第三个参数
//                configAttributes.add(cfg);
//                //用权限的path作为map的key，用ConfigAttribute的集合作为value
//                map.put(sysUrlAuth.getUaUrl(), configAttributes);
//        }
    }

    /**
     * 判定用户请求的url是否在权限表中
     * 如果在权限表中，则返回给decide方法，用来判定用户是否有此权限
     * 如果不在权限表中则放行
     *
     * @param o
     * @return
     * @throws IllegalArgumentException
     */

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
//        map.clear();
        loadResourceDefine();
        //Object中包含用户请求request
        String url = ((FilterInvocation) o).getRequestUrl();
        if (url.contains("?")) {
            url = url.substring(0, url.indexOf("?"));
        }
//        PathMatcher pathMatcher = new AntPathMatcher();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String resURL = iterator.next();
            if (resURL.equals(url)) {
                return map.get(resURL);
            }
        }
        return null;
    }

//    @Override
//    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
//
//        /**
//         * 首先判断数据库该url访问所需的权限
//         */
//        //Object中包含用户请求request
//        String url = ((FilterInvocation) object).getRequestUrl();
//        if (url.contains("?")){
//            url = url.substring(0,url.indexOf("?"));
//        }
//        // 获取url对应的权限列表
//        List<SysUrlAuth> sysUrlAuths = sysUrlAuthMapper.selectByUrl(url);
//        if (null != sysUrlAuths) {
//            // 返回的权限列表
//            List<ConfigAttribute> authList = new ArrayList<>();
//            // 遍历
//            Iterator<SysUrlAuth> iterator = sysUrlAuths.iterator();
//            ConfigAttribute configAttribute;
//            if (iterator.hasNext()) {
//                String uaAuth = iterator.next().getUaAuth();
//                configAttribute = new SecurityConfig(uaAuth);
//                authList.add(configAttribute);
//            }
//            return authList;
//        }else {
//            // 如果没查询到请求的url信息，则默认不拦截
//            return null;
//        }
//
//
//    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
