package cn.bkehs.cloud.springframework.dict.config;

import cn.bkehs.cloud.system.rpc.api.dict.DictDataApi;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 字典用到 Feign 的配置项
 *
 * @author beckwell-xwh
 */
@AutoConfiguration
@EnableFeignClients(clients = DictDataApi.class) // 主要是引入相关的 API 服务
public class EhsDictRpcAutoConfiguration {
}
