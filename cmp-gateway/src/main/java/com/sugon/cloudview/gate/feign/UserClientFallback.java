package com.sugon.cloudview.gate.feign;

import com.sugon.cloudview.common.result.Result;
import org.springframework.stereotype.Component;

/**
 * @author zhangxin
 * @version 1.0
 * @date 2019/7/10
 */
@Component
public class UserClientFallback implements IUserClient {

    @Override
    public Result test() {
        return Result.fail();
    }
}
