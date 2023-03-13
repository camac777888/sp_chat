package com.example.sp_chat_service;


import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker   // 表示开启使用STOMP协议来传输基于代理的消息，Broker就是代理。
public class WebsocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    //注册STOMP协议的节点，并映射指定的URL。
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);
    }

    @Override
    //用来配置消息代理，用於將消息從一個客戶端路由到另一個客戶端。
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);
    }
}
