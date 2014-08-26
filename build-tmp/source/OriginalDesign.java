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

public class OriginalDesign extends PApplet {

  int x= 128;
  int y= 0;
  int z= 255;
  
  
  public void setup()
{
  size(300,300);
  background(0);
  
}
public void draw()
{
  fill(0,0,0,5);
  stroke(0,0,0,100);
  rect(0,0,300,300);
  noFill();
  stroke(x,y,z);
  translate(150,150);
  rotate(random(PI));
  ellipse(0,0,250,random(250));
  if (x<255){
  x++;
  }
  if (x==255){
     x=floor (random(0, 256));
  }
  if (y<255){
  y++;
  }
  if (y==255){
     y=floor (random(0, 256));
  }

 if (z<255){
  z++;
  }
  if (z==255){
     z=floor(random(0, 256));
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
