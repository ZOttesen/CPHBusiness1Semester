  class Arrays{
    public static void main(String[] args) {
      int[] numbers = {4,8,2,6,20};
      String[] names = {"Zack", "Louise", "Peter", "Mogens", "Gobi"};
      boolean[] statements ={true,false,false,true,true};

      writer(names);
      System.out.println(sum(numbers));
      System.out.println(average(numbers));
    }

    public static void writer(String[] names){
      for(int i=0; i<names.length; i++){
        System.out.println(names[i]);
      }
    }
    public static int sum(int[] numbers){
      int sum =0;
      for(int i=0;i<numbers.length;i++){
        sum+=numbers[i];
      }
      return sum;
    }
    public static int average(int[] numbers){
      int sum =0;
      int counter =0;
      for(int i=0;i<numbers.length;i++){
        sum+=numbers[i];
        counter++;
      }
      int average = sum/counter;
      return average;
    }

  }
