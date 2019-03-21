package com.shipc.test.core.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @ClassName WebSocketConfig
 * @Description
 * @Author shipc
 * @Date 2019/3/20 17:37
 * @Version 1.0
 */
@Configuration
@EnableWebSocketMessageBroker // 1 开启使用STOMP协议来传输基于代理的消息，这时控制器支持使用@MessageMapping,就像使用@RequestMapping一样
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) { // 2 注册STOMP协议的节点（endpoint），并映射的指定的URL.
        registry.addEndpoint("/endpointWisely").withSockJS();  // 3 注册一个STOMP的endpoint，并使用SockJS协议。
    }

    public void configureMessageBroker(MessageBrokerRegistry registry) { // 4 配置消息代理（Message Broker）
        registry.enableSimpleBroker("/topic"); // 5 广播式应配置一个/topic消息代理。
    }

}
