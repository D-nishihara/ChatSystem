package jp.co.chat.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ChatUserInformationDto {
	private String userId;
	private String userPassword;
}
