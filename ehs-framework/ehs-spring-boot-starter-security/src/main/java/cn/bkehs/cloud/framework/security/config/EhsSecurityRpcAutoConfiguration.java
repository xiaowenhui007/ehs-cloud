package cn.bkehs.cloud.framework.security.config;

import cn.bkehs.cloud.framework.security.core.rpc.LoginUserRequestInterceptor;
import cn.bkehs.cloud.system.rpc.api.oauth2.OAuth2TokenApi;
import cn.bkehs.cloud.system.rpc.api.permission.PermissionApi;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * Security 使用到 Feign 的配置项
 *
 * @author beckwell-xwh
 */
@AutoConfiguration
@EnableFeignClients(clients = {OAuth2TokenApi.class, // 主要是引入相关的 API 服务
        PermissionApi.class})
public class EhsSecurityRpcAutoConfiguration {

    @Bean
    public LoginUserRequestInterceptor loginUserRequestInterceptor() {
        return new LoginUserRequestInterceptor();
    }

}
