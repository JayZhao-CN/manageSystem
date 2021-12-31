package com.pp.managesystem.entity;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回信息
 */
public class SysMsg {
    //状态码
    private int code;
    //状态信息
    private String msg;
    //用户返回信息
    private JSONObject dataInfo = new JSONObject();
//    private Map<String ,Object> dataInfo = new HashMap<>();

    //返回成功
    public static SysMsg success(){
        SysMsg result = new SysMsg();
        result.setCode(100);
        result.setMsg("返回成功");
        return result;
    }
    //返回失败
    public static SysMsg failed(){
        SysMsg result = new SysMsg();
        result.setCode(200);
        result.setMsg("返回失败");
        return result;
    }

    //链式add
    public SysMsg add(String key,Object value){
        this.getDataInfo().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getDataInfo() {
        return dataInfo;
    }

    public void setDataInfo(JSONObject dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Override
    public String toString() {
        return "{" + "\"code\"" + ":" + code +"," + "\"msg\"" + ":\"" + msg + "\"," + "\"dataInfo\"" + ":" + dataInfo + "}";
    }
}
