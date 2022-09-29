class Ball
{
  //Variables that I will use when constructing and displaying a ball.
  float wid;
  float hei;
  float color1;
  float color2;
  float color3;

  //Variables that will randomly set the position of the ball on the screen.
  float xpos = random(800);
  float ypos = random(600);

  //The constructor for the Ball class.
  Ball()
  {
    wid = 40;
    hei = 40;
    color1 = random(150, 255);
    color2 = random(100, 255);
    color3 = random(150, 255);
  }

  //A function that displays the ball
  void displayBall()
  {
    stroke(0);
    fill(color1, color2, color3);
    ellipse(xpos, ypos, wid, hei);
  }
}
