package com.wuyu.commonutils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Result {
    private boolean state;
    private Integer code;
    private String message;
    private Map<String,Object> data = new HashMap<String, Object>();
    private Result(){}
    public static Result success(){
        Result result = new Result();
        result.setState(true);
        result.setCode(ResultCode.SUCCESS);
        result.setMessage("成功");
        return result;
    }
    public static Result failure(){
        Result result = new Result();
        result.setState(false);
        result.setCode(ResultCode.ERROR);
        result.setMessage("失败");
        return result;
    }
    public Result state (boolean state){
        this.setState(state);
        return this;
    }
    public Result code (Integer code){
        this.setCode(code);
        return this;
    }
    public Result message (String message){
        this.setMessage(message);
        return this;
    }
    public Result data (String key,Object value){
        this.data.put(key,value);
        return this;
    }
    public Result data (Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
