package com.sugon.cloudview.common.result;

import lombok.Data;

/**
 * 返回结果
 * @author zhangxin
 * @version 1.0
 * @date 2019/7/10
 */
@Data
public class Result {

    private String name;
    private String code;
    private String msg;

    public static Result success() {
        Result result = new Result();
        result.setCode("200");
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setCode("200");
        result.setMsg("调用失败");
        return result;
    }
}
