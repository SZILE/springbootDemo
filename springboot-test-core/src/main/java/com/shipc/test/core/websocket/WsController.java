package com.shipc.test.core.websocket;

import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @ClassName WsController
 * @Description
 * @Author shipc
 * @Date 2019/3/20 17:52
 * @Version 1.0
 */
@Controller
public class WsController {

    @MessageMapping("/weloome")  //当浏览器向服务端发送请求时，通过@MessageMapping映射/welcome这个地址，类似于@RequestMapping
    @SendTo("topic/getResponse")  //当服务端有消息时，会对订阅了@SendTo中的路径的浏览器发送消息。
    public WiselyResponse say(WiselyMessage message) throws Exception {
        Thread.sleep(3000);
        return new WiselyResponse("Welcome, " + message.getName() + "!");
    }
}
