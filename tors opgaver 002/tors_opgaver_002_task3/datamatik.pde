Teacher myTeacher;
Student oneStudent01;
Student oneStudent02;

void setup(){

myTeacher = new Teacher("Jesper", 32, false);
oneStudent01 = new Student("Frederik", 34, false,'d');
oneStudent02 = new Student("Oskar", 21, false,'d');

println(myTeacher.name);
println(oneStudent01.name + " is from team " +oneStudent01.datamatikerTeam); 
println(oneStudent02.name + " is also from team " + oneStudent02.datamatikerTeam); 


}
