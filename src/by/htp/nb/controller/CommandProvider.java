package by.htp.nb.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.nb.controller.impl.CreateNoteImpl;
import by.htp.nb.controller.impl.EditNoteImpl;
import by.htp.nb.controller.impl.LoginUserImpl;

public class CommandProvider {
	
	private Map<CommandName, Command> commands = new HashMap<CommandName, Command>();
	
	public CommandProvider(){
		commands.put(CommandName.CREATE_NOTE, new CreateNoteImpl());
		commands.put(CommandName.EDIT_NOTE, new EditNoteImpl());
		commands.put(CommandName.LOGIN_USER, new LoginUserImpl());
	}
	
	public Command getCommand(String commandName){
		CommandName commandNameEnum = CommandName.valueOf(commandName.toUpperCase());
		
		Command command = commands.get(commandNameEnum);//LOGIN_USER
		return command;
	}

}
