package cn.bkehs.cloud.system.rpc.api.logger.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 登录日志创建 Request DTO
 *
 * @author beckwell-xwh
 */
@Data
public class LoginLogCreateReqDTO {

    @Schema(description = "日志类型，参见 LoginLogTypeEnum 枚举类", required = true, example = "1" )
    @NotNull(message = "日志类型不能为空")
    private Integer logType;

    @Schema(description = "链路追踪编号", required = true, example = "89aca178-a370-411c-ae02-3f0d672be4ab")
    private String traceId;

    @Schema(description = "用户编号", example = "666")
    private Long userId;
    @Schema(description = "用户类型，参见 UserTypeEnum 枚举", required = true, example = "2" )
    @NotNull(message = "用户类型不能为空")
    private Integer userType;
    @Schema(description = "用户账号", required = true, example = "ehs")
    @NotBlank(message = "用户账号不能为空")
    @Size(max = 30, message = "用户账号长度不能超过30个字符")
    private String username;

    @Schema(description = "登录结果，参见 LoginResultEnum 枚举类", required = true, example = "1")
    @NotNull(message = "登录结果不能为空")
    private Integer result;

    @Schema(description = "用户 IP", required = true, example = "127.0.0.1")
    @NotEmpty(message = "用户 IP 不能为空")
    private String userIp;

    @Schema(description = "浏览器 UserAgent", required = true, example = "Mozilla/5.0")
    private String userAgent;

}
