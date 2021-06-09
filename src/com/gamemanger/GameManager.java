package com.gamemanger;

import java.awt.event.KeyEvent;

import com.boategine.AbstractGame;
import com.boategine.GameContainer;
import com.boategine.Renderer;

public class GameManager extends AbstractGame
{

	public GameManager()
	{
		
	}
	
	
	@Override
	public void update(GameContainer gc, float dt) {
		// TODO Auto-generated method stub
		if(gc.getInput().isKeyDown(KeyEvent.VK_D))
		{
			System.out.println("A was pressed");
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String agrs[])
	{
		GameContainer gc = new GameContainer(new GameManager());
		gc.start();
	}
}
