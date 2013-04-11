package cs480.hidenseek.server;

public class HideNSeekDatabase {
	
	public HideNSeekDatabase() {
		//
	}
	
	//*********************************************************************************************
	// public void addDevice(String)
	//*********************************************************************************************
	public boolean addNewUser(String decive_id) {
		return true;
	}
	
	//*********************************************************************************************
	// public String getUserFirstName(String)
	//*********************************************************************************************
	public String getUserFirstName(String decive_id) {
		return "Rod";
	}
	
	//*********************************************************************************************
	// public String getUserLastNam(String)
	//*********************************************************************************************
	public String getUserLastName(String decive_id) {
		return "Ulrich";
	}
	
	//*********************************************************************************************
	// public String getUserPassword(String)
	//*********************************************************************************************
	public String getUserPassword(String decive_id) {
		return "0e18fc390ee04ebb189458d11b2b0bca";
	}
	
	
	//*********************************************************************************************
	//public void addNewGame(String, String, int) {
	//*********************************************************************************************
	public void addNewGame(String host_decive_id, String game_name, int runtime ) {
		
	}
	
	//*********************************************************************************************
	// public String getPlayerStatus(String, String)
	//*********************************************************************************************
	public String[] getPlayerInGame(String game_id) {
		String[] playerArray = {};
		return playerArray;
	}
	
	//*********************************************************************************************
	// public String getPlayerStatus(String, String)
	//*********************************************************************************************
	public String getPlayerStatus(String game_id, String decive_id) {
		return "";
	}
	
	//*********************************************************************************************
	// public String getPlayerStatus(String, String, String)
	//*********************************************************************************************
	public void setPlayerStatus(String game_id, String decive_id, String player_status) {
		
	}
	
	//*********************************************************************************************
	// public HideNSeekLocation getPlayerStatus(String, String)
	//*********************************************************************************************
	public HideNSeekLocation getPlayerLocation(String game_id, String decive_id) {
		return new HideNSeekLocation();
	}
	
	//*********************************************************************************************
	// public String setPlayerLocation(String, String, HideNSeekLocation)
	//*********************************************************************************************
	public String setPlayerLocation(String game_id, String decive_id, HideNSeekLocation location ) {
		return "";
	}
	
	//.......ect
	

	

}
