class Datamatik{
  public static void main(String[] args) {
    Student[] arrayOfStudent = new Student[]{new Student("Zack", 25, false, 6),
                                             new Student("Louise", 24, true, 6),
                                             new Student("Peter", 23, false, 1),
                                             new Student("Henning", 46, false, 1),
                                             new Student("Phillip", 18, false, 1),
                                             new Student("Mette", 29, true, 1),
                                             new Student("Inge", 22, true, 1),
                                             new Student("Lasse", 37, false, 1),
                                             new Student("Simone", 55, true, 1),
                                             new Student("Dennis", 33, false, 1)};

    System.out.println(returnNameOfStudent(arrayOfStudent,0));
    System.out.println(returnNameOfStudent(arrayOfStudent,1));
    System.out.println(returnNameOfStudent(arrayOfStudent,2));
    System.out.println(returnNameOfStudent(arrayOfStudent,3));
    System.out.println(returnNameOfStudent(arrayOfStudent,4));
    System.out.println(returnNameOfStudent(arrayOfStudent,5));
    System.out.println(returnNameOfStudent(arrayOfStudent,6));
    System.out.println(returnNameOfStudent(arrayOfStudent,7));
    System.out.println(returnNameOfStudent(arrayOfStudent,8));
    System.out.println(returnNameOfStudent(arrayOfStudent,9));

    System.out.println(studentSearch(arrayOfStudent,"Mette"));
  }

  public static String returnNameOfStudent(Student[] arrayOfStudent, int number){
    return arrayOfStudent[number].getName();
  }

  public static int studentSearch(Student[] arrayOfStudent, String name){
    for(int i =0;i<arrayOfStudent.length;i++){
      if(arrayOfStudent[i].getName()==name) return i;
    }
    return 50;
  }
}
