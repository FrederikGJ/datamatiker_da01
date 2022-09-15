//@@ -3,11 +3,11 @@

boolean iAmHappy() {
  boolean happy = true;
  return happy;
}

void setup() {
  if (iAmHappy())
  {
    System.out.println("I clap my hands");
    println("I clap my hands");
  } else
  {
    System.out.println("I don't clap my hands");
    println("I don't clap my hands");
  }
  println(what("john"));
}


int sum(int a, int b)
{
  int c = a + b;
  return c;
}


String what(String p)
{
  return p.toUpperCase();
}


boolean where(String q)

{
  if (Character.isUpperCase(q.charAt(0))){
  
  return true;
  }
  return false;
}
