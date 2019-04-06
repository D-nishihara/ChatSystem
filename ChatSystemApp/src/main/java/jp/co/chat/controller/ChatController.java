package jp.co.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.chat.dao.ChatLoginAuthenticationDao;
import jp.co.chat.dto.ChatUserInformationDto;
import jp.co.chat.form.LoginForm;

@Controller
public class ChatController {
	
	private final ChatUserInformationDto chatUserInformationDto;
	
	private final ChatLoginAuthenticationDao chatLoginAuthenticationDao;
	
	@ModelAttribute
	public LoginForm setLoginForm() {
		return new LoginForm();
	}
	
	@Autowired
	public ChatController(ChatUserInformationDto chatUserInformationDto , ChatLoginAuthenticationDao chatLoginAuthenticationDao) {
		this.chatUserInformationDto = chatUserInformationDto;
		this.chatLoginAuthenticationDao = chatLoginAuthenticationDao;
	}
	
	@RequestMapping("/chatcontroller")
	public String LoginAuthentication(Model mode , LoginForm loginForm , BindingResult result) {
		
		if (result.hasErrors()) {
			return "home";
		}
		
		chatUserInformationDto.setUserId(loginForm.getUserId());
		chatUserInformationDto.setUserPassword(loginForm.getUserPassword());
		
		boolean bool = chatLoginAuthenticationDao.UserAuthenticationProcess(chatUserInformationDto);
		
		if(!bool) {
			return "home";
		}
		
		return "chatscreen";
	}

}
