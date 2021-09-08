int number = -20;
boolean negative =false;

if (number>0){
for (int i = 0;i<=number;i++)
{
  if (i == 6) println("SIX");
  else if (i == (number/2)) println("HALF");
  else println(i);
}
}

if (number<0){
  for (int i = 0;i>=number;i--)
{
  if (i == -6) println("NEGATIVE SIX");
  else if (i == (number/2)) println("HALF");
  else println(i);
}
}
