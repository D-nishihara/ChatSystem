package jp.co.chat.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@EnableWebSocketMessageBroker 
@Configuration
public class ChatWebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
	
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/hello"); // WebSocket�̃G���h�|�C���g (�ڑ����Ɏw�肷��G���h�|�C���g)���w��
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/chat"); // �A�v���P�[�V����(Controller)�Ńn���h�����O����G���h�|�C���g�̃v���t�B�b�N�X
        registry.enableSimpleBroker("/topic", "/queue"); // Topic(Pub-Sub)��Queue(P2P)��L���� >>> ���b�Z�[�W�u���[�J�[���n���h�����O����
    }

}
