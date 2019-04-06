package jp.co.chat.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.chat.dto.ChatUserInformationDto;
import jp.co.chat.repository.SelectUserInformationTable;

@Repository
public class ChatLoginAuthenticationDao {
	
	private final SelectUserInformationTable selectUserInformationTable;
	
	@Autowired
	public ChatLoginAuthenticationDao(SelectUserInformationTable selectUserInformationTable) {
		this.selectUserInformationTable = selectUserInformationTable;
	}
	
	public boolean UserAuthenticationProcess(ChatUserInformationDto chatUserInformationDto) {
		
		
		ChatUserInformationDto chatUserInformation = selectUserInformationTable.SelectUserInformation(chatUserInformationDto);
		
		if (chatUserInformation == null) {
			return false;
		}
		
		return true;
		
	}

}
