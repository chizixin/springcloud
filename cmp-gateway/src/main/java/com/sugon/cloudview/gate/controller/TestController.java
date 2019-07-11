package com.sugon.cloudview.gate.controller;

import com.sugon.cloudview.common.result.Result;
import com.sugon.cloudview.gate.feign.IUserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangxin
 * @version 1.0
 * @date 2019/7/10
 */
@RestController
@RequestMapping(value = "/gateway")
public class TestController {
    @Resource
    private IUserClient userClient;

    @GetMapping(value = "/test")
    public Result test(){
        //测试feign，调用user服务
        //这是网关通过feign调用user服务之前用过这个
        return userClient.test();
    }
}
