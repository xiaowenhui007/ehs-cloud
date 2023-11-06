package cn.bkehs.cloud.framework.log.config;

import cn.bkehs.cloud.framework.log.core.aop.OperateLogAspect;
import cn.bkehs.cloud.framework.log.core.service.OperateLogFrameworkService;
import cn.bkehs.cloud.framework.log.core.service.OperateLogFrameworkServiceImpl;
import cn.bkehs.cloud.system.rpc.api.logger.OperateLogApi;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class EhsOperateLogAutoConfiguration {

    @Bean
    public OperateLogAspect operateLogAspect() {
        return new OperateLogAspect();
    }

    @Bean
    public OperateLogFrameworkService operateLogFrameworkService(OperateLogApi operateLogApi) {
        return new OperateLogFrameworkServiceImpl(operateLogApi);
    }

}
