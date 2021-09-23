public class Student{
  String name;
  int age;
  boolean isFemale;
  int datamatikerTeam;

  public Student(String name, int age, boolean isFemale, int datamatikerTeam)
  {
    this.name=name;
    this.age=age;
    this.isFemale=isFemale;
    this.datamatikerTeam=datamatikerTeam;
  }

  public String getName(){
    return name;
  }
  public int getDatamatikerTeam(){
    return datamatikerTeam;
  }
}
