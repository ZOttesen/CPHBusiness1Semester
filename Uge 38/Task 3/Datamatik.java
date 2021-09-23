class Datamatik{
  public static void main(String[] args) {
    Teacher teacher = new Teacher("Mogens", 45, false);
    Student firstStudent = new Student("Zack", 25, false, 6);
    Student secondStudent = new Student("Louise", 24, true, 6);

    System.out.println(teacher.getName());
    System.out.println(firstStudent.getName() + " Gruppe " + firstStudent.getDatamatikerTeam() + " B");
    System.out.println(secondStudent.getName()+ " Gruppe " + firstStudent.getDatamatikerTeam() + " B");
  }
}
