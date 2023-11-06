package cn.bkehs.cloud.framework.web.apilog.config;

import cn.bkehs.cloud.infra.rpc.api.logger.ApiAccessLogApi;
import cn.bkehs.cloud.infra.rpc.api.logger.ApiErrorLogApi;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * API 日志使用到 Feign 的配置项
 *
 * @author beckwell-xwh
 */
@AutoConfiguration
@EnableFeignClients(clients = {ApiAccessLogApi.class, // 主要是引入相关的 API 服务
        ApiErrorLogApi.class})
public class EhsApiLogRpcAutoConfiguration {
}
