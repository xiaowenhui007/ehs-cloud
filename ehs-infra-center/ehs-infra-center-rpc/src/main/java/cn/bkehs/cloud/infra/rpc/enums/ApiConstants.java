package cn.bkehs.cloud.infra.rpc.enums;

import cn.bkehs.cloud.framework.common.enums.RpcConstants;

/**
 * API 相关的枚举
 *
 * @author beckwell-xwh
 */
public class ApiConstants {

    /**
     * 服务名
     *
     * 注意，需要保证和 spring.application.name 保持一致
     */
    public static final String NAME = "infra-server";

    public static final String PREFIX = RpcConstants.RPC_API_PREFIX + "/infra";

    public static final String VERSION = "1.0.0";

}
