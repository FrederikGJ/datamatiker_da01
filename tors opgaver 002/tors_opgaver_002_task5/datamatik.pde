Student [] arrayOfStudents = new Student[10];

void setup() {

  arrayOfStudents[0] = new Student("Rasmus", 33);
  arrayOfStudents[1] = new Student("Mark", 4);
  arrayOfStudents[2] = new Student("Isam", 66);
  arrayOfStudents[3] = new Student("Laks", 34);
  arrayOfStudents[4] = new Student("Kamal", 20);
  arrayOfStudents[5] = new Student("Jaskai", 12);
  arrayOfStudents[6] = new Student("Chang", 23);
  arrayOfStudents[7] = new Student("Loui", 15);
  arrayOfStudents[8] = new Student("Makaij", 6);
  arrayOfStudents[9] = new Student("Tom", 46);
  
  nameAndInt(arrayOfStudents, 7);
  
 println( nameAndString(arrayOfStudents, "Tom"));
  
}


void nameAndInt(Student [] arrayOfStudents, int a)
{
  for (int i = 0; i < arrayOfStudents.length ; i++)
  {
    if (i == a) {
      println(arrayOfStudents[i].name);
    }
  } 
}


int nameAndString(Student [] arrayOfStudents, String a)
{
 
  for(int i = 0; i < arrayOfStudents.length; i++)
  {
   if(arrayOfStudents[i].name == a)
   {
     return i;
   }
   }
   return -1;
  }
  
