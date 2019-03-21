package com.shipc.test.core.websocket;

/**
 * @ClassName WiselyResponse
 * @Description 服务端向浏览器发送的此类的消息。
 * @Author shipc
 * @Date 2019/3/20 17:49
 * @Version 1.0
 */
public class WiselyResponse {
    private String responseMessage;
    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }
    public String getResponseMessage() {
        return responseMessage;
    }
}
