int x = 19;
int y = 5;
int z = 6;
boolean taltjekx = x % 10 == 0;
boolean taltjeky = y % 10 == 0;
boolean taltjekz = z % 10 == 0;

if((x+y+z)==30 && taltjekx == false && taltjeky == false && taltjekz == false  ) println("SUCCESS");
else println("Failure");
