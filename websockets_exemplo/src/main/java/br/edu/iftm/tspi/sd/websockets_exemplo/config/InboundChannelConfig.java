package br.edu.iftm.tspi.sd.websockets_exemplo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

// InboundChannelConfig.java
@Configuration
public class InboundChannelConfig implements WebSocketMessageBrokerConfigurer {

  @Override
  public void configureClientInboundChannel(ChannelRegistration registration) {
    registration.interceptors(new ChannelInterceptor() {
      @Override
      public Message<?> preSend(Message<?> message, MessageChannel channel) {
        var sha = StompHeaderAccessor.wrap(message);

        if (StompCommand.CONNECT.equals(sha.getCommand())) {
          String username = sha.getFirstNativeHeader("username");
          if (username == null || username.isBlank()) {
            username = "anon-" + sha.getSessionId();
          }

          // (opcional) útil pra outras lógicas suas
          sha.getSessionAttributes().put("username", username);

          // garante que o header modificado vai pra frente
          sha.setLeaveMutable(true);
          return org.springframework.messaging.support.MessageBuilder
                   .createMessage(message.getPayload(), sha.getMessageHeaders());
        }

        return message;
      }
    });
  }
}

