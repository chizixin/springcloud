package com.sugon.cloudview.user.cmpuser.controller;

import com.sugon.cloudview.common.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxin
 * @version 1.0
 * @date 2019/7/10
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class TestController {


    @GetMapping(value = "/test")
    public Result test(){
        log.debug("【debug】测试日志打印==={}，{}",1,2);
        log.info("【info】测试日志打印==={}，{}",2,3);
        log.error("【error】测试日志打印==={}，{}");
        log.warn("【warn】测试日志打印==={}，{}");
        return Result.success();
    }
}
