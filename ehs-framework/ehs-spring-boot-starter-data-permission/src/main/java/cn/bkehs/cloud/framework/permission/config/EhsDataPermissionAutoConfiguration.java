package cn.bkehs.cloud.framework.permission.config;

import cn.bkehs.cloud.framework.mybatis.core.util.MyBatisUtils;
import cn.bkehs.cloud.framework.permission.core.aop.DataPermissionAnnotationAdvisor;
import cn.bkehs.cloud.framework.permission.core.db.DataPermissionDatabaseInterceptor;
import cn.bkehs.cloud.framework.permission.core.rule.DataPermissionRule;
import cn.bkehs.cloud.framework.permission.core.rule.DataPermissionRuleFactory;
import cn.bkehs.cloud.framework.permission.core.rule.DataPermissionRuleFactoryImpl;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * 数据权限的自动配置类
 *
 * @author beckwell-xwh
 */
@AutoConfiguration
public class EhsDataPermissionAutoConfiguration {

    @Bean
    public DataPermissionRuleFactory dataPermissionRuleFactory(List<DataPermissionRule> rules) {
        return new DataPermissionRuleFactoryImpl(rules);
    }

    @Bean
    public DataPermissionDatabaseInterceptor dataPermissionDatabaseInterceptor(MybatisPlusInterceptor interceptor,
                                                                               DataPermissionRuleFactory ruleFactory) {
        // 创建 DataPermissionDatabaseInterceptor 拦截器
        DataPermissionDatabaseInterceptor inner = new DataPermissionDatabaseInterceptor(ruleFactory);
        // 添加到 interceptor 中
        // 需要加在首个，主要是为了在分页插件前面。这个是 MyBatis Plus 的规定
        MyBatisUtils.addInterceptor(interceptor, inner, 0);
        return inner;
    }

    @Bean
    public DataPermissionAnnotationAdvisor dataPermissionAnnotationAdvisor() {
        return new DataPermissionAnnotationAdvisor();
    }

}
