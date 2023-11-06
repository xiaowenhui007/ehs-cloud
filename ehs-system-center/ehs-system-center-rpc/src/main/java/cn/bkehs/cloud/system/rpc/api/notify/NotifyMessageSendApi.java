package cn.bkehs.cloud.system.rpc.api.notify;

import cn.bkehs.cloud.framework.common.pojo.CommonResult;
import cn.bkehs.cloud.system.rpc.api.notify.dto.NotifySendSingleToUserReqDTO ;
import cn.bkehs.cloud.system.rpc.enums.ApiConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@FeignClient(name = ApiConstants.NAME) // TODO beckwell：fallbackFactory =
@Tag(name = "RPC 服务 - 站内信发送")
public interface NotifyMessageSendApi {

    String PREFIX = ApiConstants.PREFIX + "/notify/send";

    @PostMapping(PREFIX + "/send-single-admin")
    @Operation(summary = "发送单条站内信给 Admin 用户")
    CommonResult<Long> sendSingleMessageToAdmin(@Valid NotifySendSingleToUserReqDTO reqDTO);

    @PostMapping(PREFIX + "/send-single-member")
    @Operation(summary = "发送单条站内信给 Member 用户")
    CommonResult<Long> sendSingleMessageToMember(@Valid NotifySendSingleToUserReqDTO reqDTO);

}
