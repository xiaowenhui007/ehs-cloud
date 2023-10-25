package cn.bkehs.cloud.framework.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 文档地址
 *
 * @author beckwell-xwh
 */
@Getter
@AllArgsConstructor
public enum DocumentEnum {

    REDIS_INSTALL("https://gitee.com/zhijiantianya/beckwell-ehs-db/issues/I4VCSJ", "Redis 安装文档"),
    TENANT("https://doc.iocoder.cn", "SaaS 多租户文档");
    
    private final String url;
    private final String memo;

}
