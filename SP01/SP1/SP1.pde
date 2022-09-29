//an array of the object Ball
Ball [] balls;

//a variable that sets the number of balls that I create (I want 300).
int howMany = 300;


void setup()
{
  //This is the size of the window that opens when the program runs
  size(800, 600);

  //to show that I know other datatypes I will display a String when the program is running.
  String str = "The program is running. That's just great!";
  println(str);

  //I initialize the array balls using a for loop
  balls = new Ball[howMany];
  int j = 0;
  for (int i = 0; i < balls.length; i++)
  {
    balls[j++] = new Ball();
  }
}

void draw()
{
  //This makes a white background
  background(255);

  //I use a for loop and the displayBall method in the draw function
  for (Ball b : balls) {
    b.displayBall();
  }
}
