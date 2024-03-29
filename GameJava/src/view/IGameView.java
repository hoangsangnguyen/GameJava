package view;

import java.util.List;

import model.GameButton;

public interface IGameView {
	boolean USER = true;
	boolean COMPUTER = false;
	
	int EASY_TIME = 10;
	int MEDIUM_TIME = 5;
	int HARD_TIME = 3;
	
	void initView();
	
	void setNewGame(List<GameButton> buttonList);
	
	void setTime();
	
	void resumeTimer();
	
	void pauseTimer();
	
	void resetTimer();
	
	void finishGame();
	
	void setScore();
	
	void notifySetChange();
}
