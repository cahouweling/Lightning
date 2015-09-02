import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int sx = 150;
int sy = 0;
int ex = 150;
int ey = 0;

public void setup()
{
  size(300,300);
  strokeWeight(2);
  background(0);
  frameRate(1000);
}
public void draw()
{

  stroke(255);
  line(sx,sy,ex,ey);
  stroke(100,100,100,100);
  fill(100,100,100,100);
  sx = ex;
  sy = ey;
  ex = ex + (int)(Math.random()*20) - 10;
  ey = ey + (int)(Math.random()*20);
  if(sy > 350)
  {
  	background(0);
  	if((Math.random()*1000) > 998)
  	{
  	  sx = (int)(Math.random()*50) +125;
      sy = 0;
      ex = sx;
      ey = 0;
  	}
    
  }
}
public void mousePressed()
{
  background(0);
  sx = (int)(Math.random()*50) +125;
  sy = 0;
  ex = sx;
  ey = 0;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
