package com.sugon.cloudview.gate.feign;

import com.sugon.cloudview.common.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "cmp-user",fallback = UserClientFallback.class)
public interface IUserClient {

    @GetMapping(value = "/user/test")
    public Result test();
}
