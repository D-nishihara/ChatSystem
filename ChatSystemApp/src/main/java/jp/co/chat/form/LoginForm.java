package jp.co.chat.form;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LoginForm {
	private String userId;
	private String userPassword;
}
