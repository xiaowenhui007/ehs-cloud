package cn.bkehs.cloud.framework.log.core.service;

/**
 * 操作日志 Framework Service 接口
 *
 * @author beckwell-xwh
 */
public interface OperateLogFrameworkService {

    /**
     * 记录操作日志
     *
     * @param operateLog 操作日志请求
     */
    void createOperateLog(OperateLog operateLog);

}
