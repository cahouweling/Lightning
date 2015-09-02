int sx = 150;
int sy = 0;
int ex = 150;
int ey = 0;

void setup()
{
  size(300,300);
  strokeWeight(2);
  background(0);
  frameRate(1000);
}
void draw()
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
void mousePressed()
{
  background(0);
  sx = (int)(Math.random()*50) +125;
  sy = 0;
  ex = sx;
  ey = 0;
}

