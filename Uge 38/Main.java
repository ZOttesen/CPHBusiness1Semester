public class Main{

  public static void main(String[] args) {
    emptyLine();
    printString("Ballerup");
    person("Zack", 25);
  }

  public static void emptyLine(){
    System.out.println();
  }

  public static void printString(String city){
    System.out.println(city);
  }

  public static void person(String name, int age){
    System.out.println("My name is " + name + " I am " + age + " years old.");
  }
}
