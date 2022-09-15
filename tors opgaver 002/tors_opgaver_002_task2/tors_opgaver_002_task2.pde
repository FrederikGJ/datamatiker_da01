//@@ -3,11 +3,11 @@ 

boolean iAmHappy(){
boolean happy = true;
return happy;
}

 void setup() {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
     println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
     println("I don't clap my hands"); 
   }
}

int sum(int a, int b) 
{
  int c = a + b;
  return c;
}
