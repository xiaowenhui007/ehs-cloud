package cn.bkehs.cloud.infra.rpc.api.logger;

import cn.bkehs.cloud.framework.common.pojo.CommonResult;
import cn.bkehs.cloud.infra.rpc.api.logger.dto.ApiErrorLogCreateReqDTO ;
import cn.bkehs.cloud.infra.rpc.enums.ApiConstants ;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(name = ApiConstants.NAME) // TODO beckwell：fallbackFactory =
@Tag(name = "RPC 服务 - API 异常日志")
public interface ApiErrorLogApi {

    String PREFIX = ApiConstants.PREFIX + "/api-error-log";

    @PostMapping(PREFIX + "/create")
    @Operation(summary = "创建 API 异常日志")
    CommonResult<Boolean> createApiErrorLog(@Valid @RequestBody ApiErrorLogCreateReqDTO createDTO);

}
