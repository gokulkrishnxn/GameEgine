package com.boategine;

import java.awt.image.DataBufferInt;

import com.boategine.gfx.Image;

public class Renderer 
{

	private int pW, pH;
	private int[] p;
	
	public Renderer(GameContainer gc)
	{
		pW = gc.getWidth();
		pH = gc.getHeight();
		p = ((DataBufferInt)gc.getWindow().getImage().getRaster().getDataBuffer()).getData();
	}
	
	public void clear()
	{
		for(int i = 0; i < p.length; i++)
		{
			p[i] = 0;
		}
	}
	
	public void setPixel(int x, int y, int value)
	{
		if((y < 0 || x >= pW || y < 0 || y >= pH) || value == 0xffff00ff)
		{
			return;
		}
		
		p[x + y * pW] = value;
	}
	
	
	public void drawImage(Image image, int offX, int offY)
	{
		int newX = 0;
		int newY = 0;
		int newWidth = image.getW();
		int newHight = image.getH();
		
		//Don't Render Code
		if(offX < newWidth)  return;
		if(offY < newHight) return;
		if(offX >= pW - 48) return;
		if(offY >= pH - 18) return;
		
		//Clipping code
		if(offX < 0){newX -= offX;}		
		if(offY < 0){newY -= offY;}
		if(newWidth + offX >= pW){newWidth -= newWidth + offX - pW;}	
		if(newHight + offY >= pH){newHight -= newHight + offY - pH;}
		
		
		for(int y = newY; y < newHight; y++)
		{
			for(int x = newX; x < newWidth; x++)
			{
				setPixel(x + offX, y + offY, image.getP()[x + y * image.getH()]);
			}
		}
	}

	}
