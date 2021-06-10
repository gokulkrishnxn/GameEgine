package com.gamemanger;

import java.awt.event.KeyEvent;


import com.boategine.AbstractGame;
import com.boategine.GameContainer;
import com.boategine.Renderer;
import com.boategine.gfx.Image;

public class GameManager extends AbstractGame
{	

	//private Image image;

	//public GameManager() 
	//{
		//image = new Image("/test.png");
	//}
	
	
	@Override
	public void update(GameContainer gc, float dt) {
		// TODO Auto-generated method stub
		if(gc.getInput().isKeyDown(KeyEvent.VK_D))
		{
			System.out.println("A was pressed");
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r) 
	{
		
		//r.drawImage(image, gc.getInput().getMouseX() - 32, gc.getInput().getMouseY() - 32);
	}

	public static void main(String agrs[]) 
	{
		GameContainer gc = new GameContainer(new GameManager());
		gc.start();
	}


	
}
