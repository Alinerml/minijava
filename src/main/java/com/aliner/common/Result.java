package com.aliner.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    public int Code;
    public String Message;
    public Object Data;
    public Result(int code){
        this.Code = code;
    }
    public Result(int code,Object data){
        this.Code = code;
        this.Data = data;
    }

    Result ok(){
        return new Result(200);
    }
    Result ok(Object data){
        return new Result(200, data);
    }
}
