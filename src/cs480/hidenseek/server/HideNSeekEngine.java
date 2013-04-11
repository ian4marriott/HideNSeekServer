package cs480.hidenseek.server;

import java.awt.List;

public class HideNSeekEngine {
	private static int gameId;
	private static HideNSeekArena gameArena;
	private static List gameMembers;
	
	
	//*********************************************************************************************
	//*********************************************************************************************
	public HideNSeekEngine(int gameId, HideNSeekArena gameArena, List gameMembers ){
		this.gameId = gameId;
		this.gameArena = gameArena;
		this.gameMembers = gameMembers;
	}
	
	//*********************************************************************************************
	//*********************************************************************************************
	public void startGame() {
		while(gameStatus() == true){
			
			
		}
	}
	
	//*********************************************************************************************
	//*********************************************************************************************
	private boolean gameStatus() {
	  return true;
	}

}
