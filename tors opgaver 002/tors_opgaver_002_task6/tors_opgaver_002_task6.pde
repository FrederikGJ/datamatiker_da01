//fixed code
 int smaller = 0;

void setup() {
  int a = 7, b = 42;
  minimum(a, b);
  if (smaller == a) {
    println("a is the smallest!");
  }
}


int minimum(int a, int b)
{

  
  if (a < b) 
  {
    smaller = a;
  }
  else if (a >= b)
  {
    smaller = b;
  }
  return smaller;
}
