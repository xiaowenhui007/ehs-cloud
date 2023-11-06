package cn.bkehs.cloud.system.rpc.api.sms.dto.code;

import cn.bkehs.cloud.framework.common.validation.InEnum;
import cn.bkehs.cloud.framework.common.validation.Mobile;
import cn.bkehs.cloud.system.rpc.enums.sms.SmsSceneEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Schema(description = "RPC 服务 - 短信验证码的发送 Request DTO")
@Data
public class SmsCodeSendReqDTO {

    @Schema(description = "手机号", required = true, example = "15601691300")
    @Mobile
    @NotEmpty(message = "手机号不能为空")
    private String mobile;
    @Schema(description = "发送场景", required = true, example = "1")
    @NotNull(message = "发送场景不能为空")
    @InEnum(SmsSceneEnum.class)
    private Integer scene;
    @Schema(description = "发送 IP", required = true, example = "10.20.30.40")
    @NotEmpty(message = "发送 IP 不能为空")
    private String createIp;

}