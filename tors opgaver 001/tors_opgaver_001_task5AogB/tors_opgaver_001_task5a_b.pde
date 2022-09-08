
void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
  {
    String output = "i is greater than "+max+".";   
    
      println(output);
  }
  

   
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/

void MethodTwo() 
{
  int weekDay = 5; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
 
  if (weekDay < 5)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
  }
  
  // Print the name of the weekday here: 
if(weekDay == 0){ 
  println("Idag er det mandag");
  }
  
  if(weekDay == 1){ 
  println("Idag er det tirsdag");
  }
  
  if(weekDay == 2){ 
  println(" dag er det onsdag");
  }
  
  if(weekDay == 3){ 
  println("Idag er det torsdag");
  }
  
  if(weekDay == 4){ 
  println("Idag er det fredag");
  }
  
  if(weekDay == 5){ 
  println("Idag er det lørdag");
  }
  
 if(weekDay == 6){ 
  println("Idag er det søndag");
  }
    
    
  // Print if it is weekend here:
  println("Er det weekend nu " + weekend);
}
