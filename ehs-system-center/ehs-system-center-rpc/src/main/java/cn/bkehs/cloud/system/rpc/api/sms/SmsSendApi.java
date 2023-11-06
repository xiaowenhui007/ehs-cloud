package cn.bkehs.cloud.system.rpc.api.sms;

import cn.bkehs.cloud.framework.common.pojo.CommonResult;
import cn.bkehs.cloud.system.rpc.api.sms.dto.send.SmsSendSingleToUserReqDTO ;
import cn.bkehs.cloud.system.rpc.enums.ApiConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(name = ApiConstants.NAME) // TODO beckwell：fallbackFactory =
@Tag(name = "RPC 服务 - 短信发送")
public interface SmsSendApi {

    String PREFIX = ApiConstants.PREFIX + "/sms/send";

    @PostMapping(PREFIX + "/send-single-admin")
    @Operation(summary = "发送单条短信给 Admin 用户", description = "在 mobile 为空时，使用 userId 加载对应 Admin 的手机号")
    CommonResult<Long> sendSingleSmsToAdmin(@Valid @RequestBody SmsSendSingleToUserReqDTO reqDTO);

    @PostMapping(PREFIX + "/send-single-member")
    @Operation(summary = "发送单条短信给 Member 用户", description = "在 mobile 为空时，使用 userId 加载对应 Member 的手机号")
    CommonResult<Long> sendSingleSmsToMember(@Valid @RequestBody SmsSendSingleToUserReqDTO reqDTO);

}
