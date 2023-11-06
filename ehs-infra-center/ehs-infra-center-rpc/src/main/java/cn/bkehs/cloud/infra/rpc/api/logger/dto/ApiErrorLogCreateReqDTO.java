package cn.bkehs.cloud.infra.rpc.api.logger.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Schema(description = "RPC 服务 - API 错误日志创建 Request DTO")
@Data
public class ApiErrorLogCreateReqDTO {

    @Schema(description = "链路追踪编号", example = "89aca178-a370-411c-ae02-3f0d672be4ab")
    private String traceId;

    @Schema(description = "用户编号", required = true, example = "1024")
    private Long userId;
    @Schema(description = "用户类型", required = true, example = "1")
    private Integer userType;
    @Schema(description = "应用名", required = true, example = "system-server")
    @NotNull(message = "应用名不能为空")
    private String applicationName;

    @Schema(description = "请求方法名", required = true, example = "GET")
    @NotNull(message = "http 请求方法不能为空")
    private String requestMethod;
    @Schema(description = "请求地址", required = true, example = "/xxx/yyy")
    @NotNull(message = "访问地址不能为空")
    private String requestUrl;
    @Schema(description = "请求参数", required = true)
    @NotNull(message = "请求参数不能为空")
    private String requestParams;
    @Schema(description = "用户 IP", required = true, example = "127.0.0.1")
    @NotNull(message = "ip 不能为空")
    private String userIp;
    @Schema(description = "浏览器 UserAgent", required = true, example = "Mozilla/5.0")
    @NotNull(message = "User-Agent 不能为空")
    private String userAgent;

    @Schema(description = "异常时间", required = true)
    @NotNull(message = "异常时间不能为空")
    private LocalDateTime exceptionTime;
    @Schema(description = "异常名", required = true)
    @NotNull(message = "异常名不能为空")
    private String exceptionName;
    @Schema(description = "异常发生的类全名", required = true)
    @NotNull(message = "异常发生的类全名不能为空")
    private String exceptionClassName;
    @Schema(description = "异常发生的类文件", required = true)
    @NotNull(message = "异常发生的类文件不能为空")
    private String exceptionFileName;
    @Schema(description = "异常发生的方法名", required = true)
    @NotNull(message = "异常发生的方法名不能为空")
    private String exceptionMethodName;
    @Schema(description = "异常发生的方法所在行", required = true)
    @NotNull(message = "异常发生的方法所在行不能为空")
    private Integer exceptionLineNumber;
    @Schema(description = "异常的栈轨迹异常的栈轨迹", required = true)
    @NotNull(message = "异常的栈轨迹不能为空")
    private String exceptionStackTrace;
    @Schema(description = "异常导致的根消息", required = true)
    @NotNull(message = "异常导致的根消息不能为空")
    private String exceptionRootCauseMessage;
    @Schema(description = "异常导致的消息", required = true)
    @NotNull(message = "异常导致的消息不能为空")
    private String exceptionMessage;

}