void setup()
{
  size(300,300);
  background(0);
}
void draw()
{
  fill(0,0,0,5);
  stroke(0,0,0,5);
  rect(0,0,300,300);
  noFill();
  stroke(0,255,0);
  translate(150,150);
  rotate(random(4*PI));
  ellipse(0,0,250,random(250));
}


