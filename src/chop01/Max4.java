package chop01;

class Max4 {
  static int max4(int a, int b, int c, int d){
      int max = a;
      if (b>max) max = b;
      if (c>max) max = c;
      if (d>max) max = d;
      return max ;
  }

  static int min3(int a, int b, int c){
        int min = a;
        if (b<min) min = b;
        if (c<min) min = c;
        return min;
    }

    static int min4(int a, int b, int c, int d){
        int min = a;
        if (b<min) min = b;
        if (c<min) min = c;
        if (d<min) min = d;
        return min;
    }
    public static void main(String[] args) {
        System.out.println("max(1,2,3,4) = " + max4(1,2,3,4));
        System.out.println("min(1,2,3) = " + min3(1,2,3));
        System.out.println("min(10,2,3,4) = " + min4(10,2,3,4));
    }
}
