class Main{
  public static boolean happy = false;

public static void main(String [] args) {
   System.out.println(sum(5,8));

   System.out.println(upperCase("Goddag med dig"));

   boolean test = upperCaseTest("goddag med dig");

   if(test==true){
     System.out.println("Text starts with upper case");
   }
   else System.out.println("Text doesn't start with upper case");

   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands");
   }
}


  public static boolean iAmHappy()
  {
    if (happy==true) return true;
    else return false;
  }

  public static int sum (int x, int y){
    return x+y;
  }

  public static String upperCase(String text){
    return text.toUpperCase();
  }

  public static boolean upperCaseTest (String test){
  char tjek = test.charAt(0);
  if(Character.isUpperCase(tjek)) return true;
  else return false;
  }
}
