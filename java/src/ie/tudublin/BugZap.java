package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
	float playerX=100;
	float playerY=100;
	float playerWidth=100;

    public void settings()
    {
        size(500,500);
    }

    public void setup()
    {
    	
	}	
	
	//int x = 0; // 4 bytes
	
	void drawPlayer(float x, float y, float w)
	{
		line(x, y, x + 50, y);
		line(x, y, x, y - 50);
		line(x + 50, y, x + 50, y - 50);
		line(x, y - 50, x + 50, y - 50);
		stroke(255,0,0);
	}

   
	public void keyPressed()
	{


			if (keyCode == LEFT)
				{
					playerX--;
					
				}

			if (keyCode == RIGHT)
				{
					playerX++;
					
				}

			if (key == ' ')
				{
					System.out.println("SPACE key pressed");
				}
		
	}
	public void draw()
		{
			drawPlayer(playerX, playerY, playerWidth);	
		}
	
}