package jp.co.chat.repository;

import java.util.List;

import jp.co.chat.dto.ChatUserInformationDto;

public interface SelectUserInformationTable {
	
	public ChatUserInformationDto SelectUserInformation(ChatUserInformationDto chatUserInformationDto);

}
