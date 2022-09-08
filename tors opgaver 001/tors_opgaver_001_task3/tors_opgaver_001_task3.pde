int background;
int red;
int yellow;
int green;
int y = 0;
int speed = 1;

void setup() {
  size(400, 400);
  
}

void draw() {

  //rectangle for traffic light
  background = 150;
  fill(background);
  rect(150, 20, 100, 200);

  //red light
  red = 255;
  fill(red, 0, 0);
  ellipse(width/2, 60, 40, 40);

  // yellow light
  yellow = 255;
  fill(yellow, yellow, 0);
  ellipse(width/2, 120, 40, 40);


  // green light
  green = 255;
  fill(0, green, 0);
  ellipse(width/2, 180, 40, 40);
  
  
  // code stolen from example
  y = y + speed;  
  if ((y > height) || (y < 0)) {
    speed = speed * -1;
  }

  fill(0);
  ellipse(width/2,y,32,32);
}
