  int x= 128;
  int y= 0;
  int z= 255;
  
  
  void setup()
{
  size(300,300);
  background(0);
  
}
void draw()
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
