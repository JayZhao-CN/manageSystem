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

    private Map<String, String> map = null;

    /**
     * 加载权限表中所有操作请求权限
     */
    public void loadResourceDefine() {
        map = new HashMap<>(16);
//        Collection<ConfigAttribute> configAttributes;
//        ConfigAttribute configAttribute;
        // 获取启用的权限操作请求
        // 数据库中所有url-auth
        List<SysUrlAuth> sysUrlAuths = sysUrlAuthMapper.selectByExample(new SysUrlAuthExample());
//        List<Permission> permissions = permissionService.findByTypeAndStatusOrderBySortOrder(CommonConstant.PERMISSION_OPERATION, CommonConstant.STATUS_NORMAL);
        for (SysUrlAuth sysUrlAuth : sysUrlAuths) {
//                configAttributes = new ArrayList<>();
//                configAttribute = new SecurityConfig(sysUrlAuth.getUaAuth());
                //作为MyAccessDecisionManager类的decide的第三个参数
//                configAttributes.add(configAttribute);
                //用权限的path作为map的key，用ConfigAttribute的集合作为value
            // {"/12","001"}
                map.put(sysUrlAuth.getUaUrl(), sysUrlAuth.getUaAuth());
        }
    }

    /**
     * 判定用户请求的url是否在权限表中
     * 如果在权限表中，则返回给decide方法，用来判定用户是否有此权限
     * 如果不在权限表中则放行
     *
     *      * 返回该url所需要的用户权限信息
     *      *
     *      * @param object: 储存请求url信息
     *      * @return: null：标识不需要任何权限都可以访问
     *
     * @param object
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {

        /**
         * 首先判断数据库该url访问所需的权限
         */
        //Object中包含用户请求request
        String url = ((FilterInvocation) object).getRequestUrl();
        if (url.contains("?")){
            url = url.substring(0,url.indexOf("?"));
        }
        // 获取url对应的权限列表
        List<SysUrlAuth> sysUrlAuths = sysUrlAuthMapper.selectByUrl(url);
        if (null != sysUrlAuths) {
            // 返回的权限列表
            List<ConfigAttribute> authList = new ArrayList<>();
            // 遍历
            Iterator<SysUrlAuth> iterator = sysUrlAuths.iterator();
            ConfigAttribute configAttribute;
            if (iterator.hasNext()) {
                String uaAuth = iterator.next().getUaAuth();
                configAttribute = new SecurityConfig(uaAuth);
                authList.add(configAttribute);
            }
            return authList;
        }else {
            // 如果没查询到请求的url信息，则默认不拦截
            return null;
        }


    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }
    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
