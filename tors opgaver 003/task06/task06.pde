int [][] board = new int [8][8];
int sideLength = 40;
void setup()
{
  size(600, 600);
  for (int row = 0; row < 8; row++)
  {
    for (int column = 0; column < 8; column++)
    {
      if ((row + column) %2 == 0)
      {
        board[row][column] = 0; //skal blive sort
      } else {
        board[row][column]=1;//skal blvie hvid
      }
    }
  }
}


void draw()
{
  createBoard();
}

void createBoard()
{
  for (int row = 0; row < 8; row++)
  {
    for (int column = 0; column < 8; column++)
    {
      if (board[row][column] == 1)
      {
        fill(255);
      } else
      {
        fill(0);
      }
      rect(row * sideLength, column * sideLength, sideLength, sideLength);
    }
  }
}
