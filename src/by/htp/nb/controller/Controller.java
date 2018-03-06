package by.htp.nb.controller;


public class Controller {
	
	private final CommandProvider commandProvider = new CommandProvider();
	       //response
	public String doAction(String request){
		
		String[] params = request.split("|");
		
		String commandName = params[0].trim();
		
		Command command = commandProvider.getCommand(commandName);
		String response = command.execute(params);
		
		return response;		
		
		
	}	

}
