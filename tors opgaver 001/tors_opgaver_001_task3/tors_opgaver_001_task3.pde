int background;
int red;
int yellow;
int green;

void setup() {
  size(400, 400);
  background(150);
  frameRate(1);
  
  //rectangle for traffic light
  background = 200;
  fill(background);
  rect(150, 20, 100, 200);
  
  //red light
  red = 255;
  fill(red, 0, 0);
  ellipse(width/2, 60, 40, 40);
}

void draw(){
  
  yellowLight();
  greenLight();
}

void yellowLight(){
  
  yellow = 255;
  fill(yellow, yellow, 0);
  ellipse(width/2, 120, 40, 40);
}

void greenLight(){
  
  frameRate(0.25);
  green = 255;
  fill(0, green, 0);
  ellipse(width/2, 180, 40, 40);
}
