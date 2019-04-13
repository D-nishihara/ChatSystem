package jp.co.chat.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ChatWebSocketController {
	
    @MessageMapping("/hello") // �G���h�|�C���g�̎w��
    @SendTo("/topic/greetings") // ���b�Z�[�W�̈�����w��
    public String greeting(String test) {
        return test;
    }

}
